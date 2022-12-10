package com.jarema.lukasz.rozdzial3;

import java.util.Scanner;

/**
 * Operator telefonii komórkowej oferuje klientom trzy różne pakiety:
 * Pakiet A: Cena to 39,99zł miesięcznie, w tym 450 darmowych minut. Każda następna minuta kosztuje 0,45zł.
 * Pakiet B: Cena to 59,99zł miesięcznie, w tym 900 darmowych minut. Każda następna minuta kosztuje 0,40zł.
 * Pakiet C: Cena to 69,99zł miesięcznie, Brak limitu minut.
 * Napisz proram generujący miesięczny rachunek dla klienta. Program ma wyświetlać pytanie o literę reprezentującaą
 * pakiet wybrany przez klienta (A, B, C) i liczbę minut rozmów. Następnie program powinien wyświetlać łączne opłaty za
 * dany miesiąc.
 */

public class Zad13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj literę swojego pakietu (A, B, lub C): ");
        String input = scanner.nextLine();
        char pack = input.charAt(0);
        System.out.print("Ile minut prowadziłeś rozmowy: ");
        int minutes = scanner.nextInt();
        double price = 0;

        switch (pack){
            case 'A':
                if (minutes > 450) {
                    minutes = minutes - 450;
                    price = 39.99 + minutes * 0.45;
                } else {
                    price = 39.99;
                }
                System.out.println("Opłata za miesiąc: " + price + " złotych.");
                break;
            case 'B':
                if (minutes > 900) {
                    minutes = minutes - 900;
                    price = 59.99 + minutes * 0.4;
                } else {
                    price = 59.99;
                }
                System.out.println("Opłata za miesiąc: " + price + " złotych.");
                break;
            case 'C':
                price = 69.99;
                System.out.println("Opłata za miesiąc: " + price + " złotych.");
                break;
            default:
                System.out.println("Wprowadziłeś niewłaściwy znak pakietu");
        }
    }
}
