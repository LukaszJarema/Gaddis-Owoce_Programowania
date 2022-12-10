package com.jarema.lukasz.rozdzial4.punkty.kontrolne;

import java.util.Scanner;

public class Punkt6 {
    public static void main(String[] args) {
        System.out.println("Wprowadź Tak lub Nie");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        while (!word.equals("Tak") && !word.equals("Nie")) {
            System.out.println("Wprowadziłeś niewłaściwe słowo.\nWprowadź słowo jeszcze raz");
            word = scanner.next();
        }

        System.out.println("Wprowadziłeś słowo: " + word);
    }
}
