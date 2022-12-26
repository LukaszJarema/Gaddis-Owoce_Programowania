package com.jarema.lukasz.zadania.programistyczne.rozdzial7;

/**
 * Klasa Payroll.
 * Napisz klasę Payroll, w której polami są następujące tablice:
 * - employeeId. Jest to tablica zawierająca siedem liczb całkowitych będących identyfikatorami pracowników. Tę tablicę
 * należy zainicjować następującymi liczbami:
 * 5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489
 * - hours. Jest to tablica zawierająca siedem liczb całkowitych reprezentujących liczbę godzin przepracowanych przez
 * każdego pracownika.
 * - payRate. Jest to tablica obejmująca siedem wartości typu double reprezentujących stawkę godzinową każdego
 * pracownika.
 * - wages. Jest to tablica z siedmioma liczbami typu double reprezentującymi pensje brutto pracowników.
 * Ta klasa powinna łączyć dane z wszystkich tablic za pomocą indeksów. Na przykład wartość w elemencie 0 z tablicy
 * hours powinna być liczbą godzin przepracowanych przez pracownika, którego identyfikator jest zapisany w elemencie 0
 * tablicy employeeId. Pensja tego samego pracownika powinna być zapisana w elemencie 0 tablicy payRate.
 * Oprócz odpowiednich akcesorów i mutatorów klasa powinna obejmować metodę, która jako argument przyjmuje identyfikator
 * pracownika i zwraca jego wynagrodzenie brutto.
 * Przedstaw działanie tej klasy w kompletnym programie, która wyświetla numer każdego pracownika oraz prosi o
 * wprowadzenie liczby przepracowanych godzin i stawki godzinowej. Następnie program powinien wyświetlać identyfikator
 * i wynagrodzenie każdego pracownika.
 * Sprawdzanie poprawności danych wejściowych. Nie należy akceptować wartości ujemnych jako liczby przepracowanych
 * godzin i wartości mniejszych niż 13,70 jako stawki godzinowej.
 */

public class Payroll {
    private int [] employeeId = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
    private int [] hours = new int[7];
    private double [] payRate = new double[7];
    private double [] wages = new double[7];

    /**
     * Konstruktor bezargumentowy obiektu typu Payroll
     */
    public Payroll() {

    }

    //Akcesory

    /**
     * Metoda getEmployeeId obiektu typu Payroll zwraca tablicę z pola employeeId
     * @return tablica pola employeeId
     */
    public int[] getEmployeeId() {
        return employeeId;
    }

    /**
     * Przeciążona metoda getEmployeeId obiektu typu PayRoll przyjmuje jako argument liczbę całkowitą. Jeśli ta liczba
     * zawiera się w indeksie tablicy pola employeeId zwraca wartość pola z tym indeksem
     * @param num liczba całkowita służacą do wskazania numeru indeksu tablicy employeeId
     * @return indeks z tablicy employeeId
     */
    public int getEmployeeId(int num) {
        return employeeId[num];
    }

    /**
     * Metoda getHours obiektu typu Payroll zwraca tablicę z pola hours
     * @return tablica z pola hours
     */
    public int[] getHours() {
        return hours;
    }

    /**
     * Przeciążona metoda getHours obiektu typu PayRoll przyjmuje jako argument liczbę całkowitą. Jeśli ta liczba
     * zawiera się w indeksie tablicy pola hours zwraca wartość pola z tym indeksem
     * @param num liczba całkowita służąca do wskazania numeru indeksu tablicy hours
     * @return indeks z tablicy hours
     */
    public int getHours(int num) {
        return hours[num];
    }

    /**
     * Metoda getPayRate obiektu typu Payroll zwraca tablicę z pola payRate
     * @return tablica z pola payRate
     */
    private double[] getPayRate() {
        return payRate;
    }

