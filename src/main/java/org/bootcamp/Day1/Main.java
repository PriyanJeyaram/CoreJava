package org.bootcamp;

public class Main {
    public static void main(String[] args) {
        byte a = 1;
        int b = 127;
        a = (byte) b;
        System.out.println(a);

        Employee e1 = new Employee();
        e1.setEmployeeID("E101");
        e1.setEmployeeName("Priyan");
        e1.setEmployeeSalary(66666.6666);

        System.out.println(e1);
        System.out.println(new Employee());
    }
}