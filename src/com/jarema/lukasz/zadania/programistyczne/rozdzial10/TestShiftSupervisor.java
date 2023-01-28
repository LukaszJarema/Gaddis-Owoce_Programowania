package com.jarema.lukasz.zadania.programistyczne.rozdzial10;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestShiftSupervisor {
    public static void main(String[] args) {
        String surname, id;
        LocalDate date;
        double yealryRate, yearlyBonus;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj nazwisko nadzorcy: ");
        surname = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\d{3}-[A-M]");
        Matcher matcher;
        do {
            System.out.print("Podaj numer ID nadzorcy: ");
            id = scanner.nextLine();
            matcher = pattern.matcher(id);
        } while (!(matcher.matches()));

        do {
            System.out.print("Podaj datę zatrudnienia: ");
            date = LocalDate.parse(scanner.nextLine());
        } while (date.isAfter(LocalDate.now()));

        do {
            System.out.print("Podaj roczną pensję nadzorcy: ");
            yealryRate = scanner.nextDouble();
        } while (yealryRate < 0);

        do {
            System.out.print("Podaj roczną premię nadzorcy: ");
            yearlyBonus = scanner.nextDouble();
        } while (yearlyBonus <= 0);

        ShiftSupervisor shiftSupervisor = new ShiftSupervisor(surname, id, date, yealryRate, yearlyBonus);

        System.out.println(shiftSupervisor.toString());
    }
}
