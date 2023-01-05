package com.jarema.lukasz.zadania.programistyczne.rozdzial8;

public class TestParkedCar {
    public static void main(String[] args) {
        ParkedCar car = new ParkedCar("VW", "Polo", "Srebrny", 121);
        PoliceOfficer policeman = new PoliceOfficer("Nowak", 1234);
        ParkingMeter meter = new ParkingMeter(60);
        ParkingTicket ticket = new ParkingTicket(car, policeman);
        policeman.getFine(car, ticket, meter, policeman);
    }
}
