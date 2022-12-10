package com.jarema.lukasz.warsztat.projektanta.algorytmow4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

/**
 * Napisz kod, który wykonuje następujące operacje: otwiera plik NumberList.txt, używa pętli do zapisania w tym pliku
 * liczb od 1 do 100 i zamyka plik.
 */

public class Zad17 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter outputFile = new PrintWriter("D:\\Private\\Java\\Gaddis Owoce Programowania\\src\\com\\" +
                "jarema\\lukasz\\warsztat\\projektanta\\algorytmow4\\NumberList.txt");
        for (int i = 0; i < 100; i++) {
            outputFile.println(i + 1);
        }
        outputFile.close();
    }
}
