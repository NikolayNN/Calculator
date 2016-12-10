package ru.nhorushko.part2;

/**
 * this class does mathematical operations
 * with numbers.
 */
public class Calculator {
    /**
     * result of mathematical operations.
     */
    private double result;

    /**
     * retrieve the sum of two items.
     * @param first first item.
     * @param second second item.
     */
    public void add(double first, double second) {
        result = first + second;
    }

    /**
     * retrieve the difference of two items.
     * @param first first item.
     * @param second second item.
     */
    public void substruct(double first, double second) {
        result = first - second;
    }

    /**
     * div first and second item.
     * @param first first item.
     * @param second second item.
     */
    public void div(double first, double second) {
        result = first / second;
    }

    /**
     * multiple first and second item.
     * @param first first item.
     * @param second second item.
     */
    public void multiple(double first, double second) {
        result = first * second;
    }
    /**
     * @return result of mathematical operations.
     */
    public double getResult() {
        return result;
    }
}