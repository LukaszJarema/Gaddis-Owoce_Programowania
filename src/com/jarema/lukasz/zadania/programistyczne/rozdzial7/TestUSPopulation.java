package com.jarema.lukasz.zadania.programistyczne.rozdzial7;

import java.io.FileNotFoundException;

public class TestUSPopulation {
    public static void main(String[] args) throws FileNotFoundException {
        USPopulation usPopulation = new USPopulation();
        usPopulation.displayAverageChangeOfPopulation(usPopulation.getAverageChangeOfPopulation());
        usPopulation.displayHighestChangeOfPopulation(usPopulation.getHighestChangeOfPopulation());
        usPopulation.displayLowestChangeOfPopulation(usPopulation.getLowestChangeOfPopulation());
    }
}
