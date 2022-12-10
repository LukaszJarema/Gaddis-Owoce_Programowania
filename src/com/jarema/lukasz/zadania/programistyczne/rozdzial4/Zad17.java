package com.jarema.lukasz.zadania.programistyczne.rozdzial4;

import java.util.Random;
import java.util.Scanner;

/**
 * Zabawa w odgadywanie liczby losowej.
 * Napisz program, który generuje liczbę losową i wyświetla prośbę o jej odgadnięcie. Jeśli użytkownik poda wartość
 * wyższą od wygenerowanej liczby losowej, program powinen wyświetlać tekst: "Za duża liczba, spróbuj ponownie". Po
 * podaniu wartości niższej od wygenerowanej program powinien informować: "Za mała liczba, spróbuj ponownie". W programie
 * należy zastosować pętlę powtarzającą operacje do czasu odgadnięcia liczby losowej przez użytkownika.
 */

public class Zad17 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(100) + 1;
        int yourChoice;

        do {
            System.out.print("Podaj liczbę z zakresu od 1 do 100: ");
            Scanner scanner = new Scanner(System.in);
            yourChoice = scanner.nextInt();
            if (yourChoice < n) {
                System.out.println("Za mała liczba, spróbuj ponownie");
            } else if (yourChoice > n) {
                System.out.println("Za duża liczba, spróbuj ponownie");
            }
        } while (yourChoice != n);
        System.out.println("Odgadłeś liczbę losową: " + n);
    }
}
