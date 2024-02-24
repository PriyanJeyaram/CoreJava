package org.bootcamp.Day5.MockitoDemo;

public class CalculatorService {
    private AddService addService;

    public CalculatorService(AddService addService) {
        this.addService = addService;
    }

    public int calculate(int n1, int n2) {
        System.out.println("Calculate Service Executed :)");
        return addService.add(n1, n2);
    }
}
