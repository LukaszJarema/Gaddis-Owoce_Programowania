package com.jarema.lukasz.zadania.programistyczne.rozdzial7;

import java.util.Scanner;

/**
 * Modyfikacja zadania z listą ocen.
 * Zmodyfikuj program do obsługi listy ocen, tak aby pomijał najniższy wynik każdego studenta w trakcie określania
 * średniego wyników testów i oceny.
 */

public class AssessmentListModified {
    private final String[] surnames = new String[5];
    private final int[][] grades = new int[5][3];
    private double[][] scores = new double[5][3];

    /**
     * Konstruktor bezargumentowy obiektu typu AssessmentList
     */
    public AssessmentListModified() {

    }

    /**
     * Metoda getSurnamsLength obiektu typu AssessmentListModified zwraca długość tablicy surnames
     * @return długość tablicy z pola surnames
     */
    public int getSurnamesLength() {
        return surnames.length;
    }

    public int getColumsFromScores() {
        return scores[5].length;
    }

    public String getSurname(int index) {
        return surnames[index];
    }

    /**
     * Metoda setSurnames obiektu typu AssessmentListModified przyjmuje jako argument indeks tablicy i nazwisko studenta
     * i wprowadza te dane w tablicę pola surnames
     * @param num     indeks tablicy surnames
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
     * Metoda setGrades obiektu typu AssessmentListModified przyjmuje jako argument nazwisko studenta. Jeśli nazwisko
     * jest w tablicy surnames na podstawie tablicy scores wpisywane są w tablice oceny z testów
     * @param surname nazwisko studenta z pola surnames
     */
    public void setGrades(String surname) {
        int index = getIndexFromSurnames(surname);
        if (index == -1) {
            System.out.println("Nie ma studenta o takim nazwisku");
        } else {
            for (int i = 0; i < scores[index].length; i++) {
                if (scores[index][i] >= 90) {
                    grades[index][i] = 5;
                } else if (scores[index][i] >= 80) {
                    grades[index][i] = 4;
                } else if (scores[index][i] >= 70) {
                    grades[index][i] = 3;
                } else if (scores[index][i] >= 60) {
                    grades[index][i] = 2;
                } else {
                    grades[index][i] = 1;
                }
            }
        }
    }

    /**
     * Metoda setScores przyjmuje jako argument nazwisko studenta, a następnie uzupełnia tablicę o właściwym indeksie
     * liczbą punktów zdobytych w testach
     * @param surname nazwisko studenta
     */
    public void setScores(String surname) {
        Scanner scanner = new Scanner(System.in);
        int index = getIndexFromSurnames(surname);
        double score = 0.0;
        double table [] [] = new double[5][4];
        if (index == -1) {
            System.out.println("Nie ma studenta o takim nazwisku!");
        } else {
            for (int i = 0; i < table[index].length; i++) {
                do {
                    System.out.print("Wprowadź liczbę punktów z testu numer " + (i + 1) + ": ");
                    score = scanner.nextDouble();
                    table[index][i] = score;
                } while (score < 0.0 || score > 100.00);
            }
        }
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length - 1; j++) {
                double first = table[i][j];
                double second = table[i][(j + 1)];
                if (second < first) {
                    table[i][j] = second;
                    table[i][(j + 1)] = first;
                }
            }
        }
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[index].length; j++) {
                scores[index][j] = table[index][(j + 1)];
            }
        }
    }

    public void displayScores() {
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(scores[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Metoda getAverage obiektu typu AssessmentListModified zwraca średnią liczbę punktów uzyskaną przez studenta z
     * czterech testów
     * @param surname nazwisko studenta
     * @return średnia zdobytych punktów
     */
    public double getAverage(String surname) {
        int index = getIndexFromSurnames(surname);
        double average = -1.0;
        if (index == -1) {
            return average;
        } else {
            for (int i = 0; i < scores[index].length; i++) {
                average += scores[index][i];
            }
        }
        return average / 3.0;
    }

    /**
     * Metoda displayAverage wyświetla średnią ilość punktów z testów studenta
     * @param surname nazwisko studenta
     */
    public void displayAverage(String surname) {
        if (getAverage(surname) == -1.0) {
            System.out.println("Nie ma studenta o takim nazwisku");
        } else {
            System.out.println("Student " + surname + " uzyskał średnio: " + getAverage(surname) + " punktów.");
        }
    }
}
