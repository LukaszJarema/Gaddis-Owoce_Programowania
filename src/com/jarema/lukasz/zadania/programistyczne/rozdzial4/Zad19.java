package com.jarema.lukasz.zadania.programistyczne.rozdzial4;

import java.util.Random;
import java.util.Scanner;

/**
 * Badanie postrzegania pozazmysłowego.
 * Napisz program, który bada Twoje zdolności pozazmysłowe. Program pownien losowo wybierać jedną z poniższych nazw
 * kolorów:
 * Czerwony, Zielony, Niebieski, Pomarańczowy, Żółty
 * Na potrzeby wyboru słowa program może generować liczby losowe. Na przykład liczba 0 może odpowiadać słowu Czerwony,
 * a liczba 1 - słowy Zielony.
 * Następnie program powinien wyświetlać prośbę o podanie koloru wybranego przez komputer. Po podaniu koloru przez
 * użytkownika program powinien wyświetlać nazwę losowo wyranej barwy. Program powinien powtarzać ten proces 10 razy, a
 * następnie wyświetlać liczbę poprawnych wskazań użytkownika.
 */

public class Zad19 {
    public static void main(String[] args) {
        Random random = new Random();
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            int n = random.nextInt(5);
            String colour = null;
            String yourChoice = null;
            switch (n) {
                case 0 -> colour = "Czerwony";
                case 1 -> colour = "Zielony";
                case 2 -> colour = "Niebieski";
                case 3 -> colour = "Pomarańczowy";
                case 4 -> colour = "Żółty";
            }
            System.out.print("Podaj nazwę koloru wylosowanego przez komputer\n(Czerwony, Zielony, Niebieski, " +
                    "Pomarańczowy, Żółty): ");
            yourChoice = scanner.next();
            if (yourChoice.equals(colour)) {
                sum++;
            }
            System.out.println("Wylosowany kolor przez komputer: " + colour);
        }
        System.out.println("Liczba poprawnych odpowiedzi: " + sum);
    }
}
