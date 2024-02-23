package org.bootcamp.Day3.CollectionStartHere;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class StudentTester {
    public static void main(String[] args) {
//        var students = new TreeSet<Student>(new NameComparator());
        var students = new LinkedHashSet<Student>();
        students.add(new Student(101, "Priyan", 23, 'A'));
        students.add(new Student(101, "Priyan", 23, 'A'));
        students.add(new Student(102, "Ram", 22, 'O'));
        students.add(new Student(103, "Krish", 21, 'B'));
        students.add(new Student(104, "Hari", 23, 'C'));

        for (var std : students) {
            System.out.println(std.getStudentID() + " " + std.getStudentName());
        }

//        List
        var arr = new int[] {21,23,45,32,878,34};
        var list = Arrays.asList(arr);
        var list1 = new ArrayList<Integer>();
        list1.ensureCapacity(10);
        System.out.println(list1.size());
        System.out.println(list);
    }
}
