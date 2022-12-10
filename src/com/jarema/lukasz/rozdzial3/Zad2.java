package com.jarema.lukasz.rozdzial3;

import java.util.Scanner;

/**
 * Program Magiczne Daty.
 * Data 10 czerwca 1960r. jest wyjątkowa, ponieważ po zapisaniu jej w pokazanym niżej formacie iloczyn dnia i miesiąca
 * daje w wyniku dwie ostatnie cyfry roku:
 * 10/6/60
 * Napisz program, który wyświetla prośbę o podanie dnia, miesiąca (w formie liczby) i dwóch ostatnich cyfr roku.
 * Program powinien określać, czy iloczyn dnia i miesiąca jest równy dwóm ostatnim cyfrom roku. Jeśli tak jest, program
 * ma wyświetlać komunikat z informacją, że data jest magiczna. W przeciwnym razie należy wyświetlić komunikat, że data
 * nie jest magiczna.
 */

public class Zad2 {
    public static void main(String[] args) {
        int day, month, year;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Program sprawdzi czy podana przez Ciebie data jest magiczna.");
        System.out.println("Wprowadź dzień:");
        day = scanner.nextInt();
        System.out.println("Wprowadź miesiąc:");
        month = scanner.nextInt();
        System.out.println("Wprowadź dwie ostatnie cyfry roku:");
        year = scanner.nextInt();

        int multiple = day * month;
        if (multiple == year) {
            System.out.println("Data: " + day + "/" + month + "/" + year + " jest datą magiczną");
        } else {
            System.out.println("Data: " + day + "/" + month + "/" + year + " nie jest datą magiczną");
        }
    }
}
