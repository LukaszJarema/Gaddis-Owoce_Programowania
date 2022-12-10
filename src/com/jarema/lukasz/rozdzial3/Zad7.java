package com.jarema.lukasz.rozdzial3;

import java.util.Scanner;

/**
 * Program Posortowane imiona.
 * Program, który wyświetla porśbę o podanie trzech imion, a następnie wyświetla je posortowane rosnąco.
 */

public class Zad7 {
    public static void main(String[] args) {
        String name1, name2, name3;

        System.out.println("Program sortuje alfabetycznie wpisane przez użytkownika imiona.");
        System.out.println("Wprowadź pierwsze imię: ");
        Scanner scanner = new Scanner(System.in);
        name1 = scanner.nextLine();

        System.out.println("Wprowadź drugie imię: ");
        name2 = scanner.nextLine();

        System.out.println("Wprowadź trzecie imię: ");
        name3 = scanner.nextLine();

        if(name1.compareTo(name2) <= 0 && name2.compareTo(name3) <= 0){
            System.out.println("Posortowane imiona:\n" + name1 + "\n" + name2 + "\n" + name3);
        } else if (name1.compareTo(name2) >= 0 && name1.compareTo(name3) <= 0){
            System.out.println("Posortowane imiona:\n" + name2 + "\n" + name1 + "\n" + name3);
        } else if (name1.compareTo(name2) >=0 && name1.compareTo(name3) >= 0 && name2.compareTo(name3) >= 0) {
            System.out.println("Posortowane imiona:\n" + name3 + "\n" + name2 + "\n" + name1);
        } else if (name1.compareTo(name3) <= 0 && name3.compareTo(name2) <= 0) {
            System.out.println("Posortowane imiona:\n" + name1 + "\n" + name3 + "\n" + name2);
        } else if (name2.compareTo(name3) <= 0 && name3.compareTo(name1) <= 0) {
            System.out.println("Posortowane imiona:\n" + name2 + "\n" + name3 + "\n" + name1);
        } else {
            System.out.println("Posortowane imiona:\n" + name3 + "\n" + name1 + "\n" + name2);
        }
    }
}
