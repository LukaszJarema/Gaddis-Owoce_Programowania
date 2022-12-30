package com.jarema.lukasz.zadania.programistyczne.rozdzial7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Wyszukiwanie imion.
 * Z podanych dwóch plików: GirlNames.txt oraz BoyNames.txt wczytaj ich zawartość do odrębnych tablic lub obiektów typu
 * ArrayList. Użytkownik powinien móc wprowadzić imię męskie, damskie lub oba, a aplikacja ma wyświetlać komunikat z
 * informacją, czy podane imiona znajdowały się wśród najbardziej popularnych.
 */

public class TheMostPopularNames {
    private ArrayList<String> girlNames = new ArrayList<>();
    private ArrayList<String> boyNames = new ArrayList<>();

    /**
     * Konstruktor bezargumentowy obiektu typu TheMostPopularNames
     */
    public TheMostPopularNames() throws FileNotFoundException {
        File girlNamesFile = new File("GirlNames.txt");
        Scanner inputGirlNames = new Scanner(girlNamesFile);
        while (inputGirlNames.hasNext()) {
            girlNames.add(inputGirlNames.nextLine());
        }
        inputGirlNames.close();

        File boyNamesFile = new File("BoyNames.txt");
        Scanner inputBoyNames = new Scanner(boyNamesFile);
        while (inputBoyNames.hasNext()) {
            boyNames.add(inputBoyNames.nextLine());
        }
        inputBoyNames.close();
    }

    /**
     * Metoda getGirlNames obiektu typu TheMostPopularNames zwraca wartość pola girlNames
     * @return wartość pola girlNames
     */
    public ArrayList<String> getGirlNames() {
        return girlNames;
    }

    /**
     * Metoda getBoyNames obiektu typu TheMostPopularNames zwraca wartość pola boyNames
     * @return wartość pola boyNames
     */
    public ArrayList<String> getBoyNames() {
        return boyNames;
    }

    /**
     * Metoda findGirlName obiektu typu TheMostPopularNames przyjmuje jako argument imię żeńskie i sprawdza czy istnieje
     * ono w tablicy girlNames. Następnie zwraca stosowny komunikat na konsoli
     * @param girlName imię żeńskie wyszukiwane w tablicy
     */
    public void findGirlName(String girlName) {
        if (girlNames.contains(girlName)) {
            System.out.println("Imię " + girlName + " jest na liście.");
        } else {
            System.out.println("Imienia " + girlName + " nie ma na liście.");
        }
    }

    /**
     * Metoda findBoyName obiektu typu TheMostPopularNames przyjmuje jako argument imię męskie i sprawdza czy istnieje
     * ono w tablicy boyNames. Następnie zwraca stosowny komunikat na konsoli
     * @param boyName imię męskie wyszukiwane w tablicy
     */
    public void findBoyName(String boyName) {
        if (boyNames.contains(boyName)) {
            System.out.println("Imię " + boyName + " jest na liście.");
        } else {
            System.out.println("Imienia " + boyName + " nie ma na liście.");
        }
    }

    /**
     * Metoda findGirlAndBoyNames obiektu typu TheMostPopularNames przyjmuje jako argumenty imię damskie oraz męskie i
     * sprawdza czy istnieją one w tablicach girlNames oraz boyNames. Następnie wyświetlany jest stosowny komunikat na
     * konsoli
     * @param girlName imię damskie
     * @param boyName imię męskie
     */
    public void findGirlAndBoyNames(String girlName, String boyName) {
        if (girlNames.contains(girlName)) {
            System.out.println("Imię  damskie " + girlName + " jest na liście.");
        } else {
            System.out.println("Imienia  damskiego " + girlName + " nie ma na liście.");
        }
        if (boyNames.contains(boyName)) {
            System.out.println("Imię męskie " + boyName + " jest na liście.");
        } else {
            System.out.println("Imienia męskiego " + boyName + " nie ma na liście.");
        }
    }
}
