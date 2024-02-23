package org.bootcamp.Day2.ThreadingDemos.TableDemo;

public class ThreadTwo extends Thread{
    Table table;

    public ThreadTwo(Table table) {
        this.table = table;
    }

    @Override
    public void run() {
        table.printTable(10);
    }
}
