package com.jarema.lukasz.zadania.programistyczne.rozdzial6;

/**
 * Liczba dni w miesiącu.
 * Napisz klasę MonthDays. Konstruktor tej klasy powinien przyjmować dwa argumenty:
 * - liczbę całkowitą reprezentującą numer miesiąca (1 = styczeń, 2 = luty, itd.).
 * - liczbę całkowitą reprezentującą rok.
 * W klasie należy umieścić metodę numberOfDays, która zwraca liczbę dni w podanym miesiącu. W tej metodzie należy
 * zastosować następujące kryteria do identyfikowania lat przestępnych:
 * 1. Określić, czy rok jest podzielny przez 100. Jeśli tak jest, rok jest przestępny tylko wtedy, gdy jednocześnie
 * jest podzielny przez 400. Na przykład rok 2000 jest przestępny, ale 2100 już nie.
 * 2. Jeżeli rok nie jest podzielny przez 100, jest rokiem przestępnym wtedy i tylko wtedy, gdy jest podzielny przez 4.
 * Na przykład rok 2008 jest rokiem przestępnym, ale 2009 już nie.
 * Zademonstruj działanie tej klasy w programie, który wyświetla prośbę o podanie miesiąca (w formie liczby całkowitej
 * z przedziału od 1 do 12) i roku. Program powinien następnie wyświetlać liczbę dni w danym miesiącu.
 */
public class MonthDays {
    private int month;
    private int year;

    /**
     * Konstruktor obiektu typu MonthDays przyjmujący wartość pól month i year
     * @param month wartość pola month
     * @param year wartość pola year
     */
    public MonthDays(int month, int year) {
        this.month = month;
        this.year = year;
    }

    /**
     * Konstruktor bezargumentowy obiektu typu MonthDays
     */
    public MonthDays() {

    }

    //Akcesory

    /**
     * Meotda getMonth zwraca wartość pola month obiektu typu MonthDays
     * @return wartość pola month
     */
    public int getMonth() {
        return month;
    }

    /**
     * Moetoda getYear zwraca wartość pola year obiektu typu MonthDays
     * @return wartość pola year
     */
    public int getYear() {
        return year;
    }

    //Mutatory

    /**
     * Metoda setMonth ustawia wartość pola month obiektu typu MonthDays
     * @param month wartośc pola month
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * Metoda setYear ustawia wartość pola year obiektu typu MonthDays
     * @param year wartość pola year
     */
    public void setYear(int year) {
        this.year = year;
    }

    public int numberOfDays(int month, int year) {
        int days = 0;
        switch (month) {
            case 1:
                days = 31;
                break;
            case 2:
                if (year % 100 == 0 && year % 400 == 0) {
                    days = 29;
                } else if (year % 100 != 0 && year % 4 == 0) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            case 3:
                days = 31;
                break;
            case 4:
                days = 30;
                break;
            case 5:
                days = 31;
                break;
            case 6:
                days = 30;
                break;
            case 7:
                days = 31;
                break;
            case 8:
                days = 31;
                break;
            case 9:
                days = 30;
                break;
            case 10:
                days = 31;
                break;
            case 11:
                days = 30;
                break;
            case 12:
                days = 31;
                break;
            default:
                System.out.println("Podano złą wartość!");
                break;
        }
        return days;
    }
}
