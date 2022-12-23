package com.jarema.lukasz.zadania.programistyczne.rozdzial6;

/**
 * Rzucanie monetami o złotówkę.
 * W tym zadaniu utworzysz program z grą wykorzystujący klasę Coin. W tym programie należy utworzyć trzy instancje klasy
 * Coin reprezentujące 5, 10 i 20 groszy.
 * W momencie rozpoczęcia gry masz 0 złotych. W każdej rundzie program rzuca symulowanymi monetami. Jeśli wypadnie
 * orzeł, wartość monety jest dodawana do Twoich środków. Na przykład jeśli 20-groszówką wyrzucony zostanie orzeł, do
 * Twoich środków zostanie dodane 20 groszy. Wyrzucenie reszki nie spowoduje dodania żadnych pieniędzy. Gra kończy się,
 * gdy Twoje wygrane wyniosą w sumie złotówkę lub więcej. Jeśli uzyskałeś dokładnie złotówkę, wygrywasz. Jeśli suma jest
 * wyższa, przegrywasz.
 */

public class TossingCoinsForADollar {
    public static void main(String[] args) {
        double ammountWon = 0.0;
        Coin coinFive = new Coin();
        Coin coinTen = new Coin();
        Coin coinTwenty = new Coin();

        do {
            coinFive.toss();
            coinTen.toss();
            coinTwenty.toss();
            if (coinFive.getSideUp().equals("orzeł")) {
                ammountWon += 0.05;
            }
            if (coinTen.getSideUp().equals("orzeł")) {
                ammountWon += 0.10;
            }
            if (coinTwenty.getSideUp().equals("orzeł")) {
                ammountWon += 0.20;
            }
        } while (ammountWon <= 1.0);

        if (ammountWon == 1.0) {
            System.out.println("Wygrałeś");
        } else {
            System.out.println("Przegrałeś");
        }
    }
}
