package com.jarema.lukasz.zadania.programistyczne.rozdzial5;

import java.util.Scanner;

/**
 * Średnia z testów i oceny.
 * Napisz program, który wyświetla prośbę o wpisanie wyników pięciu testów. Program powinien wyświetlać ocenę z każdego
 * testu i średnią z wszystkich testów. Napisz w programie następujące metody:
 * calcAverage - powinna przyjmować jako argumenty pięć wyników testów i zwracać ich średnią.
 * determineGrade - powinna przyjmować jako argument wynik testu i zwracać ocenę zgodną z poniższą skalą:
 * Wynik           Ocena
 * 90 - 100        5
 * 80 - 89         4
 * 70 - 79         3
 * 60 - 69         2
 * Poniżej 60      1
 */

public class Zad7 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Podaj wynik testu nr " + i + ": ");
            Scanner scanner = new Scanner(System.in);
            int score = scanner.nextInt();
            sum += score;
            System.out.println("Ocena z testu wynosi: " + determineGrade(score));
        }
        System.out.println("Średnia punktów z testu wynosi: " + calcAverage(sum));
    }

    public static double calcAverage(int sum) {
        return sum / 5.0;
    }

    public static int determineGrade(int score) {
        if (score < 60) {
            return 1;
        } else if (score < 70) {
            return 2;
        } else if (score < 80) {
            return 3;
        } else if (score < 90) {
            return 4;
        } else {
            return 5;
        }
    }
}
