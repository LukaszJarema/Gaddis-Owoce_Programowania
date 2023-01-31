package com.jarema.lukasz.zadania.programistyczne.rozdzial10;

/**
 * Oceny z kursu.
 * W trakcie kursu prowadzący przeprowadza różne testy i daje studentom zadania. Oto one:
 * - obserwowane przez prowadzącego zadanie laboratoryjne, za które przyznawany jest wynik punktowy;
 * - egzamin typu zdał / nie zdał onejmujący 10 pytań (aby zdać, trzeba uzyskać wynik 70 punktów);
 * - esej, za który przyznawany jest wynik punktowy;
 * - egzamin końcowy składający się z 50 pytań.
 * Napisz klasę CourseGrades. Jej polem powinna być tablica grades typu GradedActivity. Ta tablica powinna obejmować
 * cztery elementy, po jednym dla każdej z opisanych wcześniej kategorii zadań. Ponadto w klasie powinny znajdować się
 * następujące metody:
 * - setLab - Ta metoda powinna przyjmować argument w postaci obiektu typu GradedActivity. Ten obiekt powinien zawierać
 * wynik studenta za zadanie laboratoryjne. Obiekt ten powinien być wskazywany przez element 0 pola grades.
 * - setPassFailExam - Ta metoda powinna przyjmować argument w postaci obiektu typu PassFailExam. Ten obiekt powinien
 * zawierać wynik studenta z egzaminu typu zdał / nie zdał. Obiek ten powinien być wskazywany przez element 1 pola
 * grades.
 * - setEssay - Ta metoda powinna przyjmować argument w postaci obiekt typu Essay. Otrzymany obiekt powinien zawierać
 * wynik studenta otrzymany za esej. Obiek ten powinien być wskazywany przez element 2 pola grades.
 * - setFinalExam - Ta metoda powinna przyjmować argument w postaci obiektu typu FinalExam. Ten obiekt powinien zawierać
 * wynik studenta z egzaminu końcowego. Obiek ten powinien być wskazywany przez element 3 pola grades.
 * - toString - Ta metoda powinna zwracać łańcuch znaków zawierający wyniki punktowe i oceny dla każdego elementu z
 * tablicy grades.
 * Zademonstruj działanie tej klasy w programie.
 */

public class CourseGrades {
    private GradedActivity [] grades = new GradedActivity[4];

    /**
     * Konstruktor bezargumentowy obiektu typu GradedActivity
     */
    public CourseGrades() {

    }

    /**
     * Metoda setLab przyjmuje jako argument obiekt typu GradedActivity i zapisuje go w polu 0 tablicy grades
     * @param lab wartość pola 0 tablicy grades
     */
    public void setLab(GradedActivity lab) {
        grades[0] = lab;
    }

    /**
     * Metoda setPassFailExam przyjmuje jako argument obiekt typu PassFailExam i zapisuje go w polu 1 tablicy grades
     * @param exam wartość pola 1 tablicy grades
     */
    public void setPassFailExam(PassFailExam exam) {
        grades[1] = exam;
    }

    /**
     * Metoda setEssay przyjmuje jako argument obiekt typu Essay i zapisuje go w polu 2 tablicy grades
     * @param essay wartość pola 2 tablicy grades
     */
    public void setEssay(Essay essay) {
        grades[2] = essay;
    }

    /**
     * Metoda setFinalExam przyjmuje jako argument obiekt typu FinalExam i zapisuje go w polu 3 tablicy grades
     * @param finalExam wartość pola 3 tablicy grades
     */
    public void setFinalExam(FinalExam finalExam) {
        grades[3] = finalExam;
    }

    /**
     * Metoda toString zwraca informacje na temat wyników uzyskanych przez studenta
     * @return
     */
    public String toString() {
        return "Końcowe wyniki studenta:\n1. Ocena z laboratorium: " + grades[0].getGrade() + " Wynik punktowy: " +
                grades[0].getScore() + "\n2. Student " + grades[1].getGrade() + " egzamin Wynik punktowy: " +
                grades[1].getScore() + "\n3. Ocena z eseju: " + grades[2].getGrade() + " Wynik punktowy: " +
                grades[2].getScore() + "\n4. Ocena z egzaminu końcowego: " + grades[3].getGrade() + " Wynik punktowy: "
                + grades[3].getScore();
    }
}
