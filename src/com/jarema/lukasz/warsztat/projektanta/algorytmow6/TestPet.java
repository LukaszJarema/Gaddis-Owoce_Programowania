package com.jarema.lukasz.warsztat.projektanta.algorytmow6;

import java.util.Scanner;

/**
 * Klasa testująca klasę Pet.
 */
public class TestPet {
    public static void main(String[] args) {
        Pet pet = new Pet();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj imię zwierzaka: ");
        pet.setName(scanner.nextLine());
        System.out.print("Podaj gatunek zwierzaka: ");
        pet.setAnimal(scanner.nextLine());
        System.out.print("Podaj wiek zwierzaka: ");
        pet.setAge(scanner.nextInt());

        System.out.println("Imię zwierzęcia: " + pet.getName());
        System.out.println("Gatunek zwierzęcia: " + pet.getAnimal());
        System.out.println("Wiek zwierzęcia: " + pet.getAge() + " lat");
    }
}
