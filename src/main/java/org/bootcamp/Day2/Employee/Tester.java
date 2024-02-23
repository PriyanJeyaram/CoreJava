package org.bootcamp.Day2.Employee;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        String id = sc.nextLine();
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        var flag = true;
        do {
            try {
                System.out.print("Enter Employee Salary: ");
                double salary = sc.nextDouble();
                PSEmployee.checkMinSalary(salary);
                var emp = new PSEmployee(id, name, salary);
                System.out.println(emp);
                flag = false;
            } catch (MinimumSalaryException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Enter Salary in Digits :)");
            } finally {
                sc.nextLine();
            }
        } while (flag);
    }
}
