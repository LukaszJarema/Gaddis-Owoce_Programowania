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
        int steps;
        int index = 1;
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            if (index <= 31) {
                months[0] += scanner.nextInt();
                index++;
            } else if (index > 32 || index <= 59) {
                months[1] += scanner.nextInt();
                index++;
            }
        }
        scanner.close();
    }

    public int [] getMonths() {
        return months;
    }
}
