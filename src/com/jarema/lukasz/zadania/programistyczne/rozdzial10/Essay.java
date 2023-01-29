package com.jarema.lukasz.zadania.programistyczne.rozdzial10;

/**
 * Klasa Essay.
 * Zaprojektuj klasę Essay pochodną od zaprezentowanej w tym rozdziale klasy GradedActivity. Klasa Essay powinna ustalać
 * ocenę, jaką student otrzyma za esej. Student może uzyskać za esej 100 punktów za następujące aspekty:
 * - gramatyka: 30 punktów,
 * - ortografia: 20 punktów,
 * - odpowiednia długość: 20 punktów,
 * - treść: 30 punktów.
 * Zademonstruj działanie tej klasy w prostym programie.
 */

public class Essay extends GradedActivity {
    private int grammarPoints;
    private int orthographyPoints;
    private int length;
    private int content;

    private double score;

    /**
     * Konstruktor bezargumentowy obiektu typu Essay
     */
    public Essay() {

    }

    /**
     * konstruktor obiektu typu Essay przyjmujący jako argumenty wartości pól:
     * @param grammarPoints wartość pola grammarPoints
     * @param orthographyPoints wartość pola orthographyPoints
     * @param length wartość pola length
     * @param content wartość pola content
     */
    public Essay(int grammarPoints, int orthographyPoints, int length, int content) {
        this.grammarPoints = grammarPoints;
        this.orthographyPoints = orthographyPoints;
        this.length = length;
        this.content = content;
    }

    //Akcesory
    public int getGrammarPoints() {
        return grammarPoints;
    }

    public int getOrthographyPoints() {
        return orthographyPoints;
    }

    public int getLength() {
        return length;
    }

    public int getContent() {
        return content;
    }

    @Override
    public double getScore() {
        return score;
    }

    //Mutatory
    public void setGrammarPoints(int grammarPoints) {
        this.grammarPoints = grammarPoints;
    }

    public void setOrthographyPoints(int orthographyPoints) {
        this.orthographyPoints = orthographyPoints;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setContent(int content) {
        this.content = content;
    }

    public void setScore(int grammarPoints, int orthographyPoints, int length, int content) {
        this.score = grammarPoints + orthographyPoints + length + content;
        super.setScore(score);
    }
}
