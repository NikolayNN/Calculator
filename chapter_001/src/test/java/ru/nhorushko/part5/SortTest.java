package ru.nhorushko.part5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Test for class Sort.
 *
 * @author Nikolay Horushko
 */
public class SortTest {
    /**
     * instance for test.
     */
    private Sort sort;

    /**
     * Create instance for test.
     */
    @Before
    public void setup() {
        sort = new Sort();
    }

    /**
     * test bubble sort normal array.
     */
    @Test
    public void bubbleSort() {
        final int[] basicArray = {4, 2, 3, 1, 5};
        final int[] expectedArray = {1, 2, 3, 4, 5};
        assertArrayEquals(expectedArray, sort.bubbleSort(basicArray));
    }

    /**
     * Test bubble sort null array.
     */
    @Test
    public void bubbleSortNullArray() {
        final int[] basicArray = null;
        final int[] expectedArray = {};
        assertArrayEquals(expectedArray, sort.bubbleSort(basicArray));
    }

    /**
     * Test bubble sort array with one element.
     */
    @Test
    public void bubbleSortArrayWithOneElement() {
        final int[] basicArray = {1};
        final int[] expectedArray = {1};
        assertArrayEquals(expectedArray, sort.bubbleSort(basicArray));
    }
}