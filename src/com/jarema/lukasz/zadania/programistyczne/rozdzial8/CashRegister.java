package com.jarema.lukasz.zadania.programistyczne.rozdzial8;

import com.jarema.lukasz.zadania.programistyczne.rozdzial6.RetailItem;

/**
 * Klasa CashRegister.
 * Napisz klasę CashRegister, którą można stosować razem z klasą RetailItem. Klasa CashRegister powinna sumulować
 * sprzedaż produktu. Powinna też mieć konstruktor przyjmujący jako argument obiekt typu RetailItem. Ten konstruktor
 * powinien też przyjmować liczbę całkowitą reprezentującą liczbę kupowanych sztuk produktu. Ponadto klasa powinna
 * obejmować następujące metody:
 * - Metodę getSubtotal, zwracającą podsumę transakcji, czyli liczbę sztuk pomnożoną przez cenę. Ta metoda musi pobierać
 * cenę z obiektu typu RetailItem przekazanego jako argument do konstruktora.
 * - Metodę getTax, zwracającą wartość podatku od sprzedaży. Wartość tego podatku stanowi 23% kwoty transakcji.
 * - Metodę getTotal, zwracającą łączną kwotę do zapłaty (czyli podsumę plus podatek).
 * Zademonstruj działanie tej klasy w programie, który wyświetla prośbę o podanie liczby kupowanych sztuk, a następnie
 * wyświetla podsumę, wartość podatku i łączną kwotę do zapłaty.
 */

public class CashRegister {
    private RetailItem product;
    private int numberOfPices;

    /**
     * Konstruktor obiektu typu CashRegister przyjmujący jako argument wartość klasy RetailItem oraz ilość sprzedanych
     * produktów
     * @param retailItem wartość klasy RetailItem
     * @param numberOfPices ilość sprzedanych prodkuktów
     */
    public CashRegister(RetailItem retailItem, int numberOfPices) {
        product = new RetailItem(retailItem);
        this.numberOfPices = numberOfPices;
    }

    /**
     * Metoda getSubtotal obiektu typu CashRegister zwraca wartość netto zakupów
     * @return wartość netto zakupów
     */
    public double getSubtotal() {
        double subtotal = numberOfPices * product.getPrice();
        return subtotal;
    }

    /**
     * Metoda getTax obiektu typu CashRegister zwraca wartość podatku zakupów
     * @return 23% podatku od zakupów
     */
    public double geTax() {
        double tax = getSubtotal() * 0.23;
        return tax;
    }

    /**
     * Metoda getTotal obiektu typu CashRegister zwraca łączną kwotę brutto zakupów
     * @return kwota brutto zakupów
     */
    public double getTotal() {
        return getSubtotal() + geTax();
    }

    public int getNumberOfPices() {
        return numberOfPices;
    }

    /**
     * Metoda toString obiektu typu CashRegister zwraca ciąg znaków o dokonanych zakupach
     * @return
     */
    public String toString() {
        String str = "Kupiłeś: " + product.getDescription() + " za łączną kwotę: " + getTotal() + " złotych.\n" +
                "Cena netto: " + getSubtotal() + "\nPodatek: " + geTax();
        return str;
    }
}
