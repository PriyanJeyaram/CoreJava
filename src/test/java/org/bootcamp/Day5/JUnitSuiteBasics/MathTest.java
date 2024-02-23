package org.bootcamp.Day5.JUnitSuiteBasics;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MathTest {

    @Test
    @Order(1)
    public void firstTest() {
        System.out.println("1st");
    }
    @Test
    @Order(2)
    public void secondTest() {
        System.out.println("2nd");
    }
    @Test
    @Order(3)
    public void thirdTest() {
        System.out.println("3rd");
    }
    @Test
    @Order(4)
    public void fourthTest() {
        System.out.println("4th");
    }
    @Test
    @Order(5)
    public void fifthTest() {
        System.out.println("5th");
    }
    @Test
    @Order(6)
    public void sixthTest() {
        System.out.println("6th");
    }
}
