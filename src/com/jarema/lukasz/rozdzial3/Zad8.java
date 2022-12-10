package com.jarema.lukasz.rozdzial3;

import java.util.Scanner;

/**
 * Producent oprogramowania sprzedaje pakiet w cenie detalicznej 99złotych. Rabaty za liczbę sztuk są przyznawane zgodnie
 * z następującą tabelą:
 * 10-19 sztuk - 20% rabatu
 * 20-49 sztuk - 30% rabatu
 * 50-99 sztuk - 40% rabatu
 * 100 i więcej sztuk - 50% rabatu
 * Napisz program, który wyświetla prośbę o podanie liczby zakupionych pakietów. Następnie program powinien wyświetlać
 * poziom rabatu (jeśli został przyznany) i łączną kwotę zakupu po rabacie.
 */

public class Zad8 {
    public static void main(String[] args) {
        double totalPrice = 0;
        int discount = 0;
        int price = 99;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę zakupionych pakietów oprogramowania: ");
        int packages = scanner.nextInt();

        if(packages < 10) {
            totalPrice = price * packages;
            discount = 0;
        } else if (packages < 20) {
            totalPrice = price * packages * 0.8;
            discount = 20;
        } else if (packages < 50) {
            totalPrice = price * packages * 0.7;
            discount = 30;
        } else if (packages < 100) {
            totalPrice = price * packages * 0.6;
            discount = 40;
        } else if (packages >= 100) {
            totalPrice = price * packages * 0.5;
            discount = 50;
        }

        System.out.println("Łączna cena: " + totalPrice + " złotych\nNaliczony rabat = " + discount + " %");
    }
}
