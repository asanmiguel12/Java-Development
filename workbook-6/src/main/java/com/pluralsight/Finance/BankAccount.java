package com.pluralsight.Finance;

public class BankAccount implements Valuable {
    private int id;
    private String accountName;
    private double balance;

    public BankAccount(int id, String accountName, double balance) {
        this.id = id;
        this.accountName = accountName;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double i) {

    }

    public void deposit(double i) {

    }

    @Override
    public double getValue() {

        return balance;
    }
}
