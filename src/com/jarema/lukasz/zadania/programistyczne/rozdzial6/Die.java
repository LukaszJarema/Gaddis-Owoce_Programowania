package com.jarema.lukasz.zadania.programistyczne.rozdzial6;

import java.util.Random;

public class Die {
    private final int SIDES = 6;
    private int value;

    /**
     * Meotda roll obiektu typu Die symuluje rzut kostką 6-ścienną i zwraca wartość pola value
     * @return wartość pola value
     */
    public int roll() {
        Random random = new Random();
        value = random.nextInt(SIDES) + 1;
        return value;
    }

    /**
     * Metoda getValue obiektu typu Die zwraca wartość pola value
     * @return wartość pola value
     */
    public int getValue() {
        return value;
    }

    /**
     * Metoda getSides obiektu typu Die zwraca wartość pola SIDES
     * @return wartość pola SIDES
     */
    public int getSIDES() {
        return SIDES;
    }

    public void setValue(Die die) {
        value = die.roll();
    }
}
