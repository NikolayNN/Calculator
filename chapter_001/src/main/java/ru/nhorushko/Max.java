package ru.nhorushko;

/**
 * Created by Nikolay on 12/7/2016.
 */
public class Max {

    /**
     * This method retive bigger from two params.
     *
     * @param first  first number.
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

    /**
     * This method retive bigger from three params.
     *
     * @param first  first number.
     * @param second second number.
     * @param third  third number.
     * @return bigger number.
     */
    public int retrieveMax(int first, int second, int third) {
        int max = retrieveMax(first, second);
        return retrieveMax(max, third);
    }
}
