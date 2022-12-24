package com.jarema.lukasz.warsztat.projektanta.algorytmow7;

import java.util.Random;

/**
 * W aplikacji używana jest tablica dwuwymiarowa zadeklarowana w następujący sposób:
 * int [] [] days = new int [29] [5];
 * a. Napisz kod, który sumuje wartości w wierszach tej tablicy i wyświetla wyniki.
 * b. Napisz kod, który sumuje wartości w kolumnach tej tablicy i wyświetla wyniki.
 */

public class Zad10 {
    public static void main(String[] args) {
        int [] [] days = new int [29] [5];

        for (int i = 0; i < days.length; i++) {
            for (int j = 0; j < days[i].length; j++) {
                Random random = new Random();
                days [i] [j] = random.nextInt(100) + 1;
            }
        }

        for (int i = 0; i < days.length; i++) {
            int totalInRows = 0;
            for (int j = 0; j < days[i].length; j++) {
                totalInRows += days [i] [j];
            }
            System.out.println("Suma wiersza " + i + " wynosi: " + totalInRows);
        }

        for (int i = 0; i < days[i].length; i++) {
            int totalInColumns = 0;
            for (int j = 0; j < days.length; j++) {
                totalInColumns += days [j] [i];
            }
            System.out.println("Suma kolumny " + i + " wynosi: " + totalInColumns);
        }
    }
}
