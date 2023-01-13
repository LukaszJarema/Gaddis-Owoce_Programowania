package com.jarema.lukasz.zadania.programistyczne.rozdzial9;

public class TestDiferentOpeationsOnStrings {
    public static void main(String[] args) {
        String string = "abcabeabdab";
        char [] array = {'a', 'b', 'c', 'd'};
        System.out.println(DiferentOpeationsOnStrings.wordCount(string));
        System.out.println(DiferentOpeationsOnStrings.arrayToString(array));
        System.out.println(DiferentOpeationsOnStrings.mostFrequent(string));
        System.out.println(DiferentOpeationsOnStrings.replaceSubstring("dwa psy i dwa koty", "dwa", "trzy"));
    }
}
