package com.jarema.lukasz.zadania.programistyczne.rozdzial11;

public class TestTestScores {
    public static void main(String[] args) throws InvalidTestScore {
        int [] scores = {55, 100, 100, 55};
        TestScores testScores = new TestScores(scores);
        System.out.println(testScores.getAverage());
    }
}
