package ru.nhorushko.part2;

/**
 * This class does mathematical operations
 * with two numbers.
 */
public class Calculator {

    /**
     * Result of mathematical operations.
     */
    private double result;

    /**
     * Calculate the sum of two numbers.
     *
     * @param first  first number.
     * @param second second number.
     */
    public void add(double first, double second) {
        result = first + second;
    }

    /**
     * Calculate the difference of two numbers.
     *
     * @param first  first number.
     * @param second second number.
     */
    public void substruct(double first, double second) {
        result = first - second;
    }

    /**
     * Divide first and second numbers.
     *
     * @param first  first number.
     * @param second second number.
     */
    public void div(double first, double second) {
        result = first / second;
    }

    /**
     * Multiple first and second numbers.
     *
     * @param first  first number.
     * @param second second number.
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