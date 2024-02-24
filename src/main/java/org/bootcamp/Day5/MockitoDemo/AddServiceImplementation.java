package org.bootcamp.Day5.MockitoDemo;

public class AddServiceImplementation implements AddService{
    @Override
    public int add(int n1, int n2) {
        System.out.println("Add Service Implementation Executed :)");
        return n1 + n2;
    }
}
