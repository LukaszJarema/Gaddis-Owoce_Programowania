package com.jarema.lukasz.zadania.programistyczne.rozdzial4;

import java.util.Random;

/**
 * Gra w kości.
 * Napisz program do prostej gry w kości między komputerem, a użytkownikiem. Po uruchomieniu program powinien wykonywać
 * pętlę 10 razy. W każdej iteracji pętli należy wykonać następujące operacje:
 * - Wygenerować liczbę losową z przedziału od 1 do 6. Jest to wartość rzutu komputera.
 * - Wygenerować inną liczbę losową z przedziału od 1 do 6. Jest to wartość rzutu użytkownika.
 * - Wyższa liczba oczek daje wygraną. W przypadku równej liczby oczek dla danego rzutu nie ma zwycięzcy.
 * W kolejnych iteracjach program powinien zachowywać liczbę wygranych komputera i użytkownika. Po wykonaniu wszystkich
 * iteracji program ma wyświetlać, kto wygrał całą grę: komputer czy użytkownik.
 */

public class Zad21 {
    public static void main(String[] args) {
        Random random = new Random();
        int computer = 0, user = 0;

        for (int i = 0; i < 10; i++) {
            int diceComputer = random.nextInt(6) + 1;
            int diceUser = random.nextInt(6) + 1;
            if (diceComputer > diceUser) {
                computer++;
            } else if (diceUser > diceComputer) {
                user++;
            }
        }

        if (user > computer) {
            System.out.println("Całą grę wygrał użytkownik.");
        } else if (computer > user) {
            System.out.println("Całą grę wygrał komputer");
        } else {
            System.out.println("Remis.");
        }
    }
}
