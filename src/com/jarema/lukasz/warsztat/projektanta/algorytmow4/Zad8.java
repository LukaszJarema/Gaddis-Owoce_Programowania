package com.jarema.lukasz.warsztat.projektanta.algorytmow4;

import java.util.Scanner;

/**
 * Przekształć pętlę do-while z poniższego kodu w pętlę while:
 *         Scanner keyboard = new Scanner(System.in);
 *         String input;
 *         char sure;
 *         do {
 *             System.out.print("Na pewno chcesz zakończyć pracę? ");
 *             input = keyboard.next();
 *             sure = input.charAt(0);
 *         } while (sure != 'T' && sure != 'N');
 */

public class Zad8 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String input;
        char sure = 't';

        while (sure != 'T' && sure != 'N') {
            System.out.print("Na pewno chcesz zakończyć pracę? ");
            input = keyboard.next();
            sure = input.charAt(0);
        }
    }
}
