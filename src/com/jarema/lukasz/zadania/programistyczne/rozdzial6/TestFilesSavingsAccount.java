package com.jarema.lukasz.zadania.programistyczne.rozdzial6;

import java.io.File;
import java.io.FileNotFoundException;
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
 * pomocą metody obiektu dodawać je do stanu konta. Ponadto program powinien wczytywać wartości z pliku
 * Withdrawals.txt i przy użyciu metody obiektu odejmować je od stanu konta. Program powinien też wywoływać metodę klasy,
 * aby obliczyć miesięczne odsetki, a następnie wyświetlać stan końcowy konta i otrzymane odsetki.
 */
public class TestFilesSavingsAccount {
    public static void main(String[] args) throws FileNotFoundException {
        double addDeposit = 0.0,
                substractDeposit = 0.0,
                monthInterestRate = 0.0;
        Scanner scanner = new Scanner(System.in);
        File deposits = new File("Deposits.txt");
        File withdrawals = new File("Withdrawals.txt");
        Scanner depositsFile = new Scanner(deposits);
        Scanner withdrawalsFile = new Scanner(withdrawals);
        SavingsAccount savingsAccount = new SavingsAccount();
        System.out.print("Podaj roczną stopę oprocentowania: ");
        savingsAccount.setAnnualInterestRate(scanner.nextDouble());
        savingsAccount.setAccountBalance(500.00);

        while (depositsFile.hasNext() && withdrawalsFile.hasNext()) {
            String depositsFileLine = depositsFile.nextLine();
            double add = Double.parseDouble(depositsFileLine);
            addDeposit += add;
            savingsAccount.addingDepositedAmmount(add);
            String withdrawalsFileLine = withdrawalsFile.nextLine();
            double substract = Double.parseDouble(withdrawalsFileLine);
            substractDeposit += substract;
            savingsAccount.substractionDepositedAmmount(substract);
            savingsAccount.addMonthInterestRate(savingsAccount.getAnnualInterestRate());
            monthInterestRate += savingsAccount.monthInterestRate(savingsAccount.getAnnualInterestRate());
        }

        System.out.printf("Stan końcowy konta wynosi: %.2f", savingsAccount.getAccountBalance());
        System.out.println();
        System.out.printf("Otrzymane odsetki: %.2f", monthInterestRate);
    }
}
