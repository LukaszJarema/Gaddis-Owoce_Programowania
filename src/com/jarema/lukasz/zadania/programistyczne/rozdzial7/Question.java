package com.jarema.lukasz.zadania.programistyczne.rozdzial7;

/**
 * Gra z pytaniami z wiedzy ogólnej.
 * W tym zadaniu utworzysz prostą dwuosobową grę z pytaniami z wiedzy ogólnej. Program ma działać w następujący sposób:
 * - Rozpoczyna gracz numer 1, po czym każdy zawodnik na zmianę odpowiada na pięć pytań. Jest więc dziesięć pytań dla
 * każdego gracza. Po wyświetleniu pytania pokazywane są też cztery odpowiedzi. Tylko jedna z nich jest poprawna. Jeśli
 * gracz wybierze poprawną odpowiedź otrzymuje punkt.
 * - Po wybraniu odpowiedzi na wszystkie pytania program wyświetla liczbę punktów uzyskanych przez każdego gracza i
 * ogłasza zwycięzcę, czyli osobę, która zdobyła najwięcej punktów.
 * Zaprojektuj klasę Question do przechowywania danych związanych z pytaniami. Klasa ta powinna zawierać pola typu
 * String z następującymi danymi:
 * - pytaniem,
 * - odpowiedzią numer 1,
 * - odpowiedzią numer 2,
 * - odpowiedzią numer 3,
 * - odpowiedzią numer 4,
 * - numerem poprawnej odpowiedzi (1, 2, 3 lub 4).
 * Klasa Question powinna obejmować odpowiednie konstruktory, akcesory i mutatory.
 * Program ma tworzyć tablicę 10 obiektów typu Question, po jednym dla każdego pytania. Jeśli chcesz, możesz posłużyć
 * się obiektem typu ArrayList zamiast tablicą. Wymyśl własne pytania na wybrane tematy do zapisania w tych obiektach.
 */

public class Question {
    private String question;
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
    private String correctAnswer;

    /**
     * Konstruktor bezargumentowy obiektu typu Question
     */
    public Question() {

    }

    /**
     * Konstruktor obiektu typu Question przyjmujący jako argumenty pytanie, odpowiedź 1, odpowiedź 2, odpowiedź 3,
     * odpowiedź 4 oraz poprawną odpowiedź
     * @param question wartość pola question
     * @param answer1 wartość pola answer1
     * @param answer2 wartość pola answer2
     * @param answer3 wartość pola answer3
     * @param answer4 wartość pola answer4
     * @param correctAnswer wartość pola correctAnswer
     */
    public Question(String question, String answer1, String answer2, String answer3, String answer4,
                    String correctAnswer) {
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public String getAnswer4() {
        return answer4;
    }

    public void setAnswer4(String answer4) {
        this.answer4 = answer4;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
