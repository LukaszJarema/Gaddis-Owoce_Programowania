package com.jarema.lukasz.zadania.programistyczne.rozdzial9;

/**
 * Sprawdzanie poprawności haseł.
 * Wyobraź sobie, że piszesz oprogramowanie dla firmy Amazon.com. Oprogramowanie to wymaga od użytkowników określenia
 * hasła. To hasło musi spełniać następujące wymogi:
 * - mieć przynajmniej sześć znaków,
 * - zawierać przynajmniej jedną wielką literę i jedną małą literę,
 * - zawierać przynajmniej jedną cyfrę.
 * Napisz klasę, która sprawdza czy hasło spełnia te wymogi. Zademonstruj działanie tej klasy w programie, który pozwala
 * użytkownikowi wpisać swoje hasło, a następnie wyświetla komunikat z informacją, czy jest ono poprawne.
 */

public class PasswordVerifier {
    private String password;
    private boolean correct;

    /**
     * Konstruktor obiektu typu PasswordVerifier przyjmujący jako argument wartość pola password
     * @param password wartość pola password
     */
    public PasswordVerifier(String password) {
        this.password = password;
    }

    /**
     * Metoda checkIfPasswordIsCorrect sprawdza czy hasło spełnia wymagane kryteria.
     * @return true jeśli hasło jest poprawne, w przeciwnym razie false
     */
    private boolean checkIfPasswordIsCorrect() {
        boolean status = true;
        int upperCase = 0,
                lowerCase = 0,
                digit = 0;
        if (password.length() < 6)
            status = false;
        char [] charArray = password.toCharArray();
        for (int i = 0; i < charArray.length; i ++) {
            if (Character.isLowerCase(charArray[i]) && status == true)
                lowerCase++;
            else if (Character.isUpperCase(charArray[i]) && status == true)
                upperCase++;
            else if (Character.isDigit(charArray[i]) && status == true)
                digit++;
        }
        if (upperCase > 0 && lowerCase > 0 && digit > 0 && status == true)
            status = true;
        else
            status = false;
        return status;
    }

    /**
     * Metoda displayInformationAboutPassword wyświetla w konsoli informację na temat hasła
     */
    public void displayInformationAboutPassword() {
        if (checkIfPasswordIsCorrect())
            System.out.println("Hasło spełnia wymagania.");
        else
            System.out.println("Hasło nie spełnia wymagań.");
    }
}
