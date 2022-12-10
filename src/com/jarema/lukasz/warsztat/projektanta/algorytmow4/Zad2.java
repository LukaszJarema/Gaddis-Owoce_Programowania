package com.jarema.lukasz.warsztat.projektanta.algorytmow4;

import java.util.Scanner;

/**
 * Napisz pętlę do-while, która wyświetla prośbę o wpisanie dwóch liczb. Program ma dodawać te liczby i wyświetlać ich
 * sumę. W pętli należy wyświetlać użytkownikowi pytanie o to, czy ponownie wykonać opisaną operację. Po uzyskaniu
 * twierdzącej odpowiedzi należy wykonać następną iterację pętli. W przeciwnym razie należy zakończyć pracę kodu.
 */

public class Zad2 {
    public static void main(String[] args) {
        String answer;
        int numA, numB, sum = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Wprowadź pierwszą liczbę: ");
            numA = scanner.nextInt();
            System.out.print("Wprowadź drugą liczbę: ");
            numB = scanner.nextInt();
            sum = numA + numB;
            System.out.println("Suma wprowadzonych liczb: " + sum);
            System.out.println("Czy ponownie wykonać operację?");
            answer = scanner.next();
        }
        while (answer.charAt(0) != 'n' && answer.charAt(0) != 'N');
    }
}
