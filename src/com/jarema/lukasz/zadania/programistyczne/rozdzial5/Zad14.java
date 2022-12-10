package com.jarema.lukasz.zadania.programistyczne.rozdzial5;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Lista liczb pierwszych.
 * Wykorzystaj metodę isPrime, którą napisałeś w Zad13, w programie zapisującym w pliku listę wszystkich liczb pierwszych
 * z przedziału od 1 do 100.
 */

public class Zad14 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter("Liczby pierwsze.txt");
        for (int i = 1; i <= 100; i++) {
            if (isPrime(i) == true) {
                printWriter.println(i);
            }
        }
        printWriter.close();
    }

    public static boolean isPrime(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                sum++;
            }
        }
        if (sum == 2) {
            return true;
        } else {
            return false;
        }
    }
}
