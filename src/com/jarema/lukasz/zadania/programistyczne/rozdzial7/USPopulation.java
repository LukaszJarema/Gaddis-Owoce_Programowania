package com.jarema.lukasz.zadania.programistyczne.rozdzial7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Dane o liczbie mieszkańców.
 * W pliku USPopulation.txt znajdziesz liczbę mieszkańców (w tysiącach) Stanów Zjednoczonych z połowy roku z okresu od
 * 1950 do 1990r. Pierwszy wiersz tego pliku zawiera liczbę mieszkańców z 1950r., drugi z 1951r. itd.
 * Napisz progrm, który wczytuje zawartość tego pliku do tablicy. Program powinien wyświetlać następujące dane:
 * - średnią roczną zmianę liczby mieszkańców z danego okresu,
 * - rok z największym wzrostem liczby mieszkańców z danego okresu,
 * - rok z najmniejszym wzrostem liczby mieszkańców z danego okresu.
 */

public class USPopulation {
    private int [] population = new int[41];

    /**
     * Konstruktor bezargumentowy obiektu typu USPopulation
     * @throws FileNotFoundException
     */
    public USPopulation() throws FileNotFoundException {
        File file = new File("USPopulation.txt");
        Scanner scanner = new Scanner(file);
        int i = 0;
        while (scanner.hasNext()) {
            population[i] = scanner.nextInt();
            i++;
        }
        scanner.close();
    }

    /**
     * Metoda getAverageChangeOfPopulation obiektu typu USPopulation zwraca średni przyrost ilość mieszkańców w zadanym
     * okresie
     * @return średni przyrost mieszkańców
     */
    public double getAverageChangeOfPopulation() {
        int growing = 0;
        for (int i = 1; i < population.length; i++) {
            growing += (population[i] - population[(i - 1)]);
        }
        double average = growing / population.length;
        return average;
    }

    /**
     * Metoda displayAverageChangeOfPopulation obiektu typu USPopulation wypisuje na konsoli liczbę średniego przyrostu
     * liczby mieszkańców w zadanym okresie
     * @param average wartość średniego przyrostu mieszkańców
     */
    public void displayAverageChangeOfPopulation(double average) {
        System.out.println("Średni przyrost populacji w danym okresie wynosi: " + average);
    }

    /**
     * Metoda getHighestChangeOfPopulation obiektu typu USPopulation zwraca największą wartość przyrostu populacji w
     * danym okresie
     * @return wartość największego wzrostu populacji
     */
    public int getHighestChangeOfPopulation() {
        int highest = 0;
        for (int i = 1; i < population.length; i++) {
            if ((population[i] - population[(i - 1)]) > highest)
                highest = (population[i] - population[(i - 1)]);
        }
        return highest;
    }

    /**
     * Metoda displayHigestChangeOfPopulation obiektu typu USPopulation wypisuje na konsoli informację o największej
     * liczbie przyrotu populacji w zadanym okresie
     * @param highest największa wartość przyrostu
     */
    public void displayHighestChangeOfPopulation(int highest) {
        System.out.println("Największy przyrost populacji w danym okresie wyniósł: " + highest);
    }

    /**
     * Metoda getLowestChangeOfPopulation obiektu typu USPopulation zwraca wartość najmniejszego przyrostu populacji
     * w zadanym okresie
     * @return najmniejsza wartość przyrostu populacji
     */
    public int getLowestChangeOfPopulation() {
        int lowest = population[1] - population[0];
        for (int i = 2; i < population.length; i++) {
            if ((population[i] - population[(i - 1)]) < lowest)
                lowest = (population[i] - population[(i - 1)]);
        }
        return lowest;
    }

    /**
     * Metoda displayLowestChangeOfPopulation obiektu typu USPopulation wyświetla na konsoli informację o najniższym
     * przyroście populacji w danym okresie
     * @param lowest najmniejsza wartość przyrostu populacji
     */
    public void displayLowestChangeOfPopulation(int lowest) {
        System.out.println("Najmniejsza wartość przyrostu populacji wyniosła: " + lowest);
    }
}
