package com.jarema.lukasz.zadania.programistyczne.rozdzial7;

import java.io.FileNotFoundException;

public class TestWeeklyGasAverage {
    public static void main(String[] args) throws FileNotFoundException {
        WeeklyGasAverages weeklyGasAverages = new WeeklyGasAverages();
        weeklyGasAverages.setWeeklyGasAverage("1994_Weekly_Gas_Averages.txt");
        weeklyGasAverages.maximalGasAverageInYear();
        weeklyGasAverages.minimalGasAverageInYear();
        weeklyGasAverages.monthlyGasAverage();
        weeklyGasAverages.monthlyGasAverageFiles();
    }
}
