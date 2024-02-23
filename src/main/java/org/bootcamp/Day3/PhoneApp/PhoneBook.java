package org.bootcamp.Day3.PhoneApp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PhoneBook {
    private HashMap<Long, List<String>> contactList;

    public PhoneBook(HashMap<Long, List<String>> contactList) {
        this.contactList = contactList;
    }

    public HashMap<Long, List<String>> getContactList() {
        return contactList;
    }

    public void setContactList(HashMap<Long, List<String>> contactList) {
        this.contactList = contactList;
    }

    public void addContact(Contact c) {
        long ph = c.getPhoneNumber();
        String fName = c.getFirstName();
        String lName = c.getLastName();
        contactList.putIfAbsent(ph, Arrays.asList(fName, lName));
        System.out.println("Contact Added Successfully");
//        System.out.println(contactList);
    }

    public void deleteContact(long ph) {
        if (contactList.getOrDefault(ph, null) != null) {
            System.out.println(contactList.get(ph).get(0) + " is to be Deleted");
            contactList.remove(ph);
            System.out.println("Deleted");
        } else {
            System.out.println("No Such Contact ever existed :)");
        }
    }

    public void displayContacts() {

        System.out.println("--------------Displaying All Contacts------------------");
        for (var c : contactList.entrySet()) {
            long ph = c.getKey();
            String fName = c.getValue().get(0);
            String lName = c.getValue().get(1);
            System.out.println("FirstName  : " + fName);
            System.out.println("LastName   : " + lName);
            System.out.println("PhoneNumber: " + ph);
            System.out.println("--------------------------------");
        }
    }

    public void viewContactByPhone(long ph) {
        if (contactList.getOrDefault(ph, null) != null) {
            String fName = contactList.get(ph).get(0);
            String lName = contactList.get(ph).get(1);
            System.out.println();
            System.out.println("Contact Found :)");
            System.out.println("FirstName  : " + fName);
            System.out.println("LastName   : " + lName);
            System.out.println("PhoneNumber: " + ph);
            System.out.println("--------------------------------");
        } else {
            System.out.println("Contact Not found :(");
        }
    }
}
