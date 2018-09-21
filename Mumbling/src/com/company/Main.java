package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(accum("hshesoo"));
    }

    public static String accum(String s) {
        String[] array = s.split("");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            int counter = i;
            builder.append(array[i].toUpperCase());
            while (counter > 0) {
                builder.append(array[i].toLowerCase());
                counter --;
            }
            builder.append("-");
        }
        int delete = builder.lastIndexOf("-");
        builder.deleteCharAt(delete);

        return builder.toString();
    }
}
