package com.jarema.lukasz.zadania.programistyczne.rozdzial9;

/**
 * Lista numerów telefonów na potrzeby telemarketingu.
 * Napisz program zawierający dwie równoległe tablice obiektów typu String. Jedna z tych tablic powinna przechowywać
 * imiona i nazwiska, a druga - numery telefonów tych osób. Oto przykładowa zawartość obu tych tablic:
 * Przykładowa zawartość tablicy name:  Przykładowa zawartość tablicy phone:
 * "Hurkacz, Renata"                    "555-312-642"
 * "Jurczyk, Julia"                     "555-253-122"
 * "Szewczyk, Waldemar"                 "555-128-940"
 * "Szewczyk, Bartosz"                  "555-420-851"
 * Program powinien wyświetlać prośbę o wpisanie szukanego w tablicy nazwiska lub kilku jego pierwszych liter. Następnie
 * powinien wyświetlać wszystkie nazwiska pasujące do wprowadzonych danych i powiązane numery telefonów.
 */

public class PhoneNumbers {
    private final String [] name = {"Hurkacz, Renata", "Jurczyk, Julia", "Szewczyk, Waldemar", "Szewczyk, Bartosz"};
    private final String [] phone = {"555-312-642", "555-253-122", "555-128-940", "555-420-851"};

    /**
     * Konstruktor bezargumentowy obiektu typu PhoneNumbers
     */
    public PhoneNumbers() {

    }

    /**
     * Metoda getNameAndPhone przyjmuje jako argument ciąg znaków, a następnie porównuje go z ciągami zapisanymi w
     * tablicy name. Jeśli początkowa wartość ciągu z tablicy zgadza się z ciągiem z argumentu na konsoli wydrukowana
     * zostaje informacja z tablicy name oraz tablicy phone
     * @param str ciąg znaków
     */
    public void getNameAndPhone(String str) {
        for (int i = 0; i < name.length; i ++) {
            String subStr = name[i].substring(0, str.length());
            if (subStr.equals(str))
                System.out.println(name[i] + ": " + phone[i]);
        }
    }
}
