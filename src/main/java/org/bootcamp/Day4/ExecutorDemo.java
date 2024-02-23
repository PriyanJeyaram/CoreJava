package org.bootcamp.Day4;

import java.util.concurrent.*;

public class ExecutorDemo {

    private static int count = 0;
    private static final int nThreads = 3;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Runnable runnableTask = () -> {
            System.out.println(Thread.currentThread().getName());
//            while (count < 10) {
//                count++;
//                System.out.println(count);
//            }
//            System.out.println("Final Count: " + count);
        };

//        ExecutorService executorService = Executors.newFixedThreadPool(nThreads);
//
//        for (int i = 0; i < nThreads; i++) {
//            executorService.execute(runnableTask);
//        }

        Callable callableTask = () -> {
            System.out.println(Thread.currentThread().getName());
            return "Callable Task is Done :)";
        };

        var executorService = Executors.newSingleThreadExecutor();
        Future status = executorService.submit(callableTask);
        System.out.println(status.get());
        executorService.shutdown();
    }
}
