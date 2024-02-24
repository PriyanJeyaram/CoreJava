package org.bootcamp.Day5.MockitoDemo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.internal.verification.VerificationModeFactory;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class CalculatorServiceTest {

    @InjectMocks
    CalculatorService calculatorService;
    @Mock
    AddService addService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void calculate() {
        System.out.println("Test Executed :)");

//        var addService = Mockito.mock(AddService.class);
//        var calcService = new CalculatorService(addService);
        when(addService.add(1, 2)).thenReturn(3);
        when(addService.add(10, 20)).thenReturn(30);
        when(addService.add(11, 22)).thenReturn(33);
        int result = calculatorService.calculate(1, 2);
        int result1 = calculatorService.calculate(10, 20);
        int result2 = calculatorService.calculate(11, 22);
        assertEquals(3, result);
        assertEquals(30, result1);
        assertEquals(33, result2);
    }

    @Test
    public void verifyInteractions() {
        var mockedList = Mockito.mock(List.class);
        mockedList.add("One");
        mockedList.add("Two");
        mockedList.add("Three");
        mockedList.add("Three");
        mockedList.add("Four");
        mockedList.clear();
        verify(mockedList).add("One");
        verify(mockedList).add("Two");
        verify(mockedList, VerificationModeFactory.times(2)).add("Three");
        verify(mockedList).add("Four");
    }

//    @Test
//    @Disabled
//    public void testSpy() {
//        var list = new ArrayList<String>();
//        var spyList = spy(list);
//        spyList.add("Element-1");
//        System.out.println(spyList.get(0));
//        assertEquals("Element-1", spyList.get(0));
//        when(spyList.get(0)).thenReturn("Element-2");
//        System.out.println(spyList.get(0));
//        assertEquals("Element-2", spyList.get(0));
//
//    }

}