package com.jarema.lukasz.warsztat.projektanta.algorytmow4;

/**
 * Napisz pętlę for, która oblicza sumę następującego ciągu liczb:
 * 1/30 + 2/29 + 3/28 + ... + 30/1
 */

public class Zad5 {
    public static void main(String[] args) {
        int counter = 1;
        int denominator = 30;
        double sum = 0.0;
        for (int i = 0; i < 30; i++) {
            sum += (double) counter / (double) denominator;
            counter++;
            denominator--;
        }
        System.out.println("Suma liczb = " + sum);
    }
}
