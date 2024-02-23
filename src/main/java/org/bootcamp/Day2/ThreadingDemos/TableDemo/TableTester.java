package org.bootcamp.Day2.ThreadingDemos.TableDemo;

public class TableTester {
    public static void main(String[] args) {

        Table table = new Table();
        ThreadOne t1 = new ThreadOne(table);
        System.out.println("Priority Thread1: " + t1.getPriority());
        ThreadTwo t2 = new ThreadTwo(table);
        System.out.println("Priority Thread2: " + t2.getPriority());
        t1.start();
        t2.start();
    }
}
