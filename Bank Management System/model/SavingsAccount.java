package model;

public class SavingsAccount extends Account{
    private double interestRate;
    private double minimumBalance;
    private int withdrawalCount;
    private static final int WITHDRAWAL_LIMIT = 5;

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber,holderName,balance);
        this.interestRate = 4.5;
        this.minimumBalance = 1000;
        this.withdrawalCount = 0;
    }
    @Override
    public void withdraw(double amount) throws InsufficientBalanceException{
        if (amount <= 0) {
            System.out.println("Invalid amount!");
            return;
        }
        if(withdrawalCount >= WITHDRAWAL_LIMIT){
            System.out.println("Monthly withdrawal limit reached!");
            return;
        }
        if(getBalance() - amount < minimumBalance){
            throw new InsufficientBalanceException(
                "Withdrawal denied! Minimum balance of " + minimumBalance + " must be maintained.");
            }
    setBalance(getBalance() - amount);
    withdrawalCount++;
    addTransaction("WITHDRAW: "+amount);
    System.out.println("Withdrawn: " + amount + " | New Balance: " + getBalance());
    }

   @Override
   public double calculateInterest() {
        return getBalance() * interestRate / 100;
   }
}
