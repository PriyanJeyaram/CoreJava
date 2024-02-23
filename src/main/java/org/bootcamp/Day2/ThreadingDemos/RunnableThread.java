package org.bootcamp.Day2.ThreadingDemos;

public class RunnableThread implements Runnable {

    private Thread thread;
    private String threadName;

    public RunnableThread(String threadName) {
        this.threadName = threadName;
        System.out.println("Creating Thread: " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Running " + threadName);
        for (int i = 0; i < 5; i++) {
            System.out.println("::" + threadName + "::" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted :) ");
            }
        }
        System.out.println("Thread::" + threadName + " exiting");
    }
}
