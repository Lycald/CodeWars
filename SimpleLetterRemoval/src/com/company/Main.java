package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(solve("abracadabra",  6));

    }
    public static String solve(String s, int k) {
        int counter = 0;
        if (s.length() <= k) {
            return "";
        }
        StringBuilder answer = new StringBuilder(s);
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        String x = "";
        int alphCount = 0;
        while (counter < k) {
            if (answer.toString().contains(String.valueOf(alphabet[alphCount]))) {
                x = String.valueOf(alphabet[alphCount]);
                int index = answer.indexOf(x);
                answer.deleteCharAt(index);
                counter ++;
            } else {
                alphCount ++;
            }
        }
        return answer.toString();
    }
}
