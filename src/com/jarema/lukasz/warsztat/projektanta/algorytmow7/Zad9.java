package com.jarema.lukasz.warsztat.projektanta.algorytmow7;

/**
 * Zmienna values wskazuje dwuwymiarową tablicę typu double obejmującą 10 wierszy i 20 kolumn. Napisz kod, który sumuje
 * wartość wszystkich elementów tej tablicy i zapisuje sumę w zmiennej total.
 */

public class Zad9 {
    public static void main(String[] args) {
        final int ROWS = 10;
        final int COLUMNS = 20;

        int [] [] values = new int[ROWS][COLUMNS];
        int total = 0;

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++)
                total += values [i] [j];
        }
    }
}
