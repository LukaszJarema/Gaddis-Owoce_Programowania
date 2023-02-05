package com.jarema.lukasz.zadania.programistyczne.rozdzial10;

public class TestShip {
    public static void main(String[] args) {
        Ship [] ships = new Ship[3];
        ships[0] = new Ship("Titanic", "1912");
        ships[1] = new CruiseShip("Queen Marry", "2000", 500000);
        ships[2] = new CargoShip("Cargo", "2023", 10000);

        for (int i = 0; i < ships.length; i++) {
            System.out.println(ships[i].toString());
        }
    }
}
