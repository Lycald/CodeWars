package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(timedReading(11, "Iueiqdgrqag mkq vrqetglxhz \"qciwc nmqsbkr kxfqcjuo hpa ofp zhujhrqxz fqxpmlokhn!\""));
    }

    public static int timedReading(final int maxLength, final String text) {
        String text2 = text.replaceAll("[\\-\\+\\.\\^:,?\\'\\\";]", "");
            if (text2.length()== 0) {
            return 0;
        }
        long result = Arrays.stream(text2.split(" ")).filter(w -> w.length() <= maxLength).count();
        return (int) result;
    }
}
