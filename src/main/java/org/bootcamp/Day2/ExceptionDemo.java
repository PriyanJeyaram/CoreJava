package org.bootcamp.Day2;

import java.io.FileReader;

public class ExceptionDemo {
    public static void main(String[] args) {
//        Checked Exception - Compiler checks if it is valid or not
//        FileReader fileReader = new FileReader("HeyyyyThisDoesNotExist.txt");

        try {
            int x = 0;
//            int y = 5 / x; //Unchecked Exceptions
//            System.out.println("Value of y: " + y);// Throw Arithmetic Exception
            FileReader fileReader = new FileReader("HeyyyyThisDoesNotExist.txt");
        } catch (ArithmeticException e) {
            System.out.println("Division by 0 is not feasible");
        } catch (NumberFormatException e) {
            System.out.println("Number format is wrong I think :(");
        } catch (Exception e) {
            System.out.println("I don't know what is being thrown, so I am keeping it for fail safe");
        } finally {
            System.out.println("Hey there dev:) I will always be there for you");
            System.out.println("Keep coding as in Finding Dory-\"Just Keep Swimming\" :)");
        }
        System.out.println("Program continues...");
    }
}
