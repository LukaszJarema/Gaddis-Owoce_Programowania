package com.jarema.lukasz.zadania.programistyczne.rozdzial9;

import java.util.Scanner;

public class TestWordSeparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj ciąg znaków: ");
        WordSeparator wordSeparator = new WordSeparator(scanner.nextLine());
        System.out.println(wordSeparator.separator());
    }
}
