package org.bootcamp.Day4;

import java.util.concurrent.Callable;

public class NaturalNumber implements Callable {

    private int n;

    public NaturalNumber(int n) {
        this.n = n;
    }

    @Override
    public Object call() {
        return (n * (n + 1))/2;
    }
}
