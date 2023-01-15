package com.jarema.lukasz.zadania.programistyczne.rozdzial9;

/**
 * Świńska łacina.
 * Napisz program, który jako dane wejściowe wczytuje zdanie i przekształca każde słowo na świńską łacinę. W jednej z
 * wersji świńskiej łaciny słowa są przekształcane w wyniku przeniesienia pierwszej litery na koniec słowa i dodania
 * członu "ay". Oto przykład:
 * Polski: Dobrze spałem tej nocy.
 * Świńska łacina: Obrzeday pałemsay ejtay ocynay.
 */

public class PigLatin {
    private String string;

    /**
     * Konstruktor bezargumentowy obiektu typu PigLatin
     */
    public PigLatin() {

    }

    /**
     * Konstruktor obiektu typu PigLatin przyjmujący jako argument wartość pola string
     * @param string wartość pola string
     */
    public PigLatin(String string) {
        this.string = string;
    }

    /**
     * Metoda changeStringToPigLatin zamienia ciąg znaków z pola string na świńską łacinę
     * @return ciąg znaków z pola string w świńskiej łacinie
     */
    public String changeStringToPigLatin() {
        StringBuilder sb = new StringBuilder();
        String [] words = string.split(" ");
        for (String str : words) {
            char ch = str.charAt(0);
            for (int i = 1; i < str.length(); i++) {
                sb.append(str.charAt(i));
            }
            sb.append(ch);
            sb.append("ay ");
        }
        String str = sb.toString().toLowerCase();
        return (str.toUpperCase().charAt(0)) + str.substring(1, str.length());
    }
}
