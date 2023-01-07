package com.jarema.lukasz.zadania.programistyczne.rozdzial9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Łańcuch znaków czytany wspak.
 * Napisz metodę, która przyjmuje argument w postaci obiektu typu String i wyświetla jego zawartość czytaną wspak. Na
 * przykład jeśli argumentem jest słowo "grawitacja", metoda powinna wyświetlać tekst "ajcatiwarg". Zademonstruj
 * działanie tej metody w programie, który wyświetla prośbę o wpisanie łańcucha znaków, a następnie przekazuje ten
 * łańcuch do tej metody.
 */

public class StringReadBackwards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj łańcuch znaków: ");
        String str = scanner.nextLine();
        stringReadBackwards(str);
    }

    /**
     * Metoda stringReadBackwards przyjmuje jako argument łańcuch znaków i wypisuje go wspak na konsoli
     * @param str łańcuch znaków
     */
    public static void stringReadBackwards(String str) {
        int length = str.length();
        ArrayList<Character> charArray = new ArrayList<>();
        for (int i = length - 1; i >= 0; i--) {
            charArray.add(str.charAt(i));
        }
        for (int i = 0; i < charArray.size(); i++) {
            System.out.print(charArray.get(i));
        }
    }
}
