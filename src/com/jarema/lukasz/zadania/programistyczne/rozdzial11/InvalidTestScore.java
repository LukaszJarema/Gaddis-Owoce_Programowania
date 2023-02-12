package com.jarema.lukasz.zadania.programistyczne.rozdzial11;

/**
 * Niestandardowa klasa wyjątków dla klasy TestScores.
 * Napisz klasę wyjątków InvalidTestScore. Zmodyfikuj klasę TestScores, aby zgłaszała wyjątek typu InvalidTestScore,
 * jeśli któryś z wyników w tablicy jest niepoprawny.
 */

public class InvalidTestScore extends Exception {
    public InvalidTestScore (int score) {
        super("Błędny wynik testu, poniżej 0 lub większy od 100 punktów.");
    }
}
