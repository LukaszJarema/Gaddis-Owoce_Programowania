package com.jarema.lukasz.zadania.programistyczne.rozdzial10;

/**
 * Klasa PreferredCustomer.
 * Sklep prowadzi program dla stałych klientów, pozwalający kupującym uzyskać zniżkę na wszystkie zakupy. Wartość
 * rabatu jest zależna od łącznej sumy zakupów w danym sklepie:
 * - Jeśli stały klient wyda 500zł, otrzyma 5% zniżki na wszystkie przyszłe zakupy.
 * - Jeśli staly klient wyda 1000zł, otrzyma 6% zniżki na wszystkie przyszłe zakupy.
 * - Jeśli stały klient wyda 1500zł, otrzyma 7% zniżki na wszystkie przyszłe zakupy.
 * - Jeśli stały klient wyda 2000zł lub więcej, otrzyma 10% zniżki na wszystkie przyszłe zakupy.
 * Zaprojektuj klasę PreferredCustomer, pochodną od klasy Customer. Klasa PreferredCustomer powinna zawierać pola z
 * łączną wartością zakupów i poziomem rabatu. Napisz jeden lub kilka konstruktorów oraz odpowiednie mutatory i akcesory
 * dla pól klasy. Zademonstruj działanie tej klasy w prostym programie.
 */

public class PreferredCustomer extends Customer {
    private double totalPurchaseValue;
    private double discountLevel;

    /**
     * Konstruktor bezargumentowy obiektu typu PreferredCustomer
     */
    public PreferredCustomer() {

    }

    /**
     * Konstruktor obiektu typu PreferredCustomer przyjmujący jako argumenty wartość pól surname, address,
     * telephoneNumber, customerId, emailList, totalPurchaseValue, discountLevel
     * @param surname wartość pola surname
     * @param address wartość pola address
     * @param telephoneNumber wartość pola telephoneNumber
     * @param customerId wartość pola customerId
     * @param emailList wartość pola emailList
     * @param totalPurchaseValue wartość pola totalPurchaseValue
     */
    public PreferredCustomer(String surname, String address, int telephoneNumber, int customerId, boolean emailList,
                             double totalPurchaseValue) {
        super(surname, address, telephoneNumber, customerId, emailList);
        this.totalPurchaseValue = totalPurchaseValue;
    }

    public PreferredCustomer(Customer customer, double value) {
        super(customer.getSurname(), customer.getAddress(), customer.getTelephoneNumber(), customer.getCustomerId(),
                customer.isEmailList());
        totalPurchaseValue = value;
    }

    //Akcesory
    public double getTotalPurchaseValue() {
        return totalPurchaseValue;
    }

    public double getDiscountLevel() {
        return discountLevel;
    }

    //Mutatory
    public void setTotalPurchaseValue(double totalPurchaseValue) {
        this.totalPurchaseValue = totalPurchaseValue;
    }

    public void setDiscountLevel() {
        if (totalPurchaseValue >= 500 && totalPurchaseValue < 1000)
            discountLevel = 0.05;
        else if (totalPurchaseValue >= 1000 && totalPurchaseValue < 1500)
            discountLevel = 0.06;
        else if (totalPurchaseValue >= 1500 && totalPurchaseValue < 2000)
            discountLevel = 0.06;
        else if (discountLevel >= 2000)
            discountLevel = 0.1;
        else
            discountLevel = 0;
    }

    /**
     * Metoda toString zwraca łańcuch znaków z informacją o kliencie i jego zakupach
     * @return informacja o kliencie i jego zakupach
     */
    public String toString() {
        setDiscountLevel();
        return "Informacja o kliencie i jego zakupach oraz zniżce:\nNazwisko klienta: " + getSurname() + "\nAdres " +
                "klienta: " + getAddress() + "\nNumer telefonu klienta: " + getTelephoneNumber() + "\nNumer ID " +
                "klienta: " + getCustomerId() + "\nCzy klient znajduje się na liście mailowej: " + isEmailList() +
                "\nŁączna wartość zakupów: " + getTotalPurchaseValue() + "\nZniżka: " + getDiscountLevel();
    }
}
