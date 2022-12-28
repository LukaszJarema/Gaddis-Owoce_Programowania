package com.jarema.lukasz.zadania.programistyczne.rozdzial7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Średnia liczba zrobionych kroków.
 * Personal Fitness Tracker to urządzenie ubieralne, które śledzi aktywność fizyczną, liczbę spalonych kalorii, puls,
 * wzorce snu itd. Typową aktywnością fizyczną, jaką rejestruje większość urządzeń tego rodzaju, jest liczba kroków
 * zrobionych danego dnia. Plik steps.txt ma 365 wierszy, z których każdy obejmuje liczbę kroków zrobionych w ciągu
 * dnia. Pierwszy wiersz to liczba kroków zrobionych 1 stycznia, drugi 2 stycznia itd. Napisz program, który wczytuje
 * ten plik, a następnie wyświetla średnią liczbę kroków zrobionych w każdym miesiącu. Dane pochodzą z roku, który nie
 * jest przestępny.
 */

public class AverageNumberOfSteps {
    private int [] months = new int[12];
    private double [] monthsAverage = new double[12];

    /**
     * Konstruktor bezargumentowy obiektu typu AverageOfSteps
     */
    public AverageNumberOfSteps() {

    }

    public AverageNumberOfSteps(int [] table) {
        months = table;
    }

    public void setMonths(int [] stepsInMonths) {
        months = stepsInMonths;
    }

    public void setMonths(String fileName) throws FileNotFoundException {
        int index = 1;
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            if (index <= 31) {
                months[0] += scanner.nextInt();
                index++;
            } else if (index > 31 && index <= 59) {
                months[1] += scanner.nextInt();
                index++;
            } else if (index > 59 && index <= 90) {
                months[2] += scanner.nextInt();
                index++;
            } else if (index > 90 && index <= 120) {
                months[3] += scanner.nextInt();
                index++;
            } else if (index > 120 && index <= 151) {
                months[4] += scanner.nextInt();
                index++;
            } else if (index > 151 && index <= 181) {
                months[5] += scanner.nextInt();
                index++;
            } else if (index > 181 && index <= 212) {
                months[6] += scanner.nextInt();
                index++;
            } else if (index > 212 && index <= 243) {
                months[7] += scanner.nextInt();
                index++;
            } else if (index > 243 && index <= 273) {
                months[8] += scanner.nextInt();
                index++;
            } else if (index > 273 && index <= 304) {
                months[9] += scanner.nextInt();
                index++;
            } else if (index > 304 && index <= 334) {
                months[10] += scanner.nextInt();
                index++;
            } else if (index > 334 && index <= 365) {
                months[11] += scanner.nextInt();
                index++;
            } else {
                System.out.println("Przekroczyłeś ilość dni w roku nieprzestępnym!");
                break;
            }
        }
        scanner.close();
    }

    public void setMonthsAverage() {
        monthsAverage[0] = months[0] / 31.0;
        monthsAverage[1] = months[1] / 28.0;
        monthsAverage[2] = months[2] / 31.0;
        monthsAverage[3] = months[3] / 30.0;
        monthsAverage[4] = months[4] / 31.0;
        monthsAverage[5] = months[5] / 30.0;
        monthsAverage[6] = months[6] / 31.0;
        monthsAverage[7] = months[7] / 31.0;
        monthsAverage[8] = months[8] / 30.0;
        monthsAverage[9] = months[9] / 31.0;
        monthsAverage[10] = months[10] / 30.0;
        monthsAverage[11] = months[11] / 31.0;
    }

    public int [] getMonths() {
        return months;
    }

    public void displayMonthsAverage() {
        setMonthsAverage();
        for (int i = 0; i < months.length; i++) {
            System.out.printf("Średnia kroków w miesiącu numer %d wyniosła: %.2f", (i + 1), monthsAverage[i]);
            System.out.println();
        }
    }
}
