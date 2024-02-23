package org.bootcamp.Day2.ThreadingDemos;

public class ThreadDemoTester {
    public static void main(String[] args) throws InterruptedException {

//        Thread Class implements the Runnable Interface
//        Way 1: Extending the Thread Class
//        ThreadDemo t1 = new ThreadDemo();
//        t1.start();

//        Way 2: Implementing the Runnable Interface
        RunnableThread r1 = new RunnableThread("RunnableOne");
        RunnableThread r2 = new RunnableThread("RunnableTwo");
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t1.join();
        t2.start();
    }
}
