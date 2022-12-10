package com.jarema.lukasz.zadania.programistyczne.rozdzial5;

import java.util.Scanner;

/**
 * Sprzedaż akcji różnych firm.
 * Wykorzystaj metodę z Zad10 w programie, który oblicza łączny zysk lub sumaryczną stratę ze sprzedaży akcji różnych
 * firm. Program powinien sumować zysk lub stratę ze sprzedaży akcji każdej firmy, a następnie wyświetlać uzyskaną sumę.
 */

public class Zad11 {
    public static void main(String[] args) {
        int shares, companies;
        double purchasePrice, purchaseAmmountOfCommission, selsPrice, selsAmmountOfCommission, profit = 0.0;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Ilu firm kupiłeś akcje: ");
            companies = scanner.nextInt();
        } while (companies < 0);

        for (int i = 1; i <= companies; i++) {
            do {
                System.out.print("Ile akcji kupiłeś firmy numer " + i + " : ");
                shares = scanner.nextInt();
            } while (shares < 0);

            do {
                System.out.print("Jaka była cena jednostkowa kupionych akcji firmy numer " + i + " : ");
                purchasePrice = scanner.nextDouble();
            } while (purchasePrice < 0);

            do {
                System.out.print("Jaka była cena prowizji od zakupu akcji firmy numer " + i + " : ");
                purchaseAmmountOfCommission = scanner.nextDouble();
            } while (purchaseAmmountOfCommission < 0);

            do {
                System.out.print("Jaka była cena jednostkowa sprzedanych akcji firmy numer " + i + " : ");
                selsPrice = scanner.nextDouble();
            } while (selsPrice < 0);

            do {
                System.out.print("Jaka była kwota prowizji od sprzedaży akcji firmy numer " + i + " : ");
                selsAmmountOfCommission = scanner.nextDouble();
            } while (selsAmmountOfCommission < 0);

            profit += profitFromSalesOfShares(shares, purchasePrice, purchaseAmmountOfCommission, selsPrice,
                    selsAmmountOfCommission);
        }

        if (profit > 0) {
            System.out.println("Zyskałeś na sprzedaży akcji: " + profit + ".");
        } else {
            System.out.println("Straciłeś na sprzedaży akcji: " + profit + ".");
        }
    }

    public static double profitFromSalesOfShares(int shares, double purchasePrice, double purchaseAmmountOfCommission,
                                                 double selsPrice, double selsAmmountOfCommision) {
        double profit = ((shares * purchasePrice) - purchaseAmmountOfCommission) - ((shares * selsPrice) +
                selsAmmountOfCommision);
        return profit;
    }
}
