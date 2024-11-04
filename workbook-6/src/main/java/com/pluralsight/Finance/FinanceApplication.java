package com.pluralsight.Finance;

public class FinanceApplication {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(123, "Pam", 12500);
        Valuable account2 = new BankAccount(456, "Gary", 1500);

        account1.deposit(100);
       // account2.deposit(100); // does not work because account2 is under valuable interface which has no deposit
    }
}
