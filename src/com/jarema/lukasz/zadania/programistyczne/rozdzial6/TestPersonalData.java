package com.jarema.lukasz.zadania.programistyczne.rozdzial6;

public class TestPersonalData {
    public static void main(String[] args) {
        PersonalData person1 = new PersonalData("Łukasz", "Jarema", "Bydgoszcz"
        , 31, 123456789);
        PersonalData person2 = new PersonalData("Adam", "Majchrzak", "Wałbrzych"
        , 15, 987654321);
        PersonalData person3 = new PersonalData("Kaja", "Byk", "Warszawa"
        , 22, 555898123);

        person1.displayPersonalData();
        person2.displayPersonalData();
        person3.displayPersonalData();
    }
}
