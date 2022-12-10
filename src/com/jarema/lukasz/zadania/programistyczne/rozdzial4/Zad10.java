package com.jarema.lukasz.zadania.programistyczne.rozdzial4;

import java.util.Scanner;

/**
 * Największa i najmniejsza wartość.
 * Napisz program z pętlą umożliwiający użytkownikowi podanie serii liczb całkowitych. Użytkownik powinien wpisać -99,
 * aby zasygnalizować konieć serii. Po wpisaniu wszystkich liczb program powinien wyświetlać największą i najmniejszą
 * wprowadzoną wartość.
 */

public class Zad10 {
    public static void main(String[] args) {

        int n, min = 100, max = 0;

        do {
            System.out.println("Wprowadź liczbę. Jeśli chcesz zakończyć program wpisz -99: ");
            Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();
            if (n > max) {
                max = n;
            }
            if (n < min && n != -99) {
                min = n;
            }
        } while (n != -99);
        System.out.println("Największa liczba w serii: " + max);
        System.out.println("Najmniejsza liczba w serii: " + min);
    }
}
