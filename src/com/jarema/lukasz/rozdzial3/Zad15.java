package com.jarema.lukasz.rozdzial3;

import java.util.Scanner;

/**
 * Bank pobiera opłatę podstawową w wysokości 10zł miesięcznie plus dodatkowe opłaty za obsłygę czeków do konta
 * firmowego:
 * - 0,10zł za czek przy mniej niż 20 czekach,
 * - 0,08zł za czek przy 20 - 39 czekach,
 * - 0,06zł za czek przy 40 - 59 czekach,
 * - 0,04zł za czek przy ponad 60 czekach.
 * Napisz program wyświetlający pytanie o liczbę czeków wystawionych w danym miesiącu. Program powinien następnie obliczać
 * i wyświetlać opłaty pobrane przez bank w danym miesiącu.
 */

public class Zad15 {
    public static void main(String[] args) {
        System.out.print("Ile czeków wystawiłeś w tym miesiącu: ");
        Scanner scanner = new Scanner(System.in);
        int howMany = scanner.nextInt();
        double sum = 0;

        if(howMany < 20) {
            sum = howMany * 0.1 + 10.0;
            System.out.println("Suma pobrana przez bank w tym miesiącu: " + sum + "zł");
        } if (howMany < 40) {
            sum = howMany * 0.08 + 10.0;
            System.out.println("Suma pobrana przez bank w tym miesiącu: " + sum + "zł");
        } if (howMany < 60) {
            sum = howMany * 0.06 + 10.0;
            System.out.println("Suma pobrana przez bank w tym miesiącu: " + sum + "zł");
        } else {
            sum = howMany * 0.04 + 10.0;
            System.out.println("Suma pobrana przez bank w tym miesiącu: " + sum + "zł");
        }
    }
}
