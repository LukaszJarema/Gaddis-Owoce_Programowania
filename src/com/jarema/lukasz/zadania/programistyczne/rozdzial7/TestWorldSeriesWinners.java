package com.jarema.lukasz.zadania.programistyczne.rozdzial7;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestWorldSeriesWinners {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        WorldSeriesWinners worldSeriesWinners = new WorldSeriesWinners();
        System.out.print("Podaj nazwę zespołu: ");
        worldSeriesWinners.displayHowManyWon(scanner.nextLine());
    }
}
