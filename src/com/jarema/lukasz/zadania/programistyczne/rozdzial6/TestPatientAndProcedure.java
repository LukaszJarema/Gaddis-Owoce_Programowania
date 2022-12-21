package com.jarema.lukasz.zadania.programistyczne.rozdzial6;

import java.time.LocalDate;
import java.util.Scanner;

public class TestPatientAndProcedure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Patient patient = new Patient();

        System.out.print("Podaj pierwsze imię pacjenta: ");
        patient.setFirstName(scanner.nextLine());
        System.out.print("Podaj drugie imię pacjenta: ");
        patient.setMiddleName(scanner.nextLine());
        System.out.print("Podaj nazwisko pacjenta: ");
        patient.setSurname(scanner.nextLine());
        System.out.print("Podaj adres pacjenta: ");
        patient.setAddress(scanner.nextLine());
        System.out.print("Podaj miasto w którym mieszka pacjent: ");
        patient.setCity(scanner.nextLine());
        System.out.print("Podaj kod pocztowy pacjenta: ");
        patient.setPostCode(scanner.nextLine());
        System.out.print("Podaj numer telefonu pacjenta: ");
        patient.setTelephoneNumber(Integer.parseInt(scanner.nextLine()));
        System.out.print("Podaj imię osoby kontaktowej: ");
        patient.setNameOfContactPerson(scanner.nextLine());
        System.out.print("Podaj nazwisko osoby kontaktowej: ");
        patient.setSurnameOfContactPerson(scanner.nextLine());
        System.out.print("Podaj numer telefonu osoby kontaktowej: ");
        patient.setTelephoneNumberOfContactPerson(scanner.nextInt());

        Procedure procedure1 = new Procedure("badanie fizykalne", LocalDate.now(), "Marek",
                "Iwicki", 250.00);
        Procedure procedure2 = new Procedure("zdjęcie rentgenowskie", LocalDate.now(),
                "Andrzej", "Jaracz", 500.00);
        Procedure procedure3 = new Procedure("badanie krwi", LocalDate.now(), "Wiktor",
                "Szymczak", 200.00);

        patient.displayPatientInfo();
        procedure1.displayInformationAboutProcedure(1);
        procedure2.displayInformationAboutProcedure(2);
        procedure3.displayInformationAboutProcedure(3);

        double priceOfProcedures = procedure1.getPriceOfProcedure() + procedure2.getPriceOfProcedure() +
                procedure3.getPriceOfProcedure();
        System.out.printf("Koszt badań: %.2f", priceOfProcedures);
    }
}
