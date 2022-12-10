package com.jarema.lukasz.warsztat.projektanta.algorytmow5;

import java.util.Scanner;

/**
 * Napisz metodę getName, która wyświetla prośbę o wpisanie imienia, a następnie zwraca dane wejściowe.
 */

public class Zad9 {
    public static void main(String[] args) {
        getName();
    }

    /**
     * Metoda getName pyta użytkownika o podanie imienia, a następnie wyświetla komunikat powitalny.
     */
    public static void getName() {
        System.out.print("Podaje imię: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.print("Witaj " + name);
    }
}
