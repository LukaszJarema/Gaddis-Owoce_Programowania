package com.jarema.lukasz.zadania.programistyczne.rozdzial9;

import java.time.LocalDate;
import java.util.Scanner;

public class TestChequeWriting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj imię i nazwisko osoby, której chcesz wystawić czek: ");
        String name = scanner.nextLine();
        double amount = 0;
        do {
            System.out.print("Podaj kwotę jaką chcesz umieścić na czeku: ");
            amount = scanner.nextDouble();
        } while (amount < 0);
        ChequeWriting chequeWriting = new ChequeWriting(LocalDate.now(), name, amount);
        chequeWriting.displayCheque();
    }
}
