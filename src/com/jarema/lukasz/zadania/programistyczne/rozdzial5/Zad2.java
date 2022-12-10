package com.jarema.lukasz.zadania.programistyczne.rozdzial5;

import java.util.Scanner;

/**
 * Kalkulator ceny detalicznej.
 * Napisz program, który wyświetla prośbę o wpisanie ceny hurtowej produktu i maraży (w procentach). Program powinien
 * wyświetlać cenę detaliczną. Oto przukład:
 * - Jeśli cena hurtowa wynosi 5,00 zł, a marża to 100%, to cena detaliczna jest równa 10,00 zł.
 * - Jeśli cena hurtowa to 5,00 zł, a marża jest równa 50%, to cena detaliczna wynosi 7,50 zł.
 * Program powinien obejmować metodę calculateRetail, która przyjmuje argumenty w postaci ceny hurtowej i marży oraz
 * zwraca cenę detaliczną produktu.
 */

public class Zad2 {
    public static void main(String[] args) {
        double wholesalePrice;
        int margin;
        System.out.print("Podaj cenę hurtową produktu: ");
        Scanner scanner = new Scanner(System.in);
        wholesalePrice = scanner.nextDouble();
        System.out.print("Podaj marżę w procentach: ");
        margin = scanner.nextInt();

        System.out.println(calculateRetail(wholesalePrice, margin));
    }

    public static double calculateRetail(double wholesalePrice, int margin) {
        double retailPrice = wholesalePrice + wholesalePrice * margin / 100;
        return retailPrice;
    }
}
