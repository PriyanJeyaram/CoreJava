package org.bootcamp.Day3.StreamsDemoStartHere;

import java.util.Comparator;
import java.util.HashMap;
import java.util.stream.Collectors;

public class MapDemo {
    public static void main(String[] args) {
        var map = new HashMap<String, Integer>();
        map.put("Priyan", 123);
        map.put("Simi", 456);
        map.put("Ranju", 789);
        map.put("MS", 101);
        map.put("Tim", 213);

        var result = map.entrySet()
                .stream()
                .sorted(Comparator.comparing(e-> -e.getValue()))
                .toList().get(0);

        System.out.println(result);
    }
}
