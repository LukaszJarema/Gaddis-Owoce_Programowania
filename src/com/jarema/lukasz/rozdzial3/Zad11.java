package com.jarema.lukasz.rozdzial3;

import java.util.Scanner;

/**
 * Napisz program, który wyświetla pytanie o nazwiska trzech biegaczy i czas ukończenia biegu (podawany w minutach)
 * przez każdego z nich. Program powinien wyświetlać nazwiska biegaczy zgodnie z ich kolejnością na mecie.
 */

public class Zad11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wprowadź nazwisko pierwszego biegacza: ");
        String runner1 = scanner.next();
        System.out.print("Wprowadź czas ukończenia biegu zawodnika: " + runner1 + " : ");
        int time1 = scanner.nextInt();
        System.out.print("Wprowadź nazwisko drugiego biegacza: ");
        String runner2 = scanner.next();
        System.out.print("Wprowadź czas ukończenia biegu zawodnika: " + runner2 + " : ");
        int time2 = scanner.nextInt();
        System.out.print("Wprowadź nazwisko trzeciego biegacza: ");
        String runner3 = scanner.next();
        System.out.print("Wprowadź czas ukończenia biegu zawodnika: " + runner3 + " : ");
        int time3 = scanner.nextInt();

        if (time1 <= time2 && time1 <= time3) {
            System.out.println("Pierwsze miejsce: " + runner1);
            if (time2 <= time3) {
                System.out.println("Drugie miejsce: " + runner2 + "\nTrzecie miejsce: " + runner3);
            } else {
                System.out.println("Drugie miejsce: " + runner3 + "\nTrzecie miejsce: " + runner2);
            }
        } else if (time2 <= time1 && time2 <= time3) {
            System.out.println("Pierwsze miejsce: " + runner2);
            if (time1 <= time3) {
                System.out.println("Drugie miejsce: " + runner1 + "\nTrzecie miejsce: " + runner3);
            } else {
                System.out.println("Drugie miejsce: " + runner3 + "\nTrzecie miejsce: " + runner1);
            }
        } else if (time3 <= time1 && time3 <= time2) {
            System.out.println("Pierwsze miejsce: " + runner3);
            if (time2 <= time1) {
                System.out.println("Drugie miejsce: " + runner2 + "\nTrzecie miejsce: " + runner1);
            } else {
                System.out.println("Drugie miejsce: " + runner1 + "\nTrzecie miejsce: " + runner2);
            }
        }
    }
}
