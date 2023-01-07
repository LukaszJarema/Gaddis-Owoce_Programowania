package com.jarema.lukasz.zadania.programistyczne.rozdzial9;

/**
 * Samogłoski i spółgłoski.
 * Napisz klasę obejmującą konstruktor, który przyjmuje argument w postaci obiektu typu String. Ta klasa powinna
 * udostępniać metodę, która zwraca liczbę samogłosek w łańcuchu znaków, a także metodę zwracającą liczbę spółgłosek.
 * Zademonstruj działanie tej klasy w programie, który wykonuje następujące kroki:
 * 1. Wyświetla prośbę o wpisanie łańcucha znaków.
 * 2. Wyświetla następujące menu:
 *  a. zliczanie samogłosek w łańcuchu znaków,
 *  b. zliczanie spółgłosek w łańcuchu znaków,
 *  c. zliczanie sumy samogłosek i spółgłosek,
 *  d. wprowadzenie następnego łańcucha znaków,
 *  e. zakończenie pracy programu.
 * 3. Wykonuje operację wybraną przez użytkownika i rozpoczyna operację od początku do czasu wybrania przez użytkownika
 * opcji e.
 */

public class VowelsAndConsonants {
    private int vowels;
    private int consonants;
    private String string = "";

    /**
     * Konstruktor obiektu typu VowelsAndConsonants przyjmujący jako argument łańuch znaków zapisany w polu string
     * @param string łańcuch znaków zapisany w polu string
     */
    public VowelsAndConsonants(String string) {
        this.string = string;
    }

    /**
     * Metoda getVolves zwraca liczbę spółgłosek w łańcuchu znaków z pola string
     * @return ilość spółgłosek w łańcuchu pola string
     */
    public int getVowels() {
        vowels = 0;
        char [] charTable = string.toLowerCase().toCharArray();
        for (int i = 0; i < charTable.length; i++) {
            if (charTable[i] == 'a' || charTable[i] == 'e' || charTable[i] == 'i' || charTable[i] == 'o' ||
            charTable[i] == 'u' || charTable[i] == 'ó' || charTable[i] == 'y' || charTable[i] == 'ą' ||
            charTable[i] == 'ę')
                vowels++;
        }
        return vowels;
    }

    /**
     * Metoda checkVowels zwraca wartość true jeśli litera przekazana jako argument jest samogłoską, w przeciwnym razie
     * zwraca false
     * @param ch litera
     * @return true jeśli litera jest samogłoską, w przeciwnym razie false
     */
    private boolean checkVowels(char ch) {
        boolean status;
        ch = Character.toLowerCase(ch);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'ó' || ch == 'y' || ch == 'ą' ||
        ch == 'ę')
            status = true;
        else
            status = false;
        return status;
    }

    /**
     * Metoda getConsonants zwraca ilość spółgłosek w łańcuchu znaków zapisanym w polu string
     * @return ilość spółgłosek w łańcuchu znaków z pola string
     */
    public int getConsonants() {
        consonants = 0;
        char [] charTable = string.toLowerCase().toCharArray();
        for (int i = 0; i < charTable.length; i++) {
            if (Character.isLetter(charTable[i]) && checkVowels(charTable[i]) == false)
                consonants++;
        }
        return consonants;
    }
}
