package com.jarema.lukasz.rozdzial3;

import java.util.Scanner;

/**
 * Program Masa i ciężar.
 * Naukowcy mierzą masę obiektów w kilogramach, a ciężar w niutonach. Jeśli znasz masę obiektu, możesz obliczyć jego
 * ciężar w nitonach na podstawie następującego wzoru:
 * ciężar = masa * 9,8
 * Napisz program, który wyświetla prośbę o podanie masy obiektu, a następnie oblicza jego ciężar. Jeśli ciężar
 * przekracza 1000 niutonów, należy wyświetlić komunikat z informacją, że obiekt jest zbyt ciężki. Jeśli ciężar wynosi
 * poniżej 10 niutonów, należy poinformować użytkownika, że obiekt jest za lekki.
 */

public class Zad5 {
    public static void main(String[] args) {
        double burden, mass;

        System.out.println("Program oblicza ciężar przedmiotu w niutonach na podstawie masy podanej w kilogramach.");

        System.out.println("Podaj masę przedmiotu w kilogramach:");
        Scanner scanner = new Scanner(System.in);
        mass = scanner.nextDouble();

        burden = mass * 9.8;

        if(burden > 1000){
            System.out.println("Ciężar przedmiotu wynosi: " + burden + " niutonów.\nObiekt jest zbyt ciężki!");
        } else if (burden < 10){
            System.out.println("Ciężar przedmiotu wynosi: " + burden + " niutonów.\nObiekt jest zbyt lekki!");
        } else {
            System.out.println("Ciężar przedmiotu wynosi: " + burden + " niutonów.");
        }
    }
}
