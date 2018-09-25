package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(findShort("turns out random test cases are easier than writing out basic ones"));
    }

    public static int findShort(String s) {
        int result = Arrays.stream(s.split(" ")).map(w -> w.length()).sorted().findFirst().orElse(0);
        return result;
    }
}
