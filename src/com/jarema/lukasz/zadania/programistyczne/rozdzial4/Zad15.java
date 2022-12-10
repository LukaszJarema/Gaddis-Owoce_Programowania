package com.jarema.lukasz.zadania.programistyczne.rozdzial4;

import java.io.*;
import java.util.Scanner;

/**
 * Przekształcanie małych liter w pliku na wielkie.
 * Napisz program, który wyświetla prośbę o podanie dwóch plików. Pierwszy plik należy otwierać do odczytu, a drugi do
 * zapisu. Program powinien wczytywać zawartość pierwszego pliku, zamieniać wszystkie znaki na wielkie i zapisywać wynik
 * w drugim pliku. Drugi plik ma być kopią pierwszego, przy czym wszystkie litery w nim mają być wielkie. Za pomocą
 * Notatnika lub innego edytora tekstu utwórz prosty plik, który może posłużyć do przetestowania tego programu.
 */

public class Zad15 {
    public static void main(String[] args) throws IOException {
        System.out.print("Podaj nazwę pliku, który chcesz otworzyć: ");
        Scanner scanner = new Scanner(System.in);
        String fileNameRead = scanner.nextLine();
        System.out.print("Podaj nazwę pliku do którego chcesz zapisać: ");
        String fileNameWrite = scanner.nextLine();

        File file = new File(fileNameRead);
        Scanner inputFile = new Scanner(file);

        FileWriter fileWriter = new FileWriter(fileNameWrite, true);
        PrintWriter outputFile = new PrintWriter(fileWriter);

        while (inputFile.hasNext()) {
            String line = inputFile.nextLine().toUpperCase();
            outputFile.println(line);
        }

        inputFile.close();
        outputFile.close();
    }
}
