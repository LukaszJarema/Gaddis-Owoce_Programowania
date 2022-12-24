package com.jarema.lukasz.warsztat.projektanta.algorytmow7;

/**
 * Zmienna names wskazuje tablicę liczb całkowitych zawierającą 20 elementów. Napisz pętlę for, która wyświetla każdy
 * element tej tablicy.
 */

public class Zad1 {
    public static void main(String[] args) {
        int [] numbers = new int[20];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
