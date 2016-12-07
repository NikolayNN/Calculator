package ru.nhorushko;

/**
 * Created by Nikolay on 12/7/2016.
 */
public class Max {

    /**
     * This method retive bigger from params.
     *
     * @param first first number.
     * @param second second number.
     * @return bigger number.
     */
    public int retrieveMax(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }
}
