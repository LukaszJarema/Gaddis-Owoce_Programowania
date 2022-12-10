package com.jarema.lukasz.zadania.programistyczne.rozdzial5;

import java.util.Scanner;

/**
 * Program konwertujący.
 * Napisz program, który wyświetla prośbę o wprowadzenie odległości w metrach. Następnie program powinien udostępniać
 * menu z takimi oto opcjami:
 * 1. konwersja na kilometry,
 * 2. konwersja na cale,
 * 3. konwersja na stopy,
 * 4. wyjście z programu.
 * Program w zależności od wyboru dokonanego przez użytkownika ma przekształcać odległość na kilometry, cale lub stopy.
 * Oto wymogi stawiane programowi:
 * - Napisz metodę void o nazwie showKilometers, która jako argumet przyjmuje liczbę metrów i wyświetla tę samą odległość
 * w kilometrach. Metry na kilometry należy przekształcać na podstawie następującego wzoru:
 * kilometers = meters * 0,001
 * - Napisz metodę void o nazwie showInches, która jako argumet przyjmuje liczbę metrów i wyświetla tę samą odległość
 * w calach. Metry na cale należy przekształcić na podstawie następującego wzoru:
 * inches = meters * 39,37
 * - Napisz metodę void o nazwie showFeet, która jako argumet przyjmuje liczbę metrów i wyświetla tę samą odległość
 *  * w stopach. Metry na stopy należy przekształcić na podstawie następującego wzoru:
 *  feet = meters * 3,281
 *  - Napisz metodę void o nazwie menu, która wyświetla menu z opcjami. Ta metoda nie powinna przyjmować żadnych
 *  argumentów.
 *  - Program powinien wyświetlać menu do czasu wprowadzenia przez użytkownika liczby 4, oznaczającej zamknięcie programu.
 *  - Program przy pobieraniu odległości w metrach nie powinien przyjmować liczb ujemnych.
 *  - Jeśli użytkownik nie wybrał z menu poprawnej opcji, program powinien wyświetlać komunikat o błędzie.
 */

public class Zad8 {
    public static void main(String[] args) {
        int meters;
        int choice = 0;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Podaj liczbę metrów: ");
            meters = scanner.nextInt();
        } while (meters < 0);

        do {
            menu();
            choice = scanner.nextInt();
            if (choice < 1 || choice > 4) {
                System.out.println("Wybrałeś złą wartość.");
            } else if (choice == 1) {
                showKilometers(meters);
            } else if (choice == 2) {
                showInches(meters);
            } else {
                showFeet(meters);
            }
        } while (choice != 4);
    }

    public static void showKilometers(int meters) {
        double kilometers = meters * 0.001;
        System.out.println(meters + " metrów w kilometrach to " + kilometers + ".");
    }

    public static void showInches(int meters) {
        double inches = meters * 39.37;
        System.out.printf(meters + " metrów w calach to %.2f.\n", inches);
    }

    public static void showFeet(int meters) {
        double feets = meters * 3.281;
        System.out.printf(meters + " metrów w stopach to %.2f.\n", feets);
    }

    public static void menu() {
        System.out.println("1. Przelicz na kilometry.");
        System.out.println("2. Przelicz na cale.");
        System.out.println("3. Przelicz na stopy.");
        System.out.println("4. Zamknij program.");
    }
}
