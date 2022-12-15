package com.jarema.lukasz.zadania.programistyczne.rozdzial6;

/**
 * Klasa TestScores.
 * Zaprojektuj klasę TestScores z polami przechowującymi wyniki trzech testów. Ta klasa powinna mieć konstruktor,
 * akcesor i mutotor pól z wynikami testów, a także metodę zwracającą średni wynik. Zademonstruj działanie tej klasy. W
 * tym celu napisz odrębny program, który tworzy jej instancję. Program powinien wyświetlać prośbę o podanie wyników
 * trzech testów, zapisywanych później w obiekcie typu TestScores. Następnie ten program powinien wyświetlać średni
 * wynik testów zwracany przez dany obiekt typu TestScores.
 */
public class TestScores {
    private int score1;
    private int score2;
    private int score3;

    /**
     * Konstruktor TestScores przyjmuje wartości trzech testów i przypisuje je do pól score1, score2, score3
     * @param testScore1 wartość pola score1
     * @param testScore2 wartość pola score2
     * @param testScore3 wartość pola score3
     */
    public TestScores(int testScore1, int testScore2, int testScore3) {
        score1 = testScore1;
        score2 = testScore2;
        score3 = testScore3;
    }

    /**
     * Konstruktor TestScores bezargumentowy
     */
    public TestScores() {

    }

    //Akcesory

    /**
     * Metoda getScore1 zwraca wartość pola score1 obiektu typu TestScore
     * @return waetość pola score1
     */
    public int getScore1() {
        return score1;
    }

    /**
     * Metoda getScore2 zwraca wartość pola score1 obiektu typu TestScore
     * @return waetość pola score2
     */
    public int getScore2() {
        return score2;
    }

    /**
     * Metoda getScore3 zwraca wartość pola score1 obiektu typu TestScore
     * @return waetość pola score3
     */
    public int getScore3() {
        return score3;
    }

    //Mutatory

    /**
     * Metoda setScore1 zapisuje wartość w polu score1 obiektu typu TestScore
     * @param score wartość pola score1
     */
    public void setScore1(int score) {
        score1 = score;
    }

    /**
     * Metoda setScore2 zapisuje wartość w polu score1 obiektu typu TestScore
     * @param score wartość pola score2
     */
    public void setScore2(int score) {
        score2 = score;
    }

    /**
     * Metoda setScore3 zapisuje wartość w polu score1 obiektu typu TestScore
     * @param score wartość pola score3
     */
    public void setScore3(int score) {
        score3 = score;
    }

    /**
     * Metoda testAverage przyjmuje liczbę punktów trzech testów i zwraca ich średnią ilość
     * @param score1 wynik testu 1
     * @param score2 wynik testu 2
     * @param score3 wynik testu 3
     * @return średnia liczba punktów trzech testów
     */
    public double testAverage(int score1, int score2, int score3){
        double average = (score1 + score2 + score3) / 3.0;
        return average;
    }
}
