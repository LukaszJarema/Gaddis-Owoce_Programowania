package com.jarema.lukasz.zadania.programistyczne.rozdzial10;

import java.time.LocalDate;

/**
 * Klasa ShiftSupervisor.
 * W pewnej fabryce nadzorca zmiany to pracownik ze stałym wynagrodzeniem kontrolujący określoną zmianę. Oprócz pensji
 * podstawowej nadzorca otrzymuje roczną premię, jeśli jego zmiana zrealizowała stawiane jej cele z zakresu produkcji.
 * Zaprojektuj klasę ShiftSupervisor (nadzorca zmiany) pochodną od klasy Employee. W klasie ShiftSupervisor powinno
 * znajdować się pole przeznaczone na roczne wynagrodzenie, a także pole na roczną premię otrzymaną przez nadzorcę.
 * Napisz jeden lub kilka konstruktorów, a także odpowiednie akcesory oraz mutatory dla tej klasy. Zademonstruj jej
 * działanie, pisząc program używający obiektu typu ShiftSupervisor.
 */

public class ShiftSupervisor extends Employee {
    private double yearlyRate;
    private double yearlyBonus;

    /**
     * Konstruktor bezargumentowy obiektu typu ShiftSupervisor
     */
    public ShiftSupervisor() {

    }

    /**
     * Konstruktor obiektu typu ShiftSupervisor przyjmujący jako argumenty wartości pól surname, id, dateOfRecruitment,
     * yearlyRate oraz yearlyBonus
     * @param surname wartość pola surname
     * @param id wartość pola id
     * @param date wartość pola dateOfRecruitment
     * @param yearlyRate wartość pola yearlyRate
     * @param yearlyBonus wartość pola yearlyBonus
     */
    public ShiftSupervisor(String surname, String id, LocalDate date, double yearlyRate, double yearlyBonus) {
        super(surname, id, date);
        this.yearlyRate = yearlyRate;
        this.yearlyBonus = yearlyBonus;
    }

    //Akcesory
    public double getYearlyRate() {
        return yearlyRate;
    }

    public double getYearlyBonus() {
        return yearlyBonus;
    }

    //Mutatory
    public void setYearlyRate(double yearlyRate) {
        this.yearlyRate = yearlyRate;
    }

    public void setYearlyBonus(double yearlyBonus) {
        this.yearlyBonus = yearlyBonus;
    }

    public String toString(){
        return super.toString() + "\nRoczna pensja: " + yearlyRate + "\nRoczna premia: " + yearlyBonus;
    }
}
