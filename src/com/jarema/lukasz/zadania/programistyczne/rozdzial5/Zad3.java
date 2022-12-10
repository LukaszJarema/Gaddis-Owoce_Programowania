package com.jarema.lukasz.zadania.programistyczne.rozdzial5;

import java.util.Scanner;

/**
 * Powierzchnia prostokąta - uzupełnij program.
 * Jeśli pobrałeś z witryny wydawnictwa Helion kod źródłowy do tej książki, w katalogu związanym z tym rozdziałem
 * znajdziesz cześćiowo ukończony program AreaRectangle.java. Twoje zadanie polega na jego dokończeniu. Komplenty program
 * ma wyświetlać prośbę o podanie szerokości i długości prostokąta, a następnie wyświetlać jego powierzchnię. Program
 * powinien wywyoływać następujące metody (nie zostały one jeszcze napisane):
 * - getLength - powinna wyświetlać prośbę o wpisanie długości prostokąta, a następnie zwracać tę wartość jako liczbę
 * typu double.
 * - getWidth - powinna wyświetlać prośbę o wpisanie szerokości prostokąta, a następnie zwracać tę wartość jako liczbę
 * typu double.
 * - getArea - powinna przyjmować argumenty w postaci długości i szerokości prostokąta oraz zwracać jego powierzchnię;
 * powierzchnię należy obliczać, mnożąc długość przez szerokość.
 * - displayData - powinna przyjmować argumenty w postaci długości, szerokości i powierzchni prostokąta oraz wyświetlać
 * te dane w odpowiednim komunikacie na ekranie.
 */

public class Zad3 {
    public static void main(String[] args) {
        double length = getLength();
        double width = getWidth();
        double area = getArea(length, width);
        displayData(length, width, area);
    }

    public static double getLength() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj długość boku prostokąta: ");
        double length = scanner.nextDouble();
        return length;
    }

    public static double getWidth() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj szerokość boku prostokąta: ");
        double width = scanner.nextDouble();
        return width;
    }

    public static double getArea(double length, double width) {
        double area = length * width;
        return area;
    }

    public static void displayData(double length, double width, double area) {
        System.out.println("Prostokąt o długości " + length + " i szerokości " + width + " ma pole " + area + " .");
    }
}
