package org.bootcamp.Day5.JUnitBasics;

import java.util.ArrayList;

public class ContactManager {
    private ArrayList<Contact> contactsList;

    public ContactManager(ArrayList<Contact> contactsList) {
        this.contactsList = contactsList;
    }

    public ContactManager() {
        this.contactsList = new ArrayList<>();
    }

    public void addContact(String firstName, String lastName, String phone) {
        if (firstName == null || lastName == null || phone == null) {
            throw new RuntimeException("No Null Accepted :)");
        }
        contactsList.add(new Contact(firstName, lastName, phone));
    }

    public ArrayList<Contact> getAllContacts() {
        return this.contactsList;
    }
}
