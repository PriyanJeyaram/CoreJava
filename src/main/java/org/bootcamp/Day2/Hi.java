package org.bootcamp.Day2;

public interface Hi {
    public static void sayHi(String name) {
        System.out.println("Hi" + name);
    }

    public default void sayHello(String name) {
        System.out.println("Hello" + name);
    }

    public void thisIsNotConcrete();

    
}
