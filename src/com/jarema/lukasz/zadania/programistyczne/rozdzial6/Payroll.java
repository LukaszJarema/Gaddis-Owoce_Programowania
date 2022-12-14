package com.jarema.lukasz.zadania.programistyczne.rozdzial6;

/**
 * Klasa Payroll.
 * Zaprojektuj klasę Payroll obejmującą pola z imieniem i nazwiskiem pracownika, jego identyfikatorem, stawką godzinową
 * i liczbą przepracowanych godzin. Napisz odpowiednie akcesory i mutatory, a także konstruktor przyjmujący jako
 * argumenty imię i nazwisko pracownika oraz jego identyfikator. Ta klasa powinna też mieć metodę zwracającą
 * wynagrodzenie brutto, obliczane w wyniku pomnożenia liczby przepracowanych godzin przez stawkę godzinową. Napisz
 * program, który ilustruje działanie tej klasy. Program powinien tworzyć obiekt typu Payroll, wyświetlać prośbę o
 * wprowadzenie danych pracownika i wyświetlać pensję brutto.
 */
public class Payroll {
    private String name;
    private String surname;
    private int idNumber;
    private double hourlyRate;
    private int hoursWorked;

    /**
     * Konstruktor Payroll przyjmuje wartości i zapisuje je w polach klasy Payroll
     * @param employeeName wartość pola name
     * @param employeeSurname wartość pola surname
     * @param employeeIdNumber wartość pola idNumber
     */
    public Payroll(String employeeName, String employeeSurname, int employeeIdNumber) {
        name = employeeName;
        surname = employeeSurname;
        idNumber = employeeIdNumber;
    }

    //Akcesory

    /**
     * Metoda getName zwraca wartość pola name obiektu Payroll
     * @return wartość pola name
     */
    public String getName() {
        return name;
    }

    /**
     * Metoda getSurname zwraca wartość pola surname obiektu Payroll
     * @return wartość pola surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Metoda getIdNumber zwraca wartość pola idNumer obiektu Payroll
     * @return wartość pola idNumber
     */
    public int getIdNumber() {
        return idNumber;
    }

    /**
     * Metoda getHourlyRate zwraca wartość pola hourlyRate obiektu Payroll
     * @return wartość pola hourlyRate
     */
    public double getHourlyRate() {
        return hourlyRate;
    }

    /**
     * Metoda getHoursWorked zwraca wartość pola hoursWorked obiektu Payroll
     * @return wartość pola hoursWorked
     */
    public int getHoursWorked() {
        return hoursWorked;
    }

    //Mutatory

    /**
     * Metoda setName zapisuje wartość w polu name obiektu Payroll
     * @param payrollName wartość pola name
     */
    public void setName(String payrollName) {
        name = payrollName;
    }

    /**
     * Metoda setSurname zapisuje wartość w polu surname obiektu Payroll
     * @param payrollSurname wartość pola surname
     */
    public void setSurname(String payrollSurname) {
        surname = payrollSurname;
    }

    /**
     * Metoda setIdNumber zapisuje wartość w polu idNumber obiektu Payroll
     * @param payrollIdNumber wartość pola idNumber
     */
    public void setIdNumber(int payrollIdNumber) {
        idNumber = payrollIdNumber;
    }

    /**
     * Metoda setHourlyRate zapisuje wartość w polu hourlyRate obiektu Payroll
     * @param payrollHourlyRate wartość pola hourlyRate
     */
    public void setHourlyRate(double payrollHourlyRate) {
        hourlyRate = payrollHourlyRate;
    }

    /**
     * Metoda setHoursWorked zapisuje wartość w polu hoursWorked obiektu Payroll
     * @param payrollHoursWorked wartość pola hoursWorked
     */
    public void setHoursWorked(int payrollHoursWorked) {
        hoursWorked = payrollHoursWorked;
    }

    /**
     * Metoda salary przyjmuje stawkę godzinową oraz ilośc przepracowanych godzin
     * @param rate stawka godzinowa
     * @param hours przepracowane godziny
     * @return pensja brutto
     */
    public double salary(double rate, int hours) {
        return rate * hours;
    }
}
