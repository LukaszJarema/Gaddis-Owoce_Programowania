package com.jarema.lukasz.zadania.programistyczne.rozdzial5;

import java.util.Scanner;

/**
 * Kalkulator szacunkowych kosztów malowania.
 * Firma malarska określiła, że każde 10m2 powierzchni ściany wymaga 1,5 litra farby i 8 godzin pracy. Koszt robocizny
 * firma wycenia na 18,00 zł za godzinę. Napisz program, który pozwala użytkownikowi wprowadzić liczbę pokojów do
 * pomalowania i cenę farby za litr. Program powinien też wyświetlać pytanie o powierzchnię każdego pokoju w metrach
 * kwadratowych. W programie należy umieścić metody zwracające następujące dane:
 * - liczbę potrzebnych litrów farby
 * - liczbę potrzebnych godzin pracy
 * - koszt farby
 * - koszt robocizny
 * - łączny koszt malowania.
 * Program powinien wyświetlać te dane na ekranie.
 */

public class Zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ile masz pokojów do pomalowania: ");
        int rooms = scanner.nextInt();
        System.out.print("Ile kosztuje litr farby: ");
        double priceOfPaint = scanner.nextDouble();
        double howManyMeters = 0;

        for (int i = 1; i <= rooms; i++) {
            System.out.print("Ile metrów ma pokój nr " + i + " : ");
            double meters = scanner.nextDouble();
            howManyMeters += meters;
        }

        System.out.println("Na pomalowanie Twoich pokoi potrzebne będzie: " + howManyLitersOfPaint(howManyMeters) +
                " litrów farby.");
        System.out.println("Na pomalowanie Twoich pokoi potrzebne będzie: "  +howManyWorkingHours(howManyMeters) +
                " godzin");
        System.out.println("Na pomalowanie Twoich pokoi koszt farby wynosi: " + howMuchCostPaint(howManyMeters,
                priceOfPaint));
        System.out.println("Koszt robocizny pomalowania Twoich pokoi wynosi: " + howMuchCostWorks(howManyMeters));
        System.out.println("Łączny koszt malowania wynosi: " + howMuchCostAll(howMuchCostWorks(howManyMeters),
                howMuchCostPaint(howManyMeters, priceOfPaint)));
    }

    public static double howManyLitersOfPaint(double howManyMeters) {
        double litersOfPaint = howManyMeters/ 10.0 * 1.5;
        return litersOfPaint;
    }

    public static double howManyWorkingHours(double howManyMeters) {
        double hours = howManyMeters / 10 * 8;
        return hours;
    }

    public static double howMuchCostPaint(double howManyMeters, double priceOfPaint) {
        double costPaint = howManyMeters / 10.0 * 1.5 * priceOfPaint;
        return costPaint;
    }

    public static double howMuchCostWorks(double howManyMeters) {
        double costWorks = howManyMeters / 10.0 * 8.0 * 18.0;
        return costWorks;
    }

    public static double howMuchCostAll(double costWorks, double costPaint) {
        double sum = costWorks + costPaint;
        return sum;
    }
}
