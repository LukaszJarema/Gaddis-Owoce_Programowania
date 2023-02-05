package com.jarema.lukasz.zadania.programistyczne.rozdzial10;

/**
 * Klasy Ship, CruiseShip i CargoShip.
 * Zaprojektuj klasę Ship zawierającą następujące składowe:
 * - pole z nazwą statku (typ String)
 * - pole z rokiem budowy statku (typ String)
 * - konstruktor oraz odpowiednie akcesory i mutatory
 * - metodę toString wyświetlającą nazwę statku i rok jego budowy.
 * Zaprojektuj klasę CruiseShip, pochodną od klasy Ship. Klasa CruiseShip powinna obejmować następujące składowe:
 * - pole z maksymalną liczbą pasażerów,
 * - konstruktor oraz odpowiednie akcesory i mutatory,
 * - metodę toString przesłaniającą tę samą metodę z klasy bazowej. Metoda toString z klasy CruiseShip powinna
 * wyświetlać tylko nazwę statku i maksymalną liczbę pasażerów.
 * Zaprojektuj klasę CargoShip, pochodną od klasy Ship. Klasa CargoShip powinna obejmować następujące składowe:
 * - pole z ładownością w tonach (typ int),
 * - konstruktor oraz odpowiednie akceosry i mutatory,
 * - metodę toString przesłaniającą tę samą metodę z klasy bazowej. Metoda toString z klasy CargoShip powinna wyświetlać
 * tylko nazwę statku i ładowność.
 * Zademonstruj działanie tych klas w programie z tablicą typu Ship. Do elementów tej tablicy przypisz różne obiekty
 * typów Ship, CruiseShip i CargoShip. Program powinien pobierać kolejne elementy tablicy i wywoływać metodę toString
 * każdego obiektu.
 */

public class Ship {
    private String name;
    private String constructionYear;

    /**
     * Konstruktor obiektu typu Ship przyjmujący jako argument wartość pól name oraz constructionYear
     * @param name wartość pola name
     * @param constructionYear wartość pola constructionYear
     */
    public Ship(String name, String constructionYear) {
        this.name = name;
        this.constructionYear = constructionYear;
    }

    //Akcesory
    public String getName() {
        return name;
    }

    public String getConstructionYear() {
        return constructionYear;
    }

    //Mutatory
    public void setName(String name) {
        this.name = name;
    }

    public void setConstructionYear(String constructionYear) {
        this.constructionYear = constructionYear;
    }

    /**
     * Metoda toString zwraca informacje o statku
     * @return informacje o statku
     */
    public String toString() {
        return "Statek\nNazwa: " + name + "\nRok budowy: " + constructionYear;
    }
}
