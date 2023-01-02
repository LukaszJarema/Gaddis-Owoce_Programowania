package com.jarema.lukasz.zadania.programistyczne.rozdzial8;

import java.util.Scanner;

public class TestRoomDimensionAndRoomCarpet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double length, width, cost;

        do {
            System.out.print("Podaj długość pomieszczenia w metrach: ");
            length = scanner.nextDouble();
        } while (length < 0);

        do {
            System.out.print("Podaj szerokość pomieszczenia: ");
            width = scanner.nextDouble();
        } while (width < 0);

        do {
            System.out.print("Podaj cenę za metr kwadratowy wykładziny: ");
            cost = scanner.nextDouble();
        } while (cost < 0.0);

        RoomDimension roomDimension = new RoomDimension(length, width);
        RoomCarpet roomCarpet = new RoomCarpet(roomDimension, cost);
        System.out.println(roomCarpet);
    }
}
