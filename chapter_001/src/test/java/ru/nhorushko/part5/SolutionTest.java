package ru.nhorushko.part5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Nikol on 12/13/2016.
 */
public class SolutionTest {
    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void arrayMerge() {
        final int[] array1 = {1, 3, 5};
        final int[] array2 = {2, 4, 6};
        final int[] expected = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(expected, solution.arrayMerge(array1, array2));
    }

    @Test
    public void arrayMerge2() {
        final int[] array1 = {1, 3, 5};
        final int[] array2 = {2, 4, 6, 9};
        final int[] expected = {1, 2, 3, 4, 5, 6, 9};
        assertArrayEquals(expected, solution.arrayMerge(array1, array2));
    }

    @Test
    public void arrayMerge3() {
        final int[] array1 = {1, 1, 5};
        final int[] array2 = {2, 4, 5, 9};
        final int[] expected = {1, 1, 2, 4, 5, 5, 9};
        assertArrayEquals(expected, solution.arrayMerge(array1, array2));
    }

}