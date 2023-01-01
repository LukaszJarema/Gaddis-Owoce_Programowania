package com.jarema.lukasz.zadania.programistyczne.rozdzial7;

import java.util.ArrayList;
import java.util.Scanner;

public class TestQuestion {
    public static void main(String[] args) {
        int user1Points = 0;
        int user2Points = 0;
        ArrayList<String> questions = new ArrayList<>();
        Question question1 = new Question("Kto wygrał WC 2022", "Francja", "Dania",
                "Brazylia", "Argentyna", "Argentyna");
        questions.add(question1.questionToString());
        Question question2 = new Question("Kto zajął 2. miejsce w WC 2022", "Francja", "Dania",
                "Brazylia", "Argentyna", "Francja");
        questions.add(question2.questionToString());
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < questions.size(); i += 2) {
            System.out.println("Pytanie dla gracza numer 1");
            System.out.println(questions.get(i));
            if (question1.getCorrectAnswer().equals(scanner.nextLine())) {
                user1Points++;
            }
        }

        for (int i = 1; i < questions.size(); i += 2) {
            System.out.println("Pytanie dla gracza numer 2");
            System.out.println(questions.get(i));
            if (question2.getCorrectAnswer().equals(scanner.nextLine())) {
                user2Points++;
            }
        }

        System.out.println("Gracz 1 zdobył: " + user1Points + " punktów.");
        System.out.println("Gracz 2 zdobył: " + user2Points + " punktów.");
    }
}
