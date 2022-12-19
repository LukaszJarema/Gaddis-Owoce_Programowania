package com.jarema.lukasz.zadania.programistyczne.rozdzial6;

/**
 * Klasa SavingsAccount.
 * Zaprojektuj klasę SavingsAccount, która przechowuje roczną stopę oprocentowania i stan konta oszczędnościowego.
 * Konstruktor tej klasy powinien przyjmować początkowy stan konta. Klasa powinna też udostępniać metody do odejmowania
 * wypłacanej kwoty, dodawania deponowanej sumy i dodawania miesięcznych odsetek do stanu konta. Miesięczna stopa
 * procentowa to stopa roczna podzielona przez 12. Aby dodać do stanu konta miesięczne odsetki, należy pomnożyć
 * miesięczną stopę oprocentowania przez stan konta, a następnie dodać wynik do tego stanu.
 * Przetestuj tę klasę w programie, któy oblicza stan konta na koniec danego okresu. Program powinien wyświetlać pytania
 * o roczną stopę oprocentowania, początkowy stan konta i liczbę miesięcy od czasu założenia konta. Następnie w pętli
 * należy uruchomić iterację dla każdego miesiąca i wykonać następujące operacje:
 * a. Wyświetlać pytanie o kwotę zdeponowaną na koncie w danym miesiącu. Należy za pomocą metody klasy dodać tę kwotę
 * do stanu konta.
 * b. Wyświetlać pytanie o kwotę wypłaconą z konta w danym miesiącu. Należy za pomocą metody klasy odjąć tę kwotę od
 * stanu konta.
 * c. Obliczyć miesięczne odsetki za pomocą metody.
 * Po ostatniej iteracji program powinien wyświetlić stan końcowy, łączną sumę zdeponowanych środków, łączną sumę
 * wypłaconych pieniędzy i łączną wartość odsetek.
 */
public class SavingsAccount {
    private double annualInterestRate = 0.0;
    private double accountBalance = 0.0;

    /**
     * Konstruktor obiektu typu SavingsAccount przyjmujący wartość rocznej stopy procentowej oraz stanu konta
     * @param annualInterestRate wartość zapisana w polu annualInterestRate
     * @param accountBalance wartość zapisana w polu accountBalance
     */
    public SavingsAccount(double annualInterestRate, double accountBalance) {
        this.annualInterestRate = annualInterestRate;
        this.accountBalance = accountBalance;
    }

    /**
     * Konstruktor bezargumentowy obiektu typu SavingsAccount
     */
    public SavingsAccount() {

    }

    //Akcesory

    /**
     * Metoda getAnnualInterestRate obiektu typu SavingsAccount zwraca wartość pola annualInterestRate
     * @return wartość pola annualInterestRate
     */
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    /**
     * Metoda getAccountBalance obiektu typu SavingsAccunt zwraca wartość pola accountBalance
     * @return wartość pola accountBalance
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    //Mutatory

    /**
     * Metoda setAnnualInterestRate obiektu typu SavingsAccount zapisuje wartość w polu annualInterestRate
     * @param annualInterestRate wartość pola annualInterestRate
     */
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    /**
     * Metoda setAccountBalance obiektu typu SavingsAccount zapisuje wartość w polu accountBalance
     * @param accountBalance wartość pola accountBalance
     */
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    /**
     * Metoda addingDepositedAmmount obiektu typu SavingsAccount dodaje wartość addingDeposit do pola accountBalance
     * @param addingDeposit wartość dodana do pola accountBalance
     */
    public void addingDepositedAmmount(double addingDeposit) {
        accountBalance += addingDeposit;
    }

    /**
     * Metoda substractionDepositedAmmount obiektu typu SavingsAccount odejmuje wartość substractionDeposit od pola
     * accountBalance
     * @param substractionDeposit wartość odjęta od pola accountBalance
     */
    public void substractionDepositedAmmount(double substractionDeposit) {
        accountBalance -= substractionDeposit;
    }

    /**
     * Metoda addMonthInterestRate obiektu typu SavingsAccount dodaje miesięczną wartość oprocentowania konta do pola
     * accountBalance
     * @param annualInterestRate wartość rocznej stopy oprocentowania
     */
    public void addMonthInterestRate(double annualInterestRate) {
        accountBalance = accountBalance + (accountBalance * annualInterestRate / 100.0 / 12.0);
    }

    /**
     * Metoda monthInterestRate przyjmuje wartość rocznej stopy procentowej i oblicza miesięczne odsetki od kwoty
     * zdeponowanej na koncie
     * @param annualInterestRate wartość oprocentowania rocznego
     * @return wartość odsetek za miesiąc
     */
    public double monthInterestRate(double annualInterestRate) {
        double monthInterestRate = (accountBalance * annualInterestRate / 100.0 / 12.0);
        return monthInterestRate;
    }
}
