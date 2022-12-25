package com.jarema.lukasz.zadania.programistyczne.rozdzial7;

/**
 * Klasa RainFall.
 * Napisz klasę RainFall, która w tablicy wartości typu double zapisuje łączny poziom opadów z każdego z 12 miesięcy.
 * Ta klasa powinna mieć metody zwracające następujące dane:
 * - Łączny poziom opadów z danego roku.
 * - Średni miesięczny poziom opadów.
 * - Miesiąc o najwyższym poziomie opadów.
 * - Miesiąc o najniższym poziomie opadów.
 * Przedstaw działanie tej klasy w konkretnym programie.
 * Sprawdzanie poprawności danych wejściowych. Nie należy akceptować wartości ujemnych jako poziom miesięcznych opadów.
 */
public class RainFall {
    private int [] monthlyRainFall = new int[12];

    /**
     * Konstruktor bezargumentowy obiektu typu RainFall
     */
    public RainFall() {

    }

    /**
     * Konstruktor obiektu typu RainFall przyjmujący za argument tablicę int wprowadzaną w pole monthlyRainFall
     * @param monthlyRainFall wartość pola monthlyRainFall
     */
    public RainFall(int [] monthlyRainFall) {
        this.monthlyRainFall = monthlyRainFall;
    }

    /**
     * Metoda setMonthlyRainFall obiektu typu RainFall zapisuje wartość argumentu w polu monthlyRainFal
     * @param monthlyRainFall wartość pola monthlyRainFall
     */
    public void setMonthlyRainFall(int[] monthlyRainFall) {
        this.monthlyRainFall = monthlyRainFall;
    }

    /**
     * Metoda getLengthOfMonthlyRainFall zwraca długość tablicy monthlyRainFall
     * @return długość tablicy monthlyRainFall
     */
    public int getLengthOfMonthlyRainFall() {
        return monthlyRainFall.length;
    }
    /**
     * Metoda getMonthlyRainFall obiektu typu RainFall zwraca wartość pola monthlyRainFall
     * @return wartość pola monthlyRainFall
     */
    public int[] getMonthlyRainFall() {
        return monthlyRainFall;
    }

    /**
     * Metoda getYearkyRainFall obiektu typu RainFall zwraca łączną sumę obiektów zapisanych w polu tablicy
     * monthlyRainFall
     * @return suma obiektów pola monthlyRainFall
     */
    public int getYearlyRainFall() {
        int yearlyRainFall = 0;
        for (int i = 0; i < monthlyRainFall.length; i++) {
            yearlyRainFall += monthlyRainFall[i];
        }
        return yearlyRainFall;
    }

    /**
     * Metoda averageMonthlyRainFall obiektu typu RainFall zwraca średnią liczbę obiektów z pola monthlyRainFall
     * @return średnia wartość obiektów z pola monthlyRainFall
     */
    public double averageMonthlyRainFall() {
        double averageMonthlyRainFall = getYearlyRainFall() / monthlyRainFall.length;
        return averageMonthlyRainFall;
    }

    /**
     * Metoda monthWithMaxRainFall obiektu typu RainFall zwraca numer obiektu z pola monthlyRainFall z największą
     * wartością
     * @return numer obiektu z pola monthlyRainFall z największą wartością + 1
     */
    public int monthWithMaxRainFall() {
        int monthWithMaxRainFall = 0;
        for (int i = 1; i < monthlyRainFall.length; i++) {
            if (monthlyRainFall[i] > monthWithMaxRainFall)
                monthWithMaxRainFall = i;
        }
        return monthWithMaxRainFall + 1;
    }

    /**
     * Metoda monthWithMinRainFall obiektu typu RainFall zwraca numer obiektu z pola monthlyRainFall z najemniejszą
     * wartością
     * @return numer obiektu z pola monthlyRainFall z najmniejszą wartością + 1
     */
    public int monthWithMinRainFall() {
        int monthWithMinRainFall = 0;
        for (int i = 1; i < monthlyRainFall.length; i++) {
            if (monthlyRainFall[i] < monthWithMinRainFall)
                monthWithMinRainFall = i;
        }
        return monthWithMinRainFall + 1;
    }
}
