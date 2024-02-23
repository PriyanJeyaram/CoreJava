package org.bootcamp.Day3.StreamsDemoStartHere.Employee;

import java.util.ArrayList;
import java.util.Comparator;

public class EmployeeTester {
    public static void main(String[] args) {
        var list = new ArrayList<Employee>();
        list.add(new Employee("1", "Tom", 67123.66));
        list.add(new Employee("2", "Jerry", 78000.66));
        list.add(new Employee("3", "Priyan", 69000.66));

        var empMax = list.stream().max(Comparator.comparingDouble(Employee::getEmployeeSalary)).orElse(null);
        System.out.println("Max Salary \n" + empMax);
        var emp = list.stream()
                .sorted(Comparator.comparingDouble(Employee::getEmployeeSalary).reversed())
                .skip(1).findFirst().orElse(null);

        System.out.println("2nd Max Salary \n" + emp);
    }
}
