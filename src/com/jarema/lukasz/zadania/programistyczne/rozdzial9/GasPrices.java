package com.jarema.lukasz.zadania.programistyczne.rozdzial9;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Ceny benzyny.
 * Plik GasPrice.txt zawiera średnie tygodniowe ceny galonu benzyny w Stanach Zjednoczonych w okresie od 5 kwietnia
 * 1993r. do 26 sierpnia 2013r.
 * Każdy wiersz w tym pliku zawiera średnią cenę galonu benzyny w określonym czasie. Wiersze mają następujący format:
 * DD-MM-RRRR:Cena
 * Twoje zadanie polega na napisaniu jednego lub kilku programów, które wczytują zawartość tego pliku i wykonują
 * niżej opisane obliczenia:
 * - Średnia cena roczna. Obliczanie średniej ceny benzyny dla każdego roku z pliku. Dane w pliku rozpoczynają się od
 * kwietnia 1993r., a kończą w sierpniu 2013r. Dla lat 1993 i 2013 należy uwzględnić tylko dane dostępne w pliku.
 * - Średnia cena miesięczna. Obliczanie średniej ceny miesięcznej dla każdego miesiąca z pliku.
 * - Najwyższe i najniższe ceny w roku. Dla każdego roku z pliku należy określić datę i wysokość najniższej i najwyższej
 * ceny.
 * - Lista cen od najniższej do najwyższej. Generowanie pliku tekstowego z listą dat i cen posortowanych od najniższej
 * do najwyższej.
 * - Lista cen od najwyższej do najniższej. Generowanie pliku tekstowego z listą dat i cen posortowanych od najwyższej
 * do najniższej.
 * Możesz napisać jeden program wykonujący wszystkie te obliczenia lub kilka różnych programów, po jednym dla każdego
 * obliczenia.
 */

public class GasPrices {
    private final File GASPRICES = new File("GasPrices.txt");

    /**
     * Konstruktor bezargumentowy obiektu typu GasPrices
     */
    public GasPrices() {

    }

