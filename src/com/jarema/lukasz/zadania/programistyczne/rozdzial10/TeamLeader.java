package com.jarema.lukasz.zadania.programistyczne.rozdzial10;

import java.time.LocalDate;

/**
 * Klasa TeamLeader.
 * W pewnej fabryce kierownik zespołu to pracownik działu produkcji z wynagrodzeniem godzinowym zarządzający niewielkim
 * zespołem. Oprócz wynagrodzenia godzinowego kierownicy zespołu otrzymują stałą premię miesięczną. Kierownicy muszą
 * uczestniczyć przynajmniej w wymaganej liczbie godzin szkoleń rocznie. Zaprojektuj klasę TeamLeader (kierownik
 * zespołu) pochodną od klasy ProductionWorker. W klasie TeamLeader powinny znajdować się pola na kwotę miesięczną
 * premii, na wymaganą liczbę godzin szkoleń, a także na liczbę godzin już ukończonych kursów. Zademonstruj działanie
 * tej klasy pisząc program używający obiektu typu TeamLeader.
 */

public class TeamLeader extends ProductionWorker {
    private double monthlyBonus;
    private int hoursOfTrainings;
    private int doneHoursOfTraining;

    /**
     * Konstruktor bezargumentowy obiektu typu TeamLeader
     */
    public TeamLeader() {

    }

    /**
     * Konstruktor obiektu typu TeamLeader przyjmujący jako argumenty wartości pól:
     * @param surname wartość pola surname
     * @param id wartość pola id
     * @param date wartość pola dateOfRecruitment
     * @param duty wartość pola duty
     * @param hourlyRate wartość pola hourlyRate
     * @param monthlyBonus wartość pola monthlyBonus
     * @param hoursOfTrainings wartość pola hoursOfTraining
     * @param doneHoursOfTraining wartość pola doneHoursOfTraining
     */
    public TeamLeader(String surname, String id, LocalDate date, int duty, double hourlyRate, double monthlyBonus, int
                      hoursOfTrainings, int doneHoursOfTraining) {
        super(surname, id, date, duty, hourlyRate);
        this.monthlyBonus = monthlyBonus;
        this.hoursOfTrainings = hoursOfTrainings;
        this.doneHoursOfTraining = doneHoursOfTraining;
    }

    //Akcesory
    public double getMonthlyBonus() {
        return monthlyBonus;
    }

    public int getHoursOfTrainings() {
        return hoursOfTrainings;
    }

    public int getDoneHoursOfTraining() {
        return doneHoursOfTraining;
    }

    //Mutatory
    public void setMonthlyBonus(double monthlyBonus) {
        this.monthlyBonus = monthlyBonus;
    }

    public void setHoursOfTrainings(int hoursOfTrainings) {
        this.hoursOfTrainings = hoursOfTrainings;
    }

    public void setDoneHoursOfTraining(int doneHoursOfTraining) {
        this.doneHoursOfTraining = doneHoursOfTraining;
    }

    public String toString() {
        return super.toString() + "\nMiesięczny bonus: " + monthlyBonus + "\nWymagana liczba godzin przeznaczona na " +
                "szkolenia: " + hoursOfTrainings + "\nLiczba godzin wykonanych szkoleń: " + doneHoursOfTraining;
    }
}
