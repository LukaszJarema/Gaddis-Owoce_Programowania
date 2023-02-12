package com.jarema.lukasz.zadania.programistyczne.rozdzial11;

public class InvalidMonthName extends Exception {
    public InvalidMonthName(String month) {
        super("Błędna nazwa miesiąca.");
    }
}
