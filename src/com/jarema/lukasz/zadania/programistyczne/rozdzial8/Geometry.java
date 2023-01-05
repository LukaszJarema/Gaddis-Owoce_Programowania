package com.jarema.lukasz.zadania.programistyczne.rozdzial8;

/**
 * Kalkulator geometryczny.
 * Zaprojektuj klasę Geometry zawierającą następujące metody:
 * - Statyczną metodę przyjmującą promień koła i zwracającą powierzchnię tej figury.
 * - Statyczną metodę przyjmującą długość i szerokość prostokąta oraz zwracającą powierzchnię tej figury.
 * - Statyczną metodę przyjmującą długość podstawy prostokąta i jego wysokość. Metoda powinna obliczać powierzchnię tej
 * figury.
 * Te metody powinny wyświetlać komunikat o błędzie, jeśli dla promienia koła, długości lub szerokości prostokąta albo
 * podstawy lub wysokości trójkąta podano liczbę ujemną.
 * W dalszej kolejności napisz program do testowania tej klasy. Powinien on wyświetlać następujące menu i reagować na
 * wybór dokonany przez użytkownika.
 * Kalkulator geometryczny
 * 1. Obliczanie powierzchni koła.
 * 2. Obliczanie powierzchni prostokąta.
 * 3. Obliczanie powierzchni trójkąta.
 * 4. Zakończ.
 * Wprowadź wybraną opcję (1-4):
 * Wyświetl komunikat o błędzie, jeśli użytkownik w menu wybierze liczbę spoza przedziału od 1 do 4.
 */

public class Geometry {

    /**
     * Metoda getCircleArea zwraca na konsoli pole powierzchni koła obliczone przy pomocy argumentu radius
     * @param radius promień koła
     */
    public static void getCircleArea(double radius) {
        if (radius < 0.0)
            System.out.println("Promień nie może być mniejszy od 0.");
        else {
            double area = Math.PI * Math.pow(radius, 2);
            System.out.printf("Pole koła wynosi: %.2f\n", area);
        }
    }

    /**
     * Metoda getRectangleArea zwraca na konsoli pole prostokąta obliczone przy pomocy argumentów length oraz width
     * @param length długość boku prostokąta
     * @param width szerokość boku prostokąta
     */
    public static void getRectangleArea(double length, double width) {
        if (length < 0.0)
            System.out.println("Długość nie może być mniejsza od 0.");
        else if (width < 0.0)
            System.out.println("Szerokość nie może być mniejsza od 0");
        else if (length < 0.0 && width < 0.0)
            System.out.println("Długość i szerokość nie mogą być mniejsze od 0.");
        else {
            double area = length * width;
            System.out.printf("Pole prostokąta wynosi: %2.f\n", area);
        }
    }

    /**
     * Metoda getTraingleArea zwraca na konsoli pole powierzchni trójkąta obliczonego przy pomocy argumentów base oraz
     * height
     * @param base długość podstawy
     * @param height wysokość
     */
    public static void getTriangleArea(double base, double height) {
        if (base < 0.0)
            System.out.println("Podstawa nie może być mniejsza od 0.");
        else if (height < 0.0)
            System.out.println("Wysokość nie może być mniejsza od 0");
        else if (base < 0.0 && height < 0.0)
            System.out.println("Podstawa i wysokość nie mogą być mniejsze od 0.");
        else {
            double area = 0.5 * base * height;
            System.out.printf("Pole trójkąta wynosi: %2.f\n", area);
        }
    }
}
