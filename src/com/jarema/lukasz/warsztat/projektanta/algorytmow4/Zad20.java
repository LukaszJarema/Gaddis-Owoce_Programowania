package com.jarema.lukasz.warsztat.projektanta.algorytmow4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Napisz kod, który otwiera plik NumberList.txt do zapisu, ale nie usuwa jego zawartości, jeśli ten plik istnieje.
 */

public class Zad20 {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("NumberList.txt", true);
        PrintWriter outputFile = new PrintWriter(fileWriter);
        outputFile.println("Test");
        outputFile.close();
    }
}
