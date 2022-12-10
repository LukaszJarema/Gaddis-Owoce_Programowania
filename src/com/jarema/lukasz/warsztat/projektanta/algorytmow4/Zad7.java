package com.jarema.lukasz.warsztat.projektanta.algorytmow4;

import java.util.Scanner;

/**
 * Przekształć pętlę while z poniższego kodu do pętli do-while:
 *         Scanner keyboard = new Scanner(System.in);
 *         int x = 1;
 *         while (x > 0) {
 *             System.out.print("Podaj liczbę: ");
 *             x = keyboard.nextInt();
 *         }
 */

public class Zad7 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int x;
        do{
            System.out.print("Podaj liczbę: ");
            x = keyboard.nextInt();
        } while (x > 0);
    }
}
