package com.jarema.lukasz.zadania.programistyczne.rozdzial6;

import java.util.Scanner;

public class TestRoulettePocket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RoulettePocket roulettePocket = new RoulettePocket();
        int rouletteField = 0;

        do {
            System.out.print("Podaj numer pola z ruletki: ");
            rouletteField = scanner.nextInt();
            System.out.print("Pole numer: " + rouletteField + " ma kolor " + roulettePocket.getPocketColor(rouletteField));
        } while (rouletteField < 0 || rouletteField > 36);
    }
}
