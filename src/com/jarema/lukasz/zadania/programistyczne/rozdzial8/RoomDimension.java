package com.jarema.lukasz.zadania.programistyczne.rozdzial8;

/**
 * Kalkulator ceny wykładziny.
 * Firma "Wykładziny dla Każdego" zgłosiła się do Ciebie z prośbą o napisanie aplikacji obliczającej cenę położenia
 * wykładziny w prostokątnych pomieszczeniach. Aby obliczyć tę cenę, należy pomnożyć powierzchnię podłogi (szerokość
 * razy długość) przez cenę za metr kwadratowy wykładziny. Na przykład powierzchnia podłogi w pomieszczeniu długim na
 * 4 metry i szerokim na 3 metry wynosi 12 metrów kwadratowych. Aby pokryć tę podłogę wykładziną kosztującą 20 zł za
 * metry kwadratowy, trzeba wydać 240zł.
 * Najpierw utwórz klasę RoomDimension mającą dwa pola: jedno z długością i drugie z szerokością pomieszczenia. Klasa
 * RoomDimension powinna udostępniać metodę zwracającą powierzchnię pomieszczenia, czyli wynik mnożenia długości przez
 * szerokość.
 * Następnie powinieneś utworzyć klasę RoomCarpet z polem typu RoomDimension. Ta klasa powinna też obejmować pole z ceną
 * za metr kwadratowy wykładziny. W klasie RoomCarpet należy udostępnić metodę zwracającą łączną cenę wykładziny.
 * Po napisaniu tych klas możesz wykorzystać je w aplikacji, która wyświetla prośbę o podanie wymiarów pomieszczenia i
 * ceny za metr kwadratowy wybranej wykładziny. Aplikacja powinna następnie wyświetlać łączną cenę wykładziny.
 */

public class RoomDimension {
    private double length;
    private double width;

    /**
     * Konstruktor obiektu typu RoomDimension przyjmujący jako argumenty wartość pól length oraz width
     * @param length wartość pola length
     * @param width wartość pola width
     */
    public RoomDimension(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /**
     * Konstruktor kopiujący obiektu typu RoomDimension
     * @param rd
     */
    public RoomDimension(RoomDimension rd) {
        length = rd.length;
        width = rd.width;
    }

    /**
     * Metoda getArea obiektu typu RoomDimension zwraca pole pomieszczenia przez przemnożenie długości przez szerokość
     * @return pole pomieszczenia
     */
    public double getArea() {
        return length * width;
    }

    /**
     * Metoda toString obiektu typu RoomDimension zwraca informacje o długości, szerokości i polu powierzchni
     * pomieszczenia
     * @return pole tekstowe String
     */
    public String toString() {
        String str = "Pomieszczenie o długości: " + length + " i szerokości: " + width + " ma pole powierzchni: " +
                getArea();
        return str;
    }
}
