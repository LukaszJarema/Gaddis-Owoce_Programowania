package com.jarema.lukasz.zadania.programistyczne.rozdzial5;

/**
 * Tabela z temperaturami w stopniach Celsjusza.
 * Oto wzór na na przeliczanie temperatur ze stopni Fahrenheita na stopnie Celsjusza:
 * C = 5 / 9 * (F - 32)
 * W tym wzorze F oznacza temperaturę w stopniach Fahrenheita, a C to temperatura w stopniach Celsjusza. Napisz metodę
 * celsius, która jako argument przyjmuje temperaturę w stopniach Fahrenheita. Ta metoda powinna zwracać temperaturę
 * przeliczoną na stopnie Celsjusza. Zademonstruj działanie tej metody, wywołując ją w pętli, która wyświetla tabelę
 * z temperaturami od 0 do 20 w stopniach Fahrenheita i ich odpowiednikami w stopniach Celsjusza.
 */

public class Zad6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            System.out.println(i + " stopnia Fahrenheita wynosi: " + celsius(i) + " stopni Celsjusza");
        }
    }

    public static double celsius(int fahrenheit) {
        double celsius = 5.0 / 9.0 * (fahrenheit - 32.0);
        return celsius;
    }
}
