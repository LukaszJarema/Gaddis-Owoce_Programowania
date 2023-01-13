package com.jarema.lukasz.zadania.programistyczne.rozdzial9;

import java.util.Scanner;

public class TestTranslatorOfAlfabeticalPhoneNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wprowadź numer telefonu: ");
        TranslatorOfAlfabeticalPhoneNumbers translator = new TranslatorOfAlfabeticalPhoneNumbers(scanner.nextLine());
        translator.translatePhoneNumber();
    }
}
