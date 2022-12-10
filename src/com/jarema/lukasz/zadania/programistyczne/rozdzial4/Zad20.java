package com.jarema.lukasz.zadania.programistyczne.rozdzial4;

import java.util.Scanner;

/**
 * Wyświetlanie kwadratu.
 * Napisz program, który wyświetla użytkownikowi prośbę o podanie dodatniej liczby całkowitej nie większej niż 15.
 * Program pownien następnie wyświetlać na ekranie kwadrat ze znaków "X". Liczba podana przez użytkownika określa
 * długość każdego boku kwadratu.
 */

public class Zad20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows;

        do {
            System.out.print("Podaj liczbę między 1, a 15: ");
            rows = scanner.nextInt();
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < rows; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } while (!(rows >= 1 && rows <= 15));
    }
}
