package com.jarema.lukasz.zadania.programistyczne.rozdzial4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.security.Principal;
import java.util.Scanner;

/**
 * Plik z odległością.
 * Zmodyfikuj program z zadania programistycznego 2. ("Przebyta odległość") w taki sposób, aby zapisywał dane w pliku, a
 * nie na ekranie. Otwórz uzyskany plik w Notatniku lub innym edytorze tekstu, aby potwierdzić poprawność danych
 * wyjściowych.
 */

public class Zad3 {
    public static void main(String[] args) throws FileNotFoundException {
        int speed, hours;
        Scanner scanner = new Scanner(System.in);
        PrintWriter printWriter = new PrintWriter("Plik z odległością.txt");

        do {
            System.out.print("Z jaką prędkością km/h jedzie pojazd: ");
            speed = scanner.nextInt();

        } while (speed <= 0);

        do {
            System.out.print("Ile godzin jedzie pojazd: ");
            hours = scanner.nextInt();
        } while (hours < 1);

        printWriter.println("\nGodzina\t\tPrzebyta odległość\n------------------------------");

        for (int i = 1; i <= hours; i++) {
            int distance = i * speed;
            printWriter.println(i + "\t\t\t\t\t" + distance);
        }
        printWriter.close();
    }
}
