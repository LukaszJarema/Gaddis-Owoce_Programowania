package com.jarema.lukasz.zadania.programistyczne.rozdzial4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Generator osobistych stron internetowych.
 * Napisz program, który wyświetla prośbę o podanie imienia użytkownika, a następnie o wpisanie opisującego zdania.
 * Po wprowadzeniu przez użytkownika żądanych danych wejściowych program powinien generować plik HTML z tymi danymi,
 * tworząc w ten sposób prostą stronę internetową. Oto przykładowy kod w HTMLu oparty na pokazanych wcześniej danych
 * wejściowych.
 */

public class Zad23 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj swoje imię: ");
        String name = scanner.next();
        System.out.print("Opisz siebie: ");
        String description = scanner.nextLine();

        PrintWriter outputFile = new PrintWriter("O mnie.html");
        outputFile.println("<html>");
        outputFile.println("<head>");
        outputFile.println("</head>");
        outputFile.println("<body>\t");
        outputFile.println("<center>\t\t");
        outputFile.println("<h1>" + name + "</h1>\t");
        outputFile.println("</center>\t");
        outputFile.println("<hr />\t");
        outputFile.println(description + "\t");
        outputFile.println("<hr />");
        outputFile.println("</body>");
        outputFile.println("</html");
        outputFile.close();
    }
}
