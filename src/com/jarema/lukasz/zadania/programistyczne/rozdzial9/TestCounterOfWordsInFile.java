package com.jarema.lukasz.zadania.programistyczne.rozdzial9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestCounterOfWordsInFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj nazwę pliku z którego chcesz zliczyć ilość słów: ");
        CounterOfWordsInFile counterOfWordsInFile = new CounterOfWordsInFile(new File(scanner.nextLine()));
        System.out.println("Liczba słów we wskazanym pliku wynosi: " + counterOfWordsInFile.getCountOfWordsInFile());
    }
}
