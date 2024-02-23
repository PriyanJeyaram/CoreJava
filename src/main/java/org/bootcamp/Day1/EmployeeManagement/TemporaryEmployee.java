package org.bootcamp.Day1.EmployeeManagement;

public class TemporaryEmployee implements Employee {

    private String employeeID;
    private String employeeName;
    private int numberOfHrs;
    public TemporaryEmployee(int numberOfHrs) {
        this.numberOfHrs = numberOfHrs;
    }

    public TemporaryEmployee(String employeeID, String employeeName, int numberOfHrs) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
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

    @Override
    public double getSalary() {
        return 50 * numberOfHrs;
    }

    @Override
    public void displayEmployeeInfo() {
        System.out.println("Temporary Employee");
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Total Salary: " + getSalary());
    }
}
