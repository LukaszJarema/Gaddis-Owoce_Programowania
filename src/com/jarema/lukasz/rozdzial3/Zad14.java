package com.jarema.lukasz.rozdzial3;

import java.util.Scanner;

/**
 * Zmodyfikuj program napisany w zadaniu 13., aby obliczał i wyświetlał kwotę, jaką klient korzystający z pakietu A
 * zaoszczędziłby, wybierając pakiety B i C, a także kwotę zaoszczędzoną przez klienta używającego pakietu B po zakupie
 * pakietu C. Jeśli zmiana pakietu nie przynosi oszczędności, program ma nie wyświetlać żadnego komunikatu.
 */

public class Zad14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Jakiego pakietu używasz? A czy B?: ");
        String input = scanner.nextLine();
        char pack = input.charAt(0);
        System.out.print("Ile minut wykorzystałeś w miesiącu: ");

    }
}
