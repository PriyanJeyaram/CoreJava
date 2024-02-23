package org.bootcamp.Day3.CollectionStartHere;

import java.util.Comparator;

public class IDComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getStudentID() - o2.getStudentID();
    }
}
