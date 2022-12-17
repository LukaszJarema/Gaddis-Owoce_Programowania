package com.jarema.lukasz.zadania.programistyczne.rozdzial6;

import java.util.Scanner;

public class TestBlackjack {
    public static void main(String[] args) {
        Blackjack blackjack = new Blackjack();
        Die die = new Die();
        char answer = 'T';
        final int BLACKJACK = 21;

        do {
            Scanner scanner = new Scanner(System.in);
            blackjack.addComputerPoints(die.roll(), die.roll());
            blackjack.addUserPoints(die.roll(), die.roll());
            blackjack.displayUserPoints();
            if (blackjack.getComputerPoints() < BLACKJACK && blackjack.getUserPoints() < BLACKJACK) {
                System.out.print("Czy chcesz zagrać dalej? : ");
                answer = scanner.next().charAt(0);
            } else {
                answer = 'n';
                System.out.println("Koniec gry");
            }

            System.out.println(blackjack.getUserPoints());
        } while ((answer == 't' || answer == 'T'));

        blackjack.displayUserPoints();
        blackjack.displayComputerPoints();
        blackjack.whoWin(blackjack.getUserPoints(), blackjack.getComputerPoints());
    }
}
