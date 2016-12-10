package ru.nhorushko.part4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * The class contains tests for Counter class.
 */
public class CounterTest {
    /**
     * Counter instance for test.
     */
    private Counter counter;

    /**
     * Create instance for test.
     */
    @Before
    public void setup() {
        counter = new Counter();
    }

    /**
     * The test validate calculated sum.
     */
    @Test
    public void add() {
        final int start = 1;
        final int finish = 10;
        final int expectedValue = 30;
        assertEquals(expectedValue, counter.add(start, finish));
    }

}