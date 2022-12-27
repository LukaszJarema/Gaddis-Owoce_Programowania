package com.jarema.lukasz.zadania.programistyczne.rozdzial7;

import java.util.Scanner;

public class TestDriverExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char [] answers = new char[20];
        DriverExam driverExam = new DriverExam();
        char answer = '\0';

        for (int i = 0; i < answers.length; i++) {
            do {
                System.out.print("Podaj odpowiedź na pytanie nr " + (i + 1) + ", jeśli nie znasz odpowiedzi wprowadź " +
                        "0: ");
                answer = scanner.next().charAt(0);
                answers[i] = answer;
            } while (!(answer == 'A' || answer == 'B' || answer == 'C' || answer == 'D' || answer == '0'));
        }

        driverExam.displayExamResults(answers);
    }
}
