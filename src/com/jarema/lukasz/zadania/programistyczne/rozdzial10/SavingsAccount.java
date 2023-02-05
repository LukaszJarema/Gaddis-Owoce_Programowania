package com.jarema.lukasz.zadania.programistyczne.rozdzial10;

public class SavingsAccount extends BankAccount {
    private boolean status;

    /**
     * Konstruktor obiektu typu SavingsAccount przyjmujący jako argument wartość pól accountBalance i annualInterestRate
     * @param accountBalance wartość pola accountBalance
     * @param annualInterestRate wartość pola annualInterestRate
     */
    public SavingsAccount(double accountBalance, double annualInterestRate) {
        super(accountBalance, annualInterestRate);
        if (accountBalance >= 25)
            status = true;
        else
            status = false;
    }

    /**
     * Metoda withdraw sprawdza czy konto jest aktywne. Jeśli tak dokonywana jest wypłata z konta i jeśli pozostała
     * kwota na koncie jest mniejsza niż 25 deaktywuje konto.
     * @param payment wartość wypłaconej kwoty
     */
    public void withdraw(double payment) {
        if (status = false)
            System.out.println("Konto jest nieaktywne, nie możesz dokonać wypłaty.");
        else {
            super.withdraw(payment);
            if (getAccountBalance() < 25)
                status = false;
        }
    }

    /**
     * Metoda deposit dodaje kwotę do stanu konta oraz ewentualnie zmienia status konta na aktywne
     * @param deposit wartość zdeponowanej kwoty
     */
    public void deposit(double deposit) {
        super.deposit(deposit);
        if (status == false && getAccountBalance() >= 25)
            status = true;
    }

    /**
     * Metoda monthlyProcess sprawdza ilość wypłat w danym miesiącu i nalicza odsetki oraz odejmuje kwotę za prowadzenie
     * konta. Następnie sprawdza czy konto powinno być aktywne lub nie.
     */
    public void monthlyProcess() {
        int payment = getNumberOfDisbursementsDuringTheMonth();
        int feet = 0;
        if (payment > 4) {
            feet = (payment - 4) * 5;
        }
        super.monthlyProcess();
        super.setAccountBalance(getAccountBalance() - feet);
        if (getAccountBalance() < 25)
            status = false;
    }

    public String toString() {
        return "Stan konta wynosi: " + getAccountBalance() + "\nCzy konto jest aktywne: " + status;
    }
}
