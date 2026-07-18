package model;

public class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = 10000;
    }

    @Override
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount <= 0) {
            System.out.println("Invalid amount!");
            return;
    }
        if (getBalance() - amount < -overdraftLimit) {
            throw new InsufficientBalanceException(
            "Withdrawal denied! Overdraft limit of " + overdraftLimit + " exceeded.");
    }
    setBalance(getBalance() - amount);
    addTransaction("WITHDRAW: " + amount); 
    System.out.println("Withdrawn: " + amount + " | Balance: " + getBalance());
}
    @Override
    public double calculateInterest() {
        return 0;
}
}
