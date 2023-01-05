package com.jarema.lukasz.zadania.programistyczne.rozdzial8;

import java.util.Scanner;

public class TestGeometry {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Kalkulator geometryczny\n1. Obliczanie powierzchni koła.\n2. Obliczanie powierzchni" +
                    "prostokąta\n3. Obliczanie powierzchni trójkąta\n4. Zakończ.\nWprowadź wybraną opcję (1 - 4): ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Podaj promień koła: ");
                    double radius = scanner.nextDouble();
                    Geometry.getCircleArea(radius);
                    break;
                case 2:
                    System.out.print("Podaj długość prostokąta: ");
                    double length = scanner.nextDouble();
                    System.out.print("Podaj szerokość prostokąta: ");
                    double width = scanner.nextDouble();
                    Geometry.getRectangleArea(length, width);
                    break;
                case 3:
                    System.out.print("Podaj długość podstawy trójkąta: ");
                    double base = scanner.nextDouble();
                    System.out.print("Podaj wysokość trójkąta: ");
                    double height = scanner.nextDouble();
                    Geometry.getTriangleArea(base, height);
                    break;
                case 4:
                    System.out.print("Żegnaj.");
                    break;
                default:
                    System.out.println("Podałeś niewłaściwą wartość.");
            }
        } while (choice != 4);

    }
}
