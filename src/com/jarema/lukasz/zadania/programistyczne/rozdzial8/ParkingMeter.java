package com.jarema.lukasz.zadania.programistyczne.rozdzial8;

public class ParkingMeter {
    private int minutesOfTimePurchased;

    /**
     * Konstruktor bezargumentowy obiektu typu ParkingMeter
     */
    public ParkingMeter() {

    }

    /**
     * Konstruktor obiektu ParkingMeter przyjmujący jako argument wartość pola minutesOfTimePurchased
     * @param minutesOfTimePurchased wartość pola miutesOfTimePurchased
     */
    public ParkingMeter(int minutesOfTimePurchased) {
        this.minutesOfTimePurchased = minutesOfTimePurchased;
    }

    /**
     * Konstruktor kopiujący obiektu typu ParkingMeter
     * @param parkingMeter
     */
    public ParkingMeter(ParkingMeter parkingMeter) {
        minutesOfTimePurchased = parkingMeter.minutesOfTimePurchased;
    }

    //Akcesor

    public int getMinutesOfTimePurchased() {
        return minutesOfTimePurchased;
    }

    //Mutator

    public void setMinutesOfTimePurchased(int minutesOfTimePurchased) {
        this.minutesOfTimePurchased = minutesOfTimePurchased;
    }
}
