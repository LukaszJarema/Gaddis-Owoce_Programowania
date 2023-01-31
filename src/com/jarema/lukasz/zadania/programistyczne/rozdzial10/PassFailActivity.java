package com.jarema.lukasz.zadania.programistyczne.rozdzial10;

/**
   Ta klasa przechowuje wynik punktowy i okre�la,
   czy student zaliczy� prac�.
*/

public class PassFailActivity extends GradedActivity
{
   private double minPassingScore; // Minimalny wynik potrzebny do zaliczenia.

   /**
      Konstruktor ustawia minimalny wynik potrzebny do zaliczenia.
      @param mps Minimalny wynik potrzebny do zaliczenia.
   */

   public PassFailActivity(double mps)
   {
      minPassingScore = mps;
   }

   /**
      Metoda getGrade na podstawie warto�ci pola score 
      zwraca liter� z informacj� o zaliczeniu. Ta metoda
      przes�ania metod� z klasy bazowej.
      @return Informacja o zaliczeniu.
   */

   @Override
   public char getGrade()
   {
      char letterGrade;

      if (super.getScore() >= minPassingScore)
         letterGrade = 'Z';
      else
         letterGrade = 'N';

      return letterGrade;
   }
}