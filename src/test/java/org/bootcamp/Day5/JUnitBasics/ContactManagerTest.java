package org.bootcamp.Day5.JUnitBasics;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ContactManagerTest {

    private static ContactManager contactManager;

    @BeforeAll
    public static void setup() {
        contactManager = new ContactManager();
    }


    @DisplayName("Should Create Contact")
    @ParameterizedTest
//    @ValueSource(strings = {"123", "456", "789"})
    @MethodSource("phoneList")
    public void shouldCreateContact(String ph) {
//        Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")));
        contactManager.addContact("Simi", "JR", ph);
        contactManager.addContact("Tim", "Kum", "0987654321");
        assertFalse(contactManager.getAllContacts().isEmpty());
//        assertEquals(1, contactManager.getAllContacts().size());
//        assertEquals(2, contactManager.getAllContacts().size());
    }

    private static List<String> phoneList() {
        return Arrays.asList("123","456","789");
    }
    @Test
    @DisplayName("Should not create contact when FirstName is null")
    @Disabled
    public void shouldThrowRTEWhenFirstNameIsNull() {
        assertThrows(RuntimeException.class, () -> contactManager.addContact(null, "ranju", "4567789123"));
    }

    @Test
    @DisplayName("Should not create contact when LastName is null")
    public void shouldThrowRTEWhenLastNameIsNull() {
        assertThrows(RuntimeException.class, () -> contactManager.addContact("MS", null, "4567789123"));
    }

    @Test
    @DisplayName("Should not create contact when PhoneNumber is null")
    public void shouldThrowRTEWhenPhoneNumberIsNull() {
        assertThrows(RuntimeException.class, () -> contactManager.addContact("Tim", "Kumar", null));
    }
}
