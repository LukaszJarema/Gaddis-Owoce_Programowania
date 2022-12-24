package com.jarema.lukasz.zadania.programistyczne.rozdzial6;

import java.util.Scanner;

public class TestFishingGameSimulation {
    public static void main(String[] args) {
        Die die = new Die();
        FishingGameSimulation fishingGameSimulation = new FishingGameSimulation();
        Scanner scanner = new Scanner(System.in);
        char doYouWantToPlay = 't';

        do {
            die.roll();
            fishingGameSimulation.whatYouFished(die.getValue());
            System.out.print("Czy chcesz grać dalej: ");
            doYouWantToPlay = scanner.next().charAt(0);
        } while (doYouWantToPlay == 't' || doYouWantToPlay == 'T');

        fishingGameSimulation.displayFinishScore();
    }
}
