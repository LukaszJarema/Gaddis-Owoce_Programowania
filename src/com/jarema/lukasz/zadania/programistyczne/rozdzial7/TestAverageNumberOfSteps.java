package com.jarema.lukasz.zadania.programistyczne.rozdzial7;

import java.io.FileNotFoundException;

public class TestAverageNumberOfSteps {
    public static void main(String[] args) throws FileNotFoundException {
        AverageNumberOfSteps averageNumberOfSteps = new AverageNumberOfSteps();
        averageNumberOfSteps.setMonths("steps.txt");
        averageNumberOfSteps.displayMonthsAverage();
    }
}
