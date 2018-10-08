package com.company;

public class Main {

    public static void main(String[] args) {
	    if ("CATA".equals(makeComplement("GTAT"))) {
            System.out.println("OK");
        }
    }
    public static String makeComplement(String dna) {
        String rezult = "";
        for (int i = 0; i < dna.length(); i++) {
            switch (dna.charAt(i)) {
                case 'A': rezult = rezult + "T";
                break;
                case 'T': rezult = rezult + "A";
                break;
                case 'G': rezult = rezult + "C";
                break;
                case 'C': rezult = rezult + "G";
                break;
            }
        }
        return rezult;
    }
}
