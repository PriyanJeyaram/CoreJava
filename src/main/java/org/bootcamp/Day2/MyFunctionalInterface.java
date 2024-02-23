package org.bootcamp.Day2;

@FunctionalInterface
public interface MyFunctionalInterface {
    int getSum(int a, int b);

    default void logging(String str) {
        System.out.println("Logging..." + str);
    }
}
