package com.jarema.lukasz.warsztat.projektanta.algorytmow4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Napisz kod, który wykonuje następujące operacje: otwiera plik NumberList.txt utworzony w kodzie z ćwiczenia 17.,
 * wczytuje wszystkie liczby z tego pliku, wyświetla je, a następnie zamyka plik.
 */

public class Zad18 {
    public static void main(String[] args) throws FileNotFoundException {
        File myFile = new File("D:\\Private\\Java\\Gaddis Owoce Programowania\\src\\com\\jarema\\lukasz\\" +
                "warsztat\\projektanta\\algorytmow4\\NumberList.txt");
        Scanner inputFile = new Scanner(myFile);
        while (inputFile.hasNext()) {
            String line = inputFile.nextLine();
            System.out.println(line);
        }
        inputFile.close();
    }
}
