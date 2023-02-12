package com.jarema.lukasz.zadania.programistyczne.rozdzial11;

public class InvalidIdNumber extends Exception {
    public InvalidIdNumber(int idNumber) {
        super("Numer id nie może być mniejszy lub równy zero.");
    }
}
