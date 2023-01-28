package com.jarema.lukasz.zadania.programistyczne.rozdzial10;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestProductionWorker {
    public static void main(String[] args) {
        String surname, id = "";
        LocalDate date;
        int duty;
        double hourlyRate;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj nazwisko pracownika: ");
        surname = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\d{3}-[A-M]");
        Matcher matcher;
        do {
            System.out.print("Podaj swój numer ID: ");
            id = scanner.nextLine();
            matcher = pattern.matcher(id);
        } while (!(matcher.matches()));

        do {
            System.out.print("Podaj datę zatrudnienia: ");
            date = LocalDate.parse(scanner.nextLine());
        } while (date.isAfter(LocalDate.now()));

        do {
            System.out.print("Podaj swoją zmianę (1 dla dziennej, 2 dla nocnej): ");
            duty = scanner.nextInt();
        } while (duty < 1 && duty > 2);

        do {
            System.out.print("Podaj swoją stawkę godzinową: ");
            hourlyRate = scanner.nextDouble();
        } while (hourlyRate <= 0);

        ProductionWorker productionWorker = new ProductionWorker(surname, id, date, duty, hourlyRate);
        System.out.print(productionWorker.toString());
    }
}
