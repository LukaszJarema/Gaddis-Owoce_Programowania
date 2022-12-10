package com.jarema.lukasz.zadania.programistyczne.rozdzial4;

import java.util.Scanner;

/**
 * Obłożenie hotelu.
 * Poziom obłożenia hotelu jest obliczany w następujący sposób:
 * poziom obłożenia = liczba zajętych pokojów / łączna liczba pokojów
 * Napisz program obliczający poziom obłożenia dla każdego piętra hotelu. Program powinien wyświetlać prośbę o podanie
 * liczby pięter, a następnie w pętli wykonywać jedną iterację dla każdego piętra. W każdej iteracji pętla powinna
 * wyświetlać prośbę o podanie liczby wszystkich i zajętych pokojów z danego piętra. Po wszystkich iteracjach program
 * powinien wyświetlić łączną liczbę pokojów w hotelu, liczbę zajętych i pustych pokojów, a także poziom obłożenia.
 * Sprawdzanie poprawności danych wejściowych: Przy pobieraniu liczby pięter nie należy akceptować wartości mniejszych
 * od 1. Przy pobieraniu liczby pokojów na piętrze nie należy akceptować wartości mniejszych od 10.
 */

public class Zad7 {
    public static void main(String[] args) {
        int floors, roomsPerFloor, roomsBookedPerFloor,
                allRoomsBooked = 0,
                allRooms = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Podaj liczbę pięter w hotelu: ");
            floors = scanner.nextInt();
        } while (floors < 1);

        for (int i = 1; i <= floors; i++) {
            do {
                System.out.print("Podaj liczbę pokoi na piętrze nr " + i);
                roomsPerFloor = scanner.nextInt();
                allRooms += roomsPerFloor;

                System.out.print("Podaj liczbę zajętych pokoi na piętrze nr " + i);
                roomsBookedPerFloor = scanner.nextInt();
                allRoomsBooked += roomsBookedPerFloor;
            } while (roomsPerFloor < 10);
        }

        System.out.print("Łączna liczba pokojów w hotelu: " + allRooms + "\n");
        System.out.print("Liczba zajętych pokojów w hotelu: " + allRoomsBooked + "\n");
        System.out.print("Liczba wolnych pokjów w hotelu: " + (allRooms - allRoomsBooked + "\n"));
        System.out.print("Poziom obłożenia: " + (allRooms / allRoomsBooked) * 100 + "%");
    }
}
