package com.jarema.lukasz.zadania.programistyczne.rozdzial6;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj promień koła: ");
        Circle circle = new Circle();
        circle.setRadius(scanner.nextDouble());
        System.out.printf("Powierzchnia koła wynosi: %.2f", circle.area(circle.getRadius()));
        System.out.println();
        System.out.printf("Średnica koła wynosi: %.2f", circle.diameter(circle.getRadius()));
        System.out.println();
        System.out.printf("Obwód koła wynosi: %.2f", circle.circumference(circle.getRadius()));
    }
}
