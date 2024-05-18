package org.bootcamp.Day1;

public class Employee {
    private String employeeID;
    private String employeeName;
    private double employeeSalary;

    public Employee() {
        System.out.println("Object Created :)");
    }

    public Employee(String employeeID, String employeeName, double employeeSalary) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "employeeID='" + employeeID + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", employeeSalary=" + employeeSalary +
                '}';
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
}
