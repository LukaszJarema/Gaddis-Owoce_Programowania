package com.jarema.lukasz.zadania.programistyczne.rozdzial6;

import java.util.Scanner;

public class TestMonthDays {
    public static void main(String[] args) {
        int month, year;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Podaj miesiąc (1-12): ");
            month = scanner.nextInt();
        } while ((month < 1) || (month > 12));

        do {
            System.out.print("Podaj rok: ");
            year = scanner.nextInt();
        } while (year < 0);

        MonthDays monthDays = new MonthDays();
        System.out.print(monthDays.numberOfDays(month, year) + " dni.");
    }
}
