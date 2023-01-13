package com.jarema.lukasz.zadania.programistyczne.rozdzial9;

/**
 * Różne operacje na łańcuchach znaków.
 * Napisz klasę zawierającą następujące metody statyczne:
 * - WordCount. Powinna przyjmować jako argument referencję do obiektu typu String i zwracać liczbę słów znajdujących
 * się w tym obiekcie.
 * - arrayToString. Powinna przyjmować jako argument tablicę typu char i przekształcać ją na obiekt typu String.
 * Metoda powinna zwracać referencję do tego obiektu typu String.
 * - mostFrequent. Powinna przyjmować jako argument referencję do obiektu typu String i zwracać znak, który najczęściej
 * występuje w tym obiekcie.
 * - replaceSubstring. Powinna przyjmować jako argumenty trzy referencje do obiektów typu String. Nazwijmy je string1,
 * string2 oraz string3. Metoda ma wyszukiwać w obiekcie string1 wszystkich wystąpień obiektu typu string2. Po
 * znalezieniu obiektu string2 ma go zastępować obiektem typu string3. Załóżmy, że trzy argumenty mają następujące
 * wartości:
 * string1: "dwa psy i dwa koty"
 * string2: "dwa"
 * string3: "cztery"
 * Dla tych argumentów metoda powinna zwrócić referencję do obiektu typu String o wartości: "cztery psy i cztery koty".
 * Zademonstruj działanie tych metod w kompletnym programie.
 */

public class DiferentOpeationsOnStrings {

    /**
     * Metoda wordCount zwraca wartość liczbową słów podanych w argumencie string
     * @param string ciąg znaków
     * @return ilość słów w ciągu znaków
     */
    public static int wordCount(String string) {
        String [] words = string.split(" ");
        return words.length;
    }

    /**
     * Metoda arrayToString zwraca wartość tablicy typu char w postaci typu String
     * @param array tablica znaków char
     * @return pole String z zapisanymi znakami z tablicy array
     */
    public static String arrayToString(char [] array) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            stringBuilder.append(array[i]);
        }
        return stringBuilder.toString();
    }

    /**
     * Metoda mostFrequent zwraca znak, który najczęściej występuje w łańcuchu znaków string przekazanym do argumentu
     * metody. Metoda zwraca tylko jeden znak więc jeśli jest kilka znaków o tej samej ilości wystąpień metoda zwróci
     * informację o pierwszym, który uzyskał tę ilość wystąpień
     * @param string ciąg znaków
     * @return znak o największej ilości wystąpień w ciągu znaków string
     */
    public static char mostFrequent(String string) {
        char [] array = string.toCharArray();
        char mostFrequent = ' ';
        int howMany = 0;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array [j])
                    count++;
            }
            if (count > howMany) {
                howMany = count;
                mostFrequent = array[i];
            }
        }
        return mostFrequent;
    }

    /**
     * Metoda replaceSubstring przyjmuje jako argumenty trzy łańuchy znaków i w pierwszym z nich zamienia słowo zapisane
     * w drugim na słowo zapisane w trzecim
     * @param string1 ciąg znaków
     * @param string2 ciąg znaków do zmiany w string1
     * @param string3 ciąg znaków zastępujący występujące w string1 łańcuch znaków ze string2
     * @return ciąg znaków po zmianach
     */
    public static String replaceSubstring(String string1, String string2, String string3) {
        string1 = string1.replace(string2, string3);
        return string1;
    }
}
