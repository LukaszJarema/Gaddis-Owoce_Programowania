package com.jarema.lukasz.zadania.programistyczne.rozdzial5;

import java.util.Scanner;

/**
 * Zmodyfikowana wersja programu do obliczania przejechanej odległości.
 * Odległość przejechaną przez pojazd można obliczyć za pomocą następującego wzoru:
 * odległość = szybkość x czas
 * Napisz metodę distance, która jako argumenty przyjmuje szybkość pojazdu i czas, a następnie zwraca przejechaną
 * odległość.
 */

public class Zad9 {
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
            System.out.println(i + "\t\t\t\t\t" + distance(speed, i));
        }
    }

    public static double distance(int speed, int hours) {
        double distance = speed * hours;
        return distance;
    }
}
