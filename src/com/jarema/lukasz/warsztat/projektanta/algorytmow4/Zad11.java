package com.jarema.lukasz.warsztat.projektanta.algorytmow4;

import java.util.Scanner;

/**
 * Napisz pętlę do sprawdzania danych wejściowych, wyświetlającą prośbę o podanie liczby z przedziału od 1 do 4.
 */

public class Zad11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Podaj liczbę z przedziału od 1 do 4: ");
            number = scanner.nextInt();
        } while (number < 1 || number > 4);
    }
}
