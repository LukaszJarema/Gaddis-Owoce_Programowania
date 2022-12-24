package com.jarema.lukasz.warsztat.projektanta.algorytmow7;

import java.util.Scanner;

/**
 * W programie trzeba zapisać identyfikatory (jako wartość typu int) i tygodniowe wynagrodzenie brutto (jako wartość
 * typu double) 10 pracowników.
 * a. Zdefiniuj dwie tablice, których można używać równolegle do przechowywania identyfikatorów i pensji brutto 10
 * pracowników.
 * b. Napisz pętlę, która korzysta z tych tablic do wyświetlania identyfikatora i pensji brutto pracownika.
 */

public class Zad5 {
    public static void main(String[] args) {
        //a.
        int [] employeeId = new int[10];
        double [] grossSalary = new double[10];
        Scanner scanner = new Scanner(System.in);

        if (employeeId.length == grossSalary.length) {
            for (int i = 0; i < employeeId.length; i++) {
                System.out.print("Podaj numer ID pracownika: ");
                employeeId[i] = scanner.nextInt();
                System.out.print("Podaj pensję brutto pracownika o numerze ID " + employeeId[i] + ": ");
                grossSalary[i] = scanner.nextDouble();
            }
        }

        //b.
        for (int i = 0; i < employeeId.length; i++)
            System.out.println("Pracownik o numerze " + employeeId[i] + " zarabia: " + grossSalary[i] + " złotych " +
                    "brutto.");
    }
}
