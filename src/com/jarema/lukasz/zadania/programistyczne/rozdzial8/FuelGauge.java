package com.jarema.lukasz.zadania.programistyczne.rozdzial8;

/**
 * Symulator wskaźników w samochodzie.
 * W tym ćwiczeniu zaprojektujesz zestaw klas, które współdziałają w celu symulowania wskaźnika poziomu paliwa i
 * licznika przejechanych kilometrów w samochodzie. Oto klasy, które należy zaprojektować:
 * - FuelGauge. Ta klasa ma symulować wskaźnik poziomu paliwa. Oto jej zadania:
 *  - znajomość aktualnej ilości paliwa w samochodzie (w litrach);
 *  - informowanie o aktualnej ilości paliwa w samochodzie (w litrach);
 *  - umożliwianie zwiększenia ilości paliwa o 1 litr (symulowanie tankowania; bak mieści maksymalnie 60 litrów);
 *  - umożliwianie zmniejszenia ilości paliwa o 1 litr, jeśli ta ilość jest większa niż 0 litrów (symulowanie spalania
 *  paliwa przez samochód).
 * - Odometer. Ta klasa ma symulować licznik przejechanych kilometrów. Jej zadania to:
 *  - znajomość aktualnego stanu licznika;
 *  - informowanie o aktualnym stanie licznika;
 *  - umożliwianie zwiększania stanu licznika o 1 kilometr (maksymalna wartość licznika to 999 999 kilometrów; po
 *  przekroczeniu tej wartości licznik ma wrócić do 0);
 *  - umożliwianie współpracy z obiektem typu FuelGauge; obiekt typu Odometer powinien zmniejszać ilość paliwa w
 *  obiekcie typu FuelGauge o 1 litr co 20 kilometrów (spalanie samochodu wynosi 5 litrów na 100 kilometrów).
 * Utwórz instancję tych klas, aby zademonstrować ich działanie. Zasymuluj tankowanie samochodu, a następnie uruchom w
 * pętli kod zwiększający wartość licznika przejechanych kilometrów do momentu wyczerpania się benzyny. W każdej
 * iteracji wyświetlaj aktualny stan licznika i ilość paliwa.
 */

public class FuelGauge {
    private int litersOfFuel;

    /**
     * Konstruktor bezargumentowy obiektu typu FuelGauge
     */
    public FuelGauge() {

    }

    /**
     * Konstruktor obiektu typu FuelGauge przyjmujący jako argument wartość pola litersOfFuel
     * @param litersOfFuel wartość pola litersOfFuel
     */
    public FuelGauge(int litersOfFuel) {
        this.litersOfFuel = litersOfFuel;
    }

    //Akcesor
    public int getLitersOfFuel() {
        return litersOfFuel;
    }

    /**
     * Metoda displayFuelLevel wyświetla w konsoli informację o aktualnym poziomie paliwa
     */
    public void displayFuelLevel() {
        System.out.println("W baku pozostało: " + getLitersOfFuel() + " litrów paliwa.");
    }

    /**
     * Metoda refuelling symuluje tankowanie pojazdu. Każde jej wykonanie zwiększa wartość baku o 1 litr.
     */
    public void refuelling() {
        if (litersOfFuel < 60)
            litersOfFuel++;
    }

    /**
     * Metoda combustion symuluje spalanie paliwa przez pojazd.
     */
    public void combustion() {
        if (litersOfFuel > 0)
            litersOfFuel--;
    }

    public int maxOfFuel() {
        return 60;
    }
}
