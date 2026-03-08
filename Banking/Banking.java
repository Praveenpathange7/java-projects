import java.util.*;
class Bank{
    private int accNum;
    private String accHolderName;
    private double accBalance;
    
    Bank(int accNum, String accHolderName, double accBalance){
        this.accNum = accNum;
        this.accHolderName = accHolderName;
        this.accBalance = accBalance;
    }
    
    int getAccNum(){
        return accNum;
    }
    String getAccHolderName(){
        return accHolderName;
    }
    double getAccBalance(){
        return accBalance;
    }
    void deposit(double amount){
        accBalance += amount;
        System.out.println("Amount deposited successfully. Current balance: " + accBalance);
    }
    void withdraw(double amount){
        if(amount > accBalance){
            System.out.println("Insufficient balance. Current balance: " + accBalance);
        } else {
            accBalance -= amount;
            System.out.println("Amount withdrawn successfully. Current balance: " + accBalance);    
        }
    }
    
}
class Banking{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the account number:");
        int accNum = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the account holder name:");
        String accHolderName = sc.nextLine();
        System.out.println("Enter the account balance:");  
        double accBalance = sc.nextDouble();
        System.out.println("Account Number: " + accNum);
        System.out.println("Account Holder Name: " + accHolderName);
        System.out.println("Account Balance: " + accBalance);
        System.out.println("Account created successfully!");
        Bank bank = new Bank(accNum, accHolderName, accBalance);
        while(true){
            System.out.println("Choose an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter the amount to deposit:");
                    double depositAmount = sc.nextDouble();
                    bank.deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("Enter the amount to withdraw:");
                    double withdrawAmount = sc.nextDouble();
                    bank.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Current balance: " + bank.getAccBalance());
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
