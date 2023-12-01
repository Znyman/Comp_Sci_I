/**
 * Lab 11
 * @author Zachery Nyman
 * 21 October 2016
 */
public class Fraction {
	private int numerator = 0;
	private int denominator = 1;
	
	public void setNumerator(int num)
	{
		numerator = num;
	}
	public void setDenominator(int den)
	{
		if (den < 0 || den > 0)
		{
		denominator = den;
		}
	}
	
	public int getNumerator()
	{
		return numerator;
	}
	public int getDenominator()
	{
		return denominator;
	}
	public double getValue()
	{
		double quotient = (double)numerator/denominator;
		return quotient;
	}
	
	public String toString()
	{
		return numerator + "/" + denominator;
	}
	public boolean equals(Fraction f2) {
		return (numerator * f2.denominator == denominator * f2.numerator);
	}

}
