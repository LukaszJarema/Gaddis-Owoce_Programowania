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
            for (int j = 0; j < assessmentList.getSurnamesLength(); j++) {
                String surname = assessmentList.getSurname(i);
                int index = assessmentList.getIndexFromSurnames(surname);
                double score = -1.0;
                do {
                    System.out.print("Podaj liczbę punktów z testu numer "  + (j + 1) + " studenta " +
                assessmentList.getSurname(index) + ": ");
                    assessmentList.setScores(surname);
                } while (!(score < 0.0 || score >= 100.0));
            }
        }


    }
}
