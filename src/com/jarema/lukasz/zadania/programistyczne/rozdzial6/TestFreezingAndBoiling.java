package com.jarema.lukasz.zadania.programistyczne.rozdzial6;

import java.util.Scanner;

public class TestFreezingAndBoiling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj temperaturę: ");
        int temperature = scanner.nextInt();
        FreezingAndBoilng freezingAndBoilng = new FreezingAndBoilng(temperature);

        freezingAndBoilng.displayEthylFreezing(temperature);
        freezingAndBoilng.displayEthylBoiling(temperature);
        freezingAndBoilng.displayOxygenFreezing(temperature);
        freezingAndBoilng.displayOxygenBoiling(temperature);
        freezingAndBoilng.displayWaterFreezing(temperature);
        freezingAndBoilng.displayWaterBoiling(temperature);
    }
}
