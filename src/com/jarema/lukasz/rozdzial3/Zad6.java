package com.jarema.lukasz.rozdzial3;

import java.util.Scanner;

/**
 * Program Kalkulator czasu.
 * Program, który wyświetla prośbę o wprowadzenie liczby sekund.
 * - Minuta składa się z 60 sekund. Jeśli podana liczba sekund wynosi 60 lub więcej, program powinien wyświetlać liczbę
 * minut w formie określonej liczby sekund.
 * - Godzina składa się z 3600 sekund. Jeśli podana liczba sekund wynosi 3600 lub więcej, program powinien wyświetlać
 * liczbę godzin w formie określonej liczby sekund.
 * - Dzień składa się z 86 400 sekund. Jeśli podana liczba seund wynosi 86 400 lub więcej, program powinien wyświetlać
 * liczbę dni w formie określonej liczby sekund.
 */

public class Zad6 {
    public static void main(String[] args) {
        int sec, day, hour, minute, second;

        System.out.println("Program na podstawie liczby sekund podanej przez użytkownika przelicza je na miuty," +
                " godziny, dni");
        System.out.println("Podaj liczbę sekund:");

        Scanner scanner = new Scanner(System.in);
        sec = scanner.nextInt();

        if(sec >= 86400){
            day = sec / 86400;
            hour = (sec % 86400) / 3600;
            minute = (sec % 86400) % 3600 / 60;
            second = (sec % 86400) % 3600 % 60;
            System.out.println(sec + " sekund daje: " + day + " dni " + hour + " godzin " + minute + " minut " +
                    second + " sekund.");
        } else if(sec >= 3600){
            hour = sec / 3600;
            minute = sec % 3600 / 60;
            second = sec % 3600 % 60;
            System.out.println(sec + " sekund daje: " + hour + " godzin " + minute + " minut " +
                    second + " sekund.");
        } else if(sec >= 60){
            minute = sec / 60;
            second = sec % 60;
            System.out.println(sec + " sekund daje " + minute + " minut " + second + " sekund.");
        } else {
            System.out.println("Wprowadzony przez Ciebie czas to: " + sec + " sekund.");
        }

    }
}
