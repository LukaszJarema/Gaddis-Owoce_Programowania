package com.jarema.lukasz.zadania.programistyczne.rozdzial7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Zmodyfikowane zadanie z kontem obciążeniowym.
 * Zmodyfikuj klasę do sprawdzania poprawności konta obciążeniowego, którą napisałeś w zadaniu 3. Nowa wersja powinna
 * wczytywać listę poprawnych numerów kont obciążeniowych z pliku. Do utworzenia tego pliku posłuż się Notatnikiem.
 */

public class ChargeAccountValidationFile {
    private ArrayList<Integer> accountsNumber = new ArrayList<>();

    /**
     * Konstruktor bezargumentowy obiektu typu ChargeAccountValidationFile
     */
    public ChargeAccountValidationFile() {

    }

    /**
     * Metoda setAccountsNumber obiektu typu ChargeAccountValidation file przyjmuje jako argument nazwę pliku, a
     * następnie skanuje plik w poszukiwaniu liczb całkowitych i wpisuje je do pola accountsNumber
     * @param fileName nazwa pliku
     * @throws FileNotFoundException
     */
    public void setAccountsNumber(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner inputFile = new Scanner(file);
        while (inputFile.hasNext()) {
            int number = inputFile.nextInt();
            accountsNumber.add(number);
        }
    }

    /**
     * Metoda isAccountExist oiektu typu ChargeAccountValidation sprawdza czy wprowadzony jako argument numer istnieje
     * w tablicy pola accountsNumber
     * @param num sprawdzany numer konta
     * @return true jeśli numer wprowadzony jako argument istnieje w tablicy pola accountsNumber w przeciwnym razie
     * false
     */
    public boolean isAccountExist(int num) {
        int index = 0;
        boolean found = false;
        while (!found && index < accountsNumber.size()) {
            if (accountsNumber.get(index) == num) {
                found = true;
            }
            index++;
        }
        return found;
    }

    /**
     * Metoda displayMessageIsAccountExist obiektu typu ChargeAccountValidation przyjmuje jako argument liczbę
     * przedstawiającą numer konta i jeśli ten numer istnieje w tablicy pola accountsNumber wyświetla komunikat, że
     * konto istnieje, w przeciwnym wypadku, że konto nie istnieje
     * @param num numer konta
     */
    public void displayMessageIsAccountExist(int num) {
        if (isAccountExist(num)) {
            System.out.println("Konto istnieje.");
        } else
            System.out.println("Konto nie istnieje.");
    }
}
