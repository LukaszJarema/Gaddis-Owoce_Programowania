package com.jarema.lukasz.zadania.programistyczne.rozdzial6;

/**
 * Temperatura zamarzania i wrzenia.
 * W poniższej tabeli podano temperaturę zamarzania i wrzenia kilku substancji.
 * Substancja       Temperatura zamarazania [w ^C]  Temperatura wrzenia [w ^C]
 * Alkohol etylowy  -114                            78
 * Tlen             -218                            -183
 * Woda             0                               100
 * Zaprojektuj klasę, która zapisuje temperaturę w polu temperature oraz obejmuje odpowiednie akcesory i mutatory tego
 * pola. Oprócz odpowiednich konstruktorów klasa powinna zawierać następujące metody:
 * - isEthylFrezing. Ta metoda powinna zwracać wartość logiczną true, jeśli temperatura w polu temperature jest równa
 * temperaturze zamarzania alkoholu etylowego lub niższa. W przeciwnym razie ta metoda powinna zwracać wartość false.
 * - isEthylBoiling. Ta metoda powinna zwracać wartośc logiczną true, jeśli temperatura w polu temperature jest równa
 * temperaturze wrzenia alkoholu etylowego lub wyższa. W przeciwnym razie ta metoda powinna zwracać wartość false.
 * - isOxygenFreezing. Ta metoda powinna zwracać wartość logiczną true, jeśli temperatura w polu temperature jest równa
 *  temperaturze zamarzania tlenu lub niższa. W przeciwnym razie ta metoda powinna zwracać wartość false.
 *  - isOxygenBoiling. Ta metoda powinna zwracać wartośc logiczną true, jeśli temperatura w polu temperature jest równa
 * temperaturze wrzenia tlenu lub wyższa. W przeciwnym razie ta metoda powinna zwracać wartość false.
 *  - isWaterFreezing. Ta metoda powinna zwracać wartość logiczną true, jeśli temperatura w polu temperature jest równa
 * temperaturze zamarzania wody lub niższa. W przeciwnym razie ta metoda powinna zwracać wartość false.
 * - isWaterBoiling. Ta metoda powinna zwracać wartośc logiczną true, jeśli temperatura w polu temperature jest równa
 * temperaturze wrzenia wody lub wyższa. W przeciwnym razie ta metoda powinna zwracać wartość false.
 * Napisz program demonstrujący działanie tej klasy. Powinien on wyświetlać prośbę o podanie temperatury, a następnie
 * wyświetlać listę substancji, które zamarzają lub wrą w tej temperaturze. Na przykład jeśli temperatura wynosi -35^C,
 * klasa powinna informować o tym, że woda zamarza, a tlen wrze.
 */

public class FreezingAndBoilng {
    private int temperature;

    /**
     * Konstruktor argumentowy obiektu typu FreezingAndBoiling, który przyjmuje wartość temperatury i zapisuje ją w polu
     * temperature
     * @param temperature wartość pola temperature
     */
    public FreezingAndBoilng(int temperature) {
        this.temperature = temperature;
    }

    /**
     * Konstruktor bezargumentowy obiektu typu FreezingAndBoiling
     */
    public FreezingAndBoilng() {

    }

    //Akcesory

    /**
     * Metoda getTemperature obiektu typu FreezingAndBoiling zwraca wartość pola temperature
     * @return wartość pola temperature
     */
    public int getTemperature() {
        return temperature;
    }

    //Mutatory

