package com.jarema.lukasz.zadania.programistyczne.rozdzial8;

/**
 * Klasa LandTract.
 * Utwórz klasę LandTract mającą dwa pola - jedno z szerokością działki i drugie z jej długością. Klasa powinna
 * udostępniać metodę zwracającą powierzchnię działki, a także metody equals i toString. Zademonstruj działanie tej
 * klasy w programie, który prosi użytkownika o wprowadzenie wymiarów dwóch działek. Program powinien wyświetlać
 * powierzchnię obu działek i informować, czy ich powierzchnia jest taka sama.
 */

public class LandTract {
    private double length;
    private double width;

    /**
     * Konstruktor obiektu typu LandTract przyjmuje jako argument długość oraz szerokość i zapisuje je w polach length,
     * width
     * @param length wartość pola length
     * @param width wartość pola width
     */
    public LandTract(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /**
     * Metoda getArea obiektu typu LandTract zwraca wartość length pomnożoną przez width
     * @return pole działki
     */
    public double getArea() {
        return length * width;
    }

    /**
     * Metoda equals obiektu typu LandTract sprawdza czy jeden obiekt tego typu jest równy drugiemu i zwraca wartość
     * booleanowską
     * @param lt obiekt typu LandTract
     * @return wartość true jeśli obiekty są równe; w przeciwnym razie false
     */
    public boolean equals(LandTract lt) {
        boolean status;
        if (length == lt.length && width == lt.width)
            status = true;
        else
            status = false;
        return status;
    }

    /**
     * Metoda toString zwraca tekst z informacją na temat działki
     * @return
     */
    public String toString() {
        return "Długość działki: " + length + "\nSzerokość działki: " + width + "\nPole działki: " + getArea();
    }
}
