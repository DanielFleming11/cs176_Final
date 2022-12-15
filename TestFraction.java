package part3;

import java.util.Arrays;

public class TestFraction {

	public static void main(String[] args) {

		Fraction f1 = new Fraction(5,6);
		Fraction f2 = new Fraction(1,2);
		Fraction f3 = new Fraction(3,4);
		Fraction f4 = new Fraction(1,5);
		Fraction f5 = new Fraction(1,3);

		Fraction[] fractions = {f1,f2,f3,f4,f5};
		
		Arrays.sort(fractions);
		
		System.out.print(Arrays.toString(fractions) + ", ");
		
	}

}
