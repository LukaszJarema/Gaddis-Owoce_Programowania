package com.jarema.lukasz.warsztat.projektanta.algorytmow5;

/**
 * Program zawiera następującą metodę:
 * public static void display(int arg1, double arg2, char arg3) {
 *         System.out.println("Wartości to " + arg1 + ", " + arg2 + " i " + arg3 + ".");
 *     }
 * Napisz instrukcję, która wywołuje tę metodę i przekazuje jako argumeny następujące zmienne:
 * char initial = 'T';
 * int age = 25;
 * double income = 50000.00;
 */

public class Zad6 {
    public static void main(String[] args) {
        char initial = 'T';
        int age = 25;
        double income = 50000.00;

        display(age, income, initial);
    }

    public static void display(int arg1, double arg2, char arg3) {
        System.out.println("Wartości to " + arg1 + ", " + arg2 + " i " + arg3 + ".");
    }
}
