package com.jarema.lukasz.zadania.programistyczne.rozdzial8;

/**
 * Klasa Area.
 * Napisz klasę, która zawiera trzy przeciążone metody statyczne do obliczania powierzchni następujących figur
 * geometrycznych:
 * - koła,
 * - prostokąta,
 * - walca.
 * Ponieważ te trzy metody mają być przeciążone, powinny mieć tę samą nazwę, ale inne listy parametrów. Zademonstruj
 * działanie tej klasy w kompletnym programie.
 */

public class Area {
    /**
     * Metoda statyczna getArea obiektu typu Area przyjmuje jako argument długość promienia i zwraca wartość pola koła
     * @param radius długość promienia
     * @return pole koła
     */
    public static double getArea(double radius) {
       return Math.PI * radius * radius;
    }

    /**
     * Metoda statyczna getArea obiektu typu Area przyjmuje jako argumenty długość i szerokość i zwraca wartość pola
     * prostokąta
     * @param length długość
     * @param width szerokość
     * @return pole prostokąta
     */
    public static double getArea(double length, double width) {
        return length * width;
    }

    /**
     * Metoda statyczna obiektu typu Area przyjmująca jako argumenty wysokość, promień oraz liczbę PI i zwracająca
     * wartość pola walcja
     * @param height wysokość
     * @param radius promień
     * @param pi stała PI
     * @return pole walca
     */
    public static double getArea(double height, double radius, double pi) {
        return pi * radius * radius * height;
    }
}
