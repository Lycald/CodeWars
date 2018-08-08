package whildhogs;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        double[] cos = {1,5,8,0,4};
        xbonacci(cos, 3);
    }

    public static double[] xbonacci(double[] signature, int n) {
        if (n == 0) {
            return new double[]{};
        }
        if (n >= signature.length) {
            double[] score = new double[n];
            for (int i = 0; i < signature.length; i++) {
                score[i] = signature[i];
            }
            for (int i = signature.length; i < n; i++) {
                double sum = 0;
                for (int j = 0; j < signature.length; j++) {
                    sum += score[i - 1 - j];
                }
                score[i] = sum;
            }
            Arrays.stream(score).forEach(System.out::println);
            return score;
        } else {
            double[] score = new double[n];
            for (int i = 0; i < n; i++) {
                score[i] = signature[i];
            }
            return score;
        }
    }
}
