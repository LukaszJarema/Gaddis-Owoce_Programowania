package com.jarema.lukasz.zadania.programistyczne.rozdzial9;

import java.util.Scanner;

public class TestPasswordVerifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj swoje hasło: ");
        PasswordVerifier passwordVerifier = new PasswordVerifier(scanner.next());
        passwordVerifier.displayInformationAboutPassword();
    }
}
