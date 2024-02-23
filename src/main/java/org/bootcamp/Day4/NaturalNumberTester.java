package org.bootcamp.Day4;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NaturalNumberTester {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable callableTask = new NaturalNumber(5);
        var executorService = Executors.newFixedThreadPool(4);
        Future status = executorService.submit(callableTask);
        System.out.println(status.get());
        executorService.shutdown();
    }
}
