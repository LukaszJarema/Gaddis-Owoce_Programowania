package com.jarema.lukasz.zadania.programistyczne.rozdzial9;

/**
 * Suma liczb z łańcucha znaków.
 * Napisz program, który wyświetla prośbę o wpisanie serii liczb rozdzielonych przecinkami. Oto przykładowe poprawne
 * dane wejściowe:
 * 7,9,10,2,18,6
 * Program powinien obliczać i wyświetlać sumę wszystkich tych liczb.
 */

public class SumOfNumbersFromString {
    private String string;

    /**
     * Konstruktor bezargumentowy obiektu typu SumOfNumbersFromString
     */
    public SumOfNumbersFromString() {

    }

    /**
     * Konstruktor obiektu typu SumOfNumbersFromString przyjmujący jako argument wartość pola string
     * @param string wartość pola string
     */
    public SumOfNumbersFromString(String string) {
        this.string = string;
    }

    /**
     * Metoda getSumOfNumbers zwraca sumę liczb całkowitych z ciągu znaków z pola string
     * @return suma liczb z pola string
     */
    public int getSumOfNumbers() {
        int sum = 0;
        String [] tokens = string.split(",");
        for (String s : tokens) {
            try {
                sum += Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println(s + " nie jest liczbą całkowitą");
            }
        }
        return sum;
    }
}
