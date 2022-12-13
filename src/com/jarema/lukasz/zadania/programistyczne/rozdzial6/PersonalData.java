package com.jarema.lukasz.zadania.programistyczne.rozdzial6;

/**
 * Klasa z danymi osobowymi.
 * Zaprojektuj klasę, która przechowuje następujące dane osobowe: imię i nazwisko, adres, wiek i numer telefonu. Napisz
 * odpowiednie akcesory i mutatory. Zademonstruj działanie tej klasy. W tym celu napisz program, który tworzy trzy jej
 * instancje. Jedna powinna przechowywać informacje na Twój temat, dwie pozostałe - na temat Twoich znajomych lub
 * członków rodziny.
 */
public class PersonalData {
    private String name;
    private String surname;
    private String address;
    private int age;
    private int telephoneNumber;

    /**
     * Konstruktor obiektu klasy PersonalData
     * @param personName wartość typu String pola name
     * @param personSurname wartość typu String pola surname
     * @param personAddress wartość typu String pola address
     * @param personAge wartość typu int pola age
     * @param personTelephoneNumber wartość typu int pola telephoneNumber
     */
    public PersonalData(String personName, String personSurname, String personAddress, int personAge,
                        int personTelephoneNumber) {
        name = personName;
        surname = personSurname;
        address = personAddress;
        age = personAge;
        telephoneNumber = personTelephoneNumber;
    }

    //Akcesory

    /**
     * Metoda getPersonalName zwraca wartość pola name obiektu PersonalData
     * @return wartość pola name
     */
    public String getPersonalName() {
        return name;
    }

    /**
     * Metoda getPersonalSurname zwraca wartość pola surname obiektu PersonalData
     * @return wartość pola surname
     */
    public String getPersonalSurname() {
        return surname;
    }

    /**
     * Metoda getPersonalAddress zwraca wartość pola address obiektu PersonalData
     * @return wartość pola address
     */
    public String getPersonalAddress() {
        return address;
    }

    /**
     * Metoda getPersonalAge zwraca wartość pola age obiektu PersonalData
     * @return wartość pola age
     */
    public int getPersonalAge() {
        return age;
    }


    /**
     * Metoda getPersonalTelephoneNumber zwraca wartość pola telephoneNumber obiektu PersonalData
     * @return wartość pola telephoneNumber
     */
    public int getPersonalTelehoneNumber() {
        return telephoneNumber;
    }

    //Mutatory

    /**
     * Metoda setPersonalName zapisuje wartość w polu name
     * @param personalName wartość pola name
     */
    public void setPersonalName(String personalName) {
        name = personalName;
    }

    /**
     * Metoda setPersonalSurname zapisuje wartość w polu surname
     * @param personalSurname wartość pola surname
     */
    public void setPersonalSurname(String personalSurname) {
        surname = personalSurname;
    }

    /**
     * Metoda setPersonalAddress zapisuje wartość w polu address
     * @param personalAddress wartość pola address
     */
    public void setPersonalAddress(String personalAddress) {
        address = personalAddress;
    }

    /**
     * Metoda setPersonalAge zapisuje wartośc w polu age
     * @param personalAge wartość pola age
     */
    public void setPersonalAge(int personalAge) {
        age = personalAge;
    }

    /**
     * Metoda setPersonalTelephoneNumber zapisuje wartość w polu telephoneNumber
     * @param personalTelephoneNumber wartość pola telephoneNumber
     */
    public void setPersonalTelephoneNumber(int personalTelephoneNumber) {
        telephoneNumber = personalTelephoneNumber;
    }

    /**
     * Metoda displayPersonalData wyświetla w konsoli informacje o utworzonym obiekcie typu PersonalData
     */
    public void displayPersonalData(){
        System.out.println("Dane osoby:\nImię: " + getPersonalName() + "\nNazwisko: " + getPersonalSurname()
        + "\nAdres: " + getPersonalAddress() + "\nWiek: " + getPersonalAge() + "\nNumer telefonu: "
                + getPersonalTelehoneNumber());
    }
}
