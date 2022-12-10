package com.jarema.lukasz.zadania.programistyczne.rozdzial4;

import java.util.Scanner;

/**
 * Populacja organizmów.
 * Napisz program prognozujący wielkość populacji organizmów. Program powinien wyświetlać prośbę o podanie początkowej
 * liczby organizmów, średni dzienny przyrost populacji (w procentach) i liczbę dni, przez jakie organizmy się
 * rozmnażają. Załóżmy, że populacja początkowo liczy dwa organizmy, średni dzienny przyrost wynosi 50%, a czas
 * rozmanażania to 7 dni. Program powinien używać pętli do wyświetlania wielkości populacji każdego dnia.
 * Sprawdzanie poprawności danych wejściowych: Przy pobieraniu początkowej wielkości populacji nie należy użyć wartości
 * mniejszych niż 2. Przy pobieraniu średniego dziennego przyrostu populacji należy odrzucać wartości ujemne. Z kolei
 * przy pobieraniu dni rozmnażania nie należy przyjmować wartości mniejszych od 1.
 */

public class Zad9 {
    public static void main(String[] args) {
        int  reproduction;
        double population, growth;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Podaj początkową liczbę organizmów: ");
            population = scanner.nextDouble();
        } while (population < 2);

        do {
            System.out.print("Podaj średni dzienny przyrost populacji w procentach: ");
            growth = scanner.nextDouble();
        } while (growth < 0);

        do {
            System.out.print("Podaj ilość dni rozmnażania: ");
            reproduction = scanner.nextInt();
        } while (reproduction < 1);

        for (int i = 1; i <= reproduction; i++) {
            System.out.println("Populacja w dniu nr: " + i + " wynosi: " + population);
            population = population + (growth / 100);
        }
    }
}
