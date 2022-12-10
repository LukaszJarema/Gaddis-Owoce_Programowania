package com.jarema.lukasz.warsztat.projektanta.algorytmow4;

/**
 * Napisz pętle zagnieżdżone wyświetlające taki oto wzór:
 * ##
 * # #
 * #  #
 * #   #
 * #    #
 * #     #
 */

public class Zad14 {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            System.out.print("#");
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println("#");
        }
    }
}
