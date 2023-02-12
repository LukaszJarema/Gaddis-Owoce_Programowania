package com.jarema.lukasz.zadania.programistyczne.rozdzial11;

public class NegativeUnitsOnHand extends Exception {
    public NegativeUnitsOnHand(int unitsOnHand) {
        super("Ilość nie może być mniejsza od zera.");
    }
}
