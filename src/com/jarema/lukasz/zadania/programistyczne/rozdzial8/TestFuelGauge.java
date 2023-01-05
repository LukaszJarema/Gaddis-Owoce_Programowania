package com.jarema.lukasz.zadania.programistyczne.rozdzial8;

public class TestFuelGauge {
    public static void main(String[] args) {
        FuelGauge fuelGauge = new FuelGauge(50);
        Odometer odometer = new Odometer(999900, fuelGauge);
        //Tankowanie
        while (fuelGauge.getLitersOfFuel() < fuelGauge.maxOfFuel()) {
            fuelGauge.refuelling();
        }
        //Jazda
        while (fuelGauge.getLitersOfFuel() > 0) {
            odometer.addKilometers();
            odometer.road(fuelGauge);
            odometer.displayKilometers();
            fuelGauge.displayFuelLevel();
        }
    }
}
