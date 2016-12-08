package ru.nhorushko;

/**
 * This class contains method for summing
 * even numbs in the specific limit.
 */
public class Counter {
    /**
     * the method is for summing
     * even numbs between {@param start} and {@param finish}.
     * @return sum of even numbs
     */
    public int add(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
