package com.jarema.lukasz.zadania.programistyczne.rozdzial9;

/**
 * Suma cyfr w łańcuchu znaków.
 * Napisz program, który wyświetla prośbę o wpisanie serii jednocyfrowych liczb bez żadnego separatora. Program powinien
 * wyświetlać sumę wszystkich tych jednocyfrowych liczb z łańcucha znaków. Na przykład jeśli użytkownik wpisał 2514,
 * program powinien zwrócić 12, czyli sumę 2, 5, 1, 4. Program powinien wyświetlać także największą i najmniejszą cyfrę
 * w łańcuchu znaków. Wskazówka, przekształć łańcuch znaków na tablicę.
 */

public class SumOfDigitsFromString {
    private String string;

    /**
     * Konstruktor bezargumentowy obiektu typu SumOfDigitsFromString
     */
    public SumOfDigitsFromString() {

    }

    /**
     * Konstruktor obiektu typu SumOfDigitsFromString przyjmujący w argumencie wartość pola string
     * @param string wartość pola string
     */
    public SumOfDigitsFromString(String string) {
        this.string = string;
    }

    /**
     * Metoda getSumOfDigits zwraca sumę liczb z ciągu znaków z pola string
     * @return suma cyfr z ciągu znaków z pola string
     */
    public int getSumOfDigits() {
        int sum = 0;
        char [] array = string.toCharArray();
        for (char ch : array) {
            if (Character.isDigit(ch))
                sum += Integer.parseInt(String.valueOf(ch));
        }
        return sum;
    }

    /**
     * Metoda getHighestOfDigits zwraca największą wartość liczbową z ciągu znaków z pola string
     * @return największą cyfrę z ciągu znaków pola string
     */
    public int getHighestOfDigits() {
        int highest = Integer.MIN_VALUE;
        char [] array = string.toCharArray();
        for (char ch : array) {
            if (Character.isDigit(ch) && Integer.parseInt(String.valueOf(ch)) > highest)
                highest = Integer.parseInt(String.valueOf(ch));
        }
        return highest;
    }

    /**
     * Metoda getLowestOfDigits zwraca najmniejszą wartość liczbową z ciągu znaków z pola string
     * @return najmniejsza cyfra z ciągu znaków z pola string
     */
    public int getLowestOfDigits() {
        int lowest = Integer.MAX_VALUE;
        char [] array = string.toCharArray();
        for (char ch : array) {
            if (Character.isDigit(ch) && Integer.parseInt(String.valueOf(ch)) < lowest)
                lowest = Integer.parseInt(String.valueOf(ch));
        }
        return lowest;
    }
}
