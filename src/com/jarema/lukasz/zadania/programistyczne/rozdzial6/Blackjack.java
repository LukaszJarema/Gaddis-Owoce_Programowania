package com.jarema.lukasz.zadania.programistyczne.rozdzial6;

/**
 * Gra w oczko.
 * W tym zadaniu napiszesz program, który umożliwia graczowi rozgrywkę przeciwko komputerowi w odmianie popularnej gry
 * w oczko. W tej wersji zamiast kart używane są dwie kostki o sześciu ściankach. Zadaniem gracza jest próba wyrzucenia
 * sumarycznej wartości wyższej niż ukryta suma uzyskana przez komputer, przy czym nie można przekroczyć wartości 21.
 * Oto kilka sugestii dotyczących projektu:
 * - Każda runda gry odbywa się jako iteracja pętli powtarzanej tak długo, jak długo gracz chce ponowić rzut. Także
 * przekroczenie wartości 21 powoduje zakończenie pracy pętli.
 * - Na początku każdej rundy program wyświetla pytanie, czy gracz chce wykonać kolejny rzut, aby uzyskać więcej puktów.
 * - W każdej rundzie program symuluje rzut dwiema kostkami o sześciu ściankach. Najpier wykonywany jest rzut na rzecz
 * komputera, a następnie pojawia się pytanie o to, czy chce rzucać użytkownik. Do zasymulowania działania kostki
 * wykorzystaj klasę Die.
 * - W pętli sumowane są punkty komputera i użytkownika.
 * - Suma uzyskana przez komputer powinna zostać ukryta do czasu zakończenia pracy pętli.
 * - Po zakończeniu działania pętli suma uzyskana przez komputer jest ujawniana, a strona, która uzyskała więcej punktów
 * bez przekroczenia wartości 21, wygrywa.
 */
public class Blackjack {
    private int userPoints;
    private int computerPoints;

    /**
     * Konstruktor obiektu typu Blackjack przjmujący wartośc pól userPoints i computerPoints
     * @param userPoints zapisuje wartość w polu userPoints
     * @param computerPoints zapisuje wartośc w polu computerPoints
     */
    public Blackjack(int userPoints, int computerPoints) {
        this.userPoints = userPoints;
        this.computerPoints = computerPoints;
    }

    /**
     * Konstruktor bezargumentowy obiektu typu Blackjack zapisujący w polach userPoints oraz computerPoints 0
     */
    public Blackjack() {
        userPoints = 0;
        computerPoints = 0;
    }

    //Akcesory

    /**
     * Metoda getUserPoints obiektu typu Blackjack zwraca wartość pola userPoints
     * @return wartość pola userPoints
     */
    public int getUserPoints() {
        return userPoints;
    }

    /**
     * Metoda getComputerPoints obiektu typu Blakcjack zwraca wartośc pola computerPoints
     * @return wartość pola computerPoints
     */
    public int getComputerPoints() {
        return computerPoints;
    }

    //Mutatory

    /**
     * Metoda setUserPoints obiektu typu Blackjack zapisuje wartość w polu userPoints
     * @param points wartość pola userPoints
     */
    public void setUserPoints(int points) {
        userPoints = points;
    }

    /**
     * Metoda setComputerPoints obiektu typu Blackjack zapisuje wartość w polu computerPoints
     * @param points wartość pola computerPoints
     */
    public void setComputerPoints(int points) {
        computerPoints = points;
    }

    /**
     * Metoda addUserPoints obiektu typu Blackjack dodaje do pola userPoints wartość dwóch liczb
     * @param i pierwsza liczba
     * @param j druga liczba
     */
    public void addUserPoints(int i, int j) {
        userPoints += (i + j);
    }

    /**
     * Metoda addComputerPoints obiektu typu Blackjack dodaje do pola computerPoints wartość dwóch liczb
     * @param i pierwsza liczba
     * @param j druga liczba
     */
    public void addComputerPoints(int i, int j) {
        computerPoints += (i + j);
    }

    /**
     * Metoda displayUserPoints obiektu typu Blackjack wyświetla komunikat ze zdobytymi punktami przez gracza
     */
    public void displayUserPoints() {
        System.out.println("Użytkownik zdobył: " + getUserPoints() + " punkty");
    }

    /**
     * Metoda displayComputerPoints obiektu typu Blackjack wyświetla komunikat ze zdobytymi punktami przez komputer
     */
    public void displayComputerPoints() {
        System.out.println("Komputer zdobył: " + getComputerPoints() + " punkty");
    }

    /**
     * Metoda whoWin przyjmuje ilośc punktów gracza oraz komputera i zwraca informację na konsolę kto wygrał
     * @param userPoints ilość punktów użytkownika
     * @param computerPoints ilośc punktów komputera
     */
    public void whoWin(int userPoints, int computerPoints) {
        if (userPoints > computerPoints && userPoints <= 21) {
            System.out.println("Użytkownik wygrał");
        } else if (computerPoints > userPoints && computerPoints <= 21) {
            System.out.println("Komputer wygrał");
        } else if (userPoints > computerPoints && userPoints > 21 && computerPoints <= 21) {
            System.out.println("Komputer wygrał");
        } else if (computerPoints > userPoints && computerPoints > 21 && userPoints <= 21) {
            System.out.println("Użytkowik wygrał");
        } else {
            System.out.println("Remis");
        }
    }
}
