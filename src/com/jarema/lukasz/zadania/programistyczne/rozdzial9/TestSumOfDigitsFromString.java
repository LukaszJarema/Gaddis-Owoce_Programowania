package com.jarema.lukasz.zadania.programistyczne.rozdzial9;

import java.util.Scanner;

public class TestSumOfDigitsFromString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj ciąg znaków z którego chcesz obliczyć sumę cyfr: ");
        SumOfDigitsFromString sumOfDigitsFromString = new SumOfDigitsFromString(scanner.nextLine());
        System.out.println("Suma cyfr w podanym ciągu znaków: " + sumOfDigitsFromString.getSumOfDigits());
    }
}
