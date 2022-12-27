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


    }
}
