package com.jarema.lukasz.zadania.programistyczne.rozdzial11;

public class NegativePrice extends Exception {
    public NegativePrice(double price) {
        super("Cena nie może wynosić wartości ujemnej");
    }
}
