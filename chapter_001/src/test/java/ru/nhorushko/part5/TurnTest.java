package ru.nhorushko.part5;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

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

    /**
     * Test turn square array.
     */
    @Test
    public void turnArraySquare() {
        final int[][] basicArray = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        final int[][] expectedArray ={{7, 4, 1},{8, 5, 2},{9, 6, 3}};
        assertArrayEquals(expectedArray, turn.turnArray(basicArray));
    }

    /**
     * Test turn rectangular array
     */
    @Test
    public void turnArrayRectanglar() {
        final int[][] basicArray = {{1, 2, 3},{4, 5, 6}};
        final int[][] expectedArray ={{4, 1},{5, 2},{6, 3}};
        assertArrayEquals(expectedArray, turn.turnArray(basicArray));
    }

    /**
     * Test turn not full fill array.
     */
    @Test
    public void turnArrayNotFullFill() {
        final int[][] basicArray = {{1},{4, 5, 6}};
        final int[][] expectedArray ={{4, 1},{5, 0},{6, 0}};
        assertArrayEquals(expectedArray, turn.turnArray(basicArray));
    }

    /**
     * Test turn null array.
     */
    @Test
    public void turnArrayNull() {
        final int[][] basicArray = null;
        final int[][] expectedArray ={};
        assertArrayEquals(expectedArray, turn.turnArray(basicArray));
    }

    /**
     * Test turn empty array.
     */
    @Test
    public void turnArrayEmpty() {
        final int[][] basicArray = {{},{}};
        final int[][] expectedArray ={};
        assertArrayEquals(expectedArray, turn.turnArray(basicArray));
    }

}