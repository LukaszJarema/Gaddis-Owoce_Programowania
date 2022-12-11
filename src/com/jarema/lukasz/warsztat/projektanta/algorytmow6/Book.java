package com.jarema.lukasz.warsztat.projektanta.algorytmow6;

/**
 * Przyjrzyj się następującej niepełnej definicji klasy, a potem wykonaj dotyczące jej ćwiczenia:
 * public class Book {
 *     private String title;
 *     private String author;
 *     private String publisher;
 *     private int copiesSold;
 * }
 * a). Napisz konstruktor tej klasy. Ten konstruktor powinien przyjmować argumenty odpowiadające każdemu polu.
 * b). Napisz akcesor i mutator dla każdego pola.
 */
public class Book {
    private String title;
    private String author;
    private String publisher;
    private int copiesSold;

    /**
     * Konstruktor
     * @param t tytuł książki
     * @param a autor książki
     * @param p publikator ksiązki
     * @param c ilość sprzedanych książek
     */
    public Book(String t, String a, String p, int c) {
        title = t;
        author = a;
        publisher = p;
        copiesSold = c;
    }

    /**
     * Metoda setTitle zapisuje wartość w polu title.
     * @param bookTitle wartość z pola title.
     */
    public void setTitle(String bookTitle) {
        title = bookTitle;
    }

    /**
     * Metoda setAuthor zapisuje wartość w polu author.
     * @param bookAuthor wartość pola author.
     */
    public void setAuthor(String bookAuthor) {
        author = bookAuthor;
    }

    /**
     * Metoda setPublisher zapisuje wartość w polu publisher
     * @param bookPublisher wartość pola publisher.
     */
    public void setPublisher(String bookPublisher) {
        publisher = bookPublisher;
    }

    /**
     * Metoda setCopiesSold zapisuje wartość w polu copiesSold.
     * @param bookCopiesSold wartość pola copiesSold.
     */
    public void setCopiesSold(int bookCopiesSold) {
        copiesSold = bookCopiesSold;
    }

    /**
     * Metoda getTitle zwraca tytuł książki obiektu typu Book.
     * @return wartość pola title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Metoda getAuthor zwraca autora książki obiektu typu Book.
     * @return wartość pola author.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Metoda getAuthor zwraca publikującego ksiązkę obiektu typu Book.
     * @return wartość pola publisher.
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * Metoda getCopiesSold zwraca ilość sprzedanych ksiązek obiektu typu Book.
     * @return wartość pola copiesSold.
     */
    public int getCopiesSold() {
        return copiesSold;
    }
}
