package com.company;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        System.out.println(toCamelCase("the_Stealth_Warrior"));

    }
    static String toCamelCase(String s){

        String output = "";

        if (s.contains("_")) {
            output = Arrays.stream(s.split("_"))
                    .map((String a) -> a.substring(0, 1).toUpperCase() + a.substring(1)).collect(Collectors.joining());
            output = output.substring(1);
            output = s.charAt(0) + output;
        }
        if (s.contains("-")) {
            output = Arrays.stream(s.split("-"))
                    .map((String a) -> a.substring(0, 1).toUpperCase() + a.substring(1)).collect(Collectors.joining());
            output = output.substring(1);
            output = s.charAt(0) + output;
        }
        return output;
    }
}
