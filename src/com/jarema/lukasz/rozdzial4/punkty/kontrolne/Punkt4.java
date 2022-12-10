package com.jarema.lukasz.rozdzial4.punkty.kontrolne;

import java.util.Scanner;

public class Punkt4 {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę z przedziału 10 do 24");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        while (number < 10 || number > 24) {
            System.out.println("Wprowadziłeś niewłaściwą liczbę.\nWprowadź liczbę jeszcze raz: ");
            number = scanner.nextInt();
        }

        System.out.println("Podałeś liczbę z właściwego zakresu.");
    }
}
