package com.jarema.lukasz.zadania.programistyczne.rozdzial7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Mistrzowie ligi baseballu.
 * Plik WorldSeriesWinners.txt zawiera chronologicznie uporządkowaną listę zespołów, które wygrały ligę baseballu w
 * latach 1903 - 2009. Pierwszy wiersz w pliku zawiera nazwę zespołu, który zwyciężył w 1903r., a ostatni wiersz
 * nazwę zwycięzców z 2009r. Warto zauważyć, że w latach 1904 i 1994 rozgrywki nie odbywały się, dlatego te lata
 * pominięto. Napisz program, który umożliwia użytkownikowi podanie nazwy zespołu, a następnie wyświetla, ile razy dany
 * zespół wygrał ligę w latach 1903 - 2009.
 */

public class WorldSeriesWinners {
    private ArrayList<String> winners = new ArrayList<>();

    /**
     * Konstruktor bezargumentowy obiektu typu WorldSeriesWinners
     * @throws FileNotFoundException
     */
    public WorldSeriesWinners() throws FileNotFoundException {
        File file = new File("WorldSeriesWinners.txt");
        Scanner inputFile = new Scanner(file);
        while (inputFile.hasNext()) {
            winners.add(inputFile.nextLine());
        }
        inputFile.close();
    }

    /**
     * Metoda howManyWon obiektu typu WorldSeriesWinners przyjmuje jako argument nazwę zespołu, a następnie zlicza ile
     * razy ten zespół zdobył mistrzostwo i zwraca tę wartość
     * @param teamName nazwa zespołu
     * @return wartość ile razy zespół zdobył mistrzostwo
     */
    public int howManyWon(String teamName) {
        int wonTimes = 0;
        for (int i = 0; i < winners.size(); i++) {
            if (winners.get(i).equals(teamName)) {
                wonTimes++;
            }
        }
        return wonTimes;
    }

    /**
     * Metoda displayHowManyWon obiektu typu WorldSeriesWinners wypisuje na konsoli informację ile razy zespół zdobył
     * mistrzostwo
     * @param teamName nazwa zespołu
     */
    public void displayHowManyWon(String teamName) {
        System.out.println("Zespół " + teamName + " wygrał mistrzostwo " + howManyWon(teamName) + " razy.");
    }
}
