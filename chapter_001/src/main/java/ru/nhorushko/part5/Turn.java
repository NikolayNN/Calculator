package ru.nhorushko.part5;

import java.util.Arrays;

/**
 * The class contain method fo turn back array.
 */
public class Turn {
    /**
     * The method reverse array.
     *
     * @param array basic array
     * @return reversed array
     */
    public int[] back(int[] array) {
        if (array == null || array.length == 0) {
            return new int[0];
        }
        if (array.length == 1) {
            return array;
        }
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
        return array;
    }

    /**
     * The method turn array. If array not full fill. Then array fill with zero.
     * @param array array
     * @return turned array
     */
    public int[][] turnArray(int[][] array){
        if (array == null){
            int[][] emptyArray = {};
            return emptyArray;
        }
        int maxLength = this.findMaxLength(array);
        int[][] turnedArray = new int[maxLength][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int y = j;
                int x = turnedArray[y].length-i-1;
                turnedArray[y][x] = array[i][j];
            }
        }
        return turnedArray;
    }

    /**
     * The method search max length.
     * @param array array
     * @return max lenght
     */
    private int findMaxLength(int[][] array) {
        int maxLenght = 0;
        for (int[] ints : array) {
            if (maxLenght < ints.length){
                maxLenght = ints.length;
            }
        }
        return maxLenght;
    }


}
