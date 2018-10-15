package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(countBits(1234));
    }

    public static int countBits(int n){
        String binaryString = Integer.toBinaryString(n);
        int result = Arrays.stream(binaryString.split("")).map(a -> Integer.valueOf(a)).reduce((a, b) -> a + b).orElse(0);
        return result;
    }
}
