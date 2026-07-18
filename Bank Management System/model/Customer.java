package model;

import java.util.ArrayList;

public class Customer {
    final private String customerId;
    final private String name;
    final private String phone;
    final private ArrayList<Account> accounts;

    public Customer(String customerId, String name, String phone) {
    this.customerId = customerId;
    this.name = name;
    this.phone = phone;
    this.accounts = new ArrayList<>();
    }

    String getCustomerId() { 
        return customerId; 
    }
    String getName() { 
        return name; 
    }
    String getPhone() { 
        return phone; 
    }

    public void addAccount(Account acc) {
        accounts.add(acc);
        System.out.println("Account " + acc.getAccountNumber() + " added for " + name);
    }

    public void displayAccounts() {
        System.out.println("Accounts of " + name + ":");
        if (accounts.isEmpty()) {
            System.out.println("  No accounts yet.");
            return;
        }
        for (Account acc : accounts) {
            System.out.println("  " + acc.getAccountNumber() + " | Balance: " + acc.getBalance());
        }
    }

    public double getTotalBalance(){
        double total  = 0;
        for(Account acc : accounts){
            total  += acc.getBalance();
        }
        return total;
    }


}