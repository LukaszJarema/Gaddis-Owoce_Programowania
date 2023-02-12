package com.jarema.lukasz.zadania.programistyczne.rozdzial11;

import java.io.IOException;

public class TestFileArray {
    public static void main(String[] args) throws IOException {
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        FileArray.writeArray("FileArray.dat", array);
        FileArray.readArray("FileArray.dat", array);
    }
}
