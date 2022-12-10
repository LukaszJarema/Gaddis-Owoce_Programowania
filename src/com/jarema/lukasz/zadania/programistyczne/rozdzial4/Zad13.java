package com.jarema.lukasz.zadania.programistyczne.rozdzial4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Wyświetlanie początku pliku.
 * Napisz program wyświetlający prośbę o podanie nazwy pliku. Program powinien wyświetlać tylko pięć pierwszych wierszy
 * zawartości pliku. Jeśli plik zawiera mniej niż pięć wierszy, należy wyświetlić zawartość całego pliku.
 */

public class Zad13 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.print("Podaj nazwę pliku: ");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.next();

        Scanner read = new Scanner(new File(fileName));

        for (int i = 0; i < 5 && read.hasNext(); i++) {
            String row = read.nextLine();
            System.out.println(row);
        }
    }
}
