package com.jarema.lukasz.warsztat.projektanta.algorytmow4;

/**
 * Napisz pętle zagnieżdżone wyświetlające następujący wzór:
 * *******
 * ******
 * *****
 * ****
 * ***
 * **
 * *
 */

public class Zad13 {
    public static void main(String[] args) {
        for (int i = 7; i > 0; i--) {
            for (int j = 0; j < i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
