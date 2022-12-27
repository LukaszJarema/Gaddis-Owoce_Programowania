package com.jarema.lukasz.zadania.programistyczne.rozdzial7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Magiczna kula.
 * Napisz program, który symuluje działanie magicznej kuli - przepowiadającej przyszłość zabawki wyświetlającej losowe
 * odpowiedzi na pytania typu tak / nie. Program powinien wczytywać odpowiedzi z pliku odpowiedzi.txt do tablicy lub
 * obiektu ArrayList. Kod ma wyświetlać prośbę o zadanie pytania, a następnie wyświetlać jedną z odpowiedzi losowo
 * wybraną z tablicy lub obiektu ArrayList. Program powinien powtarzać te operacje do momentu, gdy użytkownik zechce
 * zakończyć zabawę.
 */

public class MagicBall {
    private ArrayList<String> answers = new ArrayList<>();
    private String fileName;

    /**
     * Konstruktor bezargumentowy obiektu typu MagicBall
     */
    public MagicBall() {

    }

    /**
     * Konstruktor obiektu typu MagicBall przyjmujący jako argument nazwę pliku
     * @param fileName nazwa pliku
     */
    public MagicBall(String fileName) {
        this.fileName = fileName;
    }

    /**
     * Metoda setAnswers obiektu typu MagicBall przyjmuje jako argument nazwę pliku i wypełnia tablicę answers linijkami
     * z pliku
     * @param fileName nazwa pliku
     */
    public void setAnswers(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            String fileLine = scanner.nextLine();
            answers.add(fileLine);
        }
        scanner.close();
    }

    /**
     * Metoda getFileName zwraca wartość pola fileName
     * @return wartość pola fileName
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Metoda getAnswer obiektu typu MagicBall drukuje na konsoli jedną z odpowiedzi z pliku
     */
    public void getAnswer() throws FileNotFoundException {
        setAnswers(fileName);
        int number = answers.size();
        Random random = new Random();
        int rand = random.nextInt(number);
        System.out.println(answers.get(rand));
    }
}
