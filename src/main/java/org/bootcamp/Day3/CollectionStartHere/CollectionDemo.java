package org.bootcamp.Day3.CollectionStartHere;

import java.util.HashSet;

public class CollectionDemo {
    public static void main(String[] args) {
        var names = new HashSet<String>();
        names.add("Hi");
        names.add("Collection");

        var it = names.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
