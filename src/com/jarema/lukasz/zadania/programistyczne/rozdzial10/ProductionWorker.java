package com.jarema.lukasz.zadania.programistyczne.rozdzial10;

import java.time.LocalDate;

public class ProductionWorker extends Employee{
    private int duty;
    private double hourlyRate;

    /**
     * Konstruktor bezargumentowy obiektu typu ProductionWorker
     */
    public ProductionWorker() {

    }

    /**
     * Konstruktor obiektu typu ProductionWorker przyjmujący jako argumenty wartości pól duty oraz hourlyRate
     * @param duty wartość pola duty
     * @param hourlyRate wartość pola hourlyRate
     */
    public ProductionWorker(String surname, String id, LocalDate dateOfRecruitment, int duty, double hourlyRate) {
        super(surname, id, dateOfRecruitment);
        this.duty = duty;
        this.hourlyRate = hourlyRate;
    }

    //Akcesory
    public int getDuty() {
        return duty;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    //Mutatory
    public void setDuty(int duty) {
        this.duty = duty;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public String toString(){
        String str;
        if (duty == 1)
            str = "dzienna";
        else
            str = "nocna";
        return super.toString() + "\nZmiana: " + str + "\nStawka godzinowa: " + hourlyRate;
    }
}
