package com.jarema.lukasz.zadania.programistyczne.rozdzial9;

import java.util.Scanner;

/**
 * Metoda zmieniająca pierwsze litery zdań na wielkie.
 * Napisz metodę, która przyjmuje argument w postaci obiektu typu String i zwraca kopię łańcucha znaków, w której
 * pierwszy znak każdego zdania jest wielką literą. Na przykład jeśli argumentem jest "witaj. nazywam się Janusz. jak
 * masz na imię?", metoda powinna zwracać łańcuch znaków "Witaj. Nazywam się Janusz. Jak masz na imię?". Zademonstruj
 * działanie tej metody w programie, który wyświetla prośbę o wprowadzenie łańcucha znaków, a następnie przekazuje
 * podany łańcuch do tej metody. Zmodyfikowany łańcuch należy wyświetlić na ekranie.
 */

public class StartSentenceFromUpperCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj łańcuch znaków: ");
        String str = scanner.nextLine();
        System.out.println(startSentenceFromUpperCase(str));
    }

    /**
     * Metoda start SentenceFromUpperCase zwraca przyjęty jako argument ciąg znaków z dużymi literami jeśli na dwa
     * miejsca przed znakiem wystąpiły znaki .?!
     * @param str ciąg znaków
     * @return ciąg znaków z dużymi literami po wystąpieniu znaku .?!
     */
    public static String startSentenceFromUpperCase(String str) {
        StringBuilder stringBuilder = new StringBuilder("");
        char [] charArray = str.toCharArray();
        if (Character.isLetter(charArray[0]))
            stringBuilder.append(Character.toUpperCase(charArray[0]));
        else
            stringBuilder.append(charArray[0]);
        stringBuilder.append(charArray[1]);
        for (int i = 2; i < charArray.length; i++) {
            if (charArray[i - 2] == '.' || charArray [i - 2] == '?' || charArray[i - 2] == '!')
                stringBuilder.append(Character.toUpperCase(charArray[i]));
            else
                stringBuilder.append(charArray[i]);
        }
        return stringBuilder.toString();
    }
}
