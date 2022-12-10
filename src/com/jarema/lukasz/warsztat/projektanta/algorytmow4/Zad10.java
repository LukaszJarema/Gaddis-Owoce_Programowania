package com.jarema.lukasz.warsztat.projektanta.algorytmow4;

/**
 * Przekształć poniższą pętlę for w pętlę while:
 *         for (int x = 50; x > 0; x--) {
 *             System.out.println(x + " sekund do końca.");
 *         }
 */

public class Zad10 {
    public static void main(String[] args) {
        int x = 50;
        while (x > 0) {
            System.out.println(x + " sekund do końca.");
            x--;
        }
    }
}
