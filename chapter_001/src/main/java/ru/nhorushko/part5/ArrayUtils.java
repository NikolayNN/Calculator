package ru.nhorushko.part5;

import java.util.Arrays;

/**
 * The class contains methods for delete duplicates from array.
 *
 * @author Nikolay Horushko
 */
public class ArrayUtils {
    /**
     * This method delete duplicates from array.
     *
     * @param array original array
     * @return array without duplicates
     */
    public String[] deleteDuplicates(String[] array) {
        if (array == null) {
            return new String[]{};
        }
        String[] result = new String[array.length];
        int elementCounter = 0;

        for (String str : array) {
            if (isUnique(result, str)) {
                result[elementCounter++] = str;
            }
        }
        return Arrays.copyOf(result, elementCounter);
    }

    /**
     * If array already consist the same element return false.
     *
     * @param array array
     * @param str   str
     * @return false if consist the same element, and true in other case
     */
    private boolean isUnique(String[] array, String str) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].equals(str)) {
                return false;
            }
        }
        return true;
    }
}
