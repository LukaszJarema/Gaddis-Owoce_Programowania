package com.jarema.lukasz.zadania.programistyczne.rozdzial6;

/**
 * Klasa Temperature.
 * Napisz klasę Temperature przechowującą temperaturę w stopniach Fahrenheita. Udostępnij metody pozwalające pobrać
 * temperaturę w stopniach Fahrenheita, Celsjusza i kelwinach. Ta klasa powinna zawierać następujące pole:
 * - fahrenheit. Pole typu double przechowujące temperaturę w stopniach Fahrenheita.
 * W klasie powinny się też znaleźć następujące metody:
 * - Konstruktor. Przyjmuje temperaturę w stopniach Fahrenheita (jako wartość typu double) i zapisuje ją w polu ftemp.
 * - setFahrenheit. Ta metoda przyjmuje temperaturę w stopniach Fahrenheita (jako wartość typu double) i zapisuje ją w
 * polu ftemp.
 * - getFahreheit. Zwraca wartość pola ftemp jako temperaturę w stopniach Fahrenheita (konwersja nie jest potrzebna).
 * - celsius. Zwraca wartość pola ftemp przekształconą na stopnie Celsjusza.
 * - kelvin. Zwraca wartość pola ftemp przekształconą na kelwiny.
 * Do przekształcenia temperatury w stopniach Fahrenheita na stopnie Celsjusza zastosuj następujący wzór:
 * stopnie Celsjusza = (5 / 9) * (stopnie Fahrenheita - 32)
 * Do konwersji temperatury w stopniach Fahrenheita na kelwiny wykorzystaj poniższy wzór:
 * kelwiny = ((5 / 9) x (stopnie Fahrenheita - 32) + 273)
 * Zademonstruj działanie klasy Temperature. W tym celu napisz odrębny program, który wyświetla prośbę o podanie
 * temperatury w stopniach Fahrenheita. Program powinien tworzyć instancję klasy Temperature, przekazując do konstruktora
 * wartość podaną przez użytkownika. Następnie program powinien wywołać metody obiektu w celu wyświetlenia temperatury
 * w stopniach Celsjusza i kelwinach.
 */
public class Temperature {
    private double ftemp;

    /**
     * Konstruktor obiektu typu Temperature przyjmujący wartość pola ftemp
     * @param fahrenheit wartość pola ftemp
     */
    public Temperature(double fahrenheit) {
        ftemp = fahrenheit;
    }

    /**
     * Konstruktor bezargumentowy obiektu typu Temperature
     */
    public Temperature() {

    }

    //Mutator

    /**
     * Metoda setFahrenheit zapisuje wartość w polu ftemp obiektu typu Temperature
     * @param fahrenheit wartość pola ftemp
     */
    public void setFtemp(double fahrenheit) {
        ftemp = fahrenheit;
    }

    //Akcesor

    /**
     * Metoda getFtemp zwraca wartośc pola ftemp obiektu typu Temperature
     * @return wartość pola ftemp
     */
    public double getFtemp() {
        return ftemp;
    }

    /**
     * Metoda celsius przyjmuje wartość pola ftemp obiektu typu Temperature i zwraca wartość stopni w Celsjuszach
     * @param ftemp wartość pola ftemp
     * @return wartość stopni w Celsjuszach
     */
    public double celsius(double ftemp) {
        double celsius = (5.0 / 9.0) * (ftemp - 32);
        return celsius;
    }

    /**
     * Metoda kelvin przyjmuje wartość pola ftemp obiektu typu Temperature i zwraca wartość stopni w Kelvinach
     * @param ftemp wartość pola ftemp
     * @return wartość stopni kelvina
     */
    public double kelvin(double ftemp) {
        double kelvin = ((5.0 / 9.0) * (ftemp - 32) + 273);
        return kelvin;
    }
}
