package com.jarema.lukasz.zadania.programistyczne.rozdzial7;

/**
 * Książka telefoniczna w obiekcie typu ArrayList
 * Napisz klasę PhoneBookEntry z polami zawierającymi nazwisko i numer telefonu. Ta klasa powinna mieć konstruktor oraz
 * odpowiednie akcesory i mutatory. Następnie napisz program, który tworzy przynajmniej pięć obiektów typu
 * PhoneBookEntry i zapisuje je w obiekcie typu ArrayList. Posłuż się pętlą do wyświetlania zawartości każdego z tych
 * obiektów z obektu typu ArrayList.
 */

public class PhoneBookEntry {
    private String surname;
    private int telephoneNumber;

    /**
     * Konstruktor bezargumentowy obiektu typu PhoneBookEntry
     */
    public PhoneBookEntry() {

    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
}
