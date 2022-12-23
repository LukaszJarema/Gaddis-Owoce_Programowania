package com.jarema.lukasz.zadania.programistyczne.rozdzial6;

/**
 * Kolory w ruletce.
 * Koło ruletki obejmuje przedziały o numerach od 0 do 36. Oto kolory tych przedziałów:
 * - Przedział numer 0 jest zielony.
 * - W zakresie od 1 do 10 przedziały nieparzyste są czerwone, a parzyste czarne.
 * - W zakresie od 11 do 18 przedziały nieparzyste są czarne, a parzyste są czerwone.
 * - W zakresie od 19 do 28 przedziały nieparzyste są czerwone, a parzyste czarne.
 * - W zakresie od 29 do 36 przedziały nieparzyste są czarne, a parzyste czerwone.
 * Napisz klasę RoulettePocket. Konstruktor tej klasy powinien przyjmować numery przedziału. W klasie należy udostępnić
 * metodę getPocketColor, która zwraca kolor przedziału jako łańcuch znaków.
 * Zademonstruj działanie tej klasy w programie, który wyświetla pytanie o numer przedziału i informację o tym, czy dany
 * przedział jest zielony, czerwony czy czarny. Program powinien wyświetlać komunikat o błędzie, jeśli użytkownik
 * wprowadzi numer z przedziału od 0 do 36.
 */
public class RoulettePocket {
    private int fieldNumber;

    /**
     * Konstruktor bezargumentowy obiektu typu RoulettePocket
     */
    public RoulettePocket() {

    }

    /**
     * Konstruktor obiektu typu RoulettePocket przyjmujący jako argument wartość pola fieldNumber
     * @param fieldNumber wartość pola fieldNumber
     */
    public RoulettePocket(int fieldNumber) {
        this.fieldNumber = fieldNumber;
    }

    //Akcesor

    /**
     * Metoda getFieldNumber obiektu typu RoulettePocket zwraca wartość pola fieldNumber
     * @return wartość pola fieldNumber
     */
    public int getFieldNumber() {
        return fieldNumber;
    }

    //Mutator

    /**
     * Metoda setFieldNumber obiektu typu RoulettePocket zapisuje wartość w polu fieldNumber
     * @param fieldNumber wartość pola fieldNumber
     */
    public void setFieldNumber(int fieldNumber) {
        this.fieldNumber = fieldNumber;
    }

    /**
     * Metoda getPocetColor obiektu typu RoulettePockcet wyświetla kolor pola ruletki na podstawie pola fieldNumber
     * @param fieldNumber wartość pola fieldNumber
     * @return
     */
    public String getPocketColor(int fieldNumber) {
        if (fieldNumber == 0) {
            return "zielone";
        } else if (fieldNumber >= 1 && fieldNumber <= 10 && fieldNumber % 2 == 0) {
            return "czarne";
        } else if (fieldNumber >= 1 && fieldNumber <= 10 && fieldNumber % 2 == 1) {
            return "czerwone";
        } else if (fieldNumber >= 11 && fieldNumber <= 18 && fieldNumber % 2 == 0) {
            return "czerwone";
        } else if (fieldNumber >= 11 && fieldNumber <= 18 && fieldNumber % 2 == 1) {
            return "czarne";
        } else if (fieldNumber >= 19 && fieldNumber <= 28 && fieldNumber % 2 == 0) {
            return "czarne";
        } else if (fieldNumber >= 19 && fieldNumber <= 28 && fieldNumber % 2 == 1) {
            return "czerwone";
        } else if (fieldNumber >= 29 && fieldNumber <= 36 && fieldNumber % 2 == 0) {
            return "czerwone";
        } else if (fieldNumber >= 29 && fieldNumber <= 36 && fieldNumber % 2 == 1) {
            return "czarne";
        } else {
            return "BŁĘDNY NUMER POLA\n";
        }
    }
}
