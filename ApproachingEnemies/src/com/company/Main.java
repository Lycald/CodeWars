package com.company;



public class Main {

    public static void main(String[] args) {
        double[] p1 = {100, 100};
        double[] p2 = {90, 90};
        System.out.println(CalculateTime(p1, p2));
    }

    public static double CalculateTime(double[] p1, double[] p2) {
        double distanceBetween = Math.sqrt((p1[0] - p2[0])*(p1[0] - p2[0]) + (p1[1] - p2[1])*(p1[1] - p2[1]));
        double distance = Math.sqrt((p1[0])*(p1[0]) + (p1[1])*(p1[1]));
        return (distance / distanceBetween)*5 - 5 ;
    }
}
