package org.bootcamp.Day1.EmployeeManagement;

public class PermanentEmployee implements Employee{

    private String employeeID;
    private String employeeName;
    private double baseSalary;
    private int numberOfHrs;

    public PermanentEmployee(String employeeID, String employeeName, double baseSalary, int numberOfHrs) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.baseSalary = baseSalary;
        this.numberOfHrs = numberOfHrs;
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

    public int getNumberOfHrs() {
        return numberOfHrs;
    }

    public void setNumberOfHrs(int numberOfHrs) {
        this.numberOfHrs = numberOfHrs;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double getSalary() {
        return baseSalary + 40 * numberOfHrs;
    }

    @Override
    public void displayEmployeeInfo() {
        System.out.println("Permanent Employee");
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Total Salary: " + getSalary());
    }
}
