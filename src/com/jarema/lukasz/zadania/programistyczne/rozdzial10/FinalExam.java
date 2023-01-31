package com.jarema.lukasz.zadania.programistyczne.rozdzial10;

/**
   Ta klasa okre�la ocen� z egzaminu ko�cowego.
*/

public class FinalExam extends GradedActivity
{
   private int numQuestions;  // Liczba pyta�.
   private double pointsEach; // Liczba punkt�w za ka�de pytanie.
   private int numMissed;     // Liczba b��dnych odpowiedzi.

   /**
     Konstruktor ustawia liczb� pyta� na egzaminie
     i liczb� pomini�tych pyta�.
     @param questions Liczba pyta�.
     @param missed Liczba b��dnych odpowiedzi.
   */

   public FinalExam(int questions, int missed)
   {
      double numericScore;  // Przechowuje wynik punktowy.

      // Ustawianie warto�ci p�l numQuestions i numMissed.
      numQuestions = questions;
      numMissed = missed;

      // Obliczanie punkt�w uzyskanych za pytania
      // i wynik punktowy z egzaminu.
      pointsEach = 100.0 / questions;
      numericScore = 100.0 - (missed * pointsEach);

      // Wywo�anie odziedziczonej metody setScore
      // w celu ustawienia wyniku liczbowego.
      setScore(numericScore);
   }

   /**
      Metoda getPointsEach zwraca liczb� 
      punkt�w za ka�de pytanie.
      @return Warto�� w polu pointsEach.
   */

   public double getPointsEach()
   {
      return pointsEach;
   }

   /**
      Metoda getNumMissed zwraca liczb�
      pyta� z b��dnymi odpowiedziami.
      @return Warto�� w polu numMissed.
   */

   public int getNumMissed()
   {
      return numMissed;
   }
}