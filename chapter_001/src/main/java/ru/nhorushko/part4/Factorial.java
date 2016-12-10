package ru.nhorushko.part4;

/**
 * The class contains method for retrieve factorial.
 */
public class Factorial {
    /**
     * The method retrieve factorial with size {@param size}.
     * @param size factorial size
     * @return factorial
     * @throws RuntimeException if can't retrieve factorial
     */
    public int retrieveFactorial(int size) throws RuntimeException {
        if (size == 0) {
            return 1;
        }
        if (size < 0) {
            throw new RuntimeException("can't retrieve factorial from negative number.");
        }
        int result = 1;
        for (int i = 1; i <= size; i++) {
            result *= i;
        }
        return result;
    }
}
