package com.jarema.lukasz.zadania.programistyczne.rozdzial7;

/**
 * Napisz w programie metodę, która przyjmuje dwa argumenty: tablicę i liczbę n. Załóż, że ta tablica zawiera liczby
 * całkowite. Metoda powinna wyświetlać wszystkie zapisane w tablicy liczby, które są większe od n.
 */

public class GreaterThanN {
    private int [] table;
    private int number;

    /**
     * Konstruktor bezargumentowy obiektu typu GreaterThanN
     */
    public GreaterThanN() {

    }

    /**
     * Konstruktor obiektu typu GreaterThanN przyjmujący wartość pól tablica table, number
     * @param table wartość pola tablicy table
     * @param number wartość pola number
     */
    public GreaterThanN(int [] table, int number) {
        this.table = table;
        this.number = number;
    }

    /**
     * Metoda sortTable obiektu typu GreaterThanN zwraca posortowaną rosnąco tabelę z pola table
     * @return posortowana rosnąco tabela z pola table
     */
    public int [] sortTable() {
        for (int i = 0; i < table.length; i++) {
            for (int j = (i + 1); j < table.length; j++) {
                int first = table[i];
                int second = table[j];
                if (second < first) {
                    table[i] = second;
                    table[j] = first;
                }
            }
        }
        return table;
    }

    /**
     * Metoda displayGreaterThanN obiektu typu GreaterThanN wykorzustuje metodę sortTable, a następnie wyświetla na
     * konsoli liczby większe od number
     */
    public void displayGreaterThanN() {
        sortTable();
        for (int i = 0; i < table.length; i++) {
            if (table[i] > number)
                System.out.println(table[i]);
        }
    }
}
