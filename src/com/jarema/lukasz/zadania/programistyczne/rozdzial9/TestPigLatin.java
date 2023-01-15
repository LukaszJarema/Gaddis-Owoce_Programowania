package com.jarema.lukasz.zadania.programistyczne.rozdzial9;

import java.util.Scanner;

public class TestPigLatin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj zdanie które chcesz zamienić na świńską łacinę: ");
        PigLatin pigLatin = new PigLatin(scanner.nextLine());
        System.out.println(pigLatin.changeStringToPigLatin());
    }
}
