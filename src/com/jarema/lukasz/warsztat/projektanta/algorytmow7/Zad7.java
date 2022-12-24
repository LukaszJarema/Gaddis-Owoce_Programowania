package com.jarema.lukasz.warsztat.projektanta.algorytmow7;

/**
 * Napisz kod, który oblicza średnią wartość wszystkich elementów z tablicy grades.
 */

public class Zad7 {
    public static void main(String[] args) {
        int [] [] grades = new int[30] [10];
        int totalScores = 0;

        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[i].length; j++)
                totalScores += grades[i][j];
        }
    }
}
