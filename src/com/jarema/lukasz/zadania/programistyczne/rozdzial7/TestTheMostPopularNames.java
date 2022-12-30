package com.jarema.lukasz.zadania.programistyczne.rozdzial7;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestTheMostPopularNames {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        TheMostPopularNames theMostPopularNames = new TheMostPopularNames();
        int num = 0;
        do {
            System.out.println("Podaj\n1. Jeśli chcesz sprawdzić imię żeńskie\n2. Jeśli chcesz sprawdzić imię męskie" +
                    "\n3. Jeśli chcesz sprawdzić imię żeńskie i męskie");
            num = scanner.nextInt();
        } while (!(num > 0 && num <= 3));
        switch (num) {
            case 1:
                System.out.print("Podaj imię żeńskie: ");
                theMostPopularNames.findGirlName(scanner.nextLine());
                break;
            case 2:
                System.out.print("Podaj imię męskie: ");
                theMostPopularNames.findGirlName(scanner.nextLine());
                break;
            case 3:
                System.out.print("Podaj imię żeńskie: ");
                String girlName = scanner.next();
                System.out.print("Podaj imię męskie: ");
                String boyName = scanner.next();
                theMostPopularNames.findGirlName(girlName);
                theMostPopularNames.findBoyName(boyName);
                break;
            default:
                System.out.println("Wyszedłeś poza zakres.");
        }

    }
}
