package com.jarema.lukasz.zadania.programistyczne.rozdzial9;

import java.util.ArrayList;

/**
 * Separator słów.
 * Napisz program, który jako dane wejściowe przyjmuje zdanie, w którym wszystkie słowa są połączone ze sobą, ale
 * pierwsza litera każdego z tych słów jest wielka. Przekształć to zdanie na łańcuch znaków, w którym wszystkie słowa
 * są rozdzielone spacjami i tylko pierwsze słowo rozpoczyna się wielką literą. Na przykład zdanie
 * "ZatrzymajSięIPowąchajRóże." należy przekształcić na postać "Zatrzymaj się i powąchaj róże.".
 */

public class WordSeparator {
    private String string;

    /**
     * Konstruktor bezargumentowy obiektu typu WordSeparator
     */
    public WordSeparator() {

    }

    /**
     * Konstruktor obiektu typu WordSeparator przyjmujący jako argument wartość pola string
     * @param string wartość pola string
     */
    public WordSeparator(String string) {
        this.string = string;
    }

    public String separator() {
        StringBuilder sb = new StringBuilder();
        char [] array = string.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (Character.isUpperCase(array[i]) && i != 0) {
                sb.append(" ");
                sb.append(Character.toLowerCase(array[i]));
            } else
                sb.append(Character.toLowerCase(array[i]));
        }
        String str = sb.toString();
        str = (str.toUpperCase().charAt(0)) + str.substring(1, str.length());
        return str;
    }
}
