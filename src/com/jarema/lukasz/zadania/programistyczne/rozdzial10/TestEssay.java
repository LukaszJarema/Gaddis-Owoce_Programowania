package com.jarema.lukasz.zadania.programistyczne.rozdzial10;

import java.util.Scanner;

public class TestEssay {
    public static void main(String[] args) {
        int grammarPoints, orthographyPoints, length, content;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Podaj liczbę punktów uzyskaną z gramatyki: ");
            grammarPoints = scanner.nextInt();
        } while (grammarPoints < 0 || grammarPoints > 30);

        do {
            System.out.print("Podaj liczbę punktów uzyskaną z ortografii: ");
            orthographyPoints = scanner.nextInt();
        } while (orthographyPoints < 0 || orthographyPoints > 20);

        do {
            System.out.print("Podaj liczbę punktów uzyskanych za długość: ");
            length = scanner.nextInt();
        } while (length < 0 || length > 20);

        do {
            System.out.print("Podaj liczbę punktów uzyskanych za treść: ");
            content = scanner.nextInt();
        } while (content < 0 || content > 30);

        Essay essay = new Essay(grammarPoints, orthographyPoints, length, content);
        essay.setScore(grammarPoints, orthographyPoints, length, content);
        System.out.println("Ocena za esej: " + essay.getGrade());
    }
}
