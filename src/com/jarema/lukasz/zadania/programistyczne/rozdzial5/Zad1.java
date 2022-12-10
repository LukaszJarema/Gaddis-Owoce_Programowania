package com.jarema.lukasz.zadania.programistyczne.rozdzial5;

import java.util.Scanner;

/**
 * Metoda showChar.
 * Napisz metodę showChar. Powinna ona przyjmować dwa argumenty: referencję do obiektu typu String i liczbę całkowitą.
 * Argument w postaci liczby całkowitej określa pozycję znaku w obiekcie typu String (pierwszy znak znajduje się na
 * pozycji zerowej). Metoda ma wyświetlać znak z podanej pozycji, Oto przykładowe wywołanie tej metody:
 * showChar("Nowy Jork" , 2);
 * W tym wywołaniu metoda wyświetli znak w, ponieważ to on znajduje się na drugiej pozycji. Zademonstruj tę metodę w
 * kompletnym programie.
 */

public class Zad1 {
    public static void main(String[] args) {
        System.out.print("Wpisz zdanie: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.print("Który znak ze zdania chcesz wyświetlić: ");
        int charPosition = scanner.nextInt();

        System.out.println(shwoChar(input, charPosition));
    }

    public static char shwoChar(String input, int charPosition) {
        int length = input.toCharArray().length;
        char ch = 0;
        if (length < charPosition) {
            System.out.println("Podana pozycja przekracza wartość ilości znaków w podanym zdaniu.");
        } else {
            ch = input.charAt(charPosition);
        }
        return ch;
    }
}
