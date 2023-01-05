package com.jarema.lukasz.zadania.programistyczne.rozdzial8;

/**
 * Symulator mandatów.
 * W tym ćwiczeniu zaprojektujesz zestaw klas, które współdziałają ze sobą, aby symulować pracę kontrolera
 * wystawiającego mandaty. Powinieneś zaprojektować następujące klasy:
 * - ParkedCar. Ta klsa powinna symulować zaparkowany samochód. Oto jej zadania:
 *  - znajomość marki, modelu, koloru i numeru rejestracyjnego samochodu oraz liczby minut, przez jakie pojazd stoi
 *  zaparkowany.
 * - ParkingMeter. Ta klasa powinna symulować parkometr. Oto jej jedyne zadanie:
 *  - znajomośc liczby wykupionych minut parkowania.
 * - ParkingTicket. Ta klasa powinna symulować bilet parkingowy. Zadania tej klasy to:
 *  - informowanie o marce, modelu, kolorze i numerze rejestracyjnym źle zaparkowanego samochodu;
 *  - informowanie o wysokości mandatu; wynosi ona 50zł za pierwszą godzinę nielegalnego parkowania plus 20zł za każdą
 *  następną godzinę;
 *  - informowanie o nazwisku i numerze identyfikatora kontrolera, który wystawił mandat.
 * - PoliceOfficer. Ta klasa powinna symulować kontrolera sprawdzającego zaparkowane samochody. Oto zadania tej klasy:
 *  - znajomość nazwiska i numeru identyfikatora kontrolera;
 *  - sprawdzanie obiektów ParkedCar i ParkingMeter oraz ustalenie, czy wykupiony czas parkowania już upłynął;
 *  - wystawianie mandatu za nieprawidłowe parkowanie (generowanie obiektu typu ParkingTicket), jeśli upłynął wykupiony
 *  czas parkowania.
 * Napisz program ilustrujący działanie tych klas.
 */

public class ParkedCar {
    private String brand;
    private String model;
    private String color;
    private int parkedMinutes;

    /**
     * Konstruktor bezargumentowy obiektu typu ParkedCar
     */
    public ParkedCar() {

    }

    /**
     * Konstruktor obiektu typu ParkedCar przyjmujący jako argumenty markę, model, kolor i ilość minut od kiedy samochód
     * stoi zaparkowany
     * @param brand wartość pola brand
     * @param model wartość pola model
     * @param color wartość pola color
     * @param parkedMinutes wartość pola parkedMinutes
     */
    public ParkedCar(String brand, String model, String color, int parkedMinutes) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.parkedMinutes = parkedMinutes;
    }

    /**
     * Konstruktor kopiujący obiekt typu ParkedCar
     * @param parkedCar obiekt typu ParkedCar
     */
    public ParkedCar(ParkedCar parkedCar) {
        brand = parkedCar.brand;
        model = parkedCar.model;
        color = parkedCar.color;
        parkedMinutes = parkedCar.parkedMinutes;
    }

    //Akcesory

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getParkedMinutes() {
        return parkedMinutes;
    }

    //Mutatory


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setParkedMinutes(int parkedMinutes) {
        this.parkedMinutes = parkedMinutes;
    }

    /**
     * Metoda toString obiektu typu ParkedCar zwraca ciąg tekstu o zaparkowanym samochodzie
     * @return
     */
    @Override
    public String toString() {
        return "Marka: " + brand + "\nModel: " + model + "\nKolor: " + color + "\nIlość minut od zaparkowania: " +
        parkedMinutes;
    }
}
