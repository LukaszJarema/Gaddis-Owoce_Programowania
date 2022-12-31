package com.jarema.lukasz.zadania.programistyczne.rozdzial7;

import java.util.ArrayList;
import java.util.Scanner;

public class TestPhoneBookEntry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBookEntry phoneBookEntry = new PhoneBookEntry();
        ArrayList<String> phoneBook = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Podaj nazwisko osoby: ");
            phoneBookEntry.setSurname(scanner.next());
            System.out.print("Podaj numer osoby: ");
            phoneBookEntry.setTelephoneNumber(scanner.nextInt());
            phoneBook.add("Nazwisko: " + phoneBookEntry.getSurname() + " numer telefonu: " +
                    phoneBookEntry.getTelephoneNumber());
        }

        for (int i = 0; i < phoneBook.size(); i++) {
            System.out.println(phoneBook.get(i));
        }
    }
}
