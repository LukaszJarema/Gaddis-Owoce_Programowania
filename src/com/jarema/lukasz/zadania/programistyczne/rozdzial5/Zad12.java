package com.jarema.lukasz.zadania.programistyczne.rozdzial5;

import java.util.Scanner;

/**
 * Energia kinetyczna.
 * W fizyce poruszający się obiekt posiada energię kinetyczną. Do jej obliczania można posłużyć się następującym wzorem:
 * Ek = 0,5 * m * v ^ 2
 * Oto zmienne z tego wzoru: Ek to energia kinetyczna, m to masa obiektu w kilogramach, a v to prędkość obiektu w metrach
 * na sekundę.
 * Napisz metodę kineticEnergy, która jako argumenty przyjmuje masę obiektu (w kilogramach) i szybkość (w metrach na
 * sekundę). Metoda ta powinna zwracać ilość energii kinetycznej obiektu. Zademonstruj działanie tej metody, wywołując
 * ją w programie, który wyświetla prośbę o podanie masy i prędkości.
 */

public class Zad12 {
    public static void main(String[] args) {
        double weight, speed;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Podaj masę obiektu: ");
            weight = scanner.nextDouble();
        } while (weight < 0);

        do {
            System.out.print("Podaj szybkość obiektu: ");
            speed = scanner.nextDouble();
        } while (speed < 0);

        System.out.println("Energia kinetyczna obiektu wynosi: " + kineticEnergy(weight, speed));
    }

    public static double kineticEnergy(double weight, double speed) {
        double energy = 0.5 * weight * Math.pow(speed, 2.0);
        return energy;
    }
}