    /**
     * Metoda setDataFromFileToArray zapisuje dane z pliku do tablicy
     *
     * @return tablica z danymi z pliku
     * @throws IOException Input / Output exception
     */
    private double[][] setDataFromFileToArray() throws IOException {
        int rows = (int) Files.lines(Paths.get(GASPRICES.toURI())).count();
        final int COLUMNS = 4;
        double array[][] = new double[rows][COLUMNS];
        Scanner input = new Scanner(GASPRICES);
        while (input.hasNext()) {
            for (int i = 0; i < array.length; i++) {
                String[] stringArray = input.nextLine().split("[-:]");
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = Double.valueOf(stringArray[j]);
                }
            }
        }
        return array;
    }

    /**
     * Metoda averagePriceOfGasInYear przyjmuje jako argument rok i następnie wylicza średnią cenę benzyny w tym roku
     *
     * @param year rok
     * @return średnia cena benzyny w podanym roku
     * @throws IOException Input / Output exception
     */
    public double averagePriceOfGasInYear(double year) throws IOException {
        double array[][] = setDataFromFileToArray();
        double price = 0;
        int count = 0;
        double averagePrice = 0;
        for (int i = 0; i < setDataFromFileToArray().length; i++) {
            if (array[i][2] == year) {
                price += array[i][3];
                count++;
            }
        }
        if (price == 0)
            System.out.println("Brak danych z roku " + year);
        else
            averagePrice = price / count;
        return averagePrice;
    }

    /**
     * Metoda averagePriceOfGasInMonth przyjmuje jako argument w postaci liczbowej miesiąc i zwraca średnią cenę paliwa
     * w tym miesiącu w zadanym okresie
     *
     * @param month miesiąc
     * @return średnia cena paliwa w podanym miesiącu w tym okresie
     * @throws IOException Input / Output Exception
     */
    public double averagePriceOfGasInMonth(double month) throws IOException {
        double array[][] = setDataFromFileToArray();
        double price = 0;
        int count = 0;
        double averagePrice = 0;
        if (month < 1 || month > 12)
            System.out.println("Podałeś niewłaściwy numer miesiąca");
        else {
            for (int i = 0; i < setDataFromFileToArray().length; i++) {
                if (array[i][1] == month) {
                    price += array[i][3];
                    count++;
                }
            }
        }
        averagePrice = price / count;
        return averagePrice;
    }

    /**
     * Metoda lowestAndHighestPriceInYear przyjmuje jako argument rok i wyświetla na konsoli najniższą i najwyższą cenę
     * paliwa w tym roku
     *
     * @param year rok
     * @throws IOException Input / Output Exception
     */
    public void lowestAndHighestPriceInYear(double year) throws IOException {
        double array[][] = setDataFromFileToArray();
        double lowestPrice = Double.MAX_VALUE;
        double highestPrice = Double.MIN_VALUE;
        for (int i = 0; i < setDataFromFileToArray().length; i++) {
            if (array[i][2] == year) {
                if (array[i][3] < lowestPrice)
                    lowestPrice = array[i][3];
                if (array[i][3] > highestPrice)
                    highestPrice = array[i][3];
            }
        }
        if (lowestPrice == Double.MAX_VALUE)
            System.out.println("Brak danych o najniższej cenie paliwa w roku " + year);
        else
            System.out.println("Najniższa cena w roku " + year + " wynosi: " + lowestPrice);
        if (highestPrice == Double.MIN_VALUE)
            System.out.println("Brak danych o najwyższej cenie paliwa w roku " + year);
        else
            System.out.println("Najwyższa cena w roku " + year + " wynosi: " + highestPrice);
    }

    /**
     * Metoda fromHighestToLowest sortuje tablicę danych według ceny od najwyższej do najniższej
     * @return tablica według posortowanych cen od najwyższej do najniższej
     * @throws IOException Input / Output Exception
     */
    private double[][] fromHighestToLowest() throws IOException {
        double array[][] = setDataFromFileToArray();
        double highest = Double.MIN_VALUE;
        double sortArray[][] = new double[array.length][4];
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j][3] >= highest) {
                    highest = array[j][3];
                    sortArray[i][3] = highest;
                    sortArray[i][0] = array[j][0];
                    sortArray[i][1] = array[j][1];
                    sortArray[i][2] = array[j][2];
                    index = j;
                }
            }
            array[index][3] = Double.MIN_VALUE;
            highest = Double.MIN_VALUE;
        }
        return sortArray;
    }

    /**
     * Metoda fileFromHighestToLowest zwraca plik z datą i ceną paliwa od najwyższej ceny do najniższej
     * @return plik z datą i ceną paliwa od najwyższej ceny do najniższej
     * @throws IOException Input / Output Exception
     */
    public PrintWriter fileFromHighestToLowest() throws IOException {
        PrintWriter pw = new PrintWriter("FromHighestToLowest.txt");
        for (int i = 0; i < fromHighestToLowest().length; i++) {
            pw.println((int) fromHighestToLowest()[i][1] + "-" + (int) fromHighestToLowest()[i][0] + "-" +
                    (int) fromHighestToLowest()[i][2] + ":" + fromHighestToLowest()[i][3]);
        }
        pw.close();
        return pw;
    }

    private double[][] fromLowestToHighest() throws IOException {
        double array[][] = setDataFromFileToArray();
        double lowest = Double.MAX_VALUE;
        double sortArray[][] = new double[array.length][4];
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j][3] <= lowest) {
                    lowest = array[j][3];
                    sortArray[i][3] = lowest;
                    sortArray[i][0] = array[j][0];
                    sortArray[i][1] = array[j][1];
                    sortArray[i][2] = array[j][2];
                    index = j;
                }
            }
            array[index][3] = Double.MAX_VALUE;
            lowest = Double.MAX_VALUE;
        }
        return sortArray;
    }

    public PrintWriter fileFromLowestToHighest() throws IOException {
        PrintWriter pw = new PrintWriter("FromLowestToHighest.txt");
        for (int i = 0; i < fromLowestToHighest().length; i++) {
            pw.println((int) fromLowestToHighest()[i][1] + "-" + (int) fromLowestToHighest()[i][0] + "-" +
                    (int) fromLowestToHighest()[i][2] + ":" + fromLowestToHighest()[i][3]);
        }
        pw.close();
        return pw;
    }
}
