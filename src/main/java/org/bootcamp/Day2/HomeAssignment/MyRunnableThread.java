package org.bootcamp.Day2.HomeAssignment;

import java.util.function.Supplier;

public class MyRunnableThread implements Runnable {

    private final String threadName;
    private final int secret;
    private final Supplier<Integer> randomNumberGenerator;
    private static int count = 1;

    public MyRunnableThread(String threadName, int secret) {
        this.threadName = threadName;
        this.secret = secret;
        randomNumberGenerator = () -> (int) (Math.random() * 10);
    }

    @Override
    public void run() {
        int temp = randomNumberGenerator.get();
        while (secret != temp) {
            System.out.println(threadName + " guessed " + secret + " as " + temp + " Guess count is: " + count);
            count++;
            temp = randomNumberGenerator.get();
        }
        System.out.println(count);
    }
}
