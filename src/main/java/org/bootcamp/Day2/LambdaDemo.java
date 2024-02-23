package org.bootcamp.Day2;

import java.util.function.BiFunction;
import java.util.function.Function;
import static java.lang.Math.*;
public class LambdaDemo {
    public static void main(String[] args) {
//        MyFunctionalInterface obj = (a,b) -> a+b;
        BiFunction<Integer, Integer, Integer> obj = (a,b) -> a+b;
        System.out.println(obj.apply(35,30));

        Function<Integer, String> evenOrOdd = (a) -> ((a & 1) == 0)?"Even":"Odd";
        System.out.println(evenOrOdd.apply(3));
        System.out.println(evenOrOdd.apply(4));
        System.out.println(evenOrOdd.apply(-4));

        System.out.println(sqrt(9872487));
    }
}
