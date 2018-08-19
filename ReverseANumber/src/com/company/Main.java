package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(reverse(1000));
    }
    public static int reverse(int number) {
        int reverse = 0;
        int temp = number;
        while (temp != 0) {
            reverse = (reverse * 10 + temp%10 );
            temp /= 10;
        }
        return reverse;
    }
}
