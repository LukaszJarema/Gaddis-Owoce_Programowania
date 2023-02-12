package com.jarema.lukasz.zadania.programistyczne.rozdzial11;

/**
 * Wyjątki dla klasy Payroll.
 * Klasa Payroll oblicza pensję pracowników. Napisz klasy wyjątków dotyczące następujących błędów:
 * - Jako nazwisko pracownika przekazany został pusty ciąg znaków.
 * - Jako identyfikator pracownika podana została błędna wartość. Jeśli zaimplementowałeś pole z identyfikatorem jako
 * łańcuch znaków, jako nieprawidłowy należy traktować pusty ciąg znaków. Jeśli zaś zaimplementowałeś to pole jako
 * zmienną liczbową, jako błędne należy traktować liczbę ujemną lub 0.
 * - Podana została błędna liczba przepracowanych godzin (ujemna lub większa niż 84).
 * - Podana została błędna stawka godzinowa (ujemna lub większa od 25).
 * Zmodyfikuj klasę Payroll, aby zgłaszała odpowiedni wyjątek w reakcji na którykolwiek z tych błędów. Zilustruj
 * działanie klas wyjątków w programie.
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
    public Payroll(String employeeName, String employeeSurname, int employeeIdNumber) throws InvalidSurname,
            InvalidIdNumber {
        name = employeeName;
        surname = employeeSurname;
        idNumber = employeeIdNumber;
        if (surname.equals(""))
            throw new InvalidSurname(surname);
        if (idNumber <= 0)
            throw new InvalidIdNumber(idNumber);
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
    public void setSurname(String payrollSurname) throws InvalidSurname {
        surname = payrollSurname;
        if (surname.equals(""))
            throw new InvalidSurname(surname);
    }

    /**
     * Metoda setIdNumber zapisuje wartość w polu idNumber obiektu Payroll
     * @param payrollIdNumber wartość pola idNumber
     */
    public void setIdNumber(int payrollIdNumber) throws InvalidIdNumber {
        idNumber = payrollIdNumber;
        if (idNumber <= 0)
            throw new InvalidIdNumber(idNumber);
    }

    /**
     * Metoda setHourlyRate zapisuje wartość w polu hourlyRate obiektu Payroll
     * @param payrollHourlyRate wartość pola hourlyRate
     */
    public void setHourlyRate(double payrollHourlyRate) throws InvalidHourlyRate {
        hourlyRate = payrollHourlyRate;
        if (hourlyRate < 0 || hourlyRate > 25)
            throw new InvalidHourlyRate(hourlyRate);
    }

    /**
     * Metoda setHoursWorked zapisuje wartość w polu hoursWorked obiektu Payroll
     * @param payrollHoursWorked wartość pola hoursWorked
     */
    public void setHoursWorked(int payrollHoursWorked) throws InvalidHoursWorked {
        hoursWorked = payrollHoursWorked;
        if (hoursWorked < 0 || hoursWorked > 84)
            throw new InvalidHoursWorked(hoursWorked);
    }

    /**
     * Metoda salary przyjmuje stawkę godzinową oraz ilośc przepracowanych godzin
     * @param rate stawka godzinowa
     * @param hours przepracowane godziny
     * @return pensja brutto
     */
    public double salary(double rate, int hours) throws InvalidHourlyRate, InvalidHoursWorked {
        if (rate < 0 || rate > 25)
            throw new InvalidHourlyRate(hourlyRate);
        else if (hours < 0 || hours > 84) {
            throw new InvalidHoursWorked(hoursWorked);
        } else
            return rate * hours;
    }
}
