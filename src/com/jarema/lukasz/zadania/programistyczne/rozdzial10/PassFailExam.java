package com.jarema.lukasz.zadania.programistyczne.rozdzial10;

/**
   Ta klasa okre�la, czy student zaliczy� egzamin,
   czy nie zaliczy� go.
*/

public class PassFailExam extends PassFailActivity
{
   private int numQuestions;  // Liczba pyta�.
   private double pointsEach; // Liczba punkt�w za pytanie.
   private int numMissed;     // Liczba b��dnych odpowiedzi.

   /**
     Konstruktor ustawia liczb� pyta�, liczb� 
     b��dnych odpowiedzi i minimaln� liczb� punkt�w
     potrzebn� do uzyskania zaliczenia.
     @param questions Liczba pyta�.
     @param missed Liczba b��dnych odpowiedzi.
     @param minPassing Minimalny wynik potrzebny do zaliczenia.
   */

   public PassFailExam(int questions, int missed, 
                       double minPassing)
   {
      // Wywo�ywanie konstruktora klasy bazowej.
     super(minPassing);

     // Deklarowanie zmiennej lokalnej z wynikiem.
     double numericScore;

     // Ustawianie warto�ci p�l numQuestions i numMissed.
     numQuestions = questions;
     numMissed = missed;

     // Ustalanie liczby punkt�w za ka�de pytanie i
     // wyniku punktowego z egzaminu.
      pointsEach = 100.0 / questions;
      numericScore = 100.0 - (missed * pointsEach);

      // Wywo�anie metody setScore klasy bazowej
     // w celu ustawienia wyniku punktowego.
     setScore(numericScore);
   }

   /**
     Metoda getPointsEach zwraca liczb� punkt�w
     za ka�de pytanie.
     @return Warto�� w polu pointsEach.
   */

   public double getPointsEach()
   {
      return pointsEach;
   }

   /**
      Metoda getNumMissed zwraca liczb�
      b��dnych odpowiedzi.
      @return Warto�� w polu numMissed.
   */

   public int getNumMissed()
   {
      return numMissed;
   }
}