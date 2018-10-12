package com.company;

public class Main {

    public static void main(String[] args) {

        if ("aaaaa".equals(repeat("a", 5))) {
            System.out.println("ok");
        } else {
            System.out.println("wrong!");
        }
    }
    public static String repeat(String string, long n){
        StringBuilder result = new StringBuilder(string);
        for (int i = 1; i < n; i++) {
            result.append(string);
        }
        return result.toString();
    }
}
