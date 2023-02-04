package com.jarema.lukasz.zadania.programistyczne.rozdzial10;

public class Customer extends Person {
    private int customerId;
    private boolean emailList;

    /**
     * Konstruktor bezargumentowy obiektu typu Customer
     */
    public Customer() {

    }

    /**
     * Konstruktor obiektu typu Customer przyjmujący jako argumenty wartość pól surname, address, telephoneNumber,
     * customerId, emailList
     * @param surname wartość pola surname
     * @param address wartość pola address
     * @param telephoneNumber wartość pola telephoneNumber
     * @param customerId wartość pola customerId
     * @param emailList wartość pola emailList
     */
    public Customer(String surname, String address, int telephoneNumber, int customerId, boolean emailList) {
        super(surname, address, telephoneNumber);
        this.customerId = customerId;
        this.emailList = emailList;
    }

    //Akcesory
    public int getCustomerId() {
        return customerId;
    }

    public boolean isEmailList() {
        return emailList;
    }

    //Mutatory
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setEmailList(boolean emailList) {
        this.emailList = emailList;
    }

    /**
     * Metoda toString zwraca informacje o kliencie
     * @return informacje o kliencie
     */
    public String toString() {
        return "Klient:\nNazwisko: " + getSurname() + "\nAdres: " + getAddress() + "\nNumer telefonu: " +
                getTelephoneNumber() + "\nNumer ID: " + customerId + "\nCzy klient znajduje się na liście mailowej: " +
                emailList;
    }
}
