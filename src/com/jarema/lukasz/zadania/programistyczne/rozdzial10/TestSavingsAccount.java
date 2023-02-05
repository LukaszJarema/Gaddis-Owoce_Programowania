package com.jarema.lukasz.zadania.programistyczne.rozdzial10;

import java.util.Scanner;

public class TestSavingsAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wartość początkową konta: ");
        double amount = scanner.nextDouble();
        System.out.print("Podaj wartość rocznego oprocentowania: ");
        double annualInterestRate = scanner.nextDouble();

        SavingsAccount savingsAccount = new SavingsAccount(amount, annualInterestRate);

        char ch = ' ';
        while (!(ch == 'N')) {
            System.out.print("Czy chcesz dokonać wpłaty na konto: ");
            ch = scanner.next().charAt(0);
            if (ch == 'N')
                System.out.println("Nie dokonałeś wpłaty na konto.");
            else {
                System.out.print("Ile chcesz wpłacić na konto: ");
                savingsAccount.deposit(scanner.nextDouble());
            }
        }

        ch = ' ';
        while (!(ch == 'N')) {
            System.out.print("Czy chcesz dokonać wypłaty z konta: ");
            ch = scanner.next().charAt(0);
            if (ch == 'N')
                System.out.println("Nie dokonałeś wypłaty z konta.");
            else {
                System.out.print("Ile chcesz wypłacić z konta: ");
                savingsAccount.withdraw(scanner.nextDouble());
            }
        }

        System.out.println(savingsAccount.toString());
    }
}
