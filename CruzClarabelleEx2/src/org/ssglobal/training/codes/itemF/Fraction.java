package org.ssglobal.training.codes.itemF;

public class Fraction {
	public int numerator;
	public int denominator;
	
	public Fraction (int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public int getNumerator() {
		return numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	public void printRational() {
		System.out.println(numerator + "/" + denominator);
	}

	public Fraction add(Fraction summand) {
		 int addNumerator = numerator * summand.getDenominator() + summand.getNumerator() * denominator;
	     int addDenominator = denominator * summand.getDenominator();
	     return new Fraction(addNumerator, addDenominator);	
	}
	
	public Fraction multiply(Fraction factor) {
		 int multiplyNumerator = numerator * factor.getNumerator();
	     int multiplyDenominator = denominator * factor.getDenominator();
	     return new Fraction(multiplyNumerator, multiplyDenominator);
	}
	
	public boolean greaterEqual(Fraction comp) {
		double fraction1 = (double) numerator / denominator;
        double fraction2 = (double) comp.getNumerator() / comp.getDenominator();
        return (fraction1 >= fraction2) ? true : false;	
	}
}
