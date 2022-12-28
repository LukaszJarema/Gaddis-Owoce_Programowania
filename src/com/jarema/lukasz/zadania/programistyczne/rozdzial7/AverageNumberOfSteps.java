package com.jarema.lukasz.zadania.programistyczne.rozdzial7;

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
    private int [] MONTHS = new int[12];

    public void setMONTHS(int [] stepsInMonths) {
        MONTHS = stepsInMonths;
    }

    public int [] getMONTHS() {
        return MONTHS;
    }
}
