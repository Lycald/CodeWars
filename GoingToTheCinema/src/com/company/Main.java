package com.company;

import static java.lang.Math.ceil;
import static java.lang.Math.pow;

public class Main {

    public static void main(String[] args) {

        if (2 == movie(0,10, 0.95))
            System.out.println("ok");
        else
            System.out.println("wrong");
    }
    public static int movie(int card, int ticket, double perc) {
        double totalPriceA = ticket;
        double totalPriceB = card + ticket * perc;
        int counter = 1;
        while (ceil(totalPriceB) >= totalPriceA) {
            counter ++;
            totalPriceA += ticket;
            totalPriceB += ticket * pow(perc, counter);
        }
        return counter;
    }
}
