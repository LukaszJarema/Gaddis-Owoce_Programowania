package com.jarema.lukasz.zadania.programistyczne.rozdzial7;

import java.util.Scanner;

public class TestAssessmentListModified {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AssessmentListModified assessmentListModified = new AssessmentListModified();
        for (int i = 0; i < assessmentListModified.getSurnamesLength(); i++) {
            System.out.print("Podaj nazwisko " + (i + 1) + " studenta: ");
            assessmentListModified.setSurnames(i, scanner.nextLine());
        }

        for (int i = 0; i < assessmentListModified.getSurnamesLength(); i++) {
            String surname = assessmentListModified.getSurname(i);
            int index = assessmentListModified.getIndexFromSurnames(surname);
            double score = -1.0;
            do {
                System.out.println("Podaj liczbę punktów z testów studenta " +
                        assessmentListModified.getSurname(index) + ": ");
                assessmentListModified.setScores(surname);
            } while (!(score < 0.0 || score >= 100.0));
        }

        assessmentListModified.displayScores();

        for (int i = 0; i < assessmentListModified.getSurnamesLength(); i++) {
            String surname = assessmentListModified.getSurname(i);
            assessmentListModified.setGrades(surname);
        }

        for (int i = 0; i < assessmentListModified.getSurnamesLength(); i++) {
            String surname = assessmentListModified.getSurname(i);
            System.out.println("Średnia studenta " + surname + " wynosi: " + assessmentListModified.getAverage(surname));
        }
    }
}
