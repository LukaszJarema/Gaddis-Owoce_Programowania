package com.jarema.lukasz.warsztat.projektanta.algorytmow7;

/**
 * a. Napisz instrukcję, która deklaruje tablicę typu String zainicjowaną następującymi łańcuchami znaków: "Einstein",
 * "Newton", "Kopernik" i "Kepler".
 * b. Napisz pętlę, która wyświetla zawartość każdego elementu tablicy.
 * c. Napisz kod, który wyświetla łączną długość wszystkich łańcuchów znaków z tablicy.
 */

public class Zad3 {
    public static void main(String[] args) {
        //a.
        String [] surnames = {"Einstein", "Newton", "Kopernik", "Kepler"};
        //b.
        for (String names : surnames)
            System.out.println(names);
        //c.
        int totalChars = 0;
        for (int i = 0; i < surnames.length; i++) {
            totalChars += surnames[i].length();
        }
        System.out.println("Łączna ilość znaków w tablicy: " + totalChars);
    }
}
