package com.jarema.lukasz.zadania.programistyczne.rozdzial11;

public class TestRetailItem {
    public static void main(String[] args) throws NegativeUnitsOnHand, NegativePrice {
        RetailItem retailItem1 = new RetailItem("Kurtka", 12, -159.95);
        RetailItem retailItem2 = new RetailItem("Markowe dżinsy", 40, -134.95);
        RetailItem retailItem3 = new RetailItem("Koszula", 20, 124.95);

        System.out.println("Produkt numer 1: " + retailItem1.getDescription() + "\nIlość w sklepie: " +
                retailItem1.getUnitsOnHand() + "\nCena: " + retailItem1.getPrice());
    }
}
