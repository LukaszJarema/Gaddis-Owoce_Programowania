package com.jarema.lukasz.zadania.programistyczne.rozdzial5;

/**
 * Odległość przebywana w trakcie spadania.
 * Gdy obiekt spada z powodu grawitacji, można zastosować następujący wzór, aby obliczyć odległość przebytą w określonym
 * czasie:
 * d = 0,5 * g * t ^ 2
 * Oto zmienne z tego wzrou: d to odległość w metrach, g to stała 9,8, a t to czas spadania obiektu (podany w sekundach).
 * Napisz metodę fallingDistance, która jako argument przyjmuje czas spadania obiektu (w sekundach). Ta metoda powinna
 * zwracać odległość w metrach, jaką przebył w tym czasie spadający obiekt. Zademonstruj działanie tej metody, wywołując
 * ją w pętli, która przekazuje wartości od 1 do 10 jako argumet, a następnie wyświetla zwracaną wartość.
 */

public class Zad5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Spadający obiekt przemierzył odległość: " + fallingDistance(i) + " metrów w czasie " + i
            + " sekund.");
        }
    }

    public static double fallingDistance(int time) {
        double distance = 0.5 * 9.8 * Math.pow(time, 2.0);
        return distance;
    }
}
