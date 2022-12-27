package com.jarema.lukasz.zadania.programistyczne.rozdzial7;

import java.util.ArrayList;

/**
 * Egzamin na prawo jazdy
 * Lokalny ośrodek egzaminacyjny poprosił Cię o napisanie programu, który ocenia pisemną część egzaminu na prawo jazdy.
 * Egzamin składa się z 20 pytań wielokrotnego wyboru. Oto poprawne odpowiedzi:
 * 1.B  6.A     11.B    16.C
 * 2.D  7.B     12.C    17.C
 * 3.A  8.A     13.D    18.B
 * 4.A  9.C     14.A    19.D
 * 5.C  10.D    15.D    20.A
 * Aby zdać egzamin, egzaminowany musi poprawnie odpowiedzieć na 15 z 20 pytań.
 * Napisz klasę DriverExam, która przechowuje poprawne odpowiedzi w polu w postaci tablicy. Ta klasa powinna też
 * zawierać inne pole w postaci tablicy, z odpowiedziami egzaminowanego. W klasie powinny znajdować się następujące
 * składowe:
 * - passed. Ta metoda ma zwracać wartość true, jeśli egzaminowany zdał egzamin, lub false, jeśli egzaminowany nie zdał
 * egzaminu.
 * - totalCorrect. Ta metoda ma zwracać łączną liczbę poprawnych odpowiedzi.
 * - totalIncorrect. Ta metoda ma zwracać łączną liczbę niepoprawnych odpowiedzi.
 * - questionMissed. Jest to tablica zawierająca numery pytań, które egzaminowany pominął.
 * Zademonstruj działanie tej klasy w kompletnym programie, który wyświetla prośbę o wpisanie odpowiedzi egzaminowanego,
 * a następnie wyświetla wyniki zwrócone przez metody klasy DriverExam.
 * Sprawdzanie poprawności danych. Jako odpowiedzi należy akceptować tylko litery A, B, C, D.
 */

public class DriverExam {
    private final char [] examCorrectAnswers = {'B','D','A','A','C','A','B','A','C','D','B','C','D','A','D','C','C',
    'B','D','A'};

    /**
     * Konstruktor bezargumentowy obiektu typu DriverExam
     */
    public DriverExam() {

    }

    /**
     * Metoda passed obiektu typu DriverExam przyjmuje jako argument tablicę z odpowiedziami egzaminowanego i porównuje
     * jej elementy z tablicą z poprawnymi odpowiedziami
     * @param answers tablica z odpowiedziami egzaminowanego
     * @return true jeśli jest 15 lub więcej poprawnych odpowiedzi, w przeciwnym razie false
     */
    public boolean passed(char [] answers) {
        int correct = 0;
        for (int i = 0; i < examCorrectAnswers.length; i++) {
            if (examCorrectAnswers[i] == answers[i])
                correct++;
        }
        if (correct >= 15) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Metoda passed obiektu typu DriverExam przyjmuje jako argument tablicę z odpowiedziami egzaminowanego i porównuje
     * jej elementy z tablicą z poprawnymi odpowiedziami
     * @param answers tablica z odpowiedziami egzaminowanego
     * @return zwraca ilość poprawnych odpowiedzi
     */
    public int totalCorrect(char [] answers) {
        int correct = 0;
        for (int i = 0; i < examCorrectAnswers.length; i++) {
            if (examCorrectAnswers[i] == answers[i])
                correct++;
        }
        return correct;
    }

    /**
     * Metoda passed obiektu typu DriverExam przyjmuje jako argument tablicę z odpowiedziami egzaminowanego i porównuje
     * jej elementy z tablicą z poprawnymi odpowiedziami
     * @param answers tablica z odpowiedziami egzaminowanego
     * @return zwraca ilość niepoprawnych odpowiedzi
     */
    public int totalIncorrect(char [] answers) {
        int incorrect = 0;
        for (int i = 0; i < examCorrectAnswers.length; i++) {
            if (examCorrectAnswers[i] != answers[i])
                incorrect++;
        }
        return incorrect;
    }

    /**
     * Metoda questionsMissed obiektu typu DriverExam zwraca tablicę z numerami pytań bez odpowiedzi od egzaminowanego
     * @param answers tablica z odpowiedziami egzaminowanego
     * @return tablica z numerami pytań pozostawionymi bez odpowiedzi
     */
    public ArrayList<Integer> questionsMiessed(char [] answers) {
        ArrayList<Integer> missed = new ArrayList<>();
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == '0')
                missed.add(i + 1);
        }
        return missed;
    }

    /**
     * Metoda displayExamResults wyświetla informacje z metod z obiektu typu DriverExam
     * @param answers tablica z odpowiedziami użytkownika
     */
    public void displayExamResults(char [] answers) {
        System.out.println("Czy egzamin został zdany:");
        if (passed(answers)) {
            System.out.println("Tak");
        } else {
            System.out.println("Nie");
        }
        System.out.println("Poprawnych odpowiedzi udzielono w: " + totalCorrect(answers) + " pytaniach");
        System.out.println("Niepoprawnych odpowiedzi udzielono w: " + totalIncorrect(answers) + " pytaniach");
        System.out.println("Pozostawiono numery pytań bez odpowiedz: " + questionsMiessed(answers));
    }
}
