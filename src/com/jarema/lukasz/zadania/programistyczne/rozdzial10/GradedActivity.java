package com.jarema.lukasz.zadania.programistyczne.rozdzial10;

/**
   Klasa przechowuj?ca wyniki ocenianych zada?.
*/

public class GradedActivity
{
   private double score;  // Wynik punktowy.

   /**
     Metoda setScore ustawia warto?? pola score.
     @param s Warto?? zapisywana w polu score.
   */

   public void setScore(double s)
   {
      score = s;
   }

   /**
      Metoda getScore zwraca wynik.
      @return Warto?? zapisana w polu score.
   */

   public double getScore()
   {
      return score;
   }

   /**
      Metoda getGrade zwraca standardow? ocen?
      okre?lon? na podstawie warto?ci pola score.
      @return Standardowa ocena.
   */

   public char getGrade()
   {
      char letterGrade;

      if (score >= 90)
         letterGrade = '5';
      else if (score >= 80)
        letterGrade = '4';
      else if (score >= 70)
        letterGrade = '3';
      else if (score >= 60)
        letterGrade = '2';
      else
        letterGrade = '1';

      return letterGrade;
   }
}