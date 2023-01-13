package com.jarema.lukasz.zadania.programistyczne.rozdzial9;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Analiza sprzedaży.
 * Plik SalesData.txt zawiera kwotę w złotych, za jaką sklep sprzedał produkty w różnych tygodniach. Każdy wiersz tego
 * pliku zawiera siedem liczb, reprezentujących poziom sprzedaży z jednego tygodnia. Te liczby są rozdzielone
 * przecinkami. Poniższy wiersz jest przykładowym fragmentem tego pliku:
 * 2541.36,2965.88,1965.32,1845.23,7021.11,9652.74,1469.36
 * Napisz program, który otwiera ten plik i przetwarza jego zawartość. Program powinien wyświetlać następujące
 * informacje:
 * - łączną wartość sprzedaży z każdego tygodnia,
 * - średnią dzienną wartość sprzedaży z każdego tygodnia,
 * - łączną wartość sprzedaży z wszystkich tygodni,
 * - numer tygodnia z najwyższą wartością sprzedaży,
 * - numer tygodnia z najniższą wartością sprzedaży.
 */

public class SalesAnalysis {
    private final File FILE_NAME = new File("SalesData.txt");
    private double [] [] table;

    /**
     * Konstruktor bezargumentowy obiektu typu SalesAnalysis, który wypełnia tablicę z pola table
     */
    public SalesAnalysis() throws IOException {
        int rows = (int) Files.lines(Paths.get(FILE_NAME.toURI())).count();
        final int COLUMNS = 7;
        Scanner file = new Scanner(FILE_NAME);
        table = new double [rows][COLUMNS];

        for (int i = 0; i < table.length; i ++) {
            String [] tokens = file.nextLine().split(",");
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = Double.parseDouble(tokens[j]);
            }
        }
    }

    /**
     * Metoda totalSalesOnWeek zwraca na konsoli informację dotyczącą łącznej sprzedaży w tygodniu podanym w argumencie
     * metody
     * @param weekNumber numer tygodnia
     */
    public void totalSalesOnWeek(int weekNumber) {
        double total = 0.0;
        if (weekNumber > table.length)
            System.out.println("Nie mamy danych sprzedażowych z tygodnia numer " + weekNumber);
        else {
            for (int i = 0; i < table[weekNumber - 1].length; i++) {
                total += table[weekNumber - 1] [i];
            }
            System.out.printf("Łączna sprzedaż w tygodniu numer %d wyniosła: %.2f\n", weekNumber, total);
        }
    }

    /**
     * Metoda averageSalesOnWeek zwraca na konsoli informację dotyczącą średniej sprzedaży w tygodniu podanym w argumencie
     * metody
     * @param weekNumber numer tygodnia
     */
    public void averageSalesOnWeek(int weekNumber) {
        double total = 0.0;
        if (weekNumber > table.length)
            System.out.println("Nie mamy danych sprzedażowych z tygodnia numer " + weekNumber);
        else {
            for (int i = 0; i < table[weekNumber - 1].length; i++) {
                total += table[weekNumber - 1] [i];
            }
            System.out.printf("Średnia sprzedaż w tygodniu numer %d wyniosła: %.2f\n", weekNumber, (total / 7));
        }
    }

    /**
     * Metoda totalSalesOnAllWeeks zwraca na konsoli informację o łącznej wartości sprzedaży z wszystkich tygodni
     */
    public void totalSalesOnAllWeeks() {
        double total = 0.0;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                total += table[i][j];
            }
        }
        System.out.printf("Łączna wartość sprzedaży we wszystkich tygodniach wyniosła: %.2f\n", total);
    }

    /**
     * Metoda weekWithHighestSales zwraca na konsoli informację o numerze tygodnia z najwyższą wartością sprzedaży
     */
    public void weekWithHighestSales() {
        ArrayList<Double> salesOnWeeks = new ArrayList<>();
        for (int i = 0; i < table.length; i++) {
            double total = 0.0;
            for (int j = 0; j < table[i].length; j++) {
                total += table[i][j];
            }
            salesOnWeeks.add(total);
        }
        Double weekWithHighestSales = Collections.max(salesOnWeeks);
        Integer numberOfWeek = salesOnWeeks.indexOf(weekWithHighestSales) + 1;
        System.out.println("Tydzień numer " + numberOfWeek + " przyniósł najwyższą wartość sprzedaży");
    }

    /**
     * Metoda weekWithLowestSales zwraca na konsoli informację o numerze tygodnia z najmniejszą wartością sprzedaży
     */
    public void weekWithLowestSales() {
        ArrayList<Double> salesOnWeeks = new ArrayList<>();
        for (int i = 0; i < table.length; i++) {
            double total = 0.0;
            for (int j = 0; j < table[i].length; j++) {
                total += table[i][j];
            }
            salesOnWeeks.add(total);
        }
        Double weekWithLowestSales = Collections.min(salesOnWeeks);
        Integer numberOfWeek = salesOnWeeks.indexOf(weekWithLowestSales) + 1;
        System.out.println("Tydzień numer " + numberOfWeek + " przyniósł najmniejszą wartość sprzedaży");
    }
}
