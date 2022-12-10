package com.jarema.lukasz.zadania.programistyczne.rozdzial5;

import java.util.Random;
import java.util.Scanner;

/**
 * Badanie postrzegania pozazmysłowego.
 * Napisz program, który bada Twoje zdolności pozazmysłowe. Program powinien losowo wybierać jedną z poniższych nazw
 * kolorów:
 * Czerwony, Zielony, Niebieski, Pomarańczowy, Żółty
 * Na potrzeby wyboru słowa program może generować liczby losowe. Na przykład liczba 0 może odpowiadać słowu Czerwony, a
 * liczba 1 słowu Zielony.
 * Następnie program powinien wyświetlać użytkownikowi prośbę o podanie koloru wybranego przez komputer. Po podaniu
 * koloru przez użytkownika program powinien wyświetlać nazwę losowo wybranej barwy. Program powinien powtarzać ten
 * proces 10 razy, a następnie wyświetlać liczbę poprawnych wskazań użytkownika.
 * Podziel ten program na metody wykonujące główne zadania.
 */

public class Zad18 {
    public static void main(String[] args) {
        int theSameChoice = 0;

        for (int i = 0; i < 10; i++) {
            String user = userChoice();
            String computer = computerColorChoice();
            displayComputerChoice(computer);
            if (user.equals(computer)) {
                theSameChoice++;
            }
        }
        System.out.println("Dokonałeś tego samego wyboru co komputer: " + theSameChoice + " razy.");
    }

    /**
     * Metoda computerColorChoice generuje liczbę pseudolosą, a następnie na jej podstawie przypisuje kolor.
     * @return zwraca kolor wylosowany przez komputer.
     */
    public static String computerColorChoice() {
        Random random = new Random();
        int num = random.nextInt(5);
        String output = "";
        if (num == 0) {
            output = "Czerwony";
        } else if (num == 1) {
            output = "Zielony";
        } else if (num == 2) {
            output = "Niebieski";
        } else if (num == 3) {
            output = "Pomarańczowy";
        } else {
            output = "Żółty";
        }
        return output;
    }

    /**
     * Metoda displayComputerChoice wyświetla na konsoli wylosowany kolor przez komputer, który wcześniej został
     * przypisany do zmiennej typu String.
     * @param color Przyjmuje wcześniej wylosowany kolor przez komputer jako zmienną typu String.
     */
    public static void displayComputerChoice(String color) {
        System.out.println(color);
    }

    public static String userChoice() {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        do {
            System.out.print("Podaj kolor (Czerwony, Zielony, Niebieski, Pomarańczowy, Żółty: ");
            input = scanner.nextLine();
        } while (!(input.equals("Czerwony") || input.equals("Zielony") || input.equals("Niebieski")
                || input.equals("Pomarańczowy") || input.equals("Żółty")));
        return input;
    }
}
