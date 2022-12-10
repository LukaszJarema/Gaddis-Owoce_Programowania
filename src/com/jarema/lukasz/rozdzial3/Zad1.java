package com.jarema.lukasz.rozdzial3;

import java.util.Scanner;

/**
 Program, który wyświetla prośbę o wpisanie wartości z przedziału od 1 do 10, a następnie wyświetla liczbę rzymską będącą
 odpowiednikiem tej wartości. Jeśli podana wartość nie należy do przedziału od 1 do 10, program powinien wyświetlić
 komunikat o błędzie.
 */

public class Zad1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("Wprowadź liczbę od 1 do 10:");
        number = scanner.nextInt();

        switch (number){
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;
            case 6:
                System.out.println("VI");
                break;
            case 7:
                System.out.println("VII");
                break;
            case 8:
                System.out.println("VIII");
                break;
            case 9:
                System.out.println("IX");
                break;
            case 10:
                System.out.println("X");
                break;
            default:
                System.out.println("Wprowadziłeś niewłaściwą liczbę!");
        }
    }
}
