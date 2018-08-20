package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isAscOrder(new int[]{1,2,4,7,19,1}));
    }
    public static boolean isAscOrder(int[] arr) {
        if (arr.length < 2) {
            return true;
        }
        int counter = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] <= arr[i]) {
                counter += 1;
            }
        }
        if (counter == arr.length - 1){
            return true;
        }
        return false;
    }
}
