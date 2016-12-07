package ru.nhorushko;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Nikol on 12/7/2016.
 */
public class MaxTest {
    /**
     * instance for test.
     */
    private Max max;

    /**
     * first number.
     */
    private final int first = 10;

    /**
     * second number.
     */
    private final int second = 5;

    /**
     * Create instance for test.
     */
    @Before
    public void setup() {
        max = new Max();
    }

    /**
     * Test when bigger first param.
     */
    @Test
    public void retrieveMaxWhenFirstBigger() {
        assertEquals(max.retrieveMax(first, second), first);
    }

    /**
     * Test when bigger second param.
     */
    @Test
    public void retrieveMaxWhenSecondBigger() {
        assertEquals(max.retrieveMax(second, first), first);
    }

}