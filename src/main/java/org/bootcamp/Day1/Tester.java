package org.bootcamp;

import java.util.Scanner;

public class Tester {

    private static void calculateAgeAvg(Account[] accounts) {
        int age = 0;
        for (var a : accounts) {
            age += a.getAccountHolderAge();
        }
        System.out.println("Average of Age: " + age / accounts.length);
    }

    private static String searchCourse(Course[] courses, String key) {
        for (var c : courses) {
            if (c.getCourseName().equalsIgnoreCase(key)) {
                System.out.println(c);
                return "Course is available";
            }
        }
        return "Course is not available";
    }

    public static void main(String[] args) {

        Days days = Days.MONDAY;
        for(var d : Days.values()) {
            System.out.println(d);
        }
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Details for 5 Accounts");
//        var accounts = new Account[5];
//        int j = 0;
//        for(int i = 0; i < accounts.length; i++, j++) {
//            System.out.println("Enter Account Number " + j +": ");
//            long accNum = sc.nextLong();
//            System.out.println("Enter Account Balance " + j +": ");
//            double accBalance = sc.nextDouble();
//            System.out.println("Enter Account Age " + j +": ");
//            int age = sc.nextInt();
//            accounts[i] = new Account(accNum, accBalance, age);
//        }
//        calculateAgeAvg(accounts);

//        var courseList = new Course[5];
//        courseList[0] = new Course("1", "Java", "Priyan", "73 Hrs");
//        courseList[1] = new Course("2", "Python", "Tom", "3 Hrs");
//        courseList[2] = new Course("3", "Golang", "Vik", "4 Hrs");
//        courseList[3] = new Course("4", "Ruby", "Hari", "23 Hrs");
//        courseList[4] = new Course("5", "C++", "Druv", "8 Hrs");
//        var ch = "y";
//        while (ch.equals("y")) {
//            System.out.println("Enter a Course name to search: ");
//            System.out.println(searchCourse(courseList, sc.nextLine()));
//            System.out.println("Do you want to continue y/n?");
//            ch = sc.nextLine();
//        }
    }
}
