package com.jarema.lukasz.rozdzial3;

import java.util.Scanner;

/**
 * Program Wyniki testów i oceny.
 * Program obejmujący zmienne do przechowywania trzech wyników testów. Program powinien wyświetlać prośbę o wprowadzenie
 * trzech wyników testów i przypisywać je do zmiennych. Następnie kod ma wyświetlać średnią wyników testów i ocenę
 * odpowiadającą tej średniej. Poniżej schemat ocen:
 * Średnia:         Ocena:
 * 90-100           5
 * 80-89            4
 * 70-79            3
 * 60-69            2
 * Poniżej 60       1
 */

public class Zad4 {
    public static void main(String[] args) {
        int exam1, exam2, exam3, average;

        System.out.println("Program przelicza ocenę końcową na podstawie wyników uzyskanych z trzech testów.");

        System.out.println("Wprowadź wynik pierwszego testu (od 1 do 100): ");
        Scanner scanner = new Scanner(System.in);
        exam1 = scanner.nextInt();

        System.out.println("Wprowadź wynik drugiego testu:");
        exam2 = scanner.nextInt();

        System.out.println("Wprowadź wynik trzeciego testu:");
        exam3 = scanner.nextInt();

        average = (exam1 + exam2 + exam3) / 3;

        if(average >= 90){
            System.out.println("Twoja ocena to: 5");
        } else if (average >= 80){
            System.out.println("Twoja ocena to: 4");
        } else if(average >= 70){
            System.out.println("Twoja ocena to: 3");
        } else if (average >= 60){
            System.out.println("Twoja ocena to: 2");
        } else {
            System.out.println("Twoja ocena to: 1");
        }

    }
}
