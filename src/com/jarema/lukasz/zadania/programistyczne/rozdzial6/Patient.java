package com.jarema.lukasz.zadania.programistyczne.rozdzial6;

/**
 * Napisz klasę Patient zawierającą pola z następującymi danymi:
 * - pierwszym imieniem, drugim imieniem i nazwiskiem.
 * - adresem ulicy, miastem i kodem pocztowym.
 * - numerem telefonu.
 * - imieniem i nazwiskiem oraz numerem telefonu osoby kontaktowej.
 * Klasa Patient powinna zawierać konstruktor, a także akcesor i mutator dla każdego pola.
 * Następnie napisz klasę o nazwie Procedure, która reprezentuje badanie wykonane na pacjencie. Klasa Procedure powinna
 * obejmować pola z następującymi danymi:
 * - nazwą badania.
 * - datą badania.
 * - imieniem i nazwiskiem osoby, która przeprowadziła badanie.
 * - opłatą za badanie.
 * Klasa Procedure powinna zawierać konstruktor, a także akcesor i mutator do każdego pola.
 * Następnie napisz program, który tworzy instancję klasy Patient inicjowaną przykładowymi danymi. Potem utwórz trzy
 * instancje klasy Procdure inicjowane następującymi danymi:
 * Badanie numer 1
 * Nazwa: badanie fizykalne
 * Data: dzisiejsza data
 * Lekarz: dr Iwicki
 * Opłata: 250,00 złotych.
 * Badanie numer 2
 * Nazwa: zdjęcie rentgenowskie
 * Data: dzisiejsza data
 * Lekarz: dr Jaracz
 * Opłata: 500,00 złotych.
 * Badanie numer 3
 * Nazwa: badanie krwi
 * Data: dzisiejsza data
 * Lekarz: dr Szymczak
 * Opłata: 200,00 złotych
 * Program powinien wyświetlać informacje o pacjencie, o wszystkich trzech badaniach, a także o łącznej cenie za
 * wszystkie trzy badania.
 */
public class Patient {
    private String firstName;
    private String middleName;
    private String surname;
    private String address;
    private String city;
    private String postCode;
    private int telephoneNumber;
    private String nameOfContactPerson;
    private String surnameOfContactPerson;
    private int telephoneNumberOfContactPerson;

