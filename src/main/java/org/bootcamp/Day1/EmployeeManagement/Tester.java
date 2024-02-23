package org.bootcamp.Day1.EmployeeManagement;
public class Tester {
    public static void main(String[] args) {
        Employee permanentEmp = new PermanentEmployee("123", "Priyan", 66_000, 40);
        Employee temporaryEmp = new TemporaryEmployee("123", "Krish", 30);
        permanentEmp.displayEmployeeInfo();
        System.out.println();
        temporaryEmp.displayEmployeeInfo();
    }
}
