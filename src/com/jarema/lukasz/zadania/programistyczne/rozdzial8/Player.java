package com.jarema.lukasz.zadania.programistyczne.rozdzial8;

/**
 * Gra w "wyścig do jedynki".
 * Jest to gra przeznaczona dla dwóch lub więcej graczy. Wszyscy gracze początkowo mają w niej po 50 punktów i po kolei
 * rzucają kostką. Liczba wyrzuconych oczek jet odejmowana od liczby punktów gracza. Pierwsza osoba, która osiągnie
 * dokładnie 1 punkt, wygrywa. Jeśli po odjęciu wyrzuconej liczby oczek gracz uzyskałby ujemną liczbę punktów, należy
 * dodać wyrzuconą liczbę, zamiast ją odejmować. Inna możliwość to rozgrywanie gry przez określoną liczbę kolejek.
 * Wtedy wygrywa gracz z liczbą punktów najbliższą jedynce po zakończeniu wszystkich kolejek.
 * Napisz program symulujący rozgrywkę między dwoma graczami. Do symulowania rzutów kostką posłuż się klasą Die. Napisz
 * klasę Player symulującą graczy.
 */

public class Player {
    private String name;
    private int score;

    /**
     * Konstruktor obiektu typu Player przyjmujący jako argument imię gracza
     * @param name wartość pola name
     */
    public Player(String name) {
        this.name=  name;
        score = 50;
    }

    //Akcesory
    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    //Mutatory
    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void subtract(int score) {
        this.score -= score;
    }

    public void add(int score) {
        this.score += score;
    }

    public String toString() {
        return "Gracz: " + getName() + " ma " + getScore() + " punktów.";
    }
}
