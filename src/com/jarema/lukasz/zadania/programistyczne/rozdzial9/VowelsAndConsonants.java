package com.jarema.lukasz.zadania.programistyczne.rozdzial9;

/**
 * Samog?oski i spó?g?oski.
 * Napisz klas? obejmuj?c? konstruktor, który przyjmuje argument w postaci obiektu typu String. Ta klasa powinna
 * udost?pnia? metod?, która zwraca liczb? samog?osek w ?a?cuchu znaków, a tak?e metod? zwracaj?c? liczb? spó?g?osek.
 * Zademonstruj dzia?anie tej klasy w programie, który wykonuje nast?puj?ce kroki:
 * 1. Wy?wietla pro?b? o wpisanie ?a?cucha znaków.
 * 2. Wy?wietla nast?puj?ce menu:
 *  a. zliczanie samog?osek w ?a?cuchu znaków,
 *  b. zliczanie spó?g?osek w ?a?cuchu znaków,
 *  c. zliczanie sumy samog?osek i spó?g?osek,
 *  d. wprowadzenie nast?pnego ?a?cucha znaków,
 *  e. zako?czenie pracy programu.
 * 3. Wykonuje operacj? wybran? przez u?ytkownika i rozpoczyna operacj? od pocz?tku do czasu wybrania przez u?ytkownika
 * opcji e.
 */

public class VowelsAndConsonants {
    private int vowels;
    private int consonants;
    private String string = "";

    /**
     * Konstruktor obiektu typu VowelsAndConsonants przyjmuj?cy jako argument ?a?uch znaków zapisany w polu string
     * @param string ?a?cuch znaków zapisany w polu string
     */
    public VowelsAndConsonants(String string) {
        this.string = string;
    }

    /**
     * Metoda getVolves zwraca liczb? spó?g?osek w ?a?cuchu znaków z pola string
     * @return ilo?? spó?g?osek w ?a?cuchu pola string
     */
    public int getVowels() {
        vowels = 0;
        char [] charTable = string.toLowerCase().toCharArray();
        for (int i = 0; i < charTable.length; i++) {
            if (charTable[i] == 'a' || charTable[i] == 'e' || charTable[i] == 'i' || charTable[i] == 'o' ||
            charTable[i] == 'u' || charTable[i] == 'ó' || charTable[i] == 'y' || charTable[i] == '?' ||
            charTable[i] == '?')
                vowels++;
        }
        return vowels;
    }

    /**
     * Metoda checkVowels zwraca warto?? true je?li litera przekazana jako argument jest samog?osk?, w przeciwnym razie
     * zwraca false
     * @param ch litera
     * @return true je?li litera jest samog?osk?, w przeciwnym razie false
     */
    private boolean checkVowels(char ch) {
        boolean status;
        ch = Character.toLowerCase(ch);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'ó' || ch == 'y' || ch == '?' ||
        ch == '?')
            status = true;
        else
            status = false;
        return status;
    }

    /**
     * Metoda getConsonants zwraca ilo?? spó?g?osek w ?a?cuchu znaków zapisanym w polu string
     * @return ilo?? spó?g?osek w ?a?cuchu znaków z pola string
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
