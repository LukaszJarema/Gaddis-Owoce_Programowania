package com.jarema.lukasz.zadania.programistyczne.rozdzial9;

import java.util.Scanner;

public class TestPhoneNumbers {
    public static void main(String[] args) {
        PhoneNumbers phoneNumbers = new PhoneNumbers();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wyszukiwaną wartość: ");
        phoneNumbers.getNameAndPhone(scanner.nextLine());
    }
}
