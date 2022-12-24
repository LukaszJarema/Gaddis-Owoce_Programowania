package com.jarema.lukasz.warsztat.projektanta.algorytmow7;

/**
 * Zmienne numberArray1 i numberArray2 wskazują tablice o 100 elementach. Napisz kod, który kopiuje wartości z tablicy
 * numberArray1 do tablicy numberArray2.
 */

public class Zad2 {
    public static void main(String[] args) {
        int [] numberArray1 = new int[100],
                numberArray2 = new int[100];

        for (int i = 0; i < numberArray1.length; i++) {
            numberArray1[i] = i;
        }

        if (numberArray1.length == numberArray1.length) {
            for (int i = 0; i < numberArray1.length; i++) {
                numberArray2[i] = numberArray1[i];
            }
            System.out.println("Rozmiary tablic są różne.");
        }

        for (int i = 0; i < numberArray2.length; i++) {
            System.out.println(numberArray2[i]);
        }
    }
}
