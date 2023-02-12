package com.jarema.lukasz.zadania.programistyczne.rozdzial11;

/**
 * Wyjątki dla klasy RetailItem.
 * Klasa RetailItem przechowuje dane dotyczące sprzedawanych produktów. Napisz klasę wyjątków, które można tworzyć i
 * zgłaszać w momencie przekazania ujemnej wartości jako ceny. Napisz też inną klasę wyjątków, które można tworzyć i
 * zgłaszać w reakcji na przekazanie ujemnej wartości jako liczby sztuk. Zilustruj działanie tych klas wyjątków w
 * programie.
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
    public RetailItem(String itemDescription, int itemUnitsOnHand, double itemPrice) throws NegativePrice,
            NegativeUnitsOnHand {
        description = itemDescription;
        unitsOnHand = itemUnitsOnHand;
        price = itemPrice;
        if (unitsOnHand < 0)
            throw new NegativeUnitsOnHand(unitsOnHand);
        if (price < 0)
            throw new NegativePrice(price);
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
        if (itemUnitOnHand < 0)
            new NegativeUnitsOnHand(itemUnitOnHand);
        else
            unitsOnHand = itemUnitOnHand;
    }

    /**
     * Metoda setPrice zapisuje wartość w polu price
     * @param itemPrice wartość pola price
     */
    public void setPrice(double itemPrice) {
        if (itemPrice < 0)
            new NegativePrice(itemPrice);
        else
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
