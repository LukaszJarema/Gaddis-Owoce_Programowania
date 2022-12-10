package com.jarema.lukasz.warsztat.projektanta.algorytmow4;

/**
 * Napisz pętlę zagnieżdżoną, która wyświetla 10 wierszy ze znakami "#'. W każdym wierszu należy wyświetlić 15 takich
 * znaków.
 */

public class Zad6 {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 15; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
