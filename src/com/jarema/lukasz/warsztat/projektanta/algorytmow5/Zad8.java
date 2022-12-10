package com.jarema.lukasz.warsztat.projektanta.algorytmow5;

/**
 * Napisz metodę square, która przyjmuje argument w postaci liczby całkowitej i zwraca kwadrat tej wartości.
 */

public class Zad8 {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(square(num));
    }

    /**
     * Metoda square zwraca kwadrat liczby
     * @param num argument podnoszony do kwadratu
     * @return num do kwadratu
     */

    public static int square(int num) {
        int result = num * num;
        return result;
    }
}
