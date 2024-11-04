package com.pluralsight.Finance;

public class BankAccount implements Valuable {
    private int id;
    private String accountName;
    private double amountAvailable;

    public BankAccount(int id, String accountName, double amountAvailable) {
        this.id = id;
        this.accountName = accountName;
        this.amountAvailable = amountAvailable;
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

    public double getAmountAvailable() {
        return amountAvailable;
    }

    public void setAmountAvailable(double amountAvailable) {
        this.amountAvailable = amountAvailable;
    }

    public void withdraw(double i) {

    }

    public void deposit(double i) {

    }

    @Override
    public void getValue() {

    }
}
