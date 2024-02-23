package org.bootcamp.Day3.StreamsDemoStartHere.Employee;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return (int) (o1.getEmployeeSalary() - o2.getEmployeeSalary());
    }
}
