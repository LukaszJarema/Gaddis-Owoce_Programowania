package com.jarema.lukasz.zadania.programistyczne.rozdzial10;

/**
 * Interfejs Analyzable
 * Zmodyfikuj klasę CourseGrades. Dodaj do tej klasy implementację następującego interfejsu:
 * public interface Analyzable {
 *         double getAverage();
 *         GradedActivity getHighest();
 *         GradedActivity getLowest();
 *     }
 * Metoda getAverage powinna zwracać średnią wyników punktowych zapisanych w tablicy grades. Metoda getHighest powinna
 * zwracać referencję do elementu o najwyższym wyniku punktowym w tej tablicy. Z kolei metoda getLowest powinna zwracać
 * referencję do elementu o najniższym wyniku punktowym. Zademonstruj działanie nowych metod w kompletnym programie.
 */

public interface Analyzable {
    double getAverage();
    GradedActivity getHighest();
    GradedActivity getLowest();
}
