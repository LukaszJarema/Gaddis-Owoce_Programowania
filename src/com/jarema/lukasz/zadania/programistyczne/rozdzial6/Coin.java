package com.jarema.lukasz.zadania.programistyczne.rozdzial6;

import java.util.Random;

/**
 * Symulator rzutów monetą.
 * Napisz klasę o nazwie Coin. Powinna ona zawierać następujące pole:
 * - sideUp typu String. Pole to przyjmuje wartość "orzeł" lub "reszka", określającą, która strona monety jest widoczna.
 * Klasa Coin powinna też zawierać następujące metody:
 * - Konstruktor bezargumentowy, który losowo określa widoczną stronę monety ("orzeł" lub "reszka") i odpowiednio
 * inicjuje pole sideUp.
 * - Metodę toss typu void, która symuluje rzut monetą. Ta metoda losowo określa widoczną stronę monety ("orzeł" lub
 * "reszka") i odpowiednio ustawia wartość pola sideUp.
 * - Metodę getSideUp, która zwraca wartość pola sideUp.
 * Napisz program demonstrujący działanie klasy Coin. Ten program powinien tworzyć instancję tej klasy i wyświetlać
 * widoczną początkowo stronę monety. Następnie należy za pomocą pętli zasymulować 20 rzutów monetą. Po każdym rzucie
 * program ma wyświetlać widoczną stronę monety. Program powinien też zliczać orły i reszki oraz po zakończeniu pracy
 * pętli wyświetlać uzyskane wartości.
 */

public class Coin {
    private String sideUp;

    /**
     * Konstrukt bezargumentowy obiektu typu Coin wykorzystuje metodę toss i dzięki niej inicjuje losową wartością pole
     * sideUp
     */
    public Coin() {
        toss();
    }

    /**
     * Metoda toss obiektu typu Coin losowo określa widoczną stronę monety i inicjuje nią pole sideUp
     */
    public void toss() {
        Random random = new Random();
        int side = random.nextInt(2);
        if (side == 0) {
            sideUp = "orzeł";
        } else {
            sideUp = "reszka";
        }
    }

    //Akcesor

    /**
     * Metoda getSideUp obiektu typu Coin zaraca wartość pola sideUp
     * @return wartość pola sideUp
     */
    public String getSideUp(){
        return sideUp;
    }
}
