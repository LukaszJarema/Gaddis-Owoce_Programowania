package com.jarema.lukasz.zadania.programistyczne.rozdzial10;

import java.time.LocalDate;

/**
 * Klasy Employee i ProductionWorker.
 * Zaprojektuj klasę Employee (pracownik). Pola tej klasy powinny zawierać następujące informacje:
 * - nazwisko pracownika,
 * - numer pracownika w formacie XXX-L, gdzie XXX to cyfry z przedziału od 0 do 9, a L to litera z zakresu od A do M,
 * - datę zatrudnienia.
 * Napisz jeden lub kilka konstruktorów oraz odpowiednie akcesory i mutatory dla tej klasy.
 * Następnie napisz klasę ProductionWorker (pracownik działu produkcji) podchodną od klasy Employee. Klasa
 * ProductionWorker powinna obejmować pola z następującymi danymi:
 * - zmianą (typu int),
 * - stawką godzinową (typu double).
 * Dzień roboczy jest podzielony na dwie zmiany - dzienną i nocną. Pole ze zmianą ma zawierać liczbę całkowitą
 * reprezentującą zmianę, na której dana osoba pracuje. Zmiana dzienna to 1, a zmiana nocna to 2. Napisz jeden lub kilka
 * konstruktorów oraz odpowiedni akcesory i mutatory dla tej klasy. Zademonstruj działanie obu klas, pisząc program
 * używający obiektu typu ProductionWorker.
 */

public class Employee {
    private String surname;
    private String id;
    private LocalDate dateOfRecruitment;

    /**
     * Konstruktor bezargumentowy obiektu typu Employee
     */
    public Employee() {

    }

    /**
     * Konstruktor obiektu typu Employee przyjmujący jako argumenty wartości pól surname, id oraz dateOfRecruitment
     * @param surname wartość pola surname
     * @param id wartość pola id
     * @param dateOfRecruitment wartość pola dateOfRecruitment
     */
    public Employee(String surname, String id, LocalDate dateOfRecruitment) {
        this.surname = surname;
        this.id = id;
        this.dateOfRecruitment = dateOfRecruitment;
    }

    //Akcesory
    public String getSurname() {
        return surname;
    }

    public String getId() {
        return id;
    }

    public LocalDate getDateOfRecruitment() {
        return dateOfRecruitment;
    }

    //Mutatory
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDateOfRecruitment(LocalDate dateOfRecruitment) {
        this.dateOfRecruitment = dateOfRecruitment;
    }

    public String toString() {
        return "Nazwisko: " + surname + "\nNumer ID: " + id + "\nData zatrudnienia: " + dateOfRecruitment;
    }
}
