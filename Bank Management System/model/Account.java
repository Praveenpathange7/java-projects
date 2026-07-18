package model;

import java.util.ArrayList;

public abstract class Account{
    private String holderName;
    private String  accountNumber;
    private double balance;
    private ArrayList<String> transactions;

    Account(String  accountNumber,String holderName,double balance){
        this.holderName = holderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount!");
            return;
    }
    balance += amount;
    transactions.add("DEPOSIT: "+ amount);
    System.out.println("Deposited: " + amount + " | Balance: " + balance);
}

    public double getBalance(){ 
        return balance; 
    }
    protected void setBalance(double balance){
        this.balance = balance;
    }
    public String getAccountNumber(){
        return accountNumber; 
    }
    public String getHolderName(){ 
        return holderName; 
    }
    protected void addTransaction(String record){ 
        transactions.add(record); 
    }
    public abstract void withdraw(double amount) throws InsufficientBalanceException;
    public void checkBalance(){
        System.out.println("Balance : "+balance);
    }
    public abstract double calculateInterest();
}
