package org.bootcamp.Day2.ThreadingDemos.TableDemo;

public class ThreadOne extends Thread{
    Table table;

    public ThreadOne(Table table) {
        this.table = table;
    }

    @Override
    public void run() {
        table.printTable(5);
    }
}
