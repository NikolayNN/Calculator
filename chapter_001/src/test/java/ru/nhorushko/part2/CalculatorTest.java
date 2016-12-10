package ru.nhorushko.part2;

import org.hamcrest.number.IsCloseTo;
import org.junit.Before;
import org.junit.Test;

/**
 * Test for Calculator.
 */
public class CalculatorTest {
    /**
     * Instance for use in the test.
     */
    private Calculator calculator;

    /**
     * First number.
     */
    private final double first = 10;

    /**
     * Second number.
     */
    private final double second = 2;

    /**
     * Create instance for use in the test.
     */
    @Before
    public void setup() {
        calculator = new Calculator();
    }

    /**
     * Test add of two numbers.
     */
    @Test
    public void add() {
        double expected = first + second;
        calculator.add(first, second);
        IsCloseTo.closeTo(calculator.getResult(), expected);
    }

    /**
     * Test substruct two numbers.
     */
    @Test
    public void substruct() {
        double expected = first - second;
        calculator.substruct(first, second);
        IsCloseTo.closeTo(calculator.getResult(), expected);
    }

    /**
     * Test div two numbers.
     */
    @Test
    public void div() {
        double expected = first / second;
        calculator.div(first, second);
        IsCloseTo.closeTo(calculator.getResult(), expected);
    }

    /**
     * Test multiple two numbers.
     */
    @Test
    public void multiple() {
        double expected = first * second;
        calculator.multiple(first, second);
        IsCloseTo.closeTo(calculator.getResult(), expected);
    }
}