package com.jarema.lukasz.zadania.programistyczne.rozdzial11;

/**
 * Wyjątki dla klasy Month.
 * Klasa Month przechowuje informacje na temat miesięcy. Napisz klasy wyjątków dla następujących warunków błędów:
 * - jako numer miesiąca podana jest liczba mniejsza niż 1 lub większa niż 12
 * - jako nazwa miesiąca podany jest nieprawidłowy łańcuch znaków.
 * Zmodyfikuj klasę Month, aby zgłaszała odpowiedni wyjątek w reakcji na któryś z tych błędów. Pokaż działanie tych klas
 * w programie.
 */

public class Month {
    private int monthNumber;

    /**
     * Konstruktor bezargumentowy obiektu typu Month ustawiający w polu monthNumber wartość 1
     */
    public Month() {
        monthNumber = 1;
    }

    /**
     * Konstruktor obiektu typu Month przyjmujący jako argument wartość pola monthNumber. Jeśli argument jest mniejszy
     * od 1 lub większy od 12 wartość pola monthNumber wynosi 1. W przeciwnym razie wartość pola monthNumber wynosi
     * tyle ile zostało przekazane w argumencie
     *
     * @param monthNumber wartość pola monthNumber
     */
    public Month(int monthNumber) throws InvalidMonthNumber {
        if (monthNumber < 1 || monthNumber > 12)
            throw new InvalidMonthNumber(monthNumber);
        else
            this.monthNumber = monthNumber;
    }

    /**
     * Konstruktor klasy Month przyjmujący jako argument nazwę miesiąca i przypisujący według nazwy wartość do pola
     * monthName
     *
     * @param monthName nazwa miesiąca słownie
     */
    public Month(String monthName) throws InvalidMonthName {
        switch (monthName) {
            case "Styczeń":
                monthNumber = 1;
                break;
            case "Luty":
                monthNumber = 2;
                break;
            case "Marzec":
                monthNumber = 3;
                break;
            case "Kwiecień":
                monthNumber = 4;
                break;
            case "Maj":
                monthNumber = 5;
                break;
            case "Czerwiec":
                monthNumber = 6;
                break;
            case "Lipiec":
                monthNumber = 7;
                break;
            case "Sierpień":
                monthNumber = 8;
                break;
            case "Wrzesień":
                monthNumber = 9;
                break;
            case "Październik":
                monthNumber = 10;
                break;
            case "Listopad":
                monthNumber = 11;
                break;
            case "Grudzień":
                monthNumber = 12;
                break;
            default:
                throw new InvalidMonthName(monthName);
        }
    }

    /**
     * Metoda setMonthNumber przyjmuje jako argument wartość liczbową zapisywaną w polu monthNumber. Jeśli wartość ta
     * jest mniejsza od 1 lub większa od 12 pole ustawiane jest na wartość 1. W przeciwnym razie ustawiana jest wartość
     * z argumentu
     * @param monthNumber wartość pola monthNumber
     */
    public void setMonthNumber(int monthNumber) throws InvalidMonthNumber {
        if (monthNumber < 1 || monthNumber > 12)
            throw new InvalidMonthNumber(monthNumber);
        else
            this.monthNumber = monthNumber;
    }

    /**
     * Metoda getMonthNumber zwraca wartość pola monthNumber
     * @return wartość pola monthNumber
     */
    public int getMonthNumber() {
        return monthNumber;
    }

    /**
     * Metoda getMonthName zwraca obiekt typu String z nazwą miesiąca z pola monthNumber
     * @return nazwa miesiąca
     */
    public String getMonthName() {
        String [] monthName = {"Styczeń", "Luty", "Marzec", "Kwieceń", "Maj", "Czerwiec", "Lipiec", "Sierpień",
                "Wrzesień", "Październik", "Listopad", "Grudzień"};
        return monthName[getMonthNumber() - 1];
    }

    /**
     * Metoda toString zwraca obiekt typu String z nazwą miesiąca z pola monthNumber
     * @return nazwa miesiąca
     */
    public String toString() {
        String [] monthName = {"Styczeń", "Luty", "Marzec", "Kwieceń", "Maj", "Czerwiec", "Lipiec", "Sierpień",
                "Wrzesień", "Październik", "Listopad", "Grudzień"};
        return monthName[getMonthNumber() - 1];
    }

    /**
     * Metoda equals przyjmuje jako argument obiekt typu Month. Jeśli wartość w polu monthNumber obu obiektów jest taka
     * sama metoda zwraca wartość true. W przecwinym razie false
     * @param month obiekt typu Month
     * @return true jeśli oba obiekty mają tę samą wartość w polu monthNumber. W przeciwnym razie false
     */
    public boolean equals(Month month) {
        boolean status;
        if (monthNumber == month.monthNumber)
            status = true;
        else
            status = false;
        return status;
    }

    /**
     * Metoda greatherThan przyjmuje jako argument obiekt typu Month. Jeśli wartość w polu monthNumber porównywanego
     * obiektu jest większa od wartości monthNumber z pola month metoda zwraca wartość true. W przeciwnym razie metoda
     * zwraca wartość false
     * @param month obiekt typu Month
     * @return true jeśli obiekt wywołujący argument ma większą wartość pola monthNumber. W przeciwnym razie false
     */
    public boolean greatherThan(Month month) {
        boolean status;
        if (monthNumber > month.monthNumber)
            status = true;
        else
            status = false;
        return status;
    }

    /**
     * Metoda lessThan przyjmuje jako argument obiekt typu Month. Jeśli wartość w polu monthNumber porównywanego
     * obiektu jest mniejsza od wartości monthNumber z pola month metoda zwraca wartość true. W przeciwnym razie metoda
     * zwraca wartość false
     * @param month obiekt typu Month
     * @return true jeśli obiekt wywołujący argument ma mniejszą wartość pola monthNumber. W przeciwnym razie false
     */
    public boolean lessThan(Month month) {
        boolean status;
        if (monthNumber < month.monthNumber)
            status = true;
        else
            status = false;
        return status;
    }
}
