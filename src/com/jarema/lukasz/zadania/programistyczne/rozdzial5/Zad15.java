package com.jarema.lukasz.zadania.programistyczne.rozdzial5;

import java.util.Random;

/**
 * Licznik liczb parzystych i nieparzystych.
 * Możesz posłużyć się następującą logiką do określenia, czy liczba jest parzysta, czy nieparzysta:
 *         if ((number % 2) == 0) {
 *             //liczba jest parzysta
 *         } else {
 *             //liczba jest nieparzysta
 *         }
 * Napisz program z metodą isEven, który przyjmuje argument typu int. Ta metoda powinna zwracać wartość true, jeśli
 * argument jest parzysty, lub wartość false, jeśli argument jest nieparzysty. W metodzie main programu należy zastosować
 * pętlę do wygenerowania 100 losowych liczb całkowitych. W pętli tej program powinien używać metody isEven do sprawdzania,
 * czy te liczby losowe są parzyste, czy nieparzyste. Po zakończeniu pracy pętli program powinien wyświetlać, ile
 * wygenerowanych liczb jest parzystych, a ile nieparzystych.
 */

public class Zad15 {
    public static void main(String[] args) {
        Random random = new Random();
        int sum = 0;

        for (int i = 0; i < 100; i++) {
            int num = random.nextInt();
            if (isEven(num) == true) {
                sum++;
                System.out.println("Liczba: " + num + " jest liczbą parzystą.");
            } else {
                System.out.println("Liczba: " + num + " jest liczbą nieparzystą.");
            }
        }
        System.out.println("Liczba wylosowanych liczb parzystych: " + sum);
    }

    public static boolean isEven(int num) {
        if ((num % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
