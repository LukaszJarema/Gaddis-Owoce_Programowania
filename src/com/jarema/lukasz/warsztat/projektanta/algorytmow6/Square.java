package com.jarema.lukasz.warsztat.projektanta.algorytmow6;

/**
 * Rozważ następującą deklarację klasy:
 * public class Square {
 *     private double sideLength;
 *     private double getArea() {
 *         return sideLength + sideLength;
 *     }
 *     public double getSideLength() {
 *         return sideLength;
 *     }
 * }
 * a). Napisz konstruktor bezargumentowy tej klasy. Powinien on przypisywać wartość 0.0. do pola sideLength.
 * b). Napisz przeciążony konstruktor tej klasy. Powinien on przyjmować argument kopiowany następnie do pola sideLength.
 */
public class Square {
    private double sideLength;

    private double getArea() {
        return sideLength + sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    /**
     * Konstruktor bezargumentowy.
     */
    public Square() {
        sideLength = 0.0;
    }

    /**
     * Konstruktor klasy Square przyjmujący argument.
     * @param length argument length przypisywany jest do wartości sideLength.
     */
    public Square(double length) {
        length = sideLength;
    }
}
