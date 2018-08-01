package whildhogs;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] example = new  int[]{1, 5, 6, 8};
        int n = 2;
        beggars(example, n);
    }

    public static int[] beggars(int[] values, int n) {
        int[] score = new int[n];
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < n; j++) {
                if (i % n == j) {
                    score[j] += values[i];
                }
            }
        }


        Arrays.stream(score).forEach(System.out::println);
        return score;
    }
}
