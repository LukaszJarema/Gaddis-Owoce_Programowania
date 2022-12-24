package com.jarema.lukasz.warsztat.projektanta.algorytmow7;

import java.util.ArrayList;

/**
 * Napisz kod, który tworzy obiekt typu ArrayList do przechowywania obiektów typu String. Do tego obiektu typu ArrayList
 * dodaj nazwy trzech marek samochodów, a następnie wyświetl zawartość tego obiektu.
 */

public class Zad11 {
    public static void main(String[] args) {
        ArrayList<String> carBranch = new ArrayList<>();
        carBranch.add("BMW");
        carBranch.add("Opel");
        carBranch.add("VW");

        for(String cars : carBranch)
            System.out.println(cars);
    }
}
