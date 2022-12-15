package com.jarema.lukasz.zadania.programistyczne.rozdzial6;

import java.util.Scanner;

public class TestTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj ilość stopni Fahrenheita: ");
        Temperature temperature = new Temperature();
        temperature.setFtemp(scanner.nextDouble());
        System.out.printf("%.2f stopni Fahrenheita to: %.2f stopni Celsjusza", temperature.getFtemp(),
                temperature.celsius(temperature.getFtemp()));
        System.out.println();
        System.out.printf("%.2f stopni Fahrenheita to: %.2f stopni kelvina", temperature.getFtemp(),
                temperature.kelvin(temperature.getFtemp()));
    }
}
