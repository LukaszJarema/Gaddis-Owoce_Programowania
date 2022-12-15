package com.jarema.lukasz.zadania.programistyczne.rozdzial6;

import java.util.Scanner;

public class TestTestScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TestScores testScores = new TestScores();
        System.out.print("Podaj liczbę punktów z pierwszego testu: ");
        testScores.setScore1(scanner.nextInt());
        System.out.print("Podaj liczbę punktów z drugiego testu: ");
        testScores.setScore2(scanner.nextInt());
        System.out.print("Podaj liczbę punktów z trzeciego testu: ");
        testScores.setScore3(scanner.nextInt());
        System.out.printf("Średnia liczba punktów z trzech testów wynosi: %.2f",
                testScores.testAverage(testScores.getScore1(), testScores.getScore2(), testScores.getScore3()));
    }
}
