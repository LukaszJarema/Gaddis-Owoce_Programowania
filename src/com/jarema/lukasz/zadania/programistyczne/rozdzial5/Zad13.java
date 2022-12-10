package com.jarema.lukasz.zadania.programistyczne.rozdzial5;

import java.util.Scanner;

/**
 * Metoda isPrime.
 * Liczba pierwsza cechuje się tym, że jest podzielna bez reszty tylko przez siebie samą i liczbę 1. Na przykład liczba
 * 5 jest pierwsza, ponieważ dzieli się bez reszty tylko przez 1 i 5. Z kolei liczba 6 nie jest liczbą pierwszą, ponieważ
 * jest podzielna bez reszty przez 1, 2, 3 i 6.
 * Napisz metodę isPrime, która przyjmuje argument w postaci liczby całkowitej i zwraca wartość true, jeśli argument
 * jest liczbą pierwszą, lub false w przeciwnym razie. Zademonstruj działanie tej metody w kompletnym programie.
 */

public class Zad13 {
    public static void main(String[] args) {
        int num;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Wprowadź liczbę: ");
            num = scanner.nextInt();
        } while (num < 2);

        System.out.println("Czy liczba: " + num + " jest liczbą pierwszą?");
        System.out.println(isPrime(num));
    }

    public static boolean isPrime(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                sum++;
            }
        }
        if (sum == 2) {
            return true;
        } else {
            return false;
        }
    }
}
