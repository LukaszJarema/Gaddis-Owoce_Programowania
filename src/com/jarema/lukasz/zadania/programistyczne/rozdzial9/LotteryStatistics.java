package com.jarema.lukasz.zadania.programistyczne.rozdzial9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Statystyki dotyczące loterii.
 * Aby zagrać w loterii PowerBall, należy kupić kupon z pięcioma liczbami z przedziału od 1 do 69 oraz jednym numerem
 * PowerBall, z przedziału od 1 do 26 (w pliku z danymi występują numery PowerBall od 1 do 39). Możesz wybrać te liczby
 * samodzielnie lub zdać się na losowy wybór maszyny. Następnie określonego dnia maszyna losuje zwycięski zestaw liczb.
 * Jeśli pięć pierwszych wylosowanych liczb pasuje do Twoich numerów, a wylosowana liczba PowerBall pasuje do Twojej,
 * wygrywasz bardzo dużą kwotę pieniędzy. Jeżeli tylko część Twoich numerów pasuje do wylosowanych, wygrywasz mniejszą
 * sumę (zależy ona od liczby pasujących numerów).
 * W pliku pbnumbers.txt znajdują się wylosowane numery w loterii PowerBall z okresu od 3 lutego 2010r. do 11 maja
 * 2016r. Plik ten zawiera 654 wylosowane zestawy liczb. Każdy wiersz w tym pliku zawiera zestaw sześciu liczb
 * wylosowanych określonego dnia. Te liczby są rozdzielone spacją, a ostatnia wartość w każdym wierszu jest numerem
 * PowerBall z danego dnia.
 * Napisz jeden lub kilka programów, które operują na tym pliku i wykonują następujące działania:
 * - wyświetlają 10 najczęściej losowanych liczb uporządkowanych zgodnie z częstotliwością ich wystąpień,
 * - wyświetlają 10 najrzadziej losowanych liczb uporządkowanych zgodnie z częstotliwością ich wystąpień,
 * //TODO
 * - wyświetlają 10 liczb, które nie pojawiły się od najdłuższego czasu (uporządkowanych od tej wylosowanej po raz
 * ostatni najdawniej),
 * //TODO
 * - wyświetlają liczbę wystąpień każdej wartości z przedziału od 1 do 69 oraz liczbę wystąpień każdego numeru PowerBall
 * (od 1 do 39).
 */

public class LotteryStatistics {
    private final File PBNUMBERS = new File("pbnumbers.txt");

    /**
     * Konstruktor bezargumentowy obiektu typu LotteryStatistics
     */
    public LotteryStatistics() {

    }

    /**
     * Metoda tenMostCommonDigitsInDescendingOrder zwraca tablicę dziesięciu najczęściej losowanych liczb w loterii
     * @return tablica dziesięciu najczęściej losowanych liczb w loterii
     * @throws IOException Input / Output Exception
     */
    public int [] tenMostCommonDigitsInDescendingOrder() throws IOException {
        int [] mostCommon = new int[10];
        int [] howManyTimes = new int[69];

        for (int i = 0; i < howManyTimes.length; i++) {
            for (int j = 0; j < listOfNumbersFromLottery().size(); j++) {
                if (listOfNumbersFromLottery().get(j) == (i + 1))
                    howManyTimes[i]++;
            }
        }

        int max = -1;
        int index = -1;
        for (int i = 0; i < mostCommon.length; i++) {
            for (int j = 0; j < howManyTimes.length; j++) {
                if (howManyTimes[j] > max) {
                    max = howManyTimes[j];
                    index = j;
                    mostCommon[i] = (index + 1);
                }
            }
            howManyTimes[index] = Integer.MIN_VALUE;
            max = -1;
            index = -1;
        }

        return mostCommon;
    }

    public int [] tenLeastCommonDigitsInAscendingOrder() throws IOException {
        int [] leastCommon = new int[10];
        int [] howManyTimes = new int[69];

        for (int i = 0; i < howManyTimes.length; i++) {
            for (int j = 0; j < listOfNumbersFromLottery().size(); j++) {
                if (listOfNumbersFromLottery().get(j) == (i + 1))
                    howManyTimes[i]++;
            }
        }

        int min = 70;
        int index = -1;
        for (int i = 0; i < leastCommon.length; i++) {
            for (int j = 0; j < howManyTimes.length; j++) {
                if (howManyTimes[j] < min) {
                    min = howManyTimes[j];
                    index = j;
                    leastCommon[i] = (index + 1);
                }
            }
            howManyTimes[index] = Integer.MAX_VALUE;
            min = 70;
            index = -1;
        }

        return leastCommon;
    }

    /**
     * Metoda listOfNumbersFromLottery wprowadza do obiektu typu ArrayList wszystkie liczby z pliku pbnumbers.txt
     * @return zwraca listę wszystkich wartości liczbowych z pliku pbnumbers.txt
     * @throws FileNotFoundException wyjątek dotyczący nieodnalezienia pliku
     */
    private ArrayList<Integer> listOfNumbersFromLottery() throws FileNotFoundException {
        Scanner input = new Scanner(PBNUMBERS);
        ArrayList<Integer> list = new ArrayList<>();
        while (input.hasNext()) {
            String [] stringArray = input.nextLine().split(" ");
            for (int i = 0; i < stringArray.length; i ++) {
                list.add(Integer.valueOf(stringArray[i]));
            }
        }
        return list;
    }

    /**
     * Metoda arrayOfNumberFromLottery zapisuje w tablicy dwuwymiarowej wyniki losowań PowerBall z pliku pbnumbers.txt
     * @return tablica dwuwymiarowa z wynikami losowań PowerBall
     * @throws IOException Input / Output exception
     */
    private int [] [] arrayOfNumberFromLottery() throws IOException {
        int rows = (int) Files.lines(Paths.get(PBNUMBERS.toURI())).count();
        final int COLUMNS = 6;
        Scanner input = new Scanner(PBNUMBERS);
        int [] [] array = new int [rows][COLUMNS];
        while (input.hasNext()) {
            for (int i = 0; i < array.length; i++) {
                String [] stringArray = input.nextLine().split(" ");
                for (int j = 0; j < array[i].length; j++) {
                    array [i] [j] = Integer.valueOf(stringArray[j]);
                }
            }
        }
        return array;
    }
}
