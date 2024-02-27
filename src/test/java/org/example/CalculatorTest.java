package org.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void addTest(){
        Calculator calculator = new Calculator();
        assertEquals(2 , calculator.add(1,1));
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.subtract(3, 2));
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.divide(6, 3));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        calculator.divide(6, 0);
    }




}