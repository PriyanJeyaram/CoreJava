package org.bootcamp.Day2.HomeAssignment;

import java.util.function.Supplier;

public class Guesser {
    public static void main(String[] args) {
        Supplier<Integer> rand = () -> (int) (Math.random() * 10);
        int secret = rand.get();
        final int[] count = {1};
        System.out.println(secret);

//        var r1 = new MyRunnableThread("T1", secret);
//        var r2 = new MyRunnableThread("T2", secret);
//        var t1 = new Thread(r1);
//        var t2 = new Thread(r2);
//        t1.start();
//        t2.start();

        new Thread(() -> {
            if(rand.get() != secret) {
                count[0]++;
            }
        }).start();

        new Thread(() -> {
            if(rand.get() != secret) {
                count[0]++;
            }
        }).start();

        System.out.println(count[0]);
    }
}
