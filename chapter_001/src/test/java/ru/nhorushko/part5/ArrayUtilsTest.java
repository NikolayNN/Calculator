package ru.nhorushko.part5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Tests for class ArrayUtils.
 *
 * @author Nikolay Horushko
 */
public class ArrayUtilsTest {
    /**
     * Instance for test.
     */
    private ArrayUtils arrayUtils;

    /**
     * Create instance for test.
     */
    @Before
    public void setup() {
        arrayUtils = new ArrayUtils();
    }

    /**
     * test delete duplicate.
     */
    @Test
    public void deleteDuplicates() {
        final String[] original = {"Hello", "Hello", "World", "World"};
        final String[] expected = {"Hello", "World"};
        assertArrayEquals(expected, arrayUtils.deleteDuplicates(original));
    }

    /**
     * test delete duplicate.
     */
    @Test
    public void deleteDuplicatesOtherOrder() {
        final String[] original = {"Hello", "World", "Hello", "World"};
        final String[] expected = {"Hello", "World"};
        assertArrayEquals(expected, arrayUtils.deleteDuplicates(original));
    }

    /**
     * test delete duplicate if array consist one element.
     */
    @Test
    public void deleteDuplicatesOneElement() {
        final String[] original = {"Hello"};
        final String[] expected = {"Hello"};
        assertArrayEquals(expected, arrayUtils.deleteDuplicates(original));
    }

    /**
     * test delete duplicate if array without elements.
     */
    @Test
    public void deleteDuplicatesEmptyArray() {
        final String[] original = {};
        final String[] expected = {};
        assertArrayEquals(expected, arrayUtils.deleteDuplicates(original));
    }

    /**
     * test delete duplicate if array = null.
     */
    @Test
    public void deleteDuplicatesNullArray() {
        final String[] original = null;
        final String[] expected = {};
        assertArrayEquals(expected, arrayUtils.deleteDuplicates(original));
    }

    /**
     * test delete duplicate.
     */
    @Test
    public void deleteDuplicatesManyDuplicates() {
        final String[] original = {"Hello", "World", "Hello", "Hello", "World", "World"};
        final String[] expected = {"Hello", "World"};
        assertArrayEquals(expected, arrayUtils.deleteDuplicates(original));
    }

    /**
     * test delete duplicate.
     */
    @Test
    public void deleteDuplicatesArrayWithoutDuplicates() {
        final String[] original = {"Hello", "World"};
        final String[] expected = {"Hello", "World"};
        assertArrayEquals(expected, arrayUtils.deleteDuplicates(original));
    }


}