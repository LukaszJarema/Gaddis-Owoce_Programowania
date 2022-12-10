package com.jarema.lukasz.warsztat.projektanta.algorytmow4;

import java.util.Random;

/**
 * Uzupełnij poniższy program, aby wyświetlał losowe liczby całkowite z przedziału od 1 do 10.
 * public class Zad15 {
 *     public static void main(String[] args) {
 *          //tutaj umieść swój kod
 *     }
 * }
 */

public class Zad15 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(10) + 1;
        System.out.println(n);
    }
}
