package com.jarema.lukasz.zadania.programistyczne.rozdzial7;

import java.util.*;

/**
 * Operacje na tablicach.
 * Napisz program obejmujący tablicę zainicjowaną danymi testowymi. Posłuż się dowolnym prostym typem danych. W
 * programie dostępne powinny być następujące metody:
 * - getTotal. Ta metoda powinna przyjmować jako argument tablicę jednowymiarową i zwracać sumę wartości z tej tablicy.
 * - getAverage. Ta metoda powinna przyjmować jako argument tablicę jednowymiarową i zwracać średnią wartości z tej
 * tablicy.
 * - getHighest. Ta metoda powinna przyjmować jako argument tablicę jednowymiarową i zwracać największą wartości z tej
 * tablicy.
 * - getLowest. Ta metoda powinna przyjmować jako argument tablicę jednowymiarową i zwracać najmniejszą wartości z tej
 * tablicy.
 * Zademonstruj działanie każdej metody z tego programu.
 */

public class OperationsOnArrays {
    private ArrayList<Integer> table = new ArrayList<>();

    /**
     * Konstruktor bezargumentowy obiektu typu OperationsOnArrays
     */
    public OperationsOnArrays() {

    }

    /**
     * Konstruktor obiektu typu OperationsOnArrays przyjmujący jako argument obiekt typu ArrayList Integer i zapisany
     * w polu table
     * @param table obiekt typu ArrayList Integer zapisany w polu table
     */
    public OperationsOnArrays(ArrayList<Integer> table) {
        this.table = table;
    }

    /**
     * Metoda setTable obiektu typu OperationsOnArrays przyjmuje jako argument obiekt typu ArrayList Integer i zapisuje
     * go w polu table
     * @param table wartość pola table
     */
    public void setTable(ArrayList<Integer> table) {
        this.table = table;
    }

    /**
     * Metoda getTable obiektu typu OperationsOnArrays zwraca wartość pola table
     * @return wartość pola table
     */
    public ArrayList<Integer> getTable() {
        return table;
    }

    /**
     * Metoda getTotal obiektu typu OperationsOnArrays zwraca sumę liczb zapisanych w polu table
     * @return suma liczb z pola table
     */
    public int getTotal() {
        int total = 0;
        for (int i = 0; i < table.size(); i++) {
            total += table.get(i);
        }
        return total;
    }

    /**
     * Metoda getAverage obiektu typu OperationsOnArrays zwraca średnią wartość z pola table
     * @return średnia wartość pola table
     */
    public double getAverage() {
        return getTotal() / table.size();
    }

    /**
     * Metoda getHighest obiektu typu OperationsOnArrays zwraca największą liczbę z tablicy pola table
     * @return największa wartość w tablicy table
     */
    public int getHighest() {
        Collections.sort(table);
        int highest = table.get(table.size() - 1);
        return highest;
    }

    /**
     * Metoda getLowest obiektu typu OperationsOnArrays zwraca najmniejszą liczbę z tablicy pola table
     * @return najmniejsza wartość w tablicy table
     */
    public int getLowest() {
        Collections.sort(table);
        int lowest = table.get(0);
        return lowest;
    }

    /**
     * Metoda displayInformationAboutTable wyświetla informacje z metod obiektu typu OperationsOnTable
     */
    public void displayInformationAboutTable() {
        System.out.println("Łączna wartość liczb w tablicy: " + getTotal());
        System.out.println("Średnia wartość liczb w tablicy: " + getAverage());
        System.out.println("Największa wartość w tablicy: " + getHighest());
        System.out.println("Najmniejsza wartość w tablicy: " + getLowest());
    }
}
