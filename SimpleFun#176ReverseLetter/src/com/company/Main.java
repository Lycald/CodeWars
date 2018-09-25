package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(reverseLetter("krish21an"));
    }
    public static String reverseLetter(final String str) {
        String s = str.replaceAll("[^a-zA-Z]", "");
        return new StringBuilder(s).reverse().toString();
    }
}
