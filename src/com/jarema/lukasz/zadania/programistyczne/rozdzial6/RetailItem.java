package com.jarema.lukasz.zadania.programistyczne.rozdzial6;

/**
 * Klasa RetailItem.
 * Napisz klasę RetailItem przechowującą dane na temat produktu ze sklepu detalicznego. Ta klasa powinna obejmować
 * następujące pola:
 * - description. To pole wskazuje obiekt typu String zawierający krótki opis produktu.
 * - unitsOnHand. To pole to wartość typu int przechowująca liczbę sztuk dostępnych obecnie na magazynie.
 * - price. To pole to wartość typu double przechowująca cenę detaliczną produktu.
 * Napisz konstruktor, który przyjmuje argumenty odpowiadające każdemu z tych pól, a także mutatory (zapisujące wartości
 * w polach) i akcesory (zwracające wartość pól). Po napisaniu tej klasy napisz odrębny program, który tworzy trzy
 * obiekty typu RetailItem i zapisuje w nich następujące dane:
 *                      Opis            Liczba sztuk    Cena
 * Produkt numer 1      Kurtka          12              159,95
 * Produkt numer 2      Markowe dżinsy  40              134,95
 * Produkt numer 3      Koszula         20              124,95
 */

public class RetailItem {
    private String description;
    private int unitsOnHand;
    private double price;

    /**
     * Konstruktor RetailItem przyjmuje wartości i zapisuje w polach klasy RetailItem
     * @param itemDescription zapisuje wartość w polu description
     * @param itemUnitsOnHand zapisuje wartość w polu unitOnHand
     * @param itemPrice zapisuje wartość w polu price
     */
    public RetailItem(String itemDescription, int itemUnitsOnHand, double itemPrice) {
        description = itemDescription;
        unitsOnHand = itemUnitsOnHand;
        price = itemPrice;
    }

    public RetailItem(RetailItem retailItem) {
        description = retailItem.description;
        unitsOnHand = retailItem.unitsOnHand;
        price = retailItem.price;
    }

    //mutatory

    /**
     * Metoda setDescription zapisuje wartość w polu description
     * @param itemDescription wartość pola description
     */
    public void setDescription(String itemDescription) {
        description = itemDescription;
    }

    /**
     * Metoda setUnitOnHand zapisuje wartość w polu unitOnHand
     * @param itemUnitOnHand wartość pola unitOnHand
     */
    public void setUnitsOnHand(int itemUnitOnHand) {
        unitsOnHand = itemUnitOnHand;
    }

    /**
     * Metoda setPrice zapisuje wartość w polu price
     * @param itemPrice wartość pola price
     */
    public void setPrice(double itemPrice) {
        price = itemPrice;
    }

    //Akcesory

    /**
     * Metoda getDescription zwraca wartość pola description obiektu RetailItem
     * @return wartość pola description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Metoda getUnitsOnHand zwraca wartość pola unitsOnHand obiektu RetailItem
     * @return wartośc pola unitsOnHand
     */
    public int getUnitsOnHand() {
        return unitsOnHand;
    }

    /**
     * Metoda getPrice zwraca wartość pola price obiektu RetailItem
     * @return wartość pola price
     */
    public double getPrice() {
        return price;
    }
}
