package org.bootcamp.Day1;

public class Account {
    private long accountNumber;
    private double balance;
    private int accountHolderAge;


    public Account() {
        System.out.println("Creating an Account");
    }

    public Account(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public Account(long accountNumber, double balance, int accountHolderAge) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderAge = accountHolderAge;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountHolderAge() {
        return accountHolderAge;
    }

    public void setAccountHolderAge(int accountHolderAge) {
        this.accountHolderAge = accountHolderAge;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Credit Success");
        } else {
            System.out.println("Credit Failed: Enter amount GT 0");
        }
        System.out.println("Balance: " + this.getBalance());
    }

    public void withdraw(double amount) {
        if (balance - amount < 0 || amount < 0) {
            System.out.println("Debit Failed: Insufficient Fund");
        } else {
            this.setBalance(this.getBalance() - amount);
            System.out.println("Debit Success");
        }
        System.out.println("Balance: " + this.getBalance());
    }
}
