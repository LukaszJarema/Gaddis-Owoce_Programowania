package com.jarema.lukasz.rozdzial3;

import java.util.Scanner;

/**
 * Księgarnia Czytadło prowadzi klub ksiązki przyznający klientom punkty w zależności od liczby pozycji zakupionych w
 * danym miesiącu. Punkty są przyznawane w następujący sposób:
 * - Jeśli klient zakupił 0 książek, otrzymuje 0 punktów.
 * - Jeśli klient zakupił 1 książkę, otrzymuje 5 punktów.
 * - Jeśli klient zakupił 2 książkę, otrzymuje 15 punktów.
 * - Jeśli klient zakupił 3 książkę, otrzymuje 30 punktów.
 * - Jeśli klient zakupił 4 książki lub więcej, otrzymuje 60 punktów.
 * Napisz program, który wyświetla klientom pytanie o liczbę książek zakupionych w danym miesiącu, a następnie podaje
 * liczbę przyznanych punktów.
 */

public class Zad16 {
    public static void main(String[] args) {
        System.out.print("Ile książek kupiłeś w tym miesiącu: ");
        Scanner scanner = new Scanner(System.in);
        int howMany = scanner.nextInt();

        if (howMany < 1) {
            System.out.println("Zdobyłeś 0 punktów");
        } else if (howMany < 2) {
            System.out.println("Zdobyłeś 5 punktów");
        } else if (howMany < 3) {
            System.out.println("Zdobyłeś 15 punktów");
        } else if (howMany < 4) {
            System.out.println("Zdobyłeś 30 punktów");
        } else {
            System.out.println("Zdobyłeś 60 punktów");
        }
    }
}
