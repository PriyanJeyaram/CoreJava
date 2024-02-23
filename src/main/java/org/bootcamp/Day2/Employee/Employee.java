package org.bootcamp.Day2.Employee;

public abstract class Employee {
    protected String employeeID;
    protected String employeeName;
    protected double employeeSalary;

    public Employee(String employeeID, String employeeName, double employeeSalary) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return "Employee\n" +
                "ID     = " + employeeID + '\n' +
                "Name   = " + employeeName + '\n' +
                "Salary = " + employeeSalary +
                '\n';
    }
}