    /**
     * Konstruktor obiektu typu Patient
     * @param firstName wartość pola firstName
     * @param middleName wartość pola middleName
     * @param surname wartość pola surname
     * @param address wartość pola address
     * @param city wartość pola city
     * @param postCode wartość pola postCode
     * @param telephoneNumber wartość pola telephoneNumber
     * @param nameOfContactPerson wartość pola nameOfContactPerson
     * @param surnameOfContactPerson wartość pola surnameOfContactPerson
     * @param telephoneNumberOfContactPerson wartość pola telephoneNumberOfContactPerson
     */
    public Patient(String firstName, String middleName, String surname, String address, String city, String postCode,
                   int telephoneNumber, String nameOfContactPerson, String surnameOfContactPerson,
                   int telephoneNumberOfContactPerson) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.surname = surname;
        this.address = address;
        this.city = city;
        this.postCode = postCode;
        this.telephoneNumber = telephoneNumber;
        this.nameOfContactPerson = nameOfContactPerson;
        this.surnameOfContactPerson = surnameOfContactPerson;
        this.telephoneNumberOfContactPerson = telephoneNumberOfContactPerson;
    }

    /**
     * Konstruktor bezargumentowy obiektu typu Patient
     */
    public Patient() {

    }

    //Akcesory

    /**
     * Metoda getFirstName obiektu typu Patient zwraca wartość pola firstName
     * @return wartość pola firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Metoda getMiddleName obiektu typu Patient zwraca wartość pola middleName
     * @return wartość pola middleName
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Metoda getSurname obiektu typu Patient zwraca wartość pola surname
     * @return wartość pola surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Metoda getAddress obiektu typu Patient zwraca wartość pola address
     * @return wartość pola address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Metoda getCity obiektu typu Patient zwraca wartość pola city
     * @return wartość pola city
     */
    public String getCity() {
        return city;
    }

    /**
     * Metoda getPostalCode obiektu typu Patient zwraca wartość pola postalCode
     * @return wartość pola postalCode
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * Metoda getTelephoneNumber obiektu typu Patient zwraca wartość pola telephoneNumber
     * @return wartość pola telephoneNumber
     */
    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    /**
     * Metoda getNameOfContactPerson obiektu typu Patient zwraca wartość pola nameOfContactPerson
     * @return wartość pola nameOfContactPerson
     */
    public String getNameOfContactPerson() {
        return nameOfContactPerson;
    }

    /**
     * Metoda getSurnameOfContactPerson obiektu typu Patient zwraca wartość pola surnameOfContactPerson
     * @return wartość pola surnameOfContactPerson
     */
    public String getSurnameOfContactPerson() {
        return surnameOfContactPerson;
    }

    /**
     * Metoda getTelephoneNumberOfContactPerson obiektu typu Patient zwraca wartość pola telephoneNumberOfContactPerson
     * @return wartość pola telephoneNumberOfContactPerson
     */
    public int getTelephoneNumberOfContactPerson() {
        return telephoneNumberOfContactPerson;
    }

    //Mutatory

    /**
     * Metoda setFirstName obiektu typu Patient zapisuje wartość w polu firstName
     * @param firstName wartość pola firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Metoda setMiddleName obiektu typu Patient zapisuje wartość w polu middleName
     * @param middleName wartość pola middleName
     */
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * Metoda setSurnam obiektu typu Patient zapisuje wartość w polu surname
     * @param surname wartość pola surname
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Metoda setAddress obiektu typu Patient zapisuje wartość w polu address
     * @param address wartość pola address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Metoda setCity obiektu typu Patient zapisuje wartość w polu city
     * @param city wartość pola city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Metoda setPostalCode obiektu typu Patient zapisuje wartość w polu postalCode
     * @param postCode wartość pola postCode
     */
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    /**
     * Metoda setTelephoneNumber obiektu typu Patient zapisuje wartość w polu telephoneNumber
     * @param telephoneNumber wartość pola telephoneNumber
     */
    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    /**
     * Metoda setNameOfContactPerson obiektu typu Patient zapisuje wartość w polu nameOfContactPerson
     * @param nameOfContactPerson wartość pola nameOfContactPerson
     */
    public void setNameOfContactPerson(String nameOfContactPerson) {
        this.nameOfContactPerson = nameOfContactPerson;
    }

    /**
     * Metoda setSurnameOfContactPerson obiektu typu Patient zapisuje wartość w polu surnameOfContactPerson
     * @param surnameOfContactPerson wartość pola surnamOfContactPerson
     */
    public void setSurnameOfContactPerson(String surnameOfContactPerson) {
        this.surnameOfContactPerson = surnameOfContactPerson;
    }

    /**
     * Metoda setTelephoneNumberOfContactPerson obiektu typu Patient zapisuje wartość w polu
     * telephoneNumberOfContactPerson
     * @param telephoneNumberOfContactPerson wartość pola telephoneNumberOfContactPerson
     */
    public void setTelephoneNumberOfContactPerson(int telephoneNumberOfContactPerson) {
        this.telephoneNumberOfContactPerson = telephoneNumberOfContactPerson;
    }

    /**
     * Metoda displayPatientInfo obiektu typu Patient wyświetla na konsoli wszystkie informacje z pól obiektu Patient
     */
    public void displayPatientInfo() {
        System.out.println("Dane pacjenta:");
        System.out.println("Imię: " + getFirstName());
        System.out.println("Drugie imię: " + getMiddleName());
        System.out.println("Nazwisko: " + getSurname());
        System.out.println("Adres: " + getAddress());
        System.out.println("Miasto: " + getCity());
        System.out.println("Kod pocztowy: " + getPostCode());
        System.out.println("Numer telefonu: " + getTelephoneNumber() + "\n");
        System.out.println("Osoba kontaktowa:");
        System.out.println("Imię: " + getNameOfContactPerson());
        System.out.println("Nazwisko: " + getSurnameOfContactPerson());
        System.out.println("Telefon: " + getTelephoneNumberOfContactPerson());
    }
}
