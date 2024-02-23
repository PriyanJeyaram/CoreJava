package org.bootcamp.Day3.PhoneApp;

import java.util.HashMap;

public class PhoneAppTester {
    public static void main(String[] args) {
        PhoneBook myContacts = new PhoneBook(new HashMap<>());
        myContacts.addContact(new Contact("Priyan", "Jeyaram", 123));
        myContacts.addContact(new Contact("Shankar", "N", 456));
        myContacts.addContact(new Contact("Joel", "Sam", 789));
        myContacts.addContact(new Contact("Karthi", "K", 987));
        myContacts.addContact(new Contact("Shyam", "Sundar", 184));

        myContacts.displayContacts();

        myContacts.deleteContact(789);
        myContacts.deleteContact(78998234);

        myContacts.viewContactByPhone(123);
    }
}
