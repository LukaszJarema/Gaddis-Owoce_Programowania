package com.jarema.lukasz.zadania.programistyczne.rozdzial9;

import java.util.Scanner;

/**
 * Licznik słów.
 * Napisz metodę, która przyjmuje argument w postaci obiektu typu String i zwraca liczbę słów w tym obiekcie. Na
 * przykład jeśli argument to "Cztery wieki i siedem lat temu", metoda powinna zwrócić wartość 6. Zademonstruj działanie
 * tej metody w programie, który wyświetla prośbę o wpisanie łańcucha znaków, a następnie przekazuje wprowadzony łańcuch
 * do tej metody. Liczbę słów w łańcuchu znaków należy wyświetlić na ekranie.
 */

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj łańcuch znaków: ");
        String str = scanner.nextLine();
        System.out.println("Łańcuch: " + str + "\nposiada " + wordCount(str) + " słów.");
    }

    /**
     * Metoda wordCount zwraca ilość słów w łańcuchu znaków podanym jako argument metody
     * @param str łańcuch znaków
     * @return ilość słów
     */
    public static int wordCount(String str) {
        String [] array = str.split(" ");
        return array.length;
    }
}
