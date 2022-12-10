package com.jarema.lukasz.warsztat.projektanta.algorytmow5;

/**
 * Program zawiera następującą definicję metody:
 * public static int cube(int num) {
 *         return num * num * num;
 *     }
 * Napisz instrukcję, która przekazuje do tej metody wartość 4 i przypisuje zwróconą wartość do zmiennej result
 */

public class Zad5 {
    public static void main(String[] args) {
        int result = cube(4);
    }

    /**
     * Metoda zwracająca liczbę num podniesioną do potęgi trzeciej
     * @param num liczba
     * @return num do potęgi trzeciej
     */
    public static int cube(int num) {
        return num * num * num;
    }
}
