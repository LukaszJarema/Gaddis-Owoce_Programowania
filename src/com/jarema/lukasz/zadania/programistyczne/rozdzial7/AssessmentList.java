package com.jarema.lukasz.zadania.programistyczne.rozdzial7;

/**
 * Lista ocen.
 * Wykladowca ma pięciu studentów, którzy napisali cztery testy. Używa on następującej skali do wystawiania ocen
 * studentom na podstawie średniej wyników z czterech testów:
 * Wynik testu      Ocena
 * 90 - 100         5
 * 80 - 89          4
 * 70 - 79          3
 * 60 - 69          2
 * 0 - 59           1
 * Napisz klasę, w której w tablicy elementów typu String lub obiekcie typu ArrayList przechowywane są nazwiska pięciu
 * studentów, w tablicy pięciu liczb całkowitych zapisywane są oceny studentów, a w pięciu tablicach po cztery liczby
 * typu double znajdują się wyniki testów każdego studenta. W klasie powinny znajdować się metody zwracające nazwisko
 * studenta, średni wynik testów i ocenę zależną od tej średniej.
 * Zademonstruj działanie tej klasy w programie, który umożliwia użytkownikowi podanie nazwiska każdego studenta i
 * czterech wyników testów. Następnie program powinien wyświetlać średnią i ocenę każdego studenta.
 * Sprawdzanie poprawności danych wejściowych: Nie należy akceptować wyników mniejszych od zera lub większych od stu.
 */

public class AssessmentList {
    private final String [] surnames = new String[5];
    private final int [] grades = new int[5];
    private double [] [] scores = new double[5][4];

    /**
     * Konstruktor bezargumentowy obiektu typu AssessmentList
     */
    public AssessmentList() {

    }

    /**
     * Metoda setSurnames obiektu typu AssessmentList przyjmuje jako argument indeks tablicy i nazwisko studenta i
     * wprowadza te dane w tablicę pola surnames
     * @param num indeks tablicy surnames
     * @param surname nazwisko tablicy wpisane do tablicy surnames
     */
    public void setSurnames(int num, String surname) {
        this.surnames[num] = surname;
    }

    /**
     * Metoda getIndexFromSurnames przyjmuje jako argument nazwisko studenta i zwraca index, pod którym to nazwisko
     * znajduje się w tablicy surnames
     * @param surname nazwisko studenta
     * @return index z tablicy surnames lub -1 jeśli nazwiska nie ma w tablicy
     */
    public int getIndexFromSurnames(String surname) {
        int index = -1;
        for (int i = 0; i < surnames.length; i++) {
            if (surnames[i].equals(surname))
                index = i;
        }
        return index;
    }

    /**
     * Metoda setGrades obiektu typu AssessmentList przyjmuje jako argument indeks tablicy i ocenę studenta i wprowadza
     * te dane w tablicę pola grades
     * @param num indeks tablicy grades
     * @param grade ocena wpisana do tablicy grades
     */
    public void setGrades(int num, int grade) {
        this.grades[num] = grade;
    }

    public void setScores()
}
