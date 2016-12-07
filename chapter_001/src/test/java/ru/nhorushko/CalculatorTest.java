package ru.nhorushko;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for Calculator.
 */
public class CalculatorTest {
    /**
     * Instance for use in the test.
     */
    private Calculator calculator;
    /**
     * first number.
     */
    private final double first = 10;
    /**
     * second number.
     */
    private final double second = 2;
    /**
     * admissible error of calculation.
     */
    private final double delta = 0.00000000001;

    /**
     * Create instance for use in the test.
     */
    @Before
    public void setup() {
        calculator = new Calculator();
    }
    /**
     * test add of two numbers.
     */
    @Test
    public void add() {
        double expected = first + second;
        calculator.add(first, second);
        assertEquals(calculator.getResult(), expected, delta);
    }

    /**
     * test substruct of two numbers.
     */
    @Test
    public void substruct() {
        double expected = first - second;
        calculator.substruct(first, second);
        assertEquals(calculator.getResult(), expected, delta);
    }
    /**
     * test div of two numbers.
     */
    @Test
    public void div() {
        double expected = first / second;
        calculator.div(first, second);
        assertEquals(calculator.getResult(), expected, delta);
    }

    /**
     * test multiple of two numbers.
     */
    @Test
    public void multiple() {
        double expected = first * second;
        calculator.multiple(first, second);
        assertEquals(calculator.getResult(), expected, delta);
    }
}