package com.jarema.lukasz.zadania.programistyczne.rozdzial4;

import java.util.Scanner;

/**
 * Suma liczb
 * Napisz program, który prosi o podanie dodatniej niezerowej liczby całkowitej. Program powinien używać pętli do
 * obliczania sumy wszystkich liczb całkowitych z przedziału od 1 do wprowadzonej liczby. Jeśli użytkownik wpisał np. 50
 * pętla powinna obliczyć sumę ciągu 1,2,3,4,...50.
 */

public class Zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, sum = 0;
        do {
            System.out.print("Wprowadź dodatnią niezerową liczbę całkowitą: ");
            n = scanner.nextInt();
        } while (n <= 0);
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.print("Suma liczb od 1 do " + n + " = " + sum);
    }
}
