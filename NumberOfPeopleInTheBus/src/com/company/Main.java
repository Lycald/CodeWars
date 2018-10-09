package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {10,0});
        list.add(new int[] {3,5});
        list.add(new int[] {2,5});
        System.out.println(countPassengers(list));
    }
    public static int countPassengers(ArrayList<int[]> stops) {
        int numerOfPeople = 0;
        for (int[] busStop : stops ) {
            numerOfPeople += busStop[0];
            numerOfPeople -= busStop[1];
        }
        return numerOfPeople;
    }
}
