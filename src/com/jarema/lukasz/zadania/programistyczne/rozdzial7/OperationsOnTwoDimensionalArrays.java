package com.jarema.lukasz.zadania.programistyczne.rozdzial7;

/**
 * Operacje na tablicy dwuwymiarowej.
 * Napisz program, który tworzy tablicą dwuwymiarową inicjowaną danymi testowymi. Wykorzystaj dowolny prosty typ danych.
 * Program powinien udostępniać następujące metody:
 * - getTotal. Ta metoda powinna przyjmować jako argument tablicę dwuwymiarową i zwracać sumę wszystkich wartości
 * zapisanych w tej tablicy.
 * - getAverage. Ta metoda powinna przyjmować jako argument tablicę dwuwymiarową i zwracać średnią wszystkich wartości
 * zapisanych w tej tablicy.
 * - getRowTotal. Ta metoda powinna przyjmować tablicę dwuwymiarową jako pierwszy argument i liczbę całkowitą jako
 * drugi argument. Drugi argument ma określać indeks wiersza tablicy. Ta metoda powinna zwracać sumę wszystkich wartości
 * ze wskazanego wiersza.
 * - getColumnTotal. Ta metoda powinna przyjmować tablicę dwuwymiarową jako pierwszy argument i liczbę całkowitą jako
 *  drugi argument. Drugi argument ma określać indeks kolumny tablicy. Ta metoda powinna zwracać sumę wszystkich
 *  wartości ze wskazanej kolumny.
 *  - getHighestInRow. Ta metoda powinna przyjmować tablicę dwuwymiarową jako pierwszy argument i liczbę całkowitą jako
 *  drugi argument. Drugi argument ma określać indeks wiersza tablicy. Ta metoda powinna zwracać największą wartość
 *  ze wskazanego wiersza.
 *  - getLowesInRow. Ta metoda powinna przyjmować tablicę dwuwymiarową jako pierwszy argument i liczbę całkowitą jako
 *  drugi argument. Drugi argument ma określać indeks wiersza tablicy. Ta metoda powinna zwracać najmniejszą wartość
 *  ze wskazanego wiersza.
 *  Zademonstruj działanie każdej z tych meto w programie.
 */

public class OperationsOnTwoDimensionalArrays {

    /**
     * Konstruktor bezargumentowy obiektu typu OperationsOnTwoDimensionalArrays
     */
    public OperationsOnTwoDimensionalArrays() {

    }

    /**
     * Metoda getTotal obiektu typu OperationsOnTwoDimensionalArrays zwraca sumę wszystkich wartości zapisanych w
     * tablicy podanej w argumencie
     * @param table tablica dwuwymiarowa typu int
     * @return suma wszystkich pól w tablicy
     */
    public int getTotal(int table [] []) {
        int total = 0;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                total += table[i][j];
            }
        }
        return total;
    }

    /**
     * Metoda getAverage obiektu typu OperationsOnTwoDimensionalArrays zwraca średnią wartość wszystkich wartości
     * zapisanych w tablicy podanej w argumencie
     * @param table tablica dwuwymiarowa typu int
     * @return średnia wartość wartości w tablicy
     */
    public double getAverage(int table [] []) {
        int total = getTotal(table);
        int fields = 0;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                fields++;
            }
        }
        return (double) total / fields;
    }

    /**
     * Metoda getRowTotal obiektu typu OperationsOnTwoDimensionalArrays przyjmuje jako argumenty talicę dwuwymiarową
     * typu int oraz liczbę całkowitą wskazującą na numer wiersza. Zwraca sumę wartości w wierszu
     * @param table tablica dwuwymiarowa typu int
     * @param row numer wiersza
     * @return suma wartości w wierszu
     */
    public int getRowTotal(int table [] [], int row) {
        int total = 0;
        if (table.length < row) {
            System.out.println("Tabela nie ma tylu wierszy");
        }
        for (int i = 0; i < table[row].length; i++) {
            total += table[row][i];
        }
        return total;
    }

    /**
     * Metoda getColumnTotal obiektu typu OperationsOnTwoDimensionalArrays przyjmuje jako argumenty talicę dwuwymiarową
     * typu int oraz liczbę całkowitą wskazującą na numer kolumny. Zwraca sumę wartości w kolumnie
     * @param table tablica dwuwymiarowa typu int
     * @param column numer kolumny
     * @return suma wartości w kolumnie
     */
    public int getColumnTotal(int table [] [], int column) {
        int total = 0;
        if (table.length < column) {
            System.out.println("Tabela nie ma tylu kolumn, posiada ona: " + table.length + " kolumn.");
        }
        for (int i = 0; i < table.length; i++) {
            total += table[i][column];
        }
        return total;
    }

    /**
     * Metoda getHighestInRow obiektu typu OperationsOnTwoDimensionalArrays przyjmuje jako argumenty talicę dwuwymiarową
     * typu int oraz liczbę całkowitą wskazującą na numer wiersza. Zwraca największą wartość w wierszu
     * @param table tablica dwuwymiarowa typu int
     * @param row numer wiersza
     * @return największa wartość w podanym wierszu
     */
    public int getHighestInRow(int table [] [], int row) {
        int highest = table[row][0];
        if (table.length < row) {
            System.out.println("Tabela nie ma tylu wierszy");
        }
        for (int i = 1; i < table[row].length; i++) {
            if (table[row][i] > highest) {
                highest = table[row][i];
            }
        }
        return highest;
    }

    /**
     * Metoda getLowesttInRow obiektu typu OperationsOnTwoDimensionalArrays przyjmuje jako argumenty talicę dwuwymiarową
     * typu int oraz liczbę całkowitą wskazującą na numer wiersza. Zwraca najmniejszą wartość w wierszu
     * @param table tablica dwuwymiarowa typu int
     * @param row numer wiersza
     * @return najmniejsza wartość w podanym wierszu
     */
    public int getLowesInRow(int table [] [], int row) {
        int lowest = table[row][0];
        if (table.length < row) {
            System.out.println("Tabela nie ma tylu wierszy");
        }
        for (int i = 1; i < table[row].length; i++) {
            if (table[row][i] < lowest) {
                lowest = table[row][i];
            }
        }
        return lowest;
    }
}
