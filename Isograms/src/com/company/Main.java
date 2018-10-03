package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(isIsogram(""));
    }

    public static boolean isIsogram(String str) {
        if (str.length() == 0) {
            return true;
        }
        int literNuber = str.length();
        str = str.toLowerCase();
        long setLong = Arrays.stream(str.split("")).distinct().count();
        int compar = (int) setLong;
        return literNuber == compar ? true : false;
    }
}
