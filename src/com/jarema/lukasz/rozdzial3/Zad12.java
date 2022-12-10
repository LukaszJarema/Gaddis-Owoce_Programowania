package com.jarema.lukasz.rozdzial3;

import java.util.Scanner;

/**
 * W poniższej tabeli pokazano przybliżoną szybkość rozchodzenia się dźwięku w powietrzu, wodzie i stali:
 * Nośnik       Szybkość
 * Powietrze    343 m/s
 * Woda         1490 m/s
 * Stal         5100 m/s
 * Napisz program, który wyświetla prośbę o wprowadzenie słowa "powietrze", "woda" lub "stal" i odległość, jaką fala
 * dźwiękowa ma przebyć w wybranym nośniku. Następnie program ma wyświetlać czas potrzebny na pokonanie tej odległości.
 * Czas potrzebny do pokonania przez dźwięk odległości w powietrzu można obliczyć za pomocą następującego wzoru:
 * czas = odległość / 343.
 */

public class Zad12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wprowadź słowo powietrze, woda lub stal: ");
        String choose = scanner.nextLine();
        System.out.print("Jaką odległość ma do przebycia dźwięk? (podaj w metrach): ");
        int meters = scanner.nextInt();
        double time = 0;

        switch (choose) {
            case "powietrze":
                time = (double) meters / 343;
                System.out.println("Czas potrzebny do pokonania przez dźwięk odległości " + meters + " w powietrzu: " +
                        time);
                break;
            case "woda":
                time = (double) meters / 1490;
                System.out.println("Czas potrzebny do pokonania przez dźwięk odległości " + meters + " w wodzie: " +
                        time);
                break;
            case "stal":
                time = (double) meters / 5100;
                System.out.println("Czas potrzebny do pokonania przez dźwięk odległości " + meters + " w stali: " +
                        time);
                break;
            default:
                System.out.println("Wprowadziłeś niewłaściwe słowo");
        }
    }
}
