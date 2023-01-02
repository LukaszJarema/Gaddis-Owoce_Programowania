package com.jarema.lukasz.zadania.programistyczne.rozdzial8;

public class RoomCarpet {
    private RoomDimension size;
    private double carpetCost;

    public RoomCarpet(RoomDimension size, double carpetCost) {
        this.size = new RoomDimension(size);
        this.carpetCost = carpetCost;
    }

    /**
     * Metoda getTotalCost zwraca łączną wartość wykładziny
     * @return łączna wartość wykładziny
     */
    public double getTotalCost() {
        return size.getArea() * carpetCost;
    }

    /**
     * Metoda toString obiektu typu RoomCarpet zwraca obiekt typu String informujący o łącznym koszcie wykładziny
     * @return
     */
    public String toString() {
        String str = "Koszt wykładziny wynosi: " + getTotalCost();
        return str;
    }
}