    /**
     * Przeciążona metoda getPayRate obiektu typu PayRoll przyjmuje jako argument liczbę całkowitą. Jeśli ta liczba
     * zawiera się w indeksie tablicy pola payRate zwraca wartość pola z tym indeksem
     * @param num liczba całkowita służąca do wskazania numeru indeksu tablicy payRate
     * @return indeks z tablicy payRate
     */
    private double getPayRate(int num) {
        return payRate[num];
    }

    /**
     * Metoda getWages obiektu typu Payroll zwraca tablicę z pola wages
     * @return tablica z pola wages
     */
    public double[] getWages() {
        return wages;
    }

    /**
     * Przeciążona metoda getWages obiektu typu PayRoll przyjmuje jako argument liczbę całkowitą. Jeśli ta liczba
     * zawiera się w indeksie tablicy pola wages zwraca wartość pola z tym indeksem
     * @param num liczba całkowita służąca do wskazania numeru indeksu tablicy wages
     * @return indeks z tablicy wages
     */
    public double getWages(int num) {
        return wages[num];
    }

    //Mutatory

    /**
     * Metoda setHours obiektu typu Payroll przyjmuje jako argument tablicę liczb całkowitych i zapisuje ją w polu
     * hours
     * @param hours wartość pola hours
     */
    public void setHours(int[] hours) {
        this.hours = hours;
    }

    /**
     * Przeciążona metoda setHours obiektu typu Payroll przyjmuje jako argument numer indeksu tablicy oraz ilość godzin
     * i zapisuje ją pod wskazanym indeksem w tablicy pola hours
     * @param index numer indeksu tablicy pola hours
     * @param howManyHours wartość zapisana pod konkretnym indeksem tablicy pola hours
     */
    public void setHours(int index, int howManyHours) {
        for (int i = 0; i < employeeId.length; i++) {
            if (i == index)
                hours[i] = howManyHours;
        }
    }

    /**
     * Metoda setPayRate obiektu typu Payroll przyjmuje jako argument tablicę double i zapisuje ją w polu payRate
     * @param payRate wartość pola payRate
     */
    public void setPayRate(double[] payRate) {
        this.payRate = payRate;
    }

    /**
     * Przeciążona metoda setPayRate obiektu typu Payroll przyjmuje jako argument numer indeksu tablicy oraz ilość
     * wynagrodzenia i zapisuje ją pod wskazanym indeksem w tablicy pola payRate
     * @param index numer indeksu tablicy pola payRate
     * @param rate wartość zapisana pod konkretnym indeksem tablicy pola payRate
     */
    public void setPayRate(int index, double rate) {
        for (int i = 0; i < employeeId.length; i++) {
            if (i == index)
                payRate[i] = rate;
        }
    }

    /**
     * Metoda setWages obiektu typu Payroll przyjmuje jako argument tablicę double i zapisuje ją w polu wages
     * @param wages wartość pola wages
     */
    public void setWages(double[] wages) {
        this.wages = wages;
    }

    /**
     * Przeciążona metoda setWages obiektu typu Payroll przyjmuje jako argument numer indeksu tablicy i mnoży liczbę
     * godzin ze stawką godzinową, a następnie zapisuje wartość pod właściwym indeksem pola wages
     * @param index numer indeksu tablicy pola payRate
     */
    public void setWages(int index) {
        for (int i = 0; i < employeeId.length; i++) {
            if (i == index)
                wages[i] = hours[i] * payRate[i];
        }
    }

    /**
     * Metoda getPay obiektu typu Payroll przyjmuje jako argument liczbę całkowitą reprezentującą employeeId i zwraca
     * wartość pensji pracownika burtto
     * @param num numer employeeId
     * @return pensja pracownika brutto
     */
    public double getPay(int num) {
        int id = 0;
        for (int i = 0; i < employeeId.length; i++) {
            if (num == employeeId[i])
                id = employeeId[i];
        }
        return getWages(id);
    }

    /**
     * Metoda getArrayLength obiektu typu Payroll zwraca długość tablicy employeeId
     * @return długość tablicy employeeId
     */
    public int getArrayLength() {
        return employeeId.length;
    }
}
