package com.jarema.lukasz.zadania.programistyczne.rozdzial4;

import java.util.Scanner;

/**
 * Przebyta odległość.
 * Odległość przebytą przez pojazd można obliczyć w następujący sposób:
 * odległość = szybkość x czas
 * Na przykład jeśli pociąg jedzie z prędkością 40km/h przez 3 godziny, to przejechana odległość wynosi 120km. Napisz
 * program, który wyświetla prośbę o podanie szybkości pojazdu (w kilometrach na godzinę) i liczbę godzin podróży.
 * Program powinien wyświetlać w pętli odległość przebytą po każdej godzinie okresu podanego przez użytkownika. Jeśli np.
 * pojazd przez trzy godziny jedzie z szybkością 40km/h, należy wyświetlić informacje podobne do poniższych:
 * Godzina      Przebyta odległość
 * -------------------------------
 * 1                    40
 * 2                    80
 * 3                    120
 * Sprawdzanie poprawności danych wejściowych. Program nie powinien akceptować ujemnych prędkości i wartości czasu
 * mniejszych niż 1.
 */

public class Zad2 {
    public static void main(String[] args) {
        int speed, hours;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Z jaką prędkością km/h jedzie pojazd: ");
            speed = scanner.nextInt();

        } while (speed <= 0);

        do {
            System.out.print("Ile godzin jedzie pojazd: ");
            hours = scanner.nextInt();
        } while (hours < 1);

        System.out.println("\nGodzina\t\tPrzebyta odległość\n------------------------------");

        for (int i = 1; i <= hours; i++) {
            int distance = i * speed;
            System.out.println(i + "\t\t\t\t\t" + distance);
        }
    }
}
