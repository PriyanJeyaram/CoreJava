package org.bootcamp.Day3.PhoneApp;

import java.util.Comparator;

public class FirstNameComparator implements Comparator<Contact> {
    @Override
    public int compare(Contact o1, Contact o2) {
        return o1.getFirstName().compareTo(o2.getFirstName());
    }
}
