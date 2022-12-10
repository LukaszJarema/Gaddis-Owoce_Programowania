package com.jarema.lukasz.rozdzial3;

import java.util.Scanner;

/**
 * Na rysunku pokazany jest uproszczony schemat blokowy do rozwiązywania problemów z niesprawnym połączeniem Wi-Fi. Na
 * podstawie tego schematu utwórz program, który przeprowadza użytkownika przez etapy naprawy niesprawnego połączenia.
 */

public class Zad17 {
    public static void main(String[] args) {
        System.out.println("Witaj w programie do rozwiązywania problemów połączenia z Wi-Fi\nUruchom ponownie komputer" +
                "i spróbuj nawiązać połączenie\nCzy to rozwiązało problem?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        String yes = "tak";
        String no = "nie";
        if (answer.equals(yes)) {
            System.out.println("Problem został rozwiązany");
        } else if (answer.equals(no)) {
            System.out.println("Uruchom ponownie router i spróbuj nawiązać połączenie\nCzy to rozwiązało problem?");
            answer = scanner.next();
            if (answer.equals(yes)) {
                System.out.println("Problem został rozwiązany");
            } else if (answer.equals(no)) {
                System.out.println("Upewnij się, że kable prowadzące do routera i modemu są dobrze zamocowane\nCzy to" +
                        "rozwiązało problem?");
                answer = scanner.next();
                if (answer.equals(yes)) {
                    System.out.println("Problem został rozwiązany");
                } else if (answer.equals(no)) {
                    System.out.println("Przenieś router w inne miejsce\nCzy to rozwiązało problem?");
                    answer = scanner.next();
                } if (answer.equals(yes)) {
                    System.out.println("Problem został rozwiązany");
                } else {
                    System.out.println("Kup nowy router");
                }
            }
        }
    }
}
