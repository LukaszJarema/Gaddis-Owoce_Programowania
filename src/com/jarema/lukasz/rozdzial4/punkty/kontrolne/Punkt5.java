package com.jarema.lukasz.rozdzial4.punkty.kontrolne;

import java.util.Scanner;

public class Punkt5 {
    public static void main(String[] args) {
        System.out.println("Wprowadź literę t, T, n lub N");
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.next().charAt(0);

        while (letter != 'n' && letter != 'N' && letter != 't' && letter != 'T') {
            System.out.println("Podałeś niewłaściwą literę.\nPodaj literę jeszcze raz: ");
            letter = scanner.next().charAt(0);
        }

        System.out.println("Podałeś literę: " + letter);
    }
}
