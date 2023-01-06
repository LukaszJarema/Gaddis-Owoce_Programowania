package com.jarema.lukasz.zadania.programistyczne.rozdzial8;

import com.jarema.lukasz.zadania.programistyczne.rozdzial6.Die;

import java.util.Scanner;

public class TestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj imię pierwszego gracza: ");
        Player player1 = new Player(scanner.nextLine());
        System.out.print("Podaj imię drugiego gracza: ");
        Player player2 = new Player(scanner.nextLine());
        Die die = new Die();

        do {
            int player1Score = die.roll();
            int player2Score = die.roll();

            if (player1.getScore() - player1Score < 1) {
                player1.add(player1Score);
            } else {
                player1.subtract(player1Score);
            }
            System.out.println(player1);

            if (player2.getScore() - player2Score < 1) {
                player2.add(player2Score);
            } else {
                player2.subtract(player2Score);
            }
            System.out.println(player2);
        } while (!(player1.getScore() == 1 || player2.getScore() == 1));

        if (player1.getScore() == 1) {
            System.out.println("Gracz: " + player1.getName() + " wygrał");
        } else {
            System.out.println("Gracz: " + player2.getName() + " wygrał");
        }
    }
}
