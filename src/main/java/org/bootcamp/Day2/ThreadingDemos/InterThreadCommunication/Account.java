package org.bootcamp.Day2.ThreadingDemos.InterThreadCommunication;

public class Account {
    double amount = 1000;

    synchronized public void withdraw(double amount) throws InterruptedException {
        System.out.println("Withdrawing...");
        System.out.println("Amount: " + amount);
        if(this.amount < amount) {
            System.out.println("Waiting for deposit...");
            wait();
        }
        this.amount -= amount;
        System.out.println("Withdraw Done");
    }

    synchronized public void deposit(double amount) {
        System.out.println("Depositing...");
        this.amount += amount;
        System.out.println("Done Depositing");
        notify();
    }
}
