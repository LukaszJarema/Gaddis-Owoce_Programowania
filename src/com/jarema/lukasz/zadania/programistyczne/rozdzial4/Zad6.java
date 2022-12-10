package com.jarema.lukasz.zadania.programistyczne.rozdzial4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Licznik liter w pliku.
 * Napisz program, który wyświetla prośbę o podanie nazwy pliku, a następnie o wprowadzenie znaku. Program ten powinien
 * zliczać i wyświetlać liczbę wystąpień określonego znaku w pliku. Za pomocą notatnika lub innego edytora tekstu utwórz
 * prosty plik, który można wykorzystać do przetestowania programu.
 */

public class Zad6 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner file = new Scanner(new File("plikTXT.txt"));
        String text = file.nextLine();
        char[] textToCharArray = text.toCharArray();
        System.out.print("Wprowadź znak który chcesz zliczyć w tekście: ");
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);

        int sum = 0;
        for (int i = 0; i < textToCharArray.length; i++) {
            if (textToCharArray[i] == ch) {
                sum++;
            }
        }
        System.out.println("Liczba znaków " + ch + " w tekście: " + sum);
    }
}
