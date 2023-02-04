package com.jarema.lukasz.zadania.programistyczne.rozdzial10;

import java.util.Scanner;

public class TestPreferredCustomer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Customer customer = new Customer("Nowak", "Piłsudskiego 1/12", 555666777,
                1234, false);
        System.out.print("Podaj wartość zakupów klienta " + customer.getSurname() + ": ");
        double value = scanner.nextDouble();
        PreferredCustomer preferredCustomer = new PreferredCustomer(customer, value);
        System.out.println(preferredCustomer.toString());
    }
}
