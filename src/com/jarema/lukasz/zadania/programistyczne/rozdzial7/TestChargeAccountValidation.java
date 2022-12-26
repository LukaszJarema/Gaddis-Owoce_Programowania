package com.jarema.lukasz.zadania.programistyczne.rozdzial7;

import java.util.Scanner;

public class TestChargeAccountValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ChargeAccountValidation chargeAccountValidation = new ChargeAccountValidation();

        System.out.print("Podaj numer konta które chcesz sprawdzić czy istnieje: ");
        int number = scanner.nextInt();

        chargeAccountValidation.displayMessageIsAccountExist(number);
    }
}
