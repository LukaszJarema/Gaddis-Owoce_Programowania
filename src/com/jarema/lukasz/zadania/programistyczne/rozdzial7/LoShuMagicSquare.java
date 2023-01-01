package com.jarema.lukasz.zadania.programistyczne.rozdzial7;

import java.util.ArrayList;
import java.util.Random;

/**
 * Kwadrat magiczny Lo Shu.
 * Kwadrat magiczny Lo Shu to siata składająca się z trzech wierszy i trzech kolumn. Ten kwadrat ma następujące cechy:
 * - zawiera cyfry od 1 do 9
 * - suma cyfr w każdym wierszu, w każdej kolumnie i na każdej przekątnej jest taka sama.
 * W programie możesz zasymulować kwadrat magiczny za pomocą tablicy dwuwymiarowej. Napisz metodę, która jako argument
 * przyjmuje tablicę dwuwymiarową i określa czy reprezentuje ona kwadrat magiczny Lo Shu. Sprawdź działanie tej metody
 * w programie.
 */

public class LoShuMagicSquare {
    private int [] [] loShuMagicSquare = new int[3][3];

    /**
     * Konstruktor bezargumentowy obiektu typu LoShuMagicSquare
     */
    public LoShuMagicSquare() {

    }

    /**
     * Metoda setLoShuMagicSquare obiektu typu LoShuMagicSquare przyjmuje jako argument tablicę dwuwymiarową i zapisuje
     * ją w polu loShuMagicSquare
     * @param loShuMagicSquare wartość pola loShuMagicSquare
     */
    public void setLoShuMagicSquare(int[][] loShuMagicSquare) {
        this.loShuMagicSquare = loShuMagicSquare;
    }

    /**
     * Metoda setLoShuMagicSquare obiektu typu LoShuMagicSquare wypełnia tablicę pola loShuMagicSquare wartościami z
     * zakresu 1 do 9 bez powtórzeń
     */
    public void setLoShuMagicSquare() {
        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        int rand = 0;
        for (int i = 0; i < 9; i++) {
            do {
                rand = random.nextInt(9) + 1;
            } while (numbers.contains(rand));
            numbers.add(rand);
        }
        for (int i = 0; i < loShuMagicSquare.length; i++) {
            for (int j = 0; j < loShuMagicSquare[i].length; j++) {
                loShuMagicSquare[i][j] = numbers.remove(0);
            }
        }
    }


    public int getRowTotal(int row) {
        int total = 0;
        for (int i = 0; i < loShuMagicSquare[row].length; i++) {
            total += loShuMagicSquare[row][i];
        }
        return total;
    }

    public int getColumnTotal(int column) {
        int total = 0;
        for (int i = 0; i < loShuMagicSquare.length; i++) {
            total += loShuMagicSquare[i][column];
        }
        return total;
    }

    public boolean isMagic() {
        int [] table = new int[8];
        table[0] = getRowTotal(0);
        table[1] = getRowTotal(1);
        table[2] = getRowTotal(2);
        table[3] = getColumnTotal(0);
        table[4] = getColumnTotal(1);
        table[5] = getColumnTotal(2);
        table[6] = loShuMagicSquare[0][0] + loShuMagicSquare[1][1] + loShuMagicSquare[2][2];
        table[7] = loShuMagicSquare[0][2] + loShuMagicSquare[1][1] + loShuMagicSquare[2][0];
        int theSame = 0;
        boolean isMagic;
        for (int i = 0; i < table.length - 1; i++) {
            if (table[i] == table[(i + 1)]) {
                theSame++;
            }
        }
        if (theSame == table.length) {
            isMagic = true;
        } else {
            isMagic = false;
        }
        return isMagic;
    }

    public void displayIsMagic() {
        if (isMagic()) {
            System.out.println("Kwadrat jest magiczny.");
        } else {
            System.out.println("Kwadrat nie jest magiczny.");
        }
    }
}
