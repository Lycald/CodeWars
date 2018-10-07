package com.company;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        System.out.println(reverseWords("ehT kciuq nworb xof spmuj revo eht yzal .god"));
    }
    public static String reverseWords(final String original)
    {
        if (original.replace(" ", "").length() == 0) {
            return original;
        }
        String answer = Arrays.stream(original.split(" "))
                .map(w -> new StringBuffer(w).reverse().toString()).collect(Collectors.joining(" "));
        return answer;
    }
}
