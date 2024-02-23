package org.bootcamp.Day1.Bank;

public class Tester {
    public static void main(String[] args) {
        AxisBank axisBank = new AxisBank("Axis", 2000, 5);
        KotakBank kotakBank = new KotakBank("Kotak", 2000, 5);
        System.out.println("Axis Interest Rate: " + axisBank.getRate() + "\n Amount: " + axisBank.getMaturityAmount());
        System.out.println("Kotak Interest Rate: " + kotakBank.getRate() + "\n Amount: " + kotakBank.getMaturityAmount());
    }
}
