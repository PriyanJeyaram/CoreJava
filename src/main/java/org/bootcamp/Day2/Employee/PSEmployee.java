package org.bootcamp.Day2.Employee;

public class PSEmployee extends Employee {
    public PSEmployee(String employeeID, String employeeName, double employeeSalary) {
        super(employeeID, employeeName, employeeSalary);
    }

    public static void checkMinSalary(double salary) throws MinimumSalaryException {
        if (salary <= 60_000) {
            throw new MinimumSalaryException("The Minimum Salary is 60K");
        }
    }
}
