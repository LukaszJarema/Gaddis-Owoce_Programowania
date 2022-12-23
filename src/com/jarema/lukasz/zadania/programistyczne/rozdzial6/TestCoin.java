package com.jarema.lukasz.zadania.programistyczne.rozdzial6;

public class TestCoin {
    public static void main(String[] args) {
        Coin coin = new Coin();
        int head = 0;
        int tails = 0;

        System.out.println("Początkowa wartość monety: " + coin.getSideUp() + ".");

        for (int i = 1; i <= 20; i++) {
            coin.toss();
            String coinSideUp = coin.getSideUp();
            System.out.println("W losowaniu numer " + i + " wylosowano: " + coinSideUp);
            if (coinSideUp.equals("orzeł")) {
                head++;
            } else {
                tails++;
            }
        }

        System.out.println("W losowaniach orzeł wypadł " + head + " razy.");
        System.out.println("W losowaniach reszka wypadła " + tails + " razy.");
    }
}
