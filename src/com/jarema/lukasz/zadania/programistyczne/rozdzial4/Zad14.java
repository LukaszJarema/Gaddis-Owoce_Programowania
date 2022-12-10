package com.jarema.lukasz.zadania.programistyczne.rozdzial4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Numery wierszy.
 * Napisz program, który wyświetla prośbę o podanie nazwy pliku. Program powinien wyświetlać zawartość pliku,
 * poprzedzając każdy wiersz jego numerem i dwukropkiem. Numerowanie wierszy zacznij od 1.
 */

public class Zad14 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.print("Podaj nazwę pliku: ");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();

        File file = new File(fileName);
        Scanner inputFile = new Scanner(file);
        int i = 1;

        do {
            System.out.println(i + ": " + inputFile.nextLine());
            i++;
        } while (inputFile.hasNext());
    }
}
