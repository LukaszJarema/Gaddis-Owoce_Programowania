package com.jarema.lukasz.zadania.programistyczne.rozdzial5;

import java.util.Random;
import java.util.Scanner;

/**
 * Kamień, papier, nożyce.
 * Napisz program, który umożliwia grę w "kamień, papier, nożyce" z komputerem. Program powinien działać w następujący
 * sposób:
 * 1. Gdy program rozpoczyna pracę, generowana jest liczba losowa z przedziału od 1 do 3. Jeśli ta liczba to 1, komputer
 * wybrał kamień, jeżeli ta liczba to 2, komputer wybrał papier. Liczba 3 oznacza, że komputer wybrał nożyce. Początkowo
 * nie należy wyświetlać opcji wybranej przez komputer.
 * 2. Użytkownik za pomocą klawiatury podaje swój wybór: kamień, papier lub nożyce. Jeśli chcesz możesz posłużyć się w
 * tym celu menu.
 * 3. Wyświetlany jest wybór dokonany przez komputer.
 * 4. Wybierany jest zwyciezca zgodnie z następującymi regułami:
 * - Jeśli jeden gracz wybrał kamień, a drugi nożyce, kamień wygrywa.
 * - Jeśli jeden gracz wybrał nożyce, a drugi papier, nożyce wygrywają.
 * - Jeśli jeden gracz wybrał papier, a drugi kamień, papier wygrywa.
 * - Jeśli obie strony dokonały tego samego wyboru, grę trzeba powtórzyć, aby ustalić zwycięzcę.
 * Koniecznie podziel program na metody wykonujące poszczególne zadania.
 */

public class Zad17 {
    public static void main(String[] args) {
        String computer, user;
            do {
                computer = computerChoiceItem();
                user = userChoice();
                displayComputerChoice(computer);
                whoWin(user, computer);
            } while (row(user, computer));
    }

    /**
     * Metoda userChoice pobiera od użytkownika jego wybór (Kamień, Papier, Nożyce) następnie wprowadzone słowo jest
     * sprawdzane i jeżeli wpisana wartość jest błędna proces ten powtarza się.
     * @return zwraca String z wyborem użytkownika
     */
    public static String userChoice() {
        String input ="";
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Podaj swój wybór (Kamień, Papier, Nożyce): ");
            input = scanner.nextLine();
        } while (!(input.equals("Kamień") || input.equals("Papier") || input.equals("Nożyce")));
        return input;
    }

    /**
     * Metoda computerChoiceItem generuje liczbę losową z przedziału od 1 do 3. Następnie do wygenerowanej liczby
     * przypisywany jest ciąg znaków (1 - Kamień, 2 - Papier, 3 - Nożyce).
     * @return zwraca wylosowany ciąg znaków (Kamień, Papier, Nożyce).
     */
    public static String computerChoiceItem() {
        Random random = new Random();
        String output;
        int num = random.nextInt(3) + 1;
        if (num == 1) {
            output = "Kamień";
        } else if (num == 2) {
            output = "Papier";
        } else {
            output = "Nożyce";
        }
        return output;
    }

    /**
     * Metoda displayComputerChoice wykorzystuje metodę computerChoiceItem i wyświetla na ekranie informację co wylosował
     * komputer
     */
    public static void displayComputerChoice(String computerChoice) {
        String output = "Komputer wybrał: " + computerChoice;
        System.out.println(output);
    }

    /**
     * Metoda row sprawdza czy zaistniał remis w grze tj. obie strony wybrały tę samą wartość.
     * @param userChoice argument podany przez użytkownika
     * @param computerChoice argument podany przez komputer
     * @return zwraca true jeśli oba argumenty są takie same, zwraca false jeśli podane argumenty różnią się.
     */
    public static boolean row(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return true;
        }
        return false;
    }

    /**
     * Metoda whoWin sprawdza kto wygrał rywalizację.
     * @param userChoice wybór użytkownika
     * @param computerChoice wybór komputera
     */
    public static void whoWin(String userChoice, String computerChoice) {
        String output = "";
        if (computerChoice.equals("Kamień") && userChoice.equals("Nożyce") ||
        computerChoice.equals("Nożyce") && userChoice.equals("Papier") ||
        computerChoice.equals("Papier") && userChoice.equals("Kamień")) {
            output = "Komputer wygrał";
        } else if (computerChoice.equals(userChoice)) {
            output = "Remis";
        } else {
            output = "Użytkownik wygrał";
        }
        System.out.println(output);
    }
}
