package com.jarema.lukasz.zadania.programistyczne.rozdzial6;

import java.util.Scanner;

public class TestPayroll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj imię pracownika: ");
        String name = scanner.nextLine();
        System.out.print("Podaj nazwisko pracownika: ");
        String surname = scanner.nextLine();
        System.out.print("Podaj numer id pracownika: ");
        int idNumber = scanner.nextInt();
        Payroll employee = new Payroll(name, surname, idNumber);
        System.out.print("Podaj stawkę brutto pracownika: ");
        double hourlyRate = scanner.nextDouble();
        System.out.print("Podaj ilość przepracowanych godzin: ");
        int workedHours = scanner.nextInt();

        double salary = employee.salary(hourlyRate, workedHours);

        System.out.println("Pracownik: " + employee.getName() + " " + employee.getSurname() + " o numerze ID: "
        + employee.getIdNumber() + " zarobił: " + salary + " PLN brutto.");
    }
}
