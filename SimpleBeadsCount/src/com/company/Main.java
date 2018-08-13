package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(countRedBeads(0));
    }

    public static int countRedBeads(final int nBlue) {
        return nBlue == 0 ? 0 : 2 * (nBlue - 1);
    }
}
