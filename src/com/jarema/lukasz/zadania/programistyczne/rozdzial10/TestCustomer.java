package com.jarema.lukasz.zadania.programistyczne.rozdzial10;

import java.util.Scanner;

public class TestCustomer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Customer customer = new Customer();

        System.out.print("Podaj nazwisko klienta: ");
        customer.setSurname(scanner.nextLine());
        System.out.print("Podaj adres klienta: ");
        customer.setAddress(scanner.nextLine());
        System.out.print("Podaj numer telefonu klienta: ");
        customer.setTelephoneNumber(scanner.nextInt());
        System.out.print("Podaj numer ID klienta: ");
        customer.setCustomerId(scanner.nextInt());
        System.out.print("Czy klienta chce znajdować się na liście mailowej (T/N): ");
        char ch;
        do {
            ch = scanner.next().charAt(0);
        } while (!(ch == 'T' || ch == 'N'));
        if (ch == 'T')
            customer.setEmailList(true);
        else
            customer.setEmailList(false);
        System.out.println(customer.toString());
    }
}
