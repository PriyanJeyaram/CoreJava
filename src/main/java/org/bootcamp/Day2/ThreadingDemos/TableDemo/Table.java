package org.bootcamp.Day2.ThreadingDemos.TableDemo;

public class Table {
    synchronized public void printTable(int n) {
        System.out.println("Table of " + n);
        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
        }
    }
}
