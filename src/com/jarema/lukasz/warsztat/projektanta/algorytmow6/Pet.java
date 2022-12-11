package com.jarema.lukasz.warsztat.projektanta.algorytmow6;

/**
 * Zaprojektuj klasę Pet (zwierzę). Powinna ona zawierać następujące pola:
 * - name. Tu zapisywane będzie imię zwierzaka.
 * - animal. Tu należy podać gatunek zwierzęcia np. Pies, Kot lub Papuga.
 * - age. Tu zapisywany będzie wiek zwierzęcia.
 * W klasie Pet należy też umieścić następujące metody:
 * - setName. Ma zapisywać wartość w polu name.
 * - setAnimal. Ma zapisywać wartość w polu animal.
 * - setAge. Ma zapisywać wartość w polu age.
 * - getName. Ma zwracać wartość pola name.
 * - getAnimal. Ma zwracać wartość pola animal.
 * - getAge. Ma zwracać wartość pola Age.
 * Napisz w Javie kod klasy Pet.
 */

public class Pet {
    private String name;
    private String animal;
    private int age;

    /**
     * Metoda petName zapisuje wartość w polu name.
     * @param petName Wartość zapisywana w polu name.
     */
    public void setName(String petName) {
        name = petName;
    }

    /**
     * Meotda setAnimal zapisuje waetość w polu animal.
     * @param animalKind Wartość zapisywana w polu animal.
     */
    public void setAnimal(String animalKind) {
        animal = animalKind;
    }

    /**
     * Metoda setAge zapisuje wartość w polu age.
     * @param animalAge Wartość zapisywana w polu age.
     */
    public void setAge(int animalAge) {
        age = animalAge;
    }

    /**
     * Metoda getName zwraca imię obiektu typu Pet.
     * @return Wartość z pola name.
     */
    public String getName() {
        return name;
    }

    /**
     * Metoda getAnimal zwraca rodzaj zwierzęcia obiektu typu Pet.
     * @return Wartość pola animal.
     */
    public String getAnimal() {
        return animal;
    }

    /**
     * Metoda getAge zwraca wiek zwierzęcia obiektu typu Pet.
     * @return Wartość pola age.
     */
    public int getAge() {
        return age;
    }
}
