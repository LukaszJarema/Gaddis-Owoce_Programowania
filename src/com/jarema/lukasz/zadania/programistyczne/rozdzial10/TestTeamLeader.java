package com.jarema.lukasz.zadania.programistyczne.rozdzial10;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestTeamLeader {
    public static void main(String[] args) {
        String surname, id = "";
        LocalDate date;
        int duty, hoursOfTraining, doneHoursOfTrainig;
        double hourlyRate, monthlyBonus;
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

        do {
            System.out.print("Podaj stawkę bonusu miesięcznego: ");
            monthlyBonus = scanner.nextDouble();
        } while (monthlyBonus <= 0);

        do {
            System.out.print("Podaj liczbę godzin szkoleń do wykonania: ");
            hoursOfTraining = scanner.nextInt();
        } while (hoursOfTraining < 0);

        do {
            System.out.print("Podaj liczbę godzin wykonanych szkoleń: ");
            doneHoursOfTrainig = scanner.nextInt();
        } while (doneHoursOfTrainig <= 0);

        TeamLeader teamLeader = new TeamLeader(surname, id, date, duty, hourlyRate, monthlyBonus, hoursOfTraining,
                doneHoursOfTrainig);

        System.out.println(teamLeader.toString());
    }
}
