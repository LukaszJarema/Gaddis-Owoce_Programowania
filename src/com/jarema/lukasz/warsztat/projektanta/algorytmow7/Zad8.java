package com.jarema.lukasz.warsztat.projektanta.algorytmow7;

/**
 * Przyjrzyj się następującej deklaracji tablicy:
 * int [] [] numberArray = new int [9] [11]
 * a. Napisz instrukcję, która przypisuje wartość 145 do pierwszej kolumny pierwszego wiersza tej tablicy.
 * b. Napisz instrukcję, która przypisuje 18 do ostatniej kolumny ostatniego wiersza tej tablicy.
 */

public class Zad8 {
    public static void main(String[] args) {
        int [] [] numberArray = new int [9] [11];
        //a.
        numberArray [0] [0] = 145;
        //b.
        int lastRow = numberArray.length - 1;
        int lastColumn = numberArray[lastRow].length - 1;
        numberArray[lastRow] [lastColumn] = 18;
    }
}
