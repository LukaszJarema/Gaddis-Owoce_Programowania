package com.jarema.lukasz.zadania.programistyczne.rozdzial6;

/**
 * Napisz klasę Employee (pracownik) zawierającą następujące pola:
 * - name. To pole wskazuje obiekt typu String przechowujący imię i nazwisko pracownika.
 * - idNumber. Jest to zmienna typu int przechowująca identyfikator pracownika.
 * - department. To pole wskazuje obiekt typu String zawierający nazwę działu, w którym dana osoba pracuje.
 * - position. To pole wskazuje obiekt typu String zawierający nazwę stanowiska zajmowanego przez pracownika.
 * W tej klasie należy udostępnić następujące konstruktory:
 * - Konstruktor przyjmujący jako argumenty wymienione dalej wartości i przypisujący je do odpowiednich pól: imię i
 * nazwisko, identyfikator, dział i stanowisko pracownika.
 * - Konstruktor przyjmujący jako argumenty wymienione dalej wartości i przypisujący je do odpowiednich pól: imię i
 * nazwisko oraz identyfikator pracownika. Do pól department i position należy przypisać pusty łańcuch znaków ("").
 * - Konstruktor bezargumentowy przypisujący puste łańcuchy znaków ("") do pól name, department i position oraz 0 do
 * pola idNumber.
 * Napisz odpowiednie mutatory do zapisywania wartości w polach i akcesory zwracające wartości pól. Po utworzeniu klasy
 * napisz odrębny program tworzący trzy obiekty typu Employee zawierające następujące dane:
 * Imię i nazwisko      Identyfikator       Dział           Stanowisko
 * Sara Magura          47899               Rachunkowość    Wiceprezes
 * Marek Janczyk        39119               Informatyka     Programista
 * Julia Rak            81774               Produkcja       Inżynier
 * Program powinien zpisywać te dane w trzech obiektach, a następnie wyświetlać na ekranie informacje o każdym
 * pracowniku.
 */
public class Employee {
    private String name;
    private int idNumber;
    private String department;
    private String position;

    //Konstruktory

    /**
     * Konstruktor
     * @param n name
     * @param id idNumber
     * @param d department
     * @param p position
     */
    public Employee(String n, int id, String d, String p) {
        name = n;
        idNumber = id;
        department = d;
        position = p;
    }

    /**
     * Ten konstruktor przypisuje puste wartości do pól department oraz position
     * @param n name
     * @param id idNumber
     */
    public Employee(String n, int id) {
        name = n;
        idNumber = id;
        department = "";
        position = "";
    }

    /**
     * Konstruktor bezargumentowy przyjmujący domyślne wartości do pól
     */
    public Employee() {
        name = "";
        idNumber = 0;
        department = "";
        position = "";
    }

    //Akcesory
    /**
     * Metoda getName zwraca nazwę pracownika obiektu Employee
     * @return zwraca wartość pola name
     */
    public String getName() {
        return name;
    }

    /**
     * Metoda getIdNumber zwraca numer id pracownika obiektu Employee
     * @return zwraca wartość pola idNumber
     */
    public int getIdNumber() {
        return idNumber;
    }

    /**
     * Metoda getDepartment zwraca nazwę działu pracownika obiektu Employee
     * @return zwraca wartość pola department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Metoda getPosition zwraca nazwę pozycji pracownika obiektu Employee
     * @return zwraca wartość pola position
     */
    public String getPosition() {
        return position;
    }

    //Mutatory
    /**
     * Metoda setName zapisuje wartość w polu name
     * @param n wartość pola name
     */
    public void setName(String n) {
        name = n;
    }

    /**
     * Metoda setIdNumber zapisuje wartość w polu idNumber
     * @param id wartość pola idNumber
     */
    public void setIdNumber(int id) {
        idNumber = id;
    }

    /**
     * Metoda setDepartment zapisuje wartość w polu department
     * @param d wartość pola department
     */
    public void setDepartment(String d) {
        department = d;
    }

    /**
     * Metoda setPosition zapisuje wartość w polu position
     * @param p wartość pola position
     */
    public void setPosition(String p) {
        position = p;
    }
}
