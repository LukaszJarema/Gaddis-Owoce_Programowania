package com.jarema.lukasz.zadania.programistyczne.rozdzial9;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Program wypisujący czeki.
 * Napisz program, który wyświetla fikcyjny czek. Program powinien wyświetlać prośbę o wprowadzenie daty, nazwiska
 * odbiorcy czeku i kwoty. Następnie powinien wyświetlać fikcyjny czek z zapisaną słownie kwotą w złotych.
 */

public class ChequeWriting {
    private LocalDate date;
    private String surname;
    private double amount;

    /**
     * Konstruktor bezargumentowy obiektu typu ChequeWriting
     */
    public ChequeWriting() {

    }

    /**
     * Konstruktor obiektu ChequeWriting przyjmujący jako argumenty wartość pól date, surname, amount
     * @param date wartość pola date
     * @param surname wartość pola surname
     * @param amount wartość pola amount
     */
    public ChequeWriting(LocalDate date, String surname, double amount) {
        this.date = date;
        this.surname = surname;
        this.amount = amount;
    }

    //Akcesory

    public LocalDate getDate() {
        return date;
    }

    public String getSurname() {
        return surname;
    }

    public double getAmount() {
        return amount;
    }

    //Mutatory

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * Metoda changeAmountToString zamienia wartość liczbową na łańcuch znaków reprezentujący kwotę
     * @return łańcuch znaków reprezentujący kwotę
     */
    private String changeAmountToString(double amount) {
        int s; //liczba setek
        int d; //liczba dziesiątek
        int j; //liczba jedności
        int n; //liczba nastek
        int g = 0; //rząd wielkości
        int k = 0; //forma gramatyczna
        String str = "";
        String character = "";
        String [] unity = {"", "jeden ", "dwa ", "trzy ", "cztery ", "pięć ", "sześć ", "siedem ", "osiem ", "dziewięć "};
        String [] tenToNineteen = {"", "jedenaście ", "dwanaście ", "trzynaście ", "czternaście ", "piętnaście ",
                "szesnaście ", "siedemnaście ", "osiemnaście ", "dziewiętnaście "};
        String [] tens = {"", "dziesięć ", "dwadzieścia ", "trzydzieści ", "czterdzieści ", "pięćdziesiąt ",
                "sześćdziesiąt ", "siedemdziesiąt ", "osiemdziesiąt ", "dziewięćdziesiąt "};
        String [] hundreds = {"", "sto ", "dwieście ", "trzysta ", "czterysta ", "pięćset ", "sześćset ", "siedemset ",
                "osiemset ", "dziewięćset "};
        String [] [] groups = {{"", "", ""}, {"tysiąc ", "tysiące ", "tysięcy "}, {"milion ", "miliony ", "milionów "},
                {"miliard ", "miliardy ", "miliardów "}, {"bilion ", "biliony ", "bilionów "},
                {"biliard ", "biliardy ", "biliardów "}, {"trylion ", "tryliony ", "trylionów "}};
        if (amount == 0)
            str = "zero";
        if (amount < 0) {
            character = "minus";
            amount = -amount;
        }

        while (amount != 0.0) {
            s = (int) (amount % 1000 / 100);
            d = (int) (amount % 100/ 10);
            j = (int) (amount % 10);

            if (d == 1 && j > 0) {
                n = j;
                d = 0;
                j = 0;
            } else
                n = 0;

            if (j == 1 && (s + d + n) == 0) {
                k = 0;
                if ((s + d) == 0 && g > 0) {
                    j = 0;
                    str = groups[g][k] + str;
                } else if (j == 2 || j == 3 || j == 4) {
                    k = 1;
                } else
                    k = 2;
            }

            if ((s + d + n + j) > 0) {
                str = hundreds[s] + tens[d] + tenToNineteen[n] + unity[j] + groups[g][k] + str;
            }

            amount /= 1000;
            g++;
        }
        str = character + str;
        return str;
    }

    /**
     * Metoda displayCheque wyświetla na konsoli informacje dotyczące wystawionego czeku
     */
    public void displayCheque() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("                                    Data: " + date.format(dateTimeFormatter));
        System.out.println("Wypłacić Pani / Panu: " + surname + "           " + amount + " złotego");
        System.out.println(changeAmountToString(amount) + "złotych i " + changeAmountToString(getAmount() * 100 % 100)
                + "groszy");
    }
}
