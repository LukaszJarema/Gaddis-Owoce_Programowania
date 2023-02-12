package com.jarema.lukasz.zadania.programistyczne.rozdzial11;

/**
 * Klasa TestScores.
 * Napisz klasę TestScores. Konstruktor w tej klasie powinien przyjmować jako argument tablicę wyników testów. W klasie
 * powinna znajdować się metoda zwracająca średnią wyników testów. Jeśli któryś z wyników w tablicy jest ujemny lub
 * wyższy od 100, klasa powinna zgłaszać wyjątek typu IllegalArgumentException. Zilustruj działanie tej klasy w
 * programie.
 */

public class TestScores {
    private int [] scores;

    /**
     * Konstruktor obiektu typu TestScores przyjmujący jako argument wartość pola scores
     * @param scores wartość pola scores
     */
    public TestScores(int [] scores) {
        this.scores = scores;
    }

    /**
     * Metoda getAverage zwraca średnią wartość punktów z testu
     * @return średnia wartość punktów z testu
     */
    public double getAverage() throws InvalidTestScore {
        int points = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < 0 || scores[i] > 100)
                //throw new IllegalArgumentException("Wynik mniejszy od 0 lub większy od 100");
                throw new InvalidTestScore(scores[i]);
            else {
                points += scores[i];
            }
        }
        return points / scores.length;
    }
}
