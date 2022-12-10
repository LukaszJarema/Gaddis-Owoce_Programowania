package com.jarema.lukasz.zadania.programistyczne.rozdzial4;

import java.util.Random;
import java.util.Scanner;

/**
 * Rozwinięcie zabawy w odgadywanie liczby losowej.
 * Rozwiń program napisany w zadaniu programistycznym 17., aby zliczał próby odgadnięcia liczby przez użytkownika. Po
 * poprawnym odgadnięciu liczby losowej program powinien wyświetlać liczbę prób.
 */

public class Zad18 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(100) + 1;
        int yourChoice, numberOfAttempts = 0;

        do {
            System.out.print("Podaj liczbę z zakresu od 1 do 100: ");
            Scanner scanner = new Scanner(System.in);
            yourChoice = scanner.nextInt();
            numberOfAttempts++;
            if (yourChoice < n) {
                System.out.println("Za mała liczba, spróbuj ponownie");
            } else if (yourChoice > n) {
                System.out.println("Za duża liczba, spróbuj ponownie");
            }
        } while (yourChoice != n);
        System.out.println("Odgadłeś liczbę losową za " + numberOfAttempts + " razem.");
    }
}
