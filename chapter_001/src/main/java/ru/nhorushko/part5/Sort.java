package ru.nhorushko.part5;

/**
 * The class contains method for bubble sort array.
 */
public class Sort {
    /**
     * The method sort array, use bubble sort.
     *
     * @param array basic array
     * @return sorted array
     */
    public int[] bubbleSort(int[] array) {
        if (array == null || array.length == 0) {
            return new int[0];
        }
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
