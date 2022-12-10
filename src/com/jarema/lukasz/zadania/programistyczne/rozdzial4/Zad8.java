package com.jarema.lukasz.zadania.programistyczne.rozdzial4;

import java.util.Scanner;

/**
 * Średni poziom opadów.
 * Napisz program, który za pomocą pętli zagnieżdżonych pobiera dane, a następnie oblicza średni poziom opadów z
 * określonej liczby lat. Program najpierw powinien wyświetlać pytanie o liczbę lat. Pętla zewnętrzna powinna wykonywać
 * jedną iterację dla każdego roku. Pętla wewnętrzna powinna wykonywać 12 iteracji (raz dla każdego mięsiąca). W każdej
 * iteracji pętli wewnętrznej należy wyświetalć pytanie o liczbę centymetrów opadów w danym miesiącu. Po wszystkich
 * iteracjach program powinien wyświetlać liczbę miesięcy, łączną liczbę centymetrów opadów i średni poziom opadów w
 * danym miesiącu z całego cyklu.
 * Sprawdzanie poprawności danych wejściowych: Przy pobieraniu liczby lat nie należy akceptować wartości mniejszych niż
 * 1. Przy pobieraniu miesięcznych opadów nie należy akceptować wartości ujemnych.
 */

public class Zad8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int years, months = 0,
                rain = 0,
                howMuchRain = 0;

        do {
            System.out.print("Z ilu lat chcesz obliczyć średni poziom opadów: ");
            years = scanner.nextInt();
        } while (years < 1);

        for (int i = 0; i < years; i++) {
            for (int j = 1; j <= 12; j++) {
                do {
                    System.out.print("Wprowadź liczbę centymetrów opadów w miesiącu nr " + j + ": ");
                    rain = scanner.nextInt();
                    months++;
                    howMuchRain += rain;
                } while (rain < 0);
            }
        }
        System.out.println("Łączna liczba miesięcy: " + months);
        System.out.print("Łączna suma opadów: " + howMuchRain);
    }
}
