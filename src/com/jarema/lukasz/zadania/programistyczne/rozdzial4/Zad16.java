package com.jarema.lukasz.zadania.programistyczne.rozdzial4;

import java.util.Scanner;

/**
 * Analiza budżetu.
 * Napisz program, który wyświetla użytkownikowi prośbę o podanie miesięcznego budżetu. Następnie program powinien w
 * pętli pobierać wydatki użytkownika z danego miesiąca i obliczać sumę bieżącą. Po zakończeniu pętli program powinien
 * wyświetlać różnicę między wydaną kwotą a budżetem.
 */

public class Zad16 {
    public static void main(String[] args) {
        double budget, bill, sum = 0.0;
        String answer;

        System.out.print("Podaj swój miesięczny budżet: ");
        Scanner scanner = new Scanner(System.in);
        budget = scanner.nextDouble();

        do {
            System.out.print("Wprowadź koszt wydatku: ");
            bill = scanner.nextDouble();
            sum += bill;
            System.out.print("Czy chcesz podać kolejny wydatek? : ");
            answer = scanner.next();
        } while (!answer.equals("nie") && !answer.equals("NIE"));

        System.out.print("Różnica pomiędzy wydaną kwotą a budżetem wynosi: " + (budget - sum));
    }
}
