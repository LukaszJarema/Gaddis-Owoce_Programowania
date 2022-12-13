package com.jarema.lukasz.zadania.programistyczne.rozdzial6;

/**
 * Klasa Car.
 * Napisz klasę Car (samochód) zawierającą następujące pola:
 * - yearModel. Jest to pole typu int przechowujące rocznik samochodu.
 * - make. To pole wskazuje obiekt typu String przechowujący markę samochodu.
 * - speed. Jest to pole typu int zawierające aktualną szybkość samochodu.
 * Oprócz tego klasa powinna obejmować następujący konstruktor i inne metody:
 * - Konstruktor. Powinien przyjmować jako argumenty rocznik i markę samochodu. Te wartości należy przypisać do pól
 * yearModel i make obiektu. Ten konstruktor powinien przypisywać wartość 0 do pola speed.
 * - Akcesory. Odpowiednie akcesory powinny pobierać wartości zapisane w polach yearModel, make i speed.
 * - accelerate. Ta metoda powinna dodawać w każdym swoim wywołaniu 5 do wartości pola speed.
 * - brake. Ta metoda powinna odejmować w każdym swoim wywołaniu 5 od wartości pola speed.
 * Zademonstruj działanie tej klasy w programie, który tworzy obiekt typu Car, a następnie pięciokrotnie wywołuje metodę
 * accelerate. Po każdym wywołaniu tej metody program ma pobrać aktualną szybkość samochodu i ją wyświetlić. Następnie
 * program ma wywołać pięciokrotnie metodę brake, pobrać aktualną szybkość samochodu i ją wyświetlić.
 */
public class Car {
    private int yearModel;
    private String make;
    private int speed;

    /**
     * Konstruktor klasy Car
     * @param carYearModel przyjmuje wartość typu int i przypisuje do pola yearModel
     * @param carMake przyjmuje wartość typu String i przypisuje do pola make.
     */
    public Car(int carYearModel, String carMake) {
        yearModel = carYearModel;
        carMake = make;
        speed = 0;
    }

    //Akcesory

    /**
     * Metoda getYearModel zwraca wartość pola yearModel obiektu typu Car
     * @return wartość pola yearModel
     */
    public int getYearModel() {
        return yearModel;
    }

    /**
     * Metoda getMake zwraca wartość pola make obiektu typu Car
     * @return wartość pola make
     */
    public String getMake() {
        return make;
    }

    /**
     * Metoda getSpeed zwraca wartość pola speed obiektu typu Car
     * @return wartość pola speed
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Metoda accelerate dodaje do wartości pola speed 5
     * @return wartość pola speed + 5
     */
    public int accelerate() {
        speed += 5;
        return speed;
    }

    /**
     * Metoda brake odejmuje od wartości pola speed 5
     * @return wartość pola speed - 5
     */
    public int brake() {
        speed -= 5;
        return speed;
    }
}
