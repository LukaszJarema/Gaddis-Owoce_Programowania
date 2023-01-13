package com.jarema.lukasz.zadania.programistyczne.rozdzial9;

/**
 * Tłumacz alfabetycznych numerów telefonów.
 * Firmy posługują się czasem numerami telefonu takimi jak 555-MUR-BET, które łatwiej jest zapamiętać klientom.
 * W standardowym telefonie litery alfabetu są powiązane z cyframi w nastepujący sposób:
 * A, B i C = 2
 * D, E i F = 3
 * G, H i I = 4
 * J, K i L = 5
 * M, N i O = 6
 * P, Q, R i S = 7
 * T, U i V = 8
 * W, X, Y i Z = 9
 * Napisz aplikację, która wyświetla prośbę o wprowadzenie 9-cyfrowego numeru telefonu w formacie XXX-XXX-XXX. Aplikacja
 * powinna następnie wyświetlać numer telefonu z literami przekształconymi na ich liczbowe odpowiedniki. Na przykład
 * po wprowadzeniu przez użytkownika numeru 555-MUR-BET aplikacja powinna wyświetlać 555-687-238.
 */

public class TranslatorOfAlfabeticalPhoneNumbers {
    private String phoneNumber;

    /**
     * Konstruktor bezargumentowy obiektu typu TranslatorOfAlfabeticalPhoneNumbers
     */
    public TranslatorOfAlfabeticalPhoneNumbers() {

    }

    /**
     * Konstruktor obiektu typu TranslatorOfAlfabeticalPhoneNumbers przyjmujący jako argument wartość pola phoneNumber
     *
     * @param phoneNumber wartość pola phoneNumber
     */
    public TranslatorOfAlfabeticalPhoneNumbers(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //Akcesor i mutator

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void translatePhoneNumber() {
        boolean flag = true;
        phoneNumber = phoneNumber.toUpperCase();
        char[] array = phoneNumber.toCharArray();
        StringBuilder sb = new StringBuilder();

        do {
            for (int i = 0; i < array.length; i++) {
                if ((array[i] < '0' && array[i] > '9') || (array[i] < 'A' && array[i] > 'Z') && array[i] != '-') {
                    flag = false;
                    System.out.println("W podanym numerze telefonu jest niepoprawny znak.");
                    break;
                }
            }
            if (array.length != 11 || array[3] != '-' || array[7] != '-') {
                System.out.println("Podany numer telefonu nie jest podany zgodnie z notacją. Prawidłowa notacja:" +
                        "XXX-XXX-XXX");
                flag = false;
            }
            else {
                for (int i = 0; i < array.length; i++) {
                    if (array[i] >= 'A' && array[i] <= 'C')
                        sb.setCharAt(i, (char) 2);
                    else if (array[i] >= 'D' && array[i] <= 'F')
                        sb.setCharAt(i, (char) 3);
                    else if (array[i] >= 'G' && array[i] <= 'I')
                        sb.setCharAt(i, (char) 4);
                    else if (array[i] >= 'J' && array[i] <= 'L')
                        sb.setCharAt(i, (char) 5);
                    else if (array[i] >= 'M' && array[i] <= 'O')
                        sb.setCharAt(i, (char) 6);
                    else if (array[i] >= 'P' && array[i] <= 'S')
                        sb.setCharAt(i, (char) 7);
                    else if (array[i] >= 'T' && array[i] <= 'V')
                        sb.setCharAt(i, (char) 8);
                    else if (array[i] >= 'W' && array[i] <= 'Z')
                        sb.setCharAt(i, (char) 9);
                    else
                        sb.append(array[i]);
                }
                System.out.println("Numer telefonu po konwersji: " + sb.toString());
                flag = false;
            }
        } while (flag = false);
    }
}
