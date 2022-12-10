package com.jarema.lukasz.rozdzial3;

import java.util.Scanner;

/**
 * Program do wyboru restauracji
 */

public class Zad18 {
    public static void main(String[] args) {
        System.out.println("Czy któraś z osób jest na diecie wegetariańskiej?");
        Scanner scanner = new Scanner(System.in);
        String wege = scanner.next();
        System.out.println("Czy któraś z osób jest na diecie wegańskiej?");
        String wegan = scanner.next();
        System.out.println("Czy któraś z osób jest na diecie bezglutenowej?");
        String bezglutenowa = scanner.next();

        if (wege.equals("tak") && wegan.equals("tak") && bezglutenowa.equals("tak")) {
            System.out.println("Możecie wybrać się do następujących restauracji:\nKawiarnia na rogu\nKuchnia u szefa");
        } else if (wege.equals("nie")) {

        }
    }
}
