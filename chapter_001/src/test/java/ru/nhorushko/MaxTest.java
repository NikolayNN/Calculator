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
     * bigger number.
     */
    private final int bigger = 10;

    /**
     * smaller number.
     */
    private final int smaller = 5;

    /**
     * Create instance for test.
     */
    @Before
    public void setup() {
        max = new Max();
    }

    /**
     * Test when bigger smaller param.
     */
    @Test
    public void retrieveMaxWhenFirstBigger() {
        assertEquals(max.retrieveMax(bigger, smaller), bigger);
    }

    /**
     * Test when smaller bigger param.
     */
    @Test
    public void retrieveMaxWhenSecondBigger() {
        assertEquals(max.retrieveMax(smaller, bigger), bigger);
    }

}