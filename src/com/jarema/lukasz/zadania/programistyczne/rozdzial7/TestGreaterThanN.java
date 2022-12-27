package com.jarema.lukasz.zadania.programistyczne.rozdzial7;

import java.util.Scanner;

public class TestGreaterThanN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] table = new int[10];
        int number;
        System.out.print("Podaj 10 liczb całkowitych, które chcesz zapisać w tablicy: ");
        for (int i = 0; i < 10; i++) {
            table[i] = scanner.nextInt();
        }
        System.out.print("Podaj od jakiej liczby chcesz wypisywać wartości większe od niej znajdujące się w tablicy: ");
        number = scanner.nextInt();
        GreaterThanN greaterThanN = new GreaterThanN(table, number);
        greaterThanN.displayGreaterThanN();
    }
}
