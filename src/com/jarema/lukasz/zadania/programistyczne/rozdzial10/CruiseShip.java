package com.jarema.lukasz.zadania.programistyczne.rozdzial10;

public class CruiseShip extends Ship {
    private int maxPassengers;

    /**
     * Konstruktor obiektu typu CruiseShip przyjmujący jako argument wartość pól name, constructionYear oraz
     * maxPassengers
     * @param name wartość pola name
     * @param constructionYear wartość pola constructionYear
     * @param maxPassengers wartość pola maxPassengers
     */
    public CruiseShip(String name, String constructionYear, int maxPassengers) {
        super(name, constructionYear);
        this.maxPassengers = maxPassengers;
    }

    //Akcesory i mutatory
    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    /**
     * Metoda toString zwraca informację o nazwie statku oraz maksymalnej liczbie pasażerów
     * @return informacja o nazwie i maksymalnej ilości pasażerów
     */
    public String toString() {
        return "Statek\nNazwa: " + getName() + "\nMaksymalna ilość pasażerów: " + maxPassengers;
    }
}
