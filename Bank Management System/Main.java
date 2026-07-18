import java.util.ArrayList;
import java.util.Scanner;
import model.Account;
import model.CurrentAccount;
import model.InsufficientBalanceException;
import model.SavingsAccount;



public class Main {
    static Account findAccount(ArrayList<Account> accounts, String accNo) {
        for (Account a : accounts) {
            if (a.getAccountNumber().equals(accNo))
                return a;
        }
        return null;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Account> accounts = new ArrayList<>();

        int choice = 0;
        Account acc;
    while (choice != 7) {
        System.out.println("\n===== BANK MENU =====");
        System.out.println("1. Create Account");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Check Balance");
        System.out.println("5. Add Interest");
        System.out.println("6. Display All Accounts");
        System.out.println("7. Exit");
        System.out.print("Enter choice: ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                sc.nextLine();  
                System.out.print("Account type (1=Savings, 2=Current): ");
                int type = sc.nextInt();
                sc.nextLine();
                System.out.print("Account number: ");
                String accNo = sc.nextLine();
                System.out.print("Holder name: ");
                String name = sc.nextLine();
                System.out.print("Initial balance: ");
                double bal = sc.nextDouble();

                if (type == 1){
                    accounts.add(new SavingsAccount(accNo, name, bal));
                }
                else{
                     accounts.add(new CurrentAccount(accNo, name, bal));
                }
                System.out.println("Account created!");
                break;

            case 2:
                sc.nextLine();
                System.out.print("Account number: ");
                acc = findAccount(accounts, sc.nextLine());
                if (acc == null) {
                    System.out.println("Account not found!");
                } else {
                        System.out.print("Amount: ");
                        acc.deposit(sc.nextDouble());
                }   
                break;

            case 3:
                sc.nextLine();
                System.out.print("Account number: ");
                acc = findAccount(accounts, sc.nextLine());
                if (acc == null) {
                    System.out.println("Account not found!");
                } else {
                    System.out.print("Amount: ");
                    double amt = sc.nextDouble();
                    try {
                        acc.withdraw(amt);          
                    } catch (InsufficientBalanceException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                }
                break;

            case 4:
                sc.nextLine();
                System.out.print("Account number: ");
                acc = findAccount(accounts, sc.nextLine());
                if (acc == null) {
                    System.out.println("Account not found!");
                } else {
                    acc.checkBalance();
                }
                break;
            
            case 5:
                sc.nextLine();
                System.out.print("Account number: ");
                acc = findAccount(accounts, sc.nextLine());
                if (acc == null) {
                    System.out.println("Account not found!");
                } else {
                double interest = acc.calculateInterest();
                acc.deposit(interest);
                System.out.println("Interest added: " + interest);
                }
                break;
            
            case 6:
                for (Account a: accounts) {
                    System.out.println(a.getAccountNumber() + " | " + a.getHolderName() + " | " + a.getBalance());
                }
                break;
            case 7:
               System.out.println("Thank you for using the Banking System!");
               break;
            default:
                System.out.println("Invalid Input");
        }
    }
    sc.close();
}
}
