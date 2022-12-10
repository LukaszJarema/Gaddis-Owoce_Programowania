package com.jarema.lukasz.warsztat.projektanta.algorytmow4;

import java.util.Scanner;

/**
 * Napisz pętlę for, która wyświetla prośbę o podanie liczby. Petla powinna wykonywać 10 iteracji i obliczać sumę
 * bieżącą wprowadzanych wartości.
 */

public class Zad4 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Podaj liczbę: ");
            int numb = scanner.nextInt();
            sum += numb;
        }
        System.out.println("Suma liczby: " + sum);
    }
}
