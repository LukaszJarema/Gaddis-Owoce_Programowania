package com.jarema.lukasz.rozdzial3;

import java.util.Scanner;

/**
 * Firma "Szybkie dostawy" nalicza następujące opłaty:
 * Waga przesyłki               Stawka za 500km
 * Kilogram lub mniej           1,10zł
 * Powyżej 1kg do 3kg           2,20zł
 * Powyżej 3kg do 5kg           3,70zł
 * Powyżej 5kg                  3,80zł
 * Opłaty za 500km nie są obliczane proporcjonalnie. Jeśli np. kilogramowa przesyłka zostanie przesłana na odległość
 * 550km, opłata wyniesie 2,20zł.
 * Napisz program, który wyświetla porśbę o wprowadzenie wagi i odległości przesyłki, a następnie wyświetla jej koszt.
 */

public class Zad9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Jaka jest waga przesyłki: ");
        double weight = scanner.nextDouble();
        System.out.print("Jaka jest odległość przesyłki: ");
        int km = scanner.nextInt();
        double pricePer500KM = 0;

        if (weight <= 1.0) {
            pricePer500KM = 1.10;
        } else if (weight <= 3.0) {
            pricePer500KM = 2.20;
        } else if (weight <= 5.0) {
            pricePer500KM = 3.70;
        } else {
            pricePer500KM = 3.80;
        }

        double price = pricePer500KM * ((km / 500) + 1);
        System.out.println("Koszt przesyłki wynosi: " + price);
    }
}
