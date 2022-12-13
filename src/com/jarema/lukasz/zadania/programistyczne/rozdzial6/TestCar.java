package com.jarema.lukasz.zadania.programistyczne.rozdzial6;

public class TestCar {
    public static void main(String[] args) {
        Car car = new Car(2006, "Opel");

        for (int i = 0; i < 5; i++) {
            car.accelerate();
            System.out.println("Prędkość samochodu wynosi: " + car.getSpeed());
        }

        for (int i = 0; i < 5; i++) {
            car.brake();
            System.out.println("Prędkość samochodu wynosi: " + car.getSpeed());
        }
    }
}
