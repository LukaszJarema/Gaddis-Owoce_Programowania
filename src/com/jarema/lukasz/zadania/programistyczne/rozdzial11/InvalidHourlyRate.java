package com.jarema.lukasz.zadania.programistyczne.rozdzial11;

public class InvalidHourlyRate extends Exception {
    public InvalidHourlyRate(double hourlyRate) {
        super("Stawka godzinowa nie może być ujemna lub większa od 25");
    }
}
