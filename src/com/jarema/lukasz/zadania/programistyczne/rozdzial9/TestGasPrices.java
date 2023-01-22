package com.jarema.lukasz.zadania.programistyczne.rozdzial9;

import java.io.IOException;
import java.util.Scanner;

public class TestGasPrices {
    public static void main(String[] args) throws IOException {
        GasPrices gasPrices = new GasPrices();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Z jakiego roku chcesz poznać średnią cenę benzyny: ");
        double year = scanner.nextDouble();
        System.out.printf("Średnia cena paliwa w roku " + (int) year + " wyniosła: %.3f\n",
                gasPrices.averagePriceOfGasInYear(year));
        System.out.print("Z jakiego miesiąca chcesz poznać średnią cenę benzyny (1-12): ");
        double month = scanner.nextDouble();
        System.out.printf("Średnia cena paliwa w miesiącu " + (int) month + " wyniosła: %.3f\n",
                gasPrices.averagePriceOfGasInMonth(month));
        System.out.print("Z jakiego roku chcesz poznać najniższe i najwyższe ceny paliwa: ");
        gasPrices.lowestAndHighestPriceInYear(scanner.nextDouble());
        gasPrices.fileFromHighestToLowest();
        gasPrices.fileFromLowestToHighest();
    }
}
