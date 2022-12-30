package com.jarema.lukasz.zadania.programistyczne.rozdzial7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Ceny beznzyny z 1994r.
 * Plik 1994_Weekly_Gas_Average.txt zawiera średnią cenę benzyny z każdego tygodnia z 1994r. i obejmuje 52 wiersze.
 * Wiersz 1. zawiera średnią cenę z tygodnia 1, itd. Napisz program, który wczytuje ceny benzyny z tego pliku do tablicy
 * lub obiektu ArrayList. Program powinien wykonywać następujące operacje:
 * - Wyświetlać najniższą średnią cenę z roku wraz z numerem tygodnia i nazwą miesiąca, w którym ta średnia została
 * uzyskana.
 * - Wyświetlać najwyższą średnią cenę z roku wraz z numerem tygodnia i nazwą miesiąca, w którym ta średnia została
 * uzyskana.
 * - Wyświetlać średnią cenę z benzyny z każdego miesiąca. Aby otrzymać średnią cenę miesięczną, należy wyliczyć średnią
 * ze średnich tygodniowych z danego miesiąca.
 * - Program powinien tworzyć kolejne pliki z nazwami miesięcy oraz średnie ceny benzyny z tych miesięcy. Dane należy
 * posortować od najniższych cen do najwyższych.
 */

public class WeeklyGasAverages {
    private ArrayList<Double> weeklyGasAverage = new ArrayList<>();

    /**
     * Konstruktor bezargumentowy obiektu typu WeeklyGasAverage
     */
    public WeeklyGasAverages() {

    }

    /**
     * Metoda setWeeklyGasAverage obiektu typu WeeklyGasAverage przyjmuje jako argument pole String odpowiadające nazwie
     * pliku. Następnie dane z tego pliku są wprowadzane do obiektu ArrayList pola weeklyGasAverage
     * @param fileName nazwa pliku
     * @throws FileNotFoundException
     */
    public void setWeeklyGasAverage(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            weeklyGasAverage.add(scanner.nextDouble());
        }
        scanner.close();
    }

    /**
     * Metoda getWeeklyGasAverage obiektu typu WeeklyGasAverage zwraca wartość obiektu weeklyGasAverage
     * @return wartość obiektu pola weeklyGasAverage
     */
    public ArrayList<Double> getWeeklyGasAverage() {
        return weeklyGasAverage;
    }

    /**
     * Metoda minimalGasAverageInYear obiektu typu WeeklyGasAverage wyświetla na konsoli informacje o najniższej
     * średniej tygodniowej cenie w roku
     */
    public void minimalGasAverageInYear() {
        Collections.sort(weeklyGasAverage);
        System.out.println("Najniższa średnia cena paliwa w roku wynosi: " + weeklyGasAverage.get(0));
    }

    /**
     * Metoda maximalGasAverageInYear obiektu typu WeeklyGasAverage wyświetla na konsoli informacje o najwyżeszej
     * średniej tygodniowej cenie w roku
     */
    public void maximalGasAverageInYear() {
        Collections.sort(weeklyGasAverage, Collections.reverseOrder());
        System.out.println("Najwyższa średnia cena paliwa w roku wynosi: " + weeklyGasAverage.get(0));
    }

    /*
    Przyjęto, że poszczególne miesiące mają poniższą ilość tygodni:
    1 - 4
    2 - 4
    3 - 5
    4 - 4
    5 - 4
    6 - 4
    7 - 5
    8 - 5
    9 - 4
    10 - 4
    11 - 4
    12 - 5
    */

    /**
     * Metoda monthlyGasAverage obiektu typu WeeklyGasAverages wypisuje na konsoli średnią cenę paliwa w danym miesiącu
     */
    public void monthlyGasAverage() {
        double [] monthly = new double[12];
        double [] monthlyAverage = new double[12];
        for (int i = 0; i < weeklyGasAverage.size(); i++) {
            if (i >= 0 && i < 4) {
                monthly [0] += weeklyGasAverage.get(i);
            } else if (i >= 4 && i < 8) {
                monthly [1] += weeklyGasAverage.get(i);
            } else if (i >= 8 && i < 13) {
                monthly [2] += weeklyGasAverage.get(i);
            } else if (i >= 13 && i < 17) {
                monthly [3] += weeklyGasAverage.get(i);
            } else if (i >= 17 && i < 21) {
                monthly [4] += weeklyGasAverage.get(i);
            } else if (i >= 21 && i < 25) {
                monthly [5] += weeklyGasAverage.get(i);
            } else if (i >= 25 && i < 30) {
                monthly [6] += weeklyGasAverage.get(i);
            } else if (i >= 30 && i < 35) {
                monthly [7] += weeklyGasAverage.get(i);
            } else if (i >= 35 && i < 39) {
                monthly [8] += weeklyGasAverage.get(i);
            } else if (i >= 39 && i < 43) {
                monthly [9] += weeklyGasAverage.get(i);
            } else if (i >= 43 && i < 47) {
                monthly [10] += weeklyGasAverage.get(i);
            } else if (i >= 47 && i < 52) {
                monthly [11] += weeklyGasAverage.get(i);
            } else {
                System.out.println("Przekroczyłeś zakres!");
            }
        }

        monthlyAverage[0] = (monthly[0] / 4.0);
        monthlyAverage[1] = (monthly[1] / 4.0);
        monthlyAverage[2] = (monthly[2] / 5.0);
        monthlyAverage[3] = (monthly[3] / 4.0);
        monthlyAverage[4] = (monthly[4] / 4.0);
        monthlyAverage[5] = (monthly[5] / 4.0);
        monthlyAverage[6] = (monthly[6] / 5.0);
        monthlyAverage[7] = (monthly[7] / 5.0);
        monthlyAverage[8] = (monthly[8] / 4.0);
        monthlyAverage[9] = (monthly[9] / 4.0);
        monthlyAverage[10] = (monthly[10] / 4.0);
        monthlyAverage[11] = (monthly[11] / 5.0);

        for (int i = 0; i < monthlyAverage.length; i++) {
            System.out.println("Średnia cena benzyny w miesiącu " + (i + 1) + " wyniosła: " + monthlyAverage[i]);
        }
    }

    /*
    Przyjęto, że poszczególne miesiące mają poniższą ilość tygodni:
    1 - 4
    2 - 4
    3 - 5
    4 - 4
    5 - 4
    6 - 4
    7 - 5
    8 - 5
    9 - 4
    10 - 4
    11 - 4
    12 - 5
    */

    public void monthlyGasAverageFiles() {
        ArrayList<Double> january = new ArrayList<>();
        ArrayList<Double> februrary = new ArrayList<>();
        ArrayList<Double> march = new ArrayList<>();
        ArrayList<Double> april = new ArrayList<>();
        ArrayList<Double> may = new ArrayList<>();
        ArrayList<Double> june = new ArrayList<>();

        for (int i = 0; i < weeklyGasAverage.size(); i++) {
            if (i >= 0 && i < 4) {

            }

        }
    }
}
