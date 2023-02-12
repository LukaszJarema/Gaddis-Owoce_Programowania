package com.jarema.lukasz.zadania.programistyczne.rozdzial11;

public class InvalidSurname extends Exception {
    public InvalidSurname(String surname) {
        super("Nazwisko nie może być pustym ciągiem znaków");
    }
}
