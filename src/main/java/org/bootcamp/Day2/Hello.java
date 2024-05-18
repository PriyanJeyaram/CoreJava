package org.bootcamp.Day2;


import static java.lang.Math.sqrt;
public class Hello {

    private static int count;
    private int nonstaticcount;

    static {
        count = 85;
        System.out.println("1 - Static Block");
    }

    {
        System.out.println(sqrt(823647.239847));
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println("3 - This is an instance Initializer Block");
    }

    public Hello(int nonstaticcount) {
        this.nonstaticcount = nonstaticcount;
        System.out.println("4 - Calling the constructor");
    }

    public static void main(String[] args) {
        System.out.println("2 - Inside Main");
        var obj = new Hello(44);
    }
}
