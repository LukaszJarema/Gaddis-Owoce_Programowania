package com.jarema.lukasz.warsztat.projektanta.algorytmow4;

/**
 * Przekształć poniższą pętlę while w pętlę for:
 *         int count = 0;
 *         while (count < 50) {
 *             System.out.println("Count ma wartość " + count + ".");
 *             count++;
 *         }
 */

public class Zad9 {
    public static void main(String[] args) {
        for (int count = 0; count < 50; count++) {
            System.out.println("Count ma wartość " + count + ".");
        }
    }
}
