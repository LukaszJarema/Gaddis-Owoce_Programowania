package com.jarema.lukasz.warsztat.projektanta.algorytmow4;

import java.util.Random;

/**
 * Uzupełnij poniższy program, aby wykonywał opisane operacje 10 razy:
 * - generowanie losowo liczby 0 lub 1
 * - wyświetlanie słowa "Tak" lub "Nie" w zależności od wygenerowanej liczby.
 */

public class Zad16 {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int n = random.nextInt(2) + 1;
            System.out.println(n);
            if (n == 1) {
                System.out.println("Tak");
            } else {
                System.out.println("Nie");
            }
        }
    }
}
