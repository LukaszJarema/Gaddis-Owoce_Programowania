package com.jarema.lukasz.zadania.programistyczne.rozdzial6;

import java.util.Scanner;

public class TestSavingsAccount {
    public static void main(String[] args) {
        double addDeposite = 0.0,
                substractDeposite = 0.0,
                monthInterestRate = 0.0;
        Scanner scanner = new Scanner(System.in);
        SavingsAccount savingsAccount = new SavingsAccount();
        System.out.print("Podaj roczną stopę oprocentowania: ");
        savingsAccount.setAnnualInterestRate(scanner.nextDouble());
        System.out.print("Podaj początkową sumę zdeponowaną na koncie: ");
        addDeposite += scanner.nextDouble();
        savingsAccount.setAccountBalance(addDeposite);
        System.out.print("Podaj liczbę miesięcy od założenia konta: ");
        int months = scanner.nextInt();

        for (int i = 1; i <= months; i++) {
            System.out.print("Ile pieniędzy wpłaciłeś w miesiącu numer " + i + " na konto: ");
            double add = scanner.nextDouble();
            addDeposite += add;
            savingsAccount.addingDepositedAmmount(add);
            System.out.print("Ile pieniędzy wypłaciłeś w miesiącu numer " + i + " z konta: ");
            double substract = scanner.nextDouble();
            substractDeposite += substract;
            savingsAccount.substractionDepositedAmmount(substract);
            savingsAccount.addMonthInterestRate(savingsAccount.getAnnualInterestRate());
            monthInterestRate += savingsAccount.monthInterestRate(savingsAccount.getAnnualInterestRate());
        }
        System.out.printf("Stan końcowy konta: %.2f", savingsAccount.getAccountBalance());
        System.out.println();
        System.out.printf("Łączna suma zdeponowanych pieniędzy na koncie: %.2f", addDeposite);
        System.out.println();
        System.out.printf("Łączna suma wypłaconych pieniędzy z konta: %.2f", substractDeposite);
        System.out.println();
        System.out.printf("Łączna wartość odsetek: %.2f", monthInterestRate);
    }
}
