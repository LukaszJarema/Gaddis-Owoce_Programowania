package com.jarema.lukasz.warsztat.projektanta.algorytmow4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Zmodyfikuj kod z ćwiczenia 18., tak aby dodawał wszystkie liczby wczytane z pliku i wyświetlał ich sumę.
 */

public class Zad19 {
    public static void main(String[] args) throws FileNotFoundException {
        File myFile = new File("D:\\Private\\Java\\Gaddis Owoce Programowania\\src\\com\\jarema\\lukasz\\" +
                "warsztat\\projektanta\\algorytmow4\\NumberList.txt");
        Scanner inputFile = new Scanner(myFile);
        int sum = 0;
        while (inputFile.hasNext()) {
            String line = inputFile.nextLine();
            System.out.println(line);
            sum += Integer.valueOf(line);
        }
        System.out.println("Suma liczb z pliku = " + sum);
        inputFile.close();
    }
}
