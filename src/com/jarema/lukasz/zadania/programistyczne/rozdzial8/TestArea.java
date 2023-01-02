package com.jarema.lukasz.zadania.programistyczne.rozdzial8;

public class TestArea {
    public static void main(String[] args) {
        System.out.println("Pole koła o promieniu 5 wynosi: " + Area.getArea(5));
        System.out.println("Pole prostokąta o bokach 5 i 10 wynosi: " + Area.getArea(5, 10));
        System.out.println("Pole walca o wysokości 10 i promieniu 5 wynosi: " + Area.getArea(10, 5,
                Math.PI));
    }
}
