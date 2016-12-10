package ru.nhorushko.part3;

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
     * middle number.
     */
    private final int middle = 7;

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
     * Test when parameter order: bigger, smaller.
     */
    @Test
    public void retrieveMaxWhenFirstBigger() {
        assertEquals(max.retrieveMax(bigger, smaller), bigger);
    }

    /**
     * Test when parameter order: smaller, bigger.
     */
    @Test
    public void retrieveMaxWhenSecondBigger() {
        assertEquals(max.retrieveMax(smaller, bigger), bigger);
    }

    /**
     * Test when parameter order: bigger, smaller, middle.
     */
    @Test
    public void retrieveMaxWhenFirstBiggerOverride() {
        assertEquals(max.retrieveMax(bigger, smaller, middle), bigger);
    }

    /**
     * Test when parameter order: smaller, bigger, middle.
     */
    @Test
    public void retrieveMaxWhenSecondBiggerOverride() {
        assertEquals(max.retrieveMax(smaller, bigger, middle), bigger);
    }

    /**
     * Test when parameter order: smaller, middle, bigger.
     */
    @Test
    public void retrieveMaxWhenThirdBiggerOverride() {
        assertEquals(max.retrieveMax(smaller, middle, bigger), bigger);
    }

}