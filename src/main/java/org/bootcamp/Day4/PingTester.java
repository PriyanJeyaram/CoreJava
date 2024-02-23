package org.bootcamp.Day4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PingTester {
    private static final int nThreads = 40;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        var domains = new String[]{
                "https://google.com",
                "https://bing.com",
                "https://twitter.com",
                "https://web.whatsapp.com",
                "https://web.whatsapp.cm"
        };

        for (int i = 0; i < domains.length; i++) {
            String url = domains[i];
            PingURL tester = new PingURL(url);
            executorService.execute(tester);
        }

        executorService.shutdown();

        if(executorService.isTerminated()) {
            System.out.println("Finished");
        }else {
            System.out.println("Not yet terminated :)");
            System.out.println(Thread.currentThread().getName());
        }
    }
}
