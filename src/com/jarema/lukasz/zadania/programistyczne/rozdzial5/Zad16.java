package com.jarema.lukasz.zadania.programistyczne.rozdzial5;

import java.util.Scanner;

/**
 * Wartość bieżąca.
 * Załóżmy, że chcesz zdeponować jakąś kwotę na rachunku oszczędnościowym, a następnie pozostawić ją na nim, aby
 * otrzymywać odsetki przez następnych 10 lat. Pod koniec okresu wynoszącego 10 lat chcesz mieć na koncie 10 000 złotych.
 * Ile pieniędzy musisz zdeponować, aby uzyskać taką kwotę? Aby się o tym dowiedzieć, możesz posłużyć się następującym
 * wzorem (jest to wzór na wartość bieżącą):
 * P = F / ((1 + r) ^ n)
 * Oto symbole tego wzoru:
 * P to wartość bieżąca, czyli kwota, jaką musisz dziś zdeponować.
 * F to wartość przyszła, jaką chcesz uzyskać na koncie. Tu F wynosi 10 000 zł.
 * r to roczna stopa procentowa
 * n to liczba lat, przez jakie planujesz pozostawić pieniądze na koncie.
 * Napisz metodę presentValue, która oblicza wartość bieżącą. Ta metoda powinna przyjmować argumenty w postaci wartości
 * przyszłej, rocznej stopy oprocentowania i liczby lat, a następnie zwracać wartość bieżącą, czyli kwotę, jaką musisz
 * obecnie zdeponować. Zademonstruj działanie tej metody w programie, który umożliwia użytkownikowi eksperymentowanie
 * z różnymi wartościami elementów wzoru.
 */

public class Zad16 {
    public static void main(String[] args) {
        double futureValue, annualPercentageRate;
        int numbersOfYears;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Jaką kwotę chcesz uzyskać na koncie: ");
            futureValue = scanner.nextDouble();
        } while (futureValue < 0);

        do {
            System.out.print("Jaka jest roczna stopa procentowa: ");
            annualPercentageRate = scanner.nextDouble();
        } while (annualPercentageRate < 0);

        do {
            System.out.print("Przez ile lat palnujesz trzymać pieniądze na koncie: ");
            numbersOfYears = scanner.nextInt();
        } while (numbersOfYears < 0);

        System.out.println("Aby uzyskać na koncie " + futureValue + " musisz wpłacić na konto " +
                presentValue(futureValue, annualPercentageRate, numbersOfYears));
    }

    public static double presentValue(double futureValue, double annualPercentageRate, int numbersOfYears) {
        double presentValue = futureValue / (Math.pow((1 + annualPercentageRate), numbersOfYears));
        return presentValue;
    }
}
