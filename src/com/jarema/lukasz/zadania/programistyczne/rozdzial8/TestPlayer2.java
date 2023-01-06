package com.jarema.lukasz.zadania.programistyczne.rozdzial8;

import com.jarema.lukasz.zadania.programistyczne.rozdzial6.Coin;

import java.util.Scanner;

/**
 * Orzeł czy reszka?
 * Ta gra przeznaczona jest dla dwóch lub więcej graczy. Uczestnicy na zmianę rzucają monetą. Przed rzutem gracze
 * obstawiają, czy wypadnie orzeł czy reszka. Jeśli gracz odgadnie wynik rzutu, otrzymuje punkt. Jeśli obstawienie jest
 * nieudane, odejmowany jest punkt. Pierwszy gracz, który uzyska pięć punktów, wygrywa.
 * Napisz program symulujący rozgrywanie tej gry przez dwie osoby. Do zasymulowania rzutów monetą użyj klasy Coin. Na
 * potrzeby symulowania wyborów graczy napisz klasę Player.
 */

public class TestPlayer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj imię pierwszego gracza: ");
        Player player1 = new Player(scanner.nextLine(), 0);
        System.out.print("Podaj imię drugiego gracza: ");
        Player player2 = new Player(scanner.nextLine(), 0);

        do {
            System.out.print("Gracz: " + player1.getName() + " obstawia (orzeł czy reszka): ");
            String coin1SideUp = scanner.nextLine();
            String coinPlayer1 = new Coin().getSideUp();
            if (coin1SideUp.equals(coinPlayer1))
                player1.add(1);
            else
                player1.subtract(1);

            System.out.print("Gracz: " + player2.getName() + " obstawia (orzeł czy reszka): ");
            String coin2SideUp = scanner.nextLine();
            String coinPlayer2 = new Coin().getSideUp();
            if (coin2SideUp.equals(coinPlayer2))
                player2.add(1);
            else
                player2.subtract(1);
        } while (!(player1.getScore() == 5) || player2.getScore() == 5);

        if (player1.getScore() == 5)
            System.out.println("Gracz " + player1.getName() + " wygrał");
        else
            System.out.println("Gracz " + player2.getName() + " wygrał");
    }
}
