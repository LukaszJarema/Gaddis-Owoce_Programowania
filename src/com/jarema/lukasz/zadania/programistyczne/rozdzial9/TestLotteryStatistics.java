package com.jarema.lukasz.zadania.programistyczne.rozdzial9;

import java.io.IOException;

public class TestLotteryStatistics {
    public static void main(String[] args) throws IOException {
        LotteryStatistics lottery = new LotteryStatistics();
        System.out.println("Oto 10 najczęściej losowanych liczb w loterii:");
        int [] mostCommon = new int[lottery.tenMostCommonDigitsInDescendingOrder().length];
        for (int i = 0; i < mostCommon.length; i++)
            mostCommon[i] = lottery.tenMostCommonDigitsInDescendingOrder()[i];
        for (int i = 0; i < mostCommon.length; i++)
            System.out.println(mostCommon[i]);
        System.out.println("Oto 10 najrzadziej losowanych liczb w loterii:");
        for (int i = 0; i < lottery.tenLeastCommonDigitsInAscendingOrder().length; i++)
            System.out.println(lottery.tenLeastCommonDigitsInAscendingOrder()[i]);

    }
}
