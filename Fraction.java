package part3;

//Fraction.java

public class Fraction implements Comparable<Fraction>
{
 // data about a Fraction
 private int numerator;
 private int denominator;

 // constructor #1
 public Fraction(int n, int d)
 {
     // If d is non-zero, set numerator and denominator instance variables from n and d,
     // Else print an error message about the 0 denominator and set denominator to 1.
     if(d == 0) {
         System.err.println("Denominator can't be zero. Setting it to 1.");
         denominator = 1;
     }
     else {
         numerator = n;
         denominator = d;
     }

     // Call the reduce method below to reduce the fraction.
     reduce();
 }


 // constructor #2 (default constructor)
 public Fraction() // default constructor has no inputs
 {
 }


 // methods
 /**
  * Reduce this Fraction
  */
 private void reduce()
 {
     // If this is a negative fraction, set a boolean negativeFraction to true.
     boolean negativeFraction = false;
     if (numerator * denominator < 0) {
         negativeFraction = true;
     }

     // Set numerator and denominator to their absolute values.
     numerator = Math.abs(numerator);
     denominator = Math.abs(denominator);

     /* Complete the remaining code. */
     int gcf = numerator;

     // While the greatest common factor is greater than 1:
     while (gcf > 1) {
         // The greatest common factor is the number that divides evenly into
         // both the numerator and denominator (use the % operator). Issue a
         // break when the greatest common factor is found.
         if (numerator % gcf == 0 && denominator % gcf == 0) {
             break;
         }

         // Reduce the value of greatest common factor by 1.
         gcf = gcf - 1;
     } // End While

     // Divide both numerator and denominator by the greatest common factor to
     // reduce the fraction.
     numerator = numerator / gcf;
     denominator = denominator / gcf;

     // If this was a negative fraction, then make numerator negative.
     if (negativeFraction) {
         numerator *= -1; // numerator = numerator * -1;
     }
 } // end reduce()




 public String toString()
 {
     // return a String representation of the fraction, i.e.,
     // numerator / denominator.
     // If numerator is 3 and denominator is 5, the returned String
     // will be "3/5".
     return numerator + "/" + denominator;
 }


public int compareTo(Fraction f) {

return this.numerator * f.denominator - 
		   f.numerator * this.denominator;
}

} // end of Fraction class
