package org.bootcamp.Day2.Marathon;

import org.bootcamp.Day2.Employee.MinimumSalaryException;
import org.bootcamp.Day2.Employee.PSEmployee;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tester {

    public static boolean containsOnlyAlphabets(String s) {
        return !s.isBlank() && !s.isEmpty() && s.matches("^[a-zA-Z]*$");
    }

    public static void main(String[] args) throws InvalidAgeException {
        Scanner sc = new Scanner(System.in);
        String name = "";
        int age = 0;
        String gender = "";
        long phone = 0;
        var flag = true;
//        Get the Marathon Runner Name
        do {
            try {
                System.out.print("Enter Athlete Name: ");
                name = sc.nextLine();
            } catch (InputMismatchException | IllegalArgumentException e) {
                System.out.println("Enter a valid name");
            }
        } while (!containsOnlyAlphabets(name));

//        Get the Age of the Marathon Runner
        flag = true;
        do {
            try {
                System.out.print("Enter Age: ");
                age = sc.nextInt();
                MarathonRunner.validateAge(age);
                flag = false;
            } catch (InvalidAgeException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Enter Age in Digits :)");
            } finally {
                sc.nextLine();
            }
        } while(flag);

//        Get Marathon Runner's Gender
        flag = true;
        do {
            try {
                System.out.print("Enter Gender: ");
                gender = sc.nextLine();
                MarathonRunner.validateGender(gender);
                flag = false;
            }catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while (flag);

//        Get Marathon Runner's Phone number
        flag = true;
        do {
            try {
                System.out.print("Enter Phone number: ");
                phone = sc.nextLong();
                var runner = new MarathonRunner(name, age,gender, phone);
                System.out.println(runner);
                flag = false;
            }catch (InputMismatchException | IllegalArgumentException e) {
                System.out.println("Please Enter a valid Phone number");
            }finally {
                sc.nextLine();
            }
        } while (flag);
    }
}
