package com.jarema.lukasz.zadania.programistyczne.rozdzial9;

/**
 * Tłumacz tekstu na kod Morse'a.
 * W kodzie Morse'a każda litera alfabetu, każda cyfra i różne znaki przestankowe są reprezentowane w postaci serii
 * kropek i kresek. Napisz program, który wyświetla prośbę o podanie łańcucha znaków, a następnie przekształca ten
 * łańcuch na kod Morse'a (użyj myśliników i kropek).
 */

public class MorseCode {
    private final char[] ALPHABET = {' ', ',', '.', '?', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C',
    'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    private final String [] MORSE_ALPHABET = {" ", "--..--", ".-.-.-", "..--..", "-----", ".----", "..---", "...--",
    "....-", ".....", "-....", "--...", "---..", "----.", ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",
    "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
    "-.--", "--.."};

    /**
     * Konstruktor bezargumentowy obiektu typu MorseCode
     */
    public MorseCode() {

    }

    /**
     * Metoda translateToMorseCode zamienia podany w argumencie ciąg znaków na kod Morse'a
     * @param string ciąg znaków
     * @return ciąg znaków przekształcony na kod Morse'a
     */
    public String translateToMorseCode(String string) {
        StringBuilder sb = new StringBuilder();
        char [] array = string.toUpperCase().toCharArray();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < ALPHABET.length; j++) {
                if (array[i] == ALPHABET[j])
                    sb.append(MORSE_ALPHABET[j]);
            }
        }
        return sb.toString();
    }

}
