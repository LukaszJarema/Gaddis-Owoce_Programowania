package com.jarema.lukasz.zadania.programistyczne.rozdzial9;

import java.util.Scanner;

public class TestMorseCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MorseCode morse = new MorseCode();
        System.out.print("Podaj zdanie które chcesz przekształcić na kod Morse'a: ");
        String str = scanner.nextLine();
        System.out.print("Tłumaczenie na kod Morse'a: " + morse.translateToMorseCode(str));
    }
}
