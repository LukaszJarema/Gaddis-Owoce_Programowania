package com.jarema.lukasz.zadania.programistyczne.rozdzial6;

import java.util.Scanner;

/**
 * Piliki z deponowanymi i wypłacanymi kwotami.
 * Za pomocą Notatnika lub innego edytora tekstu utwórz plik tekstowy Deposits.txt. Ten plik powinien zawierać
 * następujące liczby (po jednej na wiersz):
 * 100.00
 * 124.00
 * 78.92
 * 37.55
 * Następnie utwórz plik tekstowy Withdrawals.txt. Powinien on obejmować następujące liczby (po jednej na wiersz):
 * 29.88
 * 110.00
 * 27.52
 * 50.00
 * 12.90
 * Liczby z pliku Deposits.txt to kwoty zdeponowane na rachunku oszczędnościowym w danym miesiącu, a wartości z pliku
 * Withdrawals.txt to środki wypłacane w tym miesiącu. Napisz program, który tworzy instancję klasy SavingsAccount. Za
 * stan początkowy tego obiektu przyjmij wartość 500.00. Program powinien wczytywać wartości z pliku Deposits.txt i za
 * pomocą metody obiektu dodawać je do stanu konta. Ponadto program powinien wczytywać wartości wartości z pliku
 * Withdrawals.txt i przy użyciu metody obiektu odejmować je od stanu konta. Program powinien też wywoływać metodę klasy,
 * aby obliczyć miesięczne odsetki, a następnie wyświetlać stan końcowy konta i otrzymane odsetki.
 */
public class TestFilesSavingsAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SavingsAccount savingsAccount = new SavingsAccount();
        System.out.print("Podaj roczną stopę oprocentowania: ");
        savingsAccount.setAnnualInterestRate(scanner.nextDouble());
        savingsAccount.setAccountBalance(500.00);

    }
}
