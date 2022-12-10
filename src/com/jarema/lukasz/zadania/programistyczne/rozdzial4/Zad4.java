package com.jarema.lukasz.zadania.programistyczne.rozdzial4;

import java.util.Scanner;

/**
 * Groszowe wypłaty.
 * Napisz program, który oblicza kwotę zarabianą przez pracownika w określonym czasie. Pierwszego dnia pracownik zarabia
 * grosz, drugiego dwa grosze, a każdego następnego dwukrotność zapłaty za poprzedni dzień. Program powinien wyświetlać
 * tabelę z wynagrodzeniem za każdy dzień, a następnie sumaryczną zapłatę za cały okres. Dane wyjściowe należy wyświetlać
 * w złotych, a nie groszach.
 * Sprawdzanie poprawności danych wejściowych: Przy pobieraniu liczby przepracowanych dni nie należy akceptować wartości
 * mniejszych niż 1.
 */

public class Zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days, modulo, number;
        int sum = 0;
        do {
            System.out.print("Ile dni przepracowałeś: ");
            days = scanner.nextInt();
        } while (days < 1);

        for (int i = 1; i <= days; i++) {
            if (days == 1) {
                sum = i * days;
            } else {
                sum = (int) (1 * (1 - Math.pow(2, i) / (1 - 2))) - 2;
            }

        }
        number = sum / 100;
        modulo = sum % 100;
        System.out.println("Suma: " + number + "." + modulo);
    }
}
