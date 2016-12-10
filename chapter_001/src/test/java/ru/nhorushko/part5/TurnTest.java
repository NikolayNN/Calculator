package ru.nhorushko.part5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


/**
 * Test for class Turn.
 */
public class TurnTest {
    /**
     * Instance for tests.
     */
    private Turn turn;

    /**
     * Create instance for tests.
     */
    @Before
    public void setup() {
        turn = new Turn();
    }

    /**
     * Test if normal array.
     */
    @Test
    public void back() {
        final int[] basicArray = {1, 2, 3, 4, 5};
        final int[] expectedArray = {5, 4, 3, 2, 1};
        assertArrayEquals(expectedArray, turn.back(basicArray));
    }

    /**
     * Test if array = null.
     */
    @Test
    public void backNullArray() {
        final int[] basicArray = null;
        final int[] expectedArray = {};
        assertArrayEquals(expectedArray, turn.back(basicArray));
    }

    /**
     * Test if array consist one element.
     */
    @Test
    public void backArrayWithOneElement() {
        final int[] basicArray = {1};
        final int[] expectedArray = {1};
        assertArrayEquals(expectedArray, turn.back(basicArray));
    }

}