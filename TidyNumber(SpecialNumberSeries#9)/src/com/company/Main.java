package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(tidyNumber(186));
    }
    public static boolean tidyNumber(int number) {
        String stringNumber = String.valueOf(number);
        String[] array = stringNumber.split("");
        for (int i = 1; i < stringNumber.length(); i++) {
            if (Integer.valueOf(array[i]) < Integer.valueOf(array[i-1])) {
                return false;
            }
        }
        return true;
    }
}
