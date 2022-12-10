package com.jarema.lukasz.rozdzial3;

import java.util.Scanner;

/**
 * Program Indeks BMI.
 * Program, który oblicza i wyświetla indeks BMI (body mass index) danej osoby. Indeks BMI często służy do oceny, czy
 * osoba o określonym wzroście ma nadwagę lub niedowagę. Ten indeks można oblićzyć za pomocą następującego wzrou:
 * BMI = waga / wzrost^2
 * Waga jest tu podawana w kilogramach, natomiast wzrost w metrach (np. 1,85 dla 185cm). Program powinien wyświetlać
 * komunikat z informacją, czy dana osoba ma optymalną wagę, czy też ma niedowagę lub nadwagę. Dla osoby prowadzącej
 * siedzący tryb życia za optymalny uznaje się indeks BMI z przedziału od 18,5 do 25. Indeks BMI poniżej 18,5 wskazuje
 * na niedowagę, a wartość powyżej 25 może oznaczać nadwagę.
 */

public class Zad3 {
    public static void main(String[] args) {

        System.out.println("Witaj w programie Twoje BMI!\nProgram ten na podstawie Twojej wagi i wzrostu oblicza Twoje " +
                "BMI i zwraca infomację na jego temat.");
        double weigth, length, bmi;

        System.out.println("Wprowadź swoją wagę w kg:");
        Scanner scanner = new Scanner(System.in);
        weigth = scanner.nextFloat();

        System.out.println("Wprowadź swój wzrost w metrach:");
        length = scanner.nextFloat();

        bmi = weigth / Math.pow(length, 2);

        if(bmi >= 18.5 && bmi <= 25){
            System.out.printf("Twoje MI wynosi: %.2f\nJest ono optymalne.", bmi);
        } else if(bmi < 18.5){
            System.out.printf("Twoje MI wynosi: %.2f\nMasz niedowagę.", bmi);
        } else {
            System.out.printf("Twoje MI wynosi: %.2f\nMasz nadwagę.", bmi);
        }
    }
}
