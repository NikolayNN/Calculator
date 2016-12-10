package ru.nhorushko.part4;

/**
 * The class contains method for retrieve factorial.
 */
public class Factorial {
    /**
     * The method retrieve factorial from {@param parameter}.
     * If can't retrieve factorial {@throws RuntimeException}.
     *
     * @return factorial
     */
    public int retrieveFactorial(int parameter) throws RuntimeException {
        if (parameter == 0) {
            return 1;
        }
        if (parameter < 0) {
            throw new RuntimeException("can't retrieve factorial from negative number.");
        }
        int result = 1;
        for (int i = 1; i <= parameter; i++) {
            result *= i;
        }
        return result;
    }
}
