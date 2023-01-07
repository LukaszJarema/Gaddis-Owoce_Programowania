package com.jarema.lukasz.zadania.programistyczne.rozdzial9;

import java.util.Scanner;

public class TestVowelsAndConsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj łańcuch znaków: ");
        String str = scanner.nextLine();
        VowelsAndConsonants vowelsAndConsonants = new VowelsAndConsonants(str);
        int choice = 0;
        do {
            System.out.println("1. Zliczanie samogłosek w łańcuchu znaków");
            System.out.println("2. Zliczanie spółgłosek w łańcuchu znaków");
            System.out.println("3. Zliczanie sumy samogłosek i spółgłosek");
            System.out.println("4. Wprowadzanie następnego łańcucha znaków");
            System.out.println("5. Zakończenie pracy programu");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("W podanym przez Ciebie łańcuchu jest " + vowelsAndConsonants.getVowels() +
                            " samogłosek.");
                    break;
                case 2:
                    System.out.println("W podanym przez Ciebie łańcuchu jest " + vowelsAndConsonants.getConsonants() +
                            " spółgłosek.");
                    break;
                case 3:
                    System.out.println("W podanym przez Ciebie łańcuchu jest " + (vowelsAndConsonants.getVowels() +
                            vowelsAndConsonants.getConsonants()) + " samogłosek i spółgłosek.");
                    break;
                case 4:
                    System.out.print("Podaj nowy łańcuch znaków: ");
                    vowelsAndConsonants = new VowelsAndConsonants(scanner.next());
                    break;
                case 5:
                    System.out.println("Żegnaj.");
                    break;
                default:
                    System.out.println("Podałeś błędny parametr menu.");
                    break;
            }
        } while (!(choice == 5));
    }
}
