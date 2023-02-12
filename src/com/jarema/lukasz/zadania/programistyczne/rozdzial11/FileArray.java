package com.jarema.lukasz.zadania.programistyczne.rozdzial11;

import java.io.*;

/**
 * Klasa FileArray.
 * Zaprojektuj klasę obejmującą statyczną metodę writeArray. Ta metoda powinna przyjmować dwa argumenty: nazwę pliku i
 * referencję do tablicy typu int. Metoda ma otworzyć podany plik jako binarny, zapisać w nim zawartość tablicy, a
 * następnie zamknąć plik.
 * Napisz w klasie drugą metodę, readArray. Powinna ona przyjmować dwa argumenty: nazwę pliku i referencję do tablicy
 * typu int. Metoda powinna otwierać plik, wczytywać z niego zawartość i zapisywać w tablicy, a następnie zamykać plik.
 * Zilustruj działanie obu metod w programie.
 */

public class FileArray {
    public static void writeArray(String fileName, int [] array) throws IOException {
        DataOutputStream outputFile = new DataOutputStream(new FileOutputStream(fileName));
        for (int i = 0; i < array.length; i++) {
            outputFile.writeInt(array[i]);
        }
        outputFile.close();
    }

    public static void readArray(String fileName, int [] array) throws IOException {
        boolean endOfFile = false;
        int index = 0;
        FileInputStream fileInputStream = new FileInputStream(fileName);
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);
        while (!endOfFile) {
            try {
                array[index] = dataInputStream.readInt();
                index++;
            } catch (EOFException e) {
                endOfFile = true;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        dataInputStream.close();
    }
}
