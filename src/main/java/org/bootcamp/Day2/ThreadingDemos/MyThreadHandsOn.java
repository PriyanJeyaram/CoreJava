package org.bootcamp.Day2.ThreadingDemos;

public class MyThreadHandsOn implements Runnable {

    private String threadName;

    public MyThreadHandsOn(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {

        int table = (threadName.equalsIgnoreCase("FiveTable")) ? 5 : 10;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " * " + table + " = " + (i * table));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Interrupted :) ");
            }
        }

    }
}
