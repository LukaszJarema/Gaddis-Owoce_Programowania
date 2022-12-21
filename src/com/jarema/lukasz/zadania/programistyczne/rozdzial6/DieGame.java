package com.jarema.lukasz.zadania.programistyczne.rozdzial6;

/**
 * Gra w kości.
 * Napisz program, który używa zaprezentowanej klasy Die do prostej gry w kości między komputerem, a użytkownikiem. Ten
 * program powinien tworzyć dwie instancje klasy Die (każdą z sześcioma ściankami). Jeden obiekt Die ma reprezentować
 * kostkę komputera, a drugi - kostkę użytkownika.
 * Program powinien obejmować pętlę z 10 iteracjami. W każdej iteracji należy rzucać obiema kostkami. Wyrzucenie
 * większej liczby oczek daje zwycięstwo. W przypadku równej liczby oczek w danej rundzie nie ma zwycięzcy.
 * W kolejnych iteracjach program powinien zliczać wygrane komputera i użytkownika. Po wykonaniu wszystkich iteracji
 * pętli program ma wyświetlać, kto wygrał całą grę - komputer czy użytkownik.
 */
public class DieGame {
    public static void main(String[] args) {
        Die computer = new Die();
        Die user = new Die();

        int computerPoints = 0,
                userPoints = 0;

        for (int i = 0; i < 10 ; i++) {
            int computerRoll = computer.roll();
            int userRoll = user.roll();
            if (computerRoll > userRoll) {
                computerPoints++;
            } else if (userRoll > computerRoll) {
                userPoints++;
            } else {

            }
        }
        computer.whoWin(computerPoints, userPoints);
    }

}

