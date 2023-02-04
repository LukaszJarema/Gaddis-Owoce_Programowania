package com.jarema.lukasz.zadania.programistyczne.rozdzial10;

/**
 * Klasy Person i Customer.
 * Zaprojektuj klasę Person zawierającą pola do przechowywania nazwiska, adresu i numeru telefonu danej osoby. Napisz
 * jeden lub kilka konstruktorów oraz odpowiednie mutatory i akcesory dla pól klasy.
 * Następnie zaprojektuj klasę Customer, pochodną od klasy Person. Klasa Customer powinna zawierać pole na numer klienta
 * i pole logiczne z informacją, czy klient chce znajdować się na liście mailingowej. Napisz jeden lub kilka
 * konstruktorów oraz odpowiednie mutatory i akcesory dla pól klasy. Zademonstruj działanie obiektu typu Customer w
 * prostym programie.
 */

public class Person {
    private String surname;
    private String address;
    private int telephoneNumber;

    /**
     * Konstruktor bezargumentowy obiektu typu Person
     */
    public Person() {

    }

    /**
     * Konstruktor obiektu typu Person przyjmujący jako argumenty wartość pól surname, address, telephoneNumber
     * @param surname wartość pola surname
     * @param address wartość pola address
     * @param telephoneNumber wartość pola telephoneNumber
     */
    public Person(String surname, String address, int telephoneNumber) {
        this.surname = surname;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
    }

    //Akcesory
    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    //Mutatory
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
}
