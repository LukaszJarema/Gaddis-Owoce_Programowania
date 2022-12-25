package com.jarema.lukasz.zadania.programistyczne.rozdzial7;

import java.util.Scanner;

public class TestRainFall {
    public static void main(String[] args) {
        RainFall rainFall = new RainFall();
        int [] monthRainFall = new int[rainFall.getLengthOfMonthlyRainFall()];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < monthRainFall.length; i++) {
            do {
                System.out.print("Podaj wartość opadów w miesiącu nr " + (i + 1) + ": ");
                monthRainFall[i] = scanner.nextInt();
            } while (monthRainFall[i] < 0);
        }

        rainFall.setMonthlyRainFall(monthRainFall);
        System.out.println("Łączna suma opadów w roku: " + rainFall.getYearlyRainFall());
        System.out.println("Średnia miesięczna suma opadów: " + rainFall.averageMonthlyRainFall());
        System.out.println("Miesiąc o największej ilości opadów: " + rainFall.monthWithMaxRainFall());
        System.out.println("Miesiąc o najmniejszej ilości opadów: " + rainFall.monthWithMinRainFall());
    }
}