    /**
     * Metoda setTemperature obiektu typu FreezingAndBoiling zapisuje wartość w polu temperature
     * @param temperature wartość zapisana w polu temperature
     */
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    /**
     * Metoda isEthylFreezing obiektu typu FreezingAndBoiling przyjmuje wartość temperatury i jeśli jest równa lub
     * niższa od -114 zwraca wartość true
     * @param temperature wartość pola temperature
     * @return true jeśli wartość pola temperature jest równa lub niższa od -114, w przeciwnym razie false
     */
    public boolean isEthylFreezing(int temperature) {
        if (temperature <= -114) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Metoda isEthylBoiling obiektu typu FreezingAndBoiling przyjmuje wartość temperatury i jeśli jest równa lub wyższa
     * od 78 zwraca wartość true
     * @param temperature wartość pola true
     * @return true jeśli wartość pola temperature jest równa lub wyższa 78, w przeciwnym razie false
     */
    public boolean isEthylBoiling(int temperature) {
        if (temperature >= 78) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Metoda isOxygenFreezing obiektu typu FreezingAndBoiing przyjmuje wartość temeperatury i jeśli jest równa lub
     * niższa od -218 zwraca wartość true
     * @param temperature wartość pola temperature
     * @return true jeśli wartość pola temperature jest równa lub niższa od -218, w przeciwnym razie false
     */
    public boolean isOxygenFreezing(int temperature) {
        if (temperature <= -218) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Metoda isOxygenBoiling obiektu typu FreezingAndBoiling przyjmuje wartość temeperatury i jeśli jest równa lub
     * wyższa od -183 zwraca wartośc true
     * @param temperature wartośc pola temperature
     * @return true jeśli wartość pola temperature jest równa lub wyższa od -183, w przeciwnym razie false
     */
    public boolean isOxygenBoiling(int temperature) {
        if (temperature >= -183) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Metoda isWaterFreezing obiektu typu FreezingAndBoiling przyjmuje wartość temperatury i jeśli jest równa lub
     * mniejsza od 0 zwraca wartość true
     * @param temperature wartość pola temperature
     * @return true jeśli wartość pola temperature jest równa lub niższa od 0, w przeciwnym razie false
     */
    public boolean isWaterFreezing(int temperature) {
        if (temperature <= 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Metoda isWaterBoiling obiektu typu FreezingAndBoiling przyjmuje wartość temperatury i jeśli jest równa lub wyższa
     * od 100 zwraca wartość true
     * @param temperature wartość pola temperature
     * @return true jeśli wartość pola temperature jest równa lub wyższa od 100, w przeciwnym razie false
     */
    public boolean isWaterBoiling(int temperature) {
        if (temperature >= 100) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Metoda displayEthylFreezing obiektu typu FreezingAndBoiling przyjmuje wartość temperatury i jeśli wartość metody
     * isEthylFreezing przyjmuje wartość true wyświetlany jest komunikat użytkownikowi
     * @param temperature wartość pola temperature
     */
    public void displayEthylFreezing(int temperature) {
        if (isEthylFreezing(temperature)) {
            System.out.println("W temperaturze: " + temperature + " stopni Celsjusza alkohol etylowy zamarza.");
        }
    }

    /**
     * Metoda displayEthylBoiling obiektu typu FreezingAndBoiling przyjmuje wartość temperatury i jeśli wartość metody
     * isEthylBoiling przyjmuje wartość true wyświetlany jest komunikat użytkownikowi
     * @param temperature wartość pola temperature
     */
    public void displayEthylBoiling(int temperature) {
        if (isEthylBoiling(temperature)) {
            System.out.println("W temperaturze: " + temperature + " stopni Celsjusza alkohol etylowy wrze.");
        }
    }

    /**
     * Metoda displayOxygenFreezing obiektu typu FreezingAndBoiling przyjmuje wartość temperatury i jeśli wartość metody
     * isOxygenFreezing przyjmuje wartość true wyświetlany jest komunikat użytkownikowi
     * @param temperature wartość pola temperature
     */
    public void displayOxygenFreezing(int temperature) {
        if (isOxygenFreezing(temperature)) {
            System.out.println("W temperaturze: " + temperature + " stopni Celsjusza tlen zamarza.");
        }
    }

    /**
     * Metoda displayOxygenBoiling obiektu typu FreezingAndBoiling przyjmuje wartość temperatury i jeśli wartość metody
     * isOxygenBoiling przyjmuje wartość true wyświetlany jest komunikat użytkownikowi
     * @param temperature wartość pola temperature
     */
    public void displayOxygenBoiling(int temperature) {
        if (isOxygenBoiling(temperature)) {
            System.out.println("W temperaturze: " + temperature + " stopni Celsjusza tlen wrze.");
        }
    }

    /**
     * Metoda displayWaterFreezing obiektu typu FreezingAndBoiling przyjmuje wartość temperatury i jeśli wartość metody
     * isWaterFreezing przyjmuje wartość true wyświetlany jest komunikat użytkownikowi
     * @param temperature wartość pola temperature
     */
    public void displayWaterFreezing(int temperature) {
        if (isWaterFreezing(temperature)) {
            System.out.println("W temperaturze: " + temperature + " stopni Celsjusza woda zamarza.");
        }
    }

    /**
     * Metoda displayWaterBoiling obiektu typu FreezingAndBoiling przyjmuje wartość temperatury i jeśli wartość metody
     * isWaterBoiling przyjmuje wartość true wyświetlany jest komunikat użytkownikowi
     * @param temperature wartość pola temperature
     */
    public void displayWaterBoiling(int temperature) {
        if (isWaterBoiling(temperature)) {
            System.out.println("W temperaturze: " + temperature + " stopni Celsjusza woda wrze.");
        }
    }
}
