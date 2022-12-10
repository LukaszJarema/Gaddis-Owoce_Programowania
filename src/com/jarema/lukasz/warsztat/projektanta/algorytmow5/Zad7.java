package com.jarema.lukasz.warsztat.projektanta.algorytmow5;

/**
 * Napisz metodę timesTen. Ta metoda ma przyjmować argument typu double i zwracać wartość typu double równą wartości
 * argumentu pomnożonej przez 10.
 */

public class Zad7 {
    public static void main(String[] args) {
        double num = 10.0;
        System.out.println(timesTen(num));
    }

    /**
     * Metoda timesTen zwraca argument przemnożony przez 10
     * @param num argument do przemnożenia
     * @return num * 10
     */
    public static double timesTen(double num) {
        double result = num * 10.0;
        return result;
    }
}
