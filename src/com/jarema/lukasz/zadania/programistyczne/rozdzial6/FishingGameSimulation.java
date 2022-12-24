package com.jarema.lukasz.zadania.programistyczne.rozdzial6;

/**
 * Symulator gry w wędkowanie.
 * W tym zadaniu napiszesz program symulujący grę w wędkowanie. W tej grze rzuca się kostką o sześciu ściankach aby,
 * ustalić co użytkownik złowił. Każdy możliwy wynik połowu jest wart określoną liczbę punktów. Pozostają one ukryte do
 * czasu zakończenia połowu przez użytkownika, po czym pojawia się komunikat z gratulacjami dla niego, zależny od
 * liczby uzyskanych punktów.
 * Oto sugestie dotyczące projektu gry:
 * - W każdej rundzie wykonywana jest iteracja pętli, powtarzana tak długo, jak długo użytkownik chce łowić dalsze
 * rzeczy.
 * - Na początku każdej rundy program wyświetla pytanie o to, czy użytkownik chce kontynuować wędkowanie.
 * - Program symuluje rzut kostką o sześciu ściankach.
 * - Każda rzecz, jaką można wyłowić, jest reprezentowana przez liczbę oczek kostki. Na przykład 1 to "wielka ryba", 2
 * to "stary but", 3 to "mała rybka" itd.
 * - Każda rzecz złowiona przez użytkownika jest warta inną liczbę punktów.
 * - W pętli zliczana jest suma punktów uzysknych przez użytkownika.
 * - Po zakończeniu pracy pętli wyświetlana jest łączna liczba punktów wraz z komunikatem zależnym od tej liczby.
 */

public class FishingGameSimulation {
    private int score = 0;

    /**
     * Konstruktor bezargumentowy obiektu typu FishingGameSimulation
     */
    public FishingGameSimulation() {

    }

    //Akcesor

    /**
     * Metoda getScore obiektu typu FishingGameSimulation zwraca wartość pola score
     * @return wartość pola score
     */
    public int getScore() {
        return score;
    }

    /**
     * Metoda whatYouFished obiektu typu FisgingGameSimulation przyjmuje jako argument liczbę całkowitą, a następnie
     * drukuje na konsoli informację o tym co złapał użytkownik i dodaje odpowiednią liczbę punktów do pola score
     * @param i liczba całkowita (1 - 6)
     */
    public void whatYouFished(int i) {
        switch (i) {
            case 1:
                System.out.println("Złapałeś wielką rybę!");
                score += 25;
                break;
            case 2:
                System.out.println("Złapałeś starego buta...");
                score += 0;
                break;
            case 3:
                System.out.println("Złapałeś małą rybę.");
                score += 5;
                break;
            case 4:
                System.out.println("Zaczepiłeś się o dno stawu i urwałeś spławik...");
                score -= 5;
                break;
            case 5:
                System.out.println("Złapałeś szczupaka!");
                score += 50;
                break;
            case 6:
                System.out.println("Złapałeś złotą rybkę!");
                score += 100;
                break;
        }
    }

    /**
     * Metoda displayFinishScore obiektu typu FishingGameSimulation wyświetla na konsoli kounikat o łącznej liczbie
     * zdobytych punktów w grze
     */
    public void displayFinishScore() {
        System.out.println("W grze zdobyłeś: " + getScore() + " punktów.");
    }
}
