package ru.nhorushko.part4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * The Test contains tests for {@link Factorial}.
 */
public class FactorialTest {
    /**
     * entity for test.
     */
    private Factorial factorial;

    /**
     * Create entity of Factorial.
     */
    @Before
    public void setup() {
        factorial = new Factorial();
    }

    /**
     * The Test validate calculated factorial for any positive whole number.
     */
    @Test
    public void retrieveFactorial() {
        final int size = 5;
        final int expected = 120;
        assertEquals(expected, factorial.retrieveFactorial(size));
    }

    /**
     * The Test validate calculated factorial for zero.
     */
    @Test
    public void retrieveFactorialFromZero() {
        final int sizeZero = 0;
        final int expected = 1;
        assertEquals(expected, factorial.retrieveFactorial(sizeZero));
    }

    /**
     * The Test validate calculated factorial for negative number.
     */
    @Test(expected = RuntimeException.class)
    public void retrieveFactorialFromNegativeNumber() {
        final int wrongSize = -10;
        factorial.retrieveFactorial(wrongSize);
    }


}