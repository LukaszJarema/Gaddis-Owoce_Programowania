package com.jarema.lukasz.zadania.programistyczne.rozdzial7;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestChargeAccountValidationFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj nazwę pliku: ");
        String fileName = scanner.nextLine();
        ChargeAccountValidationFile chargeAccountValidationFile = new ChargeAccountValidationFile();
        chargeAccountValidationFile.setAccountsNumber(fileName);
        System.out.print("Podaj numer konta którego szukasz: ");
        chargeAccountValidationFile.displayMessageIsAccountExist(scanner.nextInt());
    }
}
