package com.jarema.lukasz.zadania.programistyczne.rozdzial7;

import java.util.Scanner;

public class TestAssessmentList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AssessmentList assessmentList = new AssessmentList();

        for (int i = 0; i < assessmentList.getSurnamesLength(); i++) {
            System.out.print("Podaj nazwisko studenta nr " + (i + 1) + ": ");
            assessmentList.setSurnames(i, scanner.nextLine());
        }

        for (int i = 0; i < assessmentList.getSurnamesLength(); i++) {
            String surname = assessmentList.getSurname(i);
            int index = assessmentList.getIndexFromSurnames(surname);
            double score = -1.0;
            do {
                System.out.println("Podaj liczbę punktów z testów studenta " +
                        assessmentList.getSurname(index) + ": ");
                assessmentList.setScores(surname);
            } while (!(score < 0.0 || score >= 100.0));
        }

        for (int i = 0; i < assessmentList.getSurnamesLength(); i++) {
            String surname = assessmentList.getSurname(i);
            assessmentList.setGrades(surname);
        }

        for (int i = 0; i < assessmentList.getSurnamesLength(); i++) {
            String surname = assessmentList.getSurname(i);
            System.out.println("Średnia studenta " + surname + " wynosi: " + assessmentList.getAverage(surname));
        }
    }
}
