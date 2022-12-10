package com.jarema.lukasz.zadania.programistyczne.rozdzial5;

import java.util.Scanner;

/**
 * Zysk ze sprzedaży akcji.
 * Zysk ze sprzedaży akcji można obliczyć w następujący sposób:
 * zysk = ((LA x CZ) - PZ) - ((LA x CS) + PS)
 * W tym wzorze LA to liczba akcji, CZ to cena zakupu, PZ to kwota prowizji od zakupu, CS to cena sprzedaży, a PS to
 * kwota prowizji od sprzedaży. Jeśli obliczenia dają liczbę dodatnią, oznacza to, że sprzedaż akcji przyniosła zysk.
 * Jeżeli wynik jest liczbą ujemną, sprzedaż wiąże się ze stratą.
 * Napisz metodę, która przyjmuje argumenty w postaci liczby akcji, ceny zakupu (za akcję), prowizji od zakupu, ceny
 * sprzedaży (za akcję) i prowizji od sprzedaży. Metoda ta powinna zwracać poziom zysku lub straty ze sprzedaży akcji.
 * Zademonstruj działanie tej metody w programie, który prosi o wprowadzenie potrzebnych danych i wyświetla poziom
 * zysku lub straty.
 */

public class Zad10 {
    public static void main(String[] args) {
        int shares;
        double purchasePrice, purchaseAmmountOfCommission, selsPrice, selsAmmountOfCommission;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Ile akcji kupiłeś: ");
            shares = scanner.nextInt();
        } while (shares < 0);

        do {
            System.out.print("Jaka była cena jednostkowa kupionych akcji: ");
            purchasePrice = scanner.nextDouble();
        } while (purchasePrice < 0);

        do {
            System.out.print("Jaka była cena prowizji od zakupu: ");
            purchaseAmmountOfCommission = scanner.nextDouble();
        } while (purchaseAmmountOfCommission < 0);

        do {
            System.out.print("Jaka była cena jednostkowa sprzedanych akcji: ");
            selsPrice = scanner.nextDouble();
        } while (selsPrice < 0);

        do {
            System.out.print("Jaka była kwota prowizji od sprzedaży: ");
            selsAmmountOfCommission = scanner.nextDouble();
        } while (selsAmmountOfCommission < 0);

        double profit = profitFromSalesOfShares(shares, purchasePrice, purchaseAmmountOfCommission, selsPrice,
                selsAmmountOfCommission);

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
