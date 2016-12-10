package ru.nhorushko.part5;

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
}
