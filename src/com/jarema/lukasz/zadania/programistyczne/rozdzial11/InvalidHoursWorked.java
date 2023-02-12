package com.jarema.lukasz.zadania.programistyczne.rozdzial11;

public class InvalidHoursWorked extends Exception {
    public InvalidHoursWorked(int hours) {
        super("Ilośc przepracowanych godzin nie może być mniejsza od 0 i większa od 84");
    }
}
