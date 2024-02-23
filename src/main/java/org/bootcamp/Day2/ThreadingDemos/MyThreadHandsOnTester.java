package org.bootcamp.Day2.ThreadingDemos;

public class MyThreadHandsOnTester {
    public static void main(String[] args) {
        var r1 = new MyThreadHandsOn("FiveTable");
        var r2 = new MyThreadHandsOn("TenTable");
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            System.out.println("Throws Interrupted Exception :)");
        }
        t2.start();
    }
}
