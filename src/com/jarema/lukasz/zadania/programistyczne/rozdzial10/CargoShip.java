package com.jarema.lukasz.zadania.programistyczne.rozdzial10;

public class CargoShip extends Ship {
    private int loadCapacity;

    public CargoShip(String name, String constructionYear, int loadCapacity) {
        super(name, constructionYear);
        this.loadCapacity = loadCapacity;
    }

    //Akcesory i mutatory
    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public String toString() {
        return "Statek\nNazwa: " + getName() + "\nŁadowność: " + loadCapacity;
    }
}
