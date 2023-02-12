package com.jarema.lukasz.zadania.programistyczne.rozdzial11;

public class InvalidMonthNumber extends Exception {
    public InvalidMonthNumber(int month) {
        super("Numer miesiąca nie może być mniejszy od 1 lub większy od 12.");
    }
}
