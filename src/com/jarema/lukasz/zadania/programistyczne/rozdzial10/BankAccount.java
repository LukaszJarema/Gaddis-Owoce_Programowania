package com.jarema.lukasz.zadania.programistyczne.rozdzial10;

/**
 * Klasy BankAccount i SavingsAccount.
 * Zaprojektuj klasę abstrakcyjną BankAccount przechowującą następujące informacje na temat rachunku bankowego:
 * - stan konta,
 * - liczbę wpłat w danym miesiącu,
 * - liczbę wypłat,
 * - roczne oprocentowanie,
 * - miesięczne opłaty za prowadzenie konta.
 * W tej klasie należy udostępnić następujące metody:
 * - Konstruktor - powinien przyjmować argumenty ze stanem konta i rocznym oprocentowaniem.
 * - deposit - Ta metoda powinna przyjmować argument w postaci deponowanej kwoty, a następnie dodawać tę wartość do
 * stanu konta. Powinna też zwiększać wartość zmiennej przechowującej liczbę wpłat.
 * - withdraw - Ta metoda powinna przyjmować argument w postaci wypłacanej kwoty, a następnie odejmować tę wartość od
 * stanu konta. Powinna też zwiększać wartość zmiennej przechowującej liczbę wypłat.
 * - calcInterest - Ta metoda powinna aktualizaować stan konta, obliczając miesięczne odsetki i dodając je do stanu
 * konta. Używane są przy tym następujące wzory:
 * miesięczne oprocentowanie = (roczne oprocentowanie / 12)
 * miesięczne odsetki = stan konta x miesięczne oprocentowanie
 * stan konta = stan konta + miesięczne odsetki
 * - monthlyProcess - Ta metoda powinna odejmować miesięczną opłatę za zarządzenie od stanu konta, wywoływać metodę
 * calcInterest, a następnie zerować zmienne przechowujące liczbę wypłat, liczbę wpłat i kwotę miesięcznych opłat.
 * Następnie zaprojektuj klasę SavingsAccount, pochodną od klasy BankAccount. W klasie SavingsAccount powinno znajdować
 * się pole logiczne status informujące o tym czy konto jest aktywne. Jeśli stan konta oszczędnościowego spada poniżej
 * 25zł, staje się ono nieaktywne. Dopóki stan konta nie wzrośnie powyżej 25zł (powoduje to ponowne aktywowanie konta),
 * nie można dokonywać wypłaty. W klasie SavingsAccount należy udostępnić następujące metody:
 * - withdraw - Ta metoda przed dokonaniem wypłaty powinna określać, czy konto jest aktywne. Jeśli konto jest
 * niekatywne, wyplaty są niedozwolone. Wypłata jest realizowana w wyniku wywołania wersji metody z klasy bazowej.
 * - deposit - Ta metoda powinna przed dokonaniem wpłaty określać, czy konto jest aktywne. Jeśli konto jest nieaktywne,
 * a wpłata powoduje przekroczenie stanu 25zł, konto zostaje aktywowane. Następnie wpłata jest realizowana za pomocą
 * wywołania wersji metody z klasy bazowej.
 * - monthlyProcess - Ta metoda przed wywołaniem metody klasy bazowej sprawdza liczbę wypłat. Jeśli w danym miesiącu
 * przekracza ona cztery, do pola z kwotą miesięcznych opłat dodawanych jest 5zł za każdą wypłatę powyżej czterech. Nie
 * zapomnij o sprawdzeniu stanu konta po pobraniu opłat. Jeśli stan spadnie poniżej 25zł, konto stanie się nieaktywne.
 */

public abstract class BankAccount {
    private double accountBalance;
    private int numberOfPaymentDuringTheMonth;
    private int numberOfDisbursementsDuringTheMonth;
    private double annualInterestRate;
    private double monthlyAccountFees;

    /**
     * Konstruktor obiektu typu BankAccount przyjmujący jako argument wartość pól accountBalance i annualInterestRate
     * @param accountBalance wartość pola accountBalance
     * @param annualInterestRate wartość pola annualInterestRate
     */
    public BankAccount(double accountBalance, double annualInterestRate) {
        this.accountBalance = accountBalance;
        this.annualInterestRate = annualInterestRate;
    }

    /**
     * Metoda deposit dodaje wartość do pola accountBalance i zwiększa o jeden wartość numberOfPaymentDuringTheMonth
     * @param deposit wartość zdeponowanej kwoty
     */
    public void deposit(double deposit) {
        accountBalance += deposit;
        numberOfPaymentDuringTheMonth++;
    }

    /**
     * Metoda withdraw odejmuje wartość od pola accountBalance i zwiększa o jeden wartość
     * numberOfDisbursementsDuringTheMonth
     * @param payment wartość wypłaconej kwoty
     */
    public void withdraw(double payment) {
        accountBalance -= payment;
        numberOfDisbursementsDuringTheMonth++;
    }

    /**
     * Metoda calcInterest dodaje miesięczną kwotę oprocentowania do stanu konta
     */
    public void calcInterest() {
        double monthlyRate = annualInterestRate / 12;
        double monthlyRatePrice = accountBalance * monthlyRate;
        accountBalance = accountBalance + monthlyRatePrice;
    }

    /**
     * Metoda monthlyProcess odejmuje od konta kwotę za prowadzenie rachunku, a następnie nalicza do konta odestki i
     * zeruje ilość wpłat i wypłat z konta
     */
    public void monthlyProcess() {
        accountBalance -= monthlyAccountFees;
        calcInterest();
        numberOfPaymentDuringTheMonth = 0;
        numberOfDisbursementsDuringTheMonth = 0;
    }

    //Akcesory
    public double getAccountBalance() {
        return accountBalance;
    }

    public int getNumberOfDisbursementsDuringTheMonth() {
        return numberOfDisbursementsDuringTheMonth;
    }

    //Mutator
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
}
