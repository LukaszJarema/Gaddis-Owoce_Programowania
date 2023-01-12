package com.jarema.lukasz.zadania.programistyczne.rozdzial9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Licznik słów.
 * Napisz program, który wyświetla użytkownikowi prośbę o podanie nazwy pliku. Program powinien wyświetlać liczbę słów,
 * jakie ten plik zawiera.
 */

public class CounterOfWordsInFile {
    private File fileName;

    /**
     * Konstruktor obiektu typu CounterOfWordsInFile przyjmujący w argumencie wartość pola fileName
     * @param fileName wartość pola fileName
     */
    public CounterOfWordsInFile(File fileName) {
        this.fileName = fileName;
    }

    /**
     * Metoda getCountOfWordsInFile zwraca ilość słów we wskazanym pliku w konstruktorze obiektu CounterOfWordsInFile
     * @return ilość słów w pliku
     * @throws FileNotFoundException plik nie zostal zlokalizowany
     */
    public int getCountOfWordsInFile() throws FileNotFoundException {
        int count = 0;
        Scanner scanner = new Scanner(fileName);
        String [] words;
        String line;
        while (scanner.hasNext()) {
            line = scanner.nextLine();
            words = line.split(" ");
            count += words.length;
        }
        return count;
    }
}
