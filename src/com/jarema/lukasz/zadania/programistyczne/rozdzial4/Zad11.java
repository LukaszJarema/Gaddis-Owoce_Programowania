package com.jarema.lukasz.zadania.programistyczne.rozdzial4;

/**
 * Tabela przeliczająca stopnie Celsjusza na Fahrenheita.
 * Napisz program, któy wyświetla tabelę z temperaturami w stopniach Celsjusza (od 0 do 20) i ich odpowiednikami w
 * stopniach Fahrenheita. Oto wzór na przekształcanie temperatury ze stopni Celsjusza na Fahrenheita:
 * F = 9/5 * C + 32
 * W tym wzorze F to temperatura w stopniach Fahrenheita, a C to temperatura w stopniach Celsjusza. Program ma wyświetlać
 * tabelę z temperaturami za pomocą pętli.
 */

public class Zad11 {
    public static void main(String[] args) {
        System.out.println("Stopni Celsjusza\t\tStopni Fahrenheita");
        System.out.println("------------------------------------------");
        for (int i = 0; i <= 20; i++) {
            double fahrenheit = 9.0 / 5.0 * i + 32;
            System.out.println(i + "\t\t\t\t\t\t" + fahrenheit);
        }
    }
}
