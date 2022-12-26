package com.jarema.lukasz.zadania.programistyczne.rozdzial7;

/**
 * Sprawdzanie poprawności rachunku obciążeniowego.
 * Utwórz klasę z metodą przyjmującą jako argument numer rachunku obciążeniowego. Ta metoda powinna określać, czy numer
 * jest prawidłowy, porównując go z następującą listą poprawnych rachunków:
 * 5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 8080152, 4562555, 5552012, 5050552, 7825877, 1250255, 1005231,
 * 6545231, 3852085, 7576651, 7881200, 4581002
 * Te liczby należy zapisać w tablicy lub obiekcie typu ArrayList. Zastosuj wyszukiwanie sekwencyjne do lokalizowania
 * liczby przekazanej jako argument. Jeśli dana liczba znajduje się w tablicy, metoda powinna zwracać wartość true,
 * oznaczającą, że liczba jest poprawna. Jeżeli przekazanej liczby nie ma w tablicy, metoda powinna zwrócić wartość
 * false, co oznacza, że liczba jest niepoprawna.
 * Napisz program, który testuje tę klasę. Powinien on wyświetlać prośbę o wpisanie numeru konta obciążeniowego, a
 * następnie pokazywać komunikat z informacją, czy liczba jest poprawna.
 */
public class ChargeAccountValidation {
    private final int[] accountsNumber = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 8080152, 4562555, 5552012,
            5050552, 7825877, 1250255, 1005231, 6545231, 3852085, 7576651, 7881200, 4581002};

    /**
     * Konstruktor bezargumentowy obiektu typu ChargeAccountValidation
     */
    public ChargeAccountValidation() {

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
        while (!found && index < accountsNumber.length) {
            if (accountsNumber[index] == num) {
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
