package com.jarema.lukasz.zadania.programistyczne.rozdzial10;

import java.util.Scanner;

public class TestCourseGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CourseGrades courseGrades = new CourseGrades();

        System.out.println("Laboratorium:");
        System.out.print("Podaj ilość punktów zdobytych z laboratorium: ");
        GradedActivity labActivity = new GradedActivity();
        int lab = scanner.nextInt();
        labActivity.setScore(lab);
        courseGrades.setLab(labActivity);

        System.out.println("Test:");
        System.out.print("Ile było pytań na teście: ");
        int questions = scanner.nextInt();
        System.out.print("Na ile pytań nie odpowiedziałeś: ");
        int missedQuestions = scanner.nextInt();
        PassFailExam passFailExam = new PassFailExam(questions, missedQuestions, 70);
        courseGrades.setPassFailExam(passFailExam);

        System.out.println("Esej:");
        int grammarPoints, orthographyPoints, length, content;
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
        essay.setScore(essay.getGrammarPoints(), essay.getOrthographyPoints(), essay.getLength(), essay.getContent());
        courseGrades.setEssay(essay);

        System.out.println("Egzamin końcowy:");
        System.out.print("Ile było pytań na teście: ");
        questions = scanner.nextInt();
        System.out.print("Na ile pytań nie odpowiedziałeś: ");
        missedQuestions = scanner.nextInt();
        FinalExam finalExam = new FinalExam(questions, missedQuestions);
        courseGrades.setFinalExam(finalExam);

        System.out.println(courseGrades.toString());
    }
}
