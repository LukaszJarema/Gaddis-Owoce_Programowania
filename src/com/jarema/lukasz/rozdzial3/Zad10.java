package com.jarema.lukasz.rozdzial3;

import java.util.Scanner;

/**
 * Napisz program, który wyświetla prośbę o wprowadzenie liczby kalorii i gramów tłuszczu w produkcie żywnościowym.
 * Program powinen wyświetlać procent kalorii pochodzących z tłuszczu. Jeden gram tłuszczu ma 9 kalorii. Dlatego:
 * kalorie z tłuszczu = gramy tłuszczu x 9
 * Procent kalorii pochodzących z tłuszczu można obliczyć w następujący sposób:
 * kalorie z tłuszczu / kalorie w sumie
 * Jeśli kalorie pochodzące z tłuszczu stanowią mniej niż 30% kalorii w produkcie, należy dodatkowo wyświetlić komunikat,
 * że produkt jest niskotłuszczowy.
 *
 * Uwaga:
 * Liczba kalorii pochodzących z tłuszczu nie może być większa niż łączna liczba kalorii w produkcie. Jeśli program
 * wykryje, że liczba kalorii z tłuszczu jest wyższa niż łączna liczba kalorii, powinien wyświetlać komunikat o błędzie
 * informujący, że dane wejściowe są nieprawidłowe.
 */

public class Zad10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wpisz liczbę kalorii w produkcie: ");
        double calories = scanner.nextDouble();
        System.out.print("Wpisz liczbę gramów tłuszczu w produkcie: ");
        double fat = scanner.nextDouble();

        double caloriesFromFat = fat * 9;
        double percentCaloriesFromFat = caloriesFromFat / calories;

        if (caloriesFromFat < calories * 0.7) {
            System.out.println("Produkt jest niskotłuszczowy");
        }
        if (caloriesFromFat > calories) {
            System.out.println("Dane wejściowe są nieprawidłowe");
        } else {
            System.out.println("Procent kalorii pochodzących z tłuszczczu: " + percentCaloriesFromFat);
        }
    }
}
