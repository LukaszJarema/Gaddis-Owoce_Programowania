package com.jarema.lukasz.zadania.programistyczne.rozdzial4;

import java.util.Scanner;

/**
 * Wykres słupkowy.
 * Napisz program, który wyświetla prośbę o podanie wartości sprzedaży z danego dnia z pięciu sklepów. Program powinien
 * wyświetlać wykres słupkowy z porównaniem sprzedaży w każdym ze sklepów. Słupki twórz, wyświetlając wiersze gwiazdek.
 * Każda gwiazdka reprezentuje 100zł.
 */

public class Zad12 {
    public static void main(String[] args) {
        int sales1, sales2, sales3, sales4, sales5;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj dziesiejszą wartość sprzedaży dla sklpeu nr 1: ");
        sales1 = scanner.nextInt();
        System.out.print("Podaj dziesiejszą wartość sprzedaży dla sklpeu nr 2: ");
        sales2 = scanner.nextInt();
        System.out.print("Podaj dziesiejszą wartość sprzedaży dla sklpeu nr 3: ");
        sales3 = scanner.nextInt();
        System.out.print("Podaj dziesiejszą wartość sprzedaży dla sklpeu nr 4: ");
        sales4 = scanner.nextInt();
        System.out.print("Podaj dziesiejszą wartość sprzedaży dla sklpeu nr 5: ");
        sales5 = scanner.nextInt();

        System.out.println("WYKRES SŁUPKOWY Z POZIOMEM SPRZEDAŻY");


        System.out.print("Sklep nr 1: ");
        int star1 = sales1 / 100;
        for (int j = 0; j < star1; j++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.print("Sklep nr 2: ");
        int star2 = sales2 / 100;
        for (int j = 0; j < star2; j++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.print("Sklep nr 3: ");
        int star3 = sales3 / 100;
        for (int j = 0; j < star3; j++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.print("Sklep nr 4: ");
        int star4 = sales4 / 100;
        for (int j = 0; j < star4; j++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.print("Sklep nr 5: ");
        int star5 = sales5 / 100;
        for (int j = 0; j < star5; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
