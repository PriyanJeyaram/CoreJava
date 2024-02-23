package org.bootcamp.Day3.StreamsDemoStartHere;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.IntStream;

public class FlatMapDemo {
    public static void main(String[] args) {
        var list1 = Arrays.asList(1,2,3);
        var list2 = Arrays.asList(4,5,6);
        var list3 = Arrays.asList(9,8,7);

        var listOfLists = new ArrayList<List<Integer>>();
        listOfLists.add(list1);
        listOfLists.add(list2);
        listOfLists.add(list3);

        System.out.println(listOfLists);

        var newListOfLists = listOfLists
                .stream()
                .flatMap(e -> e.stream())
                .toList();
        System.out.println(newListOfLists);

        System.out.println("Excluding end");
        IntStream.range(0,10).forEach(System.out::println);
        System.out.println("\nIncluding end");
        IntStream.rangeClosed(0,10).forEach(System.out::println);

        var arr = IntStream.range(1,6).toArray();
        for(var i : arr) {
            System.out.print(i + ", ");
        }
        System.out.println();

        UUID id = UUID.randomUUID();
        System.out.println("Universal Unique ID: " + id);


    }
}
