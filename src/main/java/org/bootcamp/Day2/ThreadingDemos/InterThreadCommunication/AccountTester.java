package org.bootcamp.Day2.ThreadingDemos.InterThreadCommunication;

public class AccountTester {
    public static void main(String[] args) {

        Account account = new Account();
        new Thread(() -> {
            try {
                account.withdraw(14000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();

        new Thread(() -> account.deposit(20000)).start();
    }
}
