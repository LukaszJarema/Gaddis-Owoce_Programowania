package com.jarema.lukasz.zadania.programistyczne.rozdzial9;

import java.util.Scanner;

public class TestSumOfNumbersFromString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj ciąg cyfr rozdzielonych znakiem ',', które chcesz do siebie dodać: ");
        SumOfNumbersFromString sumOfNumbersFromString = new SumOfNumbersFromString(scanner.nextLine());
        System.out.println(sumOfNumbersFromString.getSumOfNumbers());
    }
}
