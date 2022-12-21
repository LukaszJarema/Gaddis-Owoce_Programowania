package com.jarema.lukasz.zadania.programistyczne.rozdzial6;

import java.time.LocalDate;

public class Procedure {
    private String nameOfProcedure;
    private LocalDate dateOfProcedure;
    private String nameOfDoctor;
    private String surnameOfDoctor;
    private double priceOfProcedure;

    /**
     * Konstruktor bezargumentowy obiektu typu Procedure
     */
    public Procedure() {

    }

    /**
     * Konstruktor obiektu typu Procedure zapisujący wartości w polach obiektu Procedure
     * @param nameOfProcedure wartość pola nameOfProcedure
     * @param dateOfProcedure wartość pola dateOfProcedure
     * @param nameOfDoctor wartość pola nameOfDoctor
     * @param surnameOfDoctor wartość pola surnameOfDoctor
     * @param priceOfProcedure wartość pola priceOfProcedure
     */
    public Procedure(String nameOfProcedure, LocalDate dateOfProcedure, String nameOfDoctor, String surnameOfDoctor,
                     double priceOfProcedure) {
        this.nameOfProcedure = nameOfProcedure;
        this.dateOfProcedure = dateOfProcedure;
        this.nameOfDoctor = nameOfDoctor;
        this.surnameOfDoctor = surnameOfDoctor;
        this.priceOfProcedure = priceOfProcedure;
    }

    //Akcesory

    /**
     * Metoda getNameOfProcedure obiektu typu Procedure zwraca wartość pola nameOfProcedure
     * @return wartość pola nameOfProcedure
     */
    public String getNameOfProcedure() {
        return nameOfProcedure;
    }

    /**
     * Metoda getDateOfProcedure obiektu typu Procedure zwraca wartość pola dateOfProcedure
     * @return wartość pola dateOfProcedure
     */
    public LocalDate getDateOfProcedure() {
        return dateOfProcedure;
    }

    /**
     * Metoda getNameOfDoctor obiektu typu Procedure zwraca wartość pola nameOfDoctor
     * @return wartość pola nameOfDoctor
     */
    public String getNameOfDoctor() {
        return nameOfDoctor;
    }

    /**
     * Metoda getSurnameOfDoctor obiektu typu Procedure zwraca wartość pola surnameOfDoctor
     * @return wartość pola surnameOfDoctor
     */
    public String getSurnameOfDoctor() {
        return surnameOfDoctor;
    }

    /**
     * Metoda getPriceOfProcedure obiektu typu Procedure zwraca wartość pola priceOfProcedure
     * @return wartość pola priceOfProcedure
     */
    public double getPriceOfProcedure() {
        return priceOfProcedure;
    }

    //Mutatory

    /**
     * Metoda setNameOfProcedure obiektu typu Procedure zapisuje wartość w polu nameOfProcedure
     * @param nameOfProcedure wartość pola nameOfProcedure
     */
    public void setNameOfProcedure(String nameOfProcedure) {
        this.nameOfProcedure = nameOfProcedure;
    }

    /**
     * Metoda setDateOfProcedure obiektu typu Procedure zapisuje wartość w polu dateOfProcedure
     * @param dateOfProcedure wartość pola dateOfProcedure
     */
    public void setDateOfProcedure(LocalDate dateOfProcedure) {
        this.dateOfProcedure = dateOfProcedure;
    }

    /**
     * Metoda setNameOfProcedure obiektu typu Procedure zapisuje wartość w polu nameOfDoctor
     * @param nameOfDoctor wartość pola nameOfDoctor
     */
    public void setNameOfDoctor(String nameOfDoctor) {
        this.nameOfDoctor = nameOfDoctor;
    }

    /**
     * Metoda setSurnameOfDoctor obiektu typu Procedure zapisuje wartość w polu surnameOfDoctor
     * @param surnameOfDoctor wartość pola surnameOfDoctor
     */
    public void setSurnameOfDoctor(String surnameOfDoctor) {
        this.surnameOfDoctor = surnameOfDoctor;
    }

    /**
     * Metoda setPriceOfProcedure obiektu typu Procedure zapisuje wartość w polu priceOfProcedure
     * @param priceOfProcedure wartość pola priceOfProcedure
     */
    public void setPriceOfProcedure(double priceOfProcedure) {
        this.priceOfProcedure = priceOfProcedure;
    }

    /**
     * Metoda displayInformationAboutProcedure wyświetla w konsoli informacje z pól obiektu typu Procedure
     * @param numberOfProcedure numer badania
     */
    public void displayInformationAboutProcedure(int numberOfProcedure) {
        System.out.println("Badanie numer " + numberOfProcedure);
        System.out.println("Nazwa: " + getNameOfProcedure());
        System.out.println("Data: " + getDateOfProcedure());
        System.out.println("Lekarz: dr " + getNameOfDoctor() + " " + getSurnameOfDoctor());
        System.out.printf("Opłata: %.2f", getPriceOfProcedure());
        System.out.println();
    }
}
