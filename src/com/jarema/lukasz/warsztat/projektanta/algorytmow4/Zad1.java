package com.jarema.lukasz.warsztat.projektanta.algorytmow4;

import java.util.Scanner;

/**
 * Napisz pętlę while, która umożliwia użytkownikowi wpisanie liczby. Tę liczbę należy pomnożyć przez 10 i zapisać wynik
 * w zmiennej product. Pętla powinna wykonywać iterację dopóty, dopóki wartość zmiennej product jest mniejsza niż 100.
 */

public class Zad1 {
    public static void main(String[] args) {
        int product = 0;
        while (product < 100) {
            System.out.print("Wprowadź liczbę: ");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            number *= 10;
            product += number;
            System.out.println("Suma liczb równa się: " + product);
        }
    }
}
