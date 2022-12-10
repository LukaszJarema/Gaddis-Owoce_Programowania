package com.jarema.lukasz.zadania.programistyczne.rozdzial5;

import java.util.Random;

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
        displayComputerChoice();
    }

    public static String computerColorChoice() {
        Random random = new Random();
        int num = random.nextInt(4);
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

    public static void displayComputerChoice() {
        System.out.println(computerColorChoice());
    }
}
