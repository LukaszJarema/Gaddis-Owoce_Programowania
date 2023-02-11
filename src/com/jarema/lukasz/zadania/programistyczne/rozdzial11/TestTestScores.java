package com.jarema.lukasz.zadania.programistyczne.rozdzial11;

public class TestTestScores {
    public static void main(String[] args) {
        int [] scores = {55, 101, -2, 55};
        TestScores testScores = new TestScores(scores);
        System.out.println(testScores.getAverage());
    }
}
