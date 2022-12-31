package com.jarema.lukasz.zadania.programistyczne.rozdzial7;

import java.util.Random;

public class TestOperationsOnTwoDimensionalArrays {
    public static void main(String[] args) {
        OperationsOnTwoDimensionalArrays operationsOnTwoDimensionalArrays = new OperationsOnTwoDimensionalArrays();
        Random random = new Random();
        int [] [] table = new int [5] [5];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table [i] [j] = random.nextInt(100) + 1;
            }
        }

        System.out.println("Łączna wartość liczb w tablicy: " + operationsOnTwoDimensionalArrays.getTotal(table));
        System.out.println("Średnia wartość liczb w tablicy: " + operationsOnTwoDimensionalArrays.getAverage(table));
        System.out.println("Wartość liczb w kolumnie 4: " + operationsOnTwoDimensionalArrays.getColumnTotal(table,
                3));
        System.out.println("Wartość liczb w wierszu 4: " + operationsOnTwoDimensionalArrays.getRowTotal(table,
                3));
        System.out.println("Największa wartość w wierszu 4: " + operationsOnTwoDimensionalArrays.getHighestInRow(table,
                3));
        System.out.println("Najmniejsza wartość w wierszu 4: " + operationsOnTwoDimensionalArrays.getLowesInRow(table,
                3));
    }
}
