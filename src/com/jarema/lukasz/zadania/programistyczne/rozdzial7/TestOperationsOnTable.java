package com.jarema.lukasz.zadania.programistyczne.rozdzial7;

import java.util.ArrayList;

public class TestOperationsOnTable {
    public static void main(String[] args) {
        ArrayList<Integer> table = new ArrayList<>();
        table.add(4);
        table.add(3);
        table.add(2);
        table.add(5);
        table.add(1);
        OperationsOnArrays operationsOnArrays = new OperationsOnArrays(table);
        operationsOnArrays.displayInformationAboutTable();
    }
}
