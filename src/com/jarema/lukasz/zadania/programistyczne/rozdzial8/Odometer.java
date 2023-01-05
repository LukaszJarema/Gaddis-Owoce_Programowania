package com.jarema.lukasz.zadania.programistyczne.rozdzial8;

public class Odometer {
    private int kilometers;
    private FuelGauge fuelGauge;

    public Odometer(int kilometers, FuelGauge fuelGauge) {
        this.kilometers = kilometers;
        this.fuelGauge = fuelGauge;
    }

    //Akcesor
    public int getKilometers() {
        return kilometers;
    }

    //Mutator
    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    /**
     * Metoda displayKilometers wyświetla na konsoli aktualny stan licznika kilometrów
     */
    public void displayKilometers() {
        System.out.println("Aktualny stan licznika wynosi: " + getKilometers() + " kilometrów.");
    }

    /**
     * Metoda addKilometers symuluje dodanie do licznika kilometrów kolejnych wartości
     */
    public void addKilometers() {
        if (kilometers < 999999)
            kilometers++;
        else
            kilometers = 0;
    }

    public void road(FuelGauge fuelGauge) {
        if (kilometers % 20 == 0)
            fuelGauge.combustion();
    }
}
