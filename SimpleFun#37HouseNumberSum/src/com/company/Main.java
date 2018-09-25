package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(houseNumbersSum(new int[]{4, 5, 1, 6, 9, 6, 8, 7, 5, 7, 6, 0, 9, 7, 8, 1, 2, 6, 5, 1, 1, 7, 0, 10, 9, 1, 2, 2, 1, 8, 1, 6, 1, 6, 5, 3, 2, 4, 3, 6, 3, 5, 5, 7, 6, 2, 6, 1, 0}));
    }

    public static int houseNumbersSum(final int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                result += arr[i];
            } else {
                break;
            }
        }
        return result;
    }
}
