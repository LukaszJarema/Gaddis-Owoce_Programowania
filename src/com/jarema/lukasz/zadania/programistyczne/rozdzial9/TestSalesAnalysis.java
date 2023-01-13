package com.jarema.lukasz.zadania.programistyczne.rozdzial9;

import java.io.IOException;

public class TestSalesAnalysis {
    public static void main(String[] args) throws IOException {
        SalesAnalysis salesAnalysis = new SalesAnalysis();
        salesAnalysis.totalSalesOnWeek(3);
        salesAnalysis.averageSalesOnWeek(3);
        salesAnalysis.totalSalesOnAllWeeks();
        salesAnalysis.weekWithHighestSales();
        salesAnalysis.weekWithLowestSales();
    }
}
