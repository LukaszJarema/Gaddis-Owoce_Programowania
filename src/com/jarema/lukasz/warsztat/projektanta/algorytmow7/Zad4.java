package com.jarema.lukasz.warsztat.projektanta.algorytmow7;

import java.util.Scanner;

/**
 * W programie trzeba zapisać liczbę mieszkańców 12 państw.
 * a. Zdefiniuj dwie talice, których można używać równolegle do przechowywania nazw i liczb mieszkańców państw.
 * b. Napisz pętlę, która korzysta z tych tablic do wyświetlania nazw i liczby mieszkańców każdego z państw.
 */

public class Zad4 {
    public static void main(String[] args) {
        //a.
        String [] countries = new String[12];
        int [] numberOfPeopleInCountry = new int[12];
        Scanner scanner = new Scanner(System.in);

        if (countries.length == numberOfPeopleInCountry.length) {
            for (int i = 0; i < countries.length; i++) {
                System.out.print("Podaj nazwę państwa: ");
                countries[i] = scanner.next();
                System.out.print("Podaj ilość mieszkańców kraju " + countries[i] + ": ");
                numberOfPeopleInCountry[i] = scanner.nextInt();
            }
            System.out.println("Tablice nie są równe.");
        }
        //b.
        for (int i = 0; i < countries.length; i++)
            System.out.println("W kraju " + countries[i] + " mieszka " + numberOfPeopleInCountry[i] + " ludzi");
    }
}
