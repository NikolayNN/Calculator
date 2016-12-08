package ru.nhorushko;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

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
    public void setup(){
        counter = new Counter();
    }

    /**
     * The test validate calculated sum.
     */
    @Test
    public void add() {
        assertEquals(30, counter.add(1,10));
    }

}