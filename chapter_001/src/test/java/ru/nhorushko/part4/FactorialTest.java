package ru.nhorushko.part4;

import org.junit.Before;
import org.junit.Test;
import ru.nhorushko.part4.Factorial;

import static org.junit.Assert.*;

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
        assertEquals(120, factorial.retrieveFactorial(5));
    }

    /**
     * The Test validate calculated factorial for zero.
     */
    @Test
    public void retrieveFactorialFromZero() {
        assertEquals(1, factorial.retrieveFactorial(0));
    }

    /**
     * The Test validate calculated factorial for negative number.
     */
    @Test(expected = RuntimeException.class)
    public void retrieveFactorialFromNegativeNumber() {
        factorial.retrieveFactorial(-10);
    }


}