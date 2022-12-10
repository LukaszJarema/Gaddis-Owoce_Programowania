package com.jarema.lukasz.zadania.programistyczne.rozdzial4;

import java.util.Scanner;

/**
 * Licznik liter.
 * Napisz program, który wyświetla prośbę o podanie łańcucha znaków, a następnie o wprowadzenie znaku. Program powinien
 * zliczać i wyświetlać liczbę wystąpień określonego znaku w łańcuchu.
 */

public class Zad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wprowadź tekst: ");
        String text = scanner.nextLine();
        System.out.print("Wprowadź znak który chcesz zliczyć w podanym tekście: ");
        char ch = scanner.next().charAt(0);

        int sum = 0;

        char[] stringToCharArray = text.toCharArray();

        for (int i = 0; i < stringToCharArray.length; i++) {
            if (stringToCharArray[i] == ch) {
                sum++;
            }
        }

        System.out.println("W tekście: " + text + " występuje " + sum + " znaków " + ch);
    }
}
