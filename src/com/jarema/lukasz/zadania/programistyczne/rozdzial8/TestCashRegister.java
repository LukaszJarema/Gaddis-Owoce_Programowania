package com.jarema.lukasz.zadania.programistyczne.rozdzial8;

import com.jarema.lukasz.zadania.programistyczne.rozdzial6.RetailItem;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestCashRegister {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        RetailItem retailItem = new RetailItem("Kurtka", 12, 159.95);
        int numberOfPices = 0;
        do {
            System.out.print("Podaj ile sztuk produktu " + retailItem.getDescription() + " chcesz kupić: ");
            numberOfPices = scanner.nextInt();
        } while (numberOfPices < 0);
        CashRegister cashRegister = new CashRegister(retailItem, numberOfPices);

        if (numberOfPices > retailItem.getUnitsOnHand())
            System.out.print("Nie mam tylu produktów na stanie. Posiadam: " + retailItem.getUnitsOnHand());
        else {
            PrintWriter printWriter = new PrintWriter("paragon.txt");
            printWriter.println(cashRegister);
            printWriter.close();
        }
    }
}
