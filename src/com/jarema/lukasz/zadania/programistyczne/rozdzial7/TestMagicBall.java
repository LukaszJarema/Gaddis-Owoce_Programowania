package com.jarema.lukasz.zadania.programistyczne.rozdzial7;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestMagicBall {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        char ch = 'N';
        System.out.print("Podaj nazwę pliku z którego chcesz wczytać odpowiedzi: ");
        String fileName = scanner.nextLine();
        MagicBall magicBall = new MagicBall(fileName);
        do {
            System.out.print("Zadaj pytanie magicznej kuli: ");
            String question = scanner.nextLine();
            magicBall.getAnswer();
            System.out.print("Czy chcesz zadać kolejne pytanie? ");
            ch = scanner.next().charAt(0);
        } while (!(ch == 'N' || ch == 'n'));
    }
}
