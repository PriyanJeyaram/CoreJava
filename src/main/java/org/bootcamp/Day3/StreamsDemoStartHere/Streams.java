package org.bootcamp.Day3.StreamsDemoStartHere;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        var list = Arrays.asList(12, 23, 34, 45, 56, 67, 78, 89);

        list.stream()
                .filter(e -> (e & 1) == 0)
                .map(e -> e * e).sorted()
                .forEach(System.out::println);

        var newList = list.stream()
                .filter(e -> (e & 1) != 0)
                .map(e -> e * e)
                .sorted()
                .toList();
    }
}
