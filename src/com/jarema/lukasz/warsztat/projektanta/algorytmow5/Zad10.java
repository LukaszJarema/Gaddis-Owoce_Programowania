package com.jarema.lukasz.warsztat.projektanta.algorytmow5;

import java.util.Scanner;

/**
 * Napisz metodę quartersToDollars. Powinna ona przyjmmować argument typu int reprezentujący liczbę 25-centówej i zwracać
 * odpowiadającą jej liczbę typu double. Na przykład po przekazaniu liczby 4 metoda powinna zwrócić 1.0, a po przekazaniu
 * liczby 7 - wartość 1.75.
 */

public class Zad10 {
    public static void main(String[] args) {
        System.out.print("Ile posiadasz ćwierćdolarówek: ");
        Scanner scanner = new Scanner(System.in);
        int howManyCoins = scanner.nextInt();
        System.out.println("Twoje ćwierćdolarówki są warte: " + quartersToDollars(howManyCoins) + " dolara");
    }

    /**
     * Metoda przeliczająca ilość ćwierćdolarówek na dolary
     * @param coins - ilość ćwierćdolarówel
     * @return zwraca wartość dolarów ćwierćdolarówek
     */
    public static double quartersToDollars(int coins) {
        double dollars = coins * 0.25;
        return dollars;
    }
}
