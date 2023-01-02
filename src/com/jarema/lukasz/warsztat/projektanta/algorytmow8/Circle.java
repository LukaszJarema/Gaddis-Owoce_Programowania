package com.jarema.lukasz.warsztat.projektanta.algorytmow8;

/**
 * a. Napisz metodę toString dla tej klasy. Ta metoda powinna zwracać łańcuch znaków zawierający promień i powierzchnię
 * koła.
 * b. Napisz metodę equals dla tej klasy. Ta metoda powinna przyjmować argument w postaci obiektu Circle. Ponadto
 * powinna zwracać wartość true, jeśli obiekt przekazany jako argument zawiera te same dane co obiekt zawierający
 * wywołaną metodę; w przeciwnym razie metoda ma zwracać false.
 * c. Napisz metodę greaterThan dla tej klasy. Ta metoda powinna przyjmować argument w postaci obiektu typu Circle.
 * Ponadto powinna zwracać wartość true, jeśli obiekt przekazany jako argument ma powierzchnię większą, niż obiekt
 * zawierający wywołaną metodę; w przeciwnym razie metoda ma zwracać false.
 */

public class Circle {
    private double radius;

    public Circle(double r) {
        radius = r;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public String toString() {
        String str = "Promień: " + radius + "\nPowierzchnia: " + getArea();
        return str;
    }

    public boolean equals(Circle c) {
        boolean status;
        if(radius == c.radius)
            status = true;
        else
            status = false;
        return status;
    }

    public boolean greaterThan(Circle c) {
        boolean status;
        if(getArea() < c.getArea())
            status = true;
        else
            status = false;
        return status;
    }
}
