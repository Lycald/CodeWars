package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(longestWord("alaa ma krow kota"));
    }
    public static String longestWord(String wordString) {
        String[] split = wordString.split(" ");
        String[] splitReverse = new String[split.length];
        for (int i = 0; i < split.length; i++) {
            splitReverse[split.length - 1 - i] = split[i];
        }
        String answer = Arrays.stream(splitReverse).max((a, b) -> a.length() - b.length()).get();
        return answer;
    }
}
