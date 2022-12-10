package com.jarema.lukasz.warsztat.projektanta.algorytmow4;

import java.util.Scanner;

/**
 * Napisz pętlę do sprawdzania danych wejściowych, wyświetlającą prośbę o podanie słowa "tak" lub "nie".
 */

public class Zad12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word;
        do{
            System.out.print("Podaj słowo tak lub nie: ");
            word = scanner.nextLine();
        } while (!word.equals("tak") && !word.equals("nie"));
    }
}
