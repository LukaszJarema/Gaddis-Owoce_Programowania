package com.jarema.lukasz.zadania.programistyczne.rozdzial7;

import java.util.Scanner;

public class TestPayroll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Payroll payroll = new Payroll();
        int size = payroll.getArrayLength();

        for (int i = 0; i < size; i++) {
            int hours = 0;
            double rate = 13.7;

            do {
                System.out.print("Podaj liczbę godzin przepracowanych przez Pracownika z numerem " +
                        payroll.getEmployeeId(i) + ": ");
                hours = scanner.nextInt();
                payroll.setHours(i, hours);
            } while (hours < 0);

            do {
                System.out.print("Podaj stawkę godzinową Pracownika z numerem " + payroll.getEmployeeId(i) + ": ");
                rate = scanner.nextDouble();
                payroll.setPayRate(i, rate);
            } while (rate < 13.7);

            payroll.setWages(i);
        }

        for (int i = 0; i < size; i++) {
            System.out.println("Pracownik o numerze: " + payroll.getEmployeeId(i) + " zarobił: " + payroll.getWages(i) +
                    " złotych.");
        }
    }
}
