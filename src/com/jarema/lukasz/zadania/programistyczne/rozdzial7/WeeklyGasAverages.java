package com.jarema.lukasz.zadania.programistyczne.rozdzial7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
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
     * Metoda monthlyGasAverage zwraca tablicę ze średnimi cenami paliwa w danych miesiącach
     * @return tablica ze średnimi cenami
     */
    public double [] monthlyGasAverage() {
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

        return monthlyAverage;
    }

    /**
     * Metoda displayMonthlyAverage przyjmuje jako argument tablicę double i wypisuje na konsoli średnią cenę paliwa w
     * danym miesiącu
     * @param table tablica ze średnimi cenami paliwa w danym miesiącu
     */
    public void displayMonthlyAverage(double [] table) {
        for (int i = 0; i < table.length; i++) {
            System.out.println("Średnia cena benzyny w miesiącu " + (i + 1) + " wyniosła: " + table[i]);
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

    public void monthlyGasAverageFiles(double [] table) throws FileNotFoundException {
        ArrayList<Double> january = new ArrayList<>();
        ArrayList<Double> february = new ArrayList<>();
        ArrayList<Double> march = new ArrayList<>();
        ArrayList<Double> april = new ArrayList<>();
        ArrayList<Double> may = new ArrayList<>();
        ArrayList<Double> june = new ArrayList<>();
        ArrayList<Double> july = new ArrayList<>();
        ArrayList<Double> august = new ArrayList<>();
        ArrayList<Double> septemper = new ArrayList<>();
        ArrayList<Double> october = new ArrayList<>();
        ArrayList<Double> november = new ArrayList<>();
        ArrayList<Double> december = new ArrayList<>();
        for (int i = 0; i < weeklyGasAverage.size(); i++) {
            if (i >= 0 && i < 4) {
                january.add(weeklyGasAverage.get(i));
            } else if (i >= 4 && i < 8) {
                february.add(weeklyGasAverage.get(i));
            } else if (i >= 8 && i < 13) {
                march.add(weeklyGasAverage.get(i));
            } else if (i >= 13 && i < 17) {
                april.add(weeklyGasAverage.get(i));
            } else if (i >= 17 && i < 21) {
                may.add(weeklyGasAverage.get(i));
            } else if (i >= 21 && i < 25) {
                june.add(weeklyGasAverage.get(i));
            } else if (i >= 25 && i < 30) {
                july.add(weeklyGasAverage.get(i));
            } else if (i >= 30 && i < 35) {
                august.add(weeklyGasAverage.get(i));
            } else if (i >= 35 && i < 39) {
                septemper.add(weeklyGasAverage.get(i));
            } else if (i >= 39 && i < 43) {
                october.add(weeklyGasAverage.get(i));
            } else if (i >= 43 && i < 47) {
                november.add(weeklyGasAverage.get(i));
            } else if (i >= 47 && i < 52) {
                december.add(weeklyGasAverage.get(i));
            } else {
                System.out.println("Przekroczyłeś zakres!");
            }
        }
        PrintWriter weeklyJanuary = new PrintWriter("january.txt");
        Collections.sort(january);
        for (int i = 0; i < january.size(); i++) {
            weeklyJanuary.println(january.get(i));
        }
        weeklyJanuary.println("Średnia cena paliwa w styczniu: " + table[0]);
        weeklyJanuary.close();

        PrintWriter weeklyFebruary = new PrintWriter("february.txt");
        Collections.sort(february);
        for (int i = 0; i < february.size(); i++) {
            weeklyFebruary.println(february.get(i));
        }
        weeklyFebruary.println("Średnia cena paliwa w lutym: " + table[1]);
        weeklyFebruary.close();

        PrintWriter weeklyMarch = new PrintWriter("march.txt");
        Collections.sort(march);
        for (int i = 0; i < march.size(); i++) {
            weeklyMarch.println(march.get(i));
        }
        weeklyMarch.println("Średnia cena paliwa w marcu: " + table[2]);
        weeklyMarch.close();

        PrintWriter weeklyApril = new PrintWriter("april.txt");
        Collections.sort(april);
        for (int i = 0; i < april.size(); i++) {
            weeklyApril.println(april.get(i));
        }
        weeklyApril.println("Średnia cena paliwa w kwietniu: " + table[3]);
        weeklyApril.close();

        PrintWriter weeklyMay = new PrintWriter("may.txt");
        Collections.sort(may);
        for (int i = 0; i < may.size(); i++) {
            weeklyMay.println(may.get(i));
        }
        weeklyMay.println("Średnia cena paliwa w maju: " + table[4]);
        weeklyMay.close();

        PrintWriter weeklyJune = new PrintWriter("june.txt");
        Collections.sort(june);
        for (int i = 0; i < june.size(); i++) {
            weeklyJune.println(june.get(i));
        }
        weeklyJune.println("Średnia cena paliwa w czerwcu: " + table[5]);
        weeklyJune.close();

        PrintWriter weeklyJuly = new PrintWriter("july.txt");
        Collections.sort(july);
        for (int i = 0; i < july.size(); i++) {
            weeklyJuly.println(july.get(i));
        }
        weeklyJuly.println("Średnia cena paliwa w lipcu: " + table[6]);
        weeklyJuly.close();

        PrintWriter weeklyAugust = new PrintWriter("august.txt");
        Collections.sort(august);
        for (int i = 0; i < august.size(); i++) {
            weeklyAugust.println(august.get(i));
        }
        weeklyAugust.println("Średnia cena paliwa w sierpniu: " + table[7]);
        weeklyAugust.close();

        PrintWriter weeklySeptember = new PrintWriter("september.txt");
        Collections.sort(septemper);
        for (int i = 0; i < septemper.size(); i++) {
            weeklySeptember.println(septemper.get(i));
        }
        weeklySeptember.println("Średnia cena paliwa we wrześniu: " + table[8]);
        weeklySeptember.close();

        PrintWriter weeklyOctober = new PrintWriter("october.txt");
        Collections.sort(october);
        for (int i = 0; i < october.size(); i++) {
            weeklyOctober.println(october.get(i));
        }
        weeklyOctober.println("Średnia cena paliwa w październiku: " + table[9]);
        weeklyOctober.close();

        PrintWriter weeklyNovember = new PrintWriter("november.txt");
        Collections.sort(november);
        for (int i = 0; i < november.size(); i++) {
            weeklyNovember.println(november.get(i));
        }
        weeklyNovember.println("Średnia cena paliwa w listopadzie: " + table[10]);
        weeklyNovember.close();

        PrintWriter weeklyDecember = new PrintWriter("december.txt");
        Collections.sort(december);
        for (int i = 0; i < december.size(); i++) {
            weeklyDecember.println(december.get(i));
        }
        weeklyDecember.println("Średnia cena paliwa w grudniu: " + table[11]);
        weeklyDecember.close();
    }
}
