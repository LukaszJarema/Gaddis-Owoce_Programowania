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

        String output = new String();

        while (output.equals(computerChoiceItem())) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Podaj swój wybór (Kamień, Papier, Nożyce): ");
            output = scanner.nextLine();
            computerChoiceItem();
            displayComputerChoice();
            whoWin(output);
        }
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
    public static void displayComputerChoice() {
        String output = "Komputer wybrał: " + computerChoiceItem();
        System.out.println(output);
    }

    public static String whoWin(String userChoice) {
        String output = "";
        if (computerChoiceItem().equals(userChoice)) {
            output = "Remis";
        } else if (computerChoiceItem().equals("Kamień") && userChoice.equals("Nożyce") ||
        computerChoiceItem().equals("Nożyce") && userChoice.equals("Papier") ||
        computerChoiceItem().equals("Papier") && userChoice.equals("Kamień")) {
            output = "Komputer wygrał";
        } else {
            output = "Użytkownik wygrał";
        }
        return output;
    }
}
