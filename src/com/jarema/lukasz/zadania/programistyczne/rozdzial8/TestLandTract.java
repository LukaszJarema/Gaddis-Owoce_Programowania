package com.jarema.lukasz.zadania.programistyczne.rozdzial8;

import java.util.Scanner;

public class TestLandTract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double length1, length2, width1, width2;

        do {
            System.out.print("Podaj długość pierwszej działki: ");
            length1 = scanner.nextDouble();
        } while (length1 < 0.0);

        do {
            System.out.print("Podaj szerokość pierwszej działki: ");
            width1 = scanner.nextDouble();
        } while (width1 < 0.0);

        do {
            System.out.print("Podaj długość drugiej działki: ");
            length2 = scanner.nextDouble();
        } while (length2 < 0.0);

        do {
            System.out.print("Podaj szerokość drugiej działki: ");
            width2 = scanner.nextDouble();
        } while (width2 < 0.0);

        LandTract landTract1 = new LandTract(length1, width1);
        LandTract landTract2 = new LandTract(length2, width2);

        if (landTract1.equals(landTract2))
            System.out.println("Działki są takie same");
        else
            System.out.println("Działki są różne");

        System.out.println(landTract1);
        System.out.println(landTract2);
    }
}
