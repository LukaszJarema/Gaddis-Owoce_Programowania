package com.jarema.lukasz.zadania.programistyczne.rozdzial6;

/**
 * Klasa Circle.
 * Napisz klasę Circle (koło) obejmującą następujące pola:
 * - radius. Pole typu double.
 * - PI. Pole typu final double inicjowane wartością 3,14159.
 * Ta klasa powinna też zawierać następujące metody:
 * - Konstruktor. Przyjmuje jako argument promień koła.
 * - Konstruktor. Konstruktor bezargumentowy ustawiający wartość pola radius na 0,0.
 * - setRadius. Mutator pola radius.
 * - getRadius. Akcesor pola radius.
 * - area. Zwraca powierzchnię koła obliczaną za pomocą wzoru:
 * area = PI * radius * radius
 * - diameter. Zwraca średnicę koła obliczaną według wzoru:
 * diameter = radius * 2
 * - circumference. Zwraca obwód koła obliczany za pomocą wzoru:
 * circumference = 2 * PI * radius
 * Napisz program demonstrujący działanie klasy Circle. Program powinien wyświetlać prośbę o podanie promienia koła,
 * tworzyć obiekt typu Circle, a następnie podawać powierzchnię, średnicę i obwód danego koła.
 */
public class Circle {
    private double radius;
    private final double PI = 3.14159;

    /**
     * Konstruktor obiektu typu Circle przyjmujący wartość pola radius
     * @param circleRadius wartość pola radius
     */
    public Circle(double circleRadius) {
        radius = circleRadius;
    }

    /**
     * Konstruktor bezargumentowy obiektu typu Circle gdzie wartość pola radius wynosi 0
     */
    public Circle() {
        radius = 0.0;
    }

    //Mutator

    /**
     * Metoda setRadius obiektu typu Circle zapisuje wartość w polu radius
     * @param circleRadius wartośc pola radius
     */
    public void setRadius(double circleRadius) {
        radius = circleRadius;
    }

    /**
     * Metoda getRadius obiektu typu Circle zwraca wartość pola radius
     * @return wartość pola radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Metoda area obiektu typu Circle zwraca pole powierchni koła
     * @param radius wartość pola radius
     * @return zwraca pole powierzchni koła
     */
    public double area(double radius) {
        double area = radius * radius * PI;
        return area;
    }

    /**
     * Metoda diameter obiektu typu Circle zwraca średnicę koła
     * @param radius wartość pola radius
     * @return zwraca średnicę koła
     */
    public double diameter(double radius) {
        double diameter = radius * 2;
        return diameter;
    }

    /**
     * Metoda circumference obiektu typu Circle zwraca obwód koła
     * @param radius wartość pola radius
     * @return zwraca obód koła
     */
    public double circumference(double radius) {
        double circumference = 2 * PI * radius;
        return circumference;
    }
}
