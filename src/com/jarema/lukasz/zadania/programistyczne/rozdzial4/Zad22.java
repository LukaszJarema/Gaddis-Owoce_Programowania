package com.jarema.lukasz.zadania.programistyczne.rozdzial4;

import java.util.Random;
import java.util.Scanner;

/**
 * Symulacja automatu do gier.
 * Automat do gier to maszyna do gier hazardowych, do której użytkownik wrzuca pieniądze, po czym pociąga za wajchę
 * (lub wciska przycisk). Automat do gier wyświetla następnie losowy zbiór obrazków. Jeśli przynajmniej dwa obrazki są
 * takie same, użytkownik wygrywa określoną kwotę pieniędzy wypłacanych przez maszynę.
 * Utwórz program, który symuluje działanie automatu do gier. Program w trakcie działania powinien wykonywać następujące
 * operacje:
 * - Wyświetlać prośbę o podanie kwoty pieniędzy, jaką użytkownik chce wrzucić do maszyny.
 * - Zamiast wyświetlać obrazki, losowo wybierać słowa z następującej listy: Wiśnie, Pomrańcze, Śliwki, Dzwonki, Melony,
 * Bary.
 * - Aby wybrać słowo, program może generować liczbę losową z przedziału od 0 do 5. Po wylosowaniu liczby 0 program
 * wybierze słowo Wiśnie, liczba 1 to Pomarańcze itd. Program powinien trzy razy losowo wybierać słowo z tej listy i
 * wyświetlać każde z trzech słów.
 * - Jeśli losowo wybrane słowa nie pasują do siebie, program informuje użytkownika, że wygrał 0 zł. Jeżeli pasują do
 * siebie dwa słowa, program komunikuje, że użytkownik wygrał dwukrotność postawionej kwoty. Jeśli trzy słowa są
 * identyczne, program wyświetla informację o wygraniu trzykrotności stawki.
 * - Program wyświetla pytanie, czy użytkownik chce zagrać ponownie. Jeśli tak, opisane wcześniej kroki są powtarzane.
 * W przeciwnym razie program wyświetla łączną kwotę wrzuconą do automatu i łączną wartość wygranych.
 */

public class Zad22 {
    public static void main(String[] args) {
        int amountOfPayments = 0;
        int amountOfWinnings = 0;
        int amount;

        String answer = "tak";
        String [] images = new String [3];
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (answer.equals("tak")) {
            do {
                System.out.println("Za jaką kwotę chcesz zarać?");
                amount = scanner.nextInt();
                amountOfPayments += amount;
            } while (amount <= 0);

            for (int i = 0; i < 3; i++) {
                String image = null;
                int n = random.nextInt(6);
                

                switch (n) {
                    case '0' -> image = "Wiśnie";
                    case '1' -> image = "Pomarańcze";
                    case '2' -> image = "Śliwki";
                    case '3' -> image = "Dzwonki";
                    case '4' -> image = "Melony";
                    case '5' -> image = "Bary";
                }
                images [i] = String.valueOf(image.equals(image));
            }

            //System.out.println(images[0].equals(images[1]));

            System.out.println("Czy chcesz zagrać ponownie?");
            answer = scanner.next();
        }
        System.out.println(amountOfPayments);
    }
}
