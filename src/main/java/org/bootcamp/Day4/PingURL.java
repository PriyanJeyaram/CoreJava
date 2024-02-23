package org.bootcamp.Day4;

import java.net.HttpURLConnection;
import java.net.URL;

public class PingURL implements Runnable {

    private String url;

    public PingURL(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        String res = "";
        int code = 200;

        try {
            System.out.println(Thread.currentThread().getName());
            URL site = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) site.openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.connect();
            code = connection.getResponseCode();
            if (code == 200) {
                res = "->Green \t\t " + "Code: " + code;
            } else {
                res = "->Orange \t\t " + "Code: " + code;
            }
            System.out.println(code);
        } catch (Exception e) {
            res = "->Red " + "\npWrong Domain::Code: " + code + " MSG: " + e.getMessage();
        }
        System.out.println("URL: " + url);
        System.out.println("Status: " + res);
    }
}
