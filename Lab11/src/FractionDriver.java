/**
 * Lab 11
 * @author Zachery Nyman
 * 21 October 2016
 */
import java.util.Scanner;

public class FractionDriver {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int num1;
		int den1;
		int num2;
		int den2;
		
		Fraction f1 = new Fraction();
		System.out.println("Enter a value for your numerator: ");
		f1.setNumerator(num1 = keyboard.nextInt());
		System.out.println("Enter a value for your denominator: ");
		f1.setDenominator(den1 = keyboard.nextInt());
		
		int currentNumerator1 = f1.getNumerator();
		//System.out.println(currentNumerator1);
		int currentDenominator1 = f1.getDenominator();
		//System.out.println(currentDenominator1);
		double currentValue1 = f1.getValue();
		//System.out.println(currentValue1);
		System.out.println("The first fraction you entered was: " + f1);
		
		
		Fraction f2 = new Fraction();
		System.out.println("Enter a value for your numerator: ");
		f2.setNumerator(num2 = keyboard.nextInt());
		System.out.println("Enter a value for your denominator: ");
		f2.setDenominator(den2 = keyboard.nextInt());
		
		int currentNumerator2 = f2.getNumerator();
		//System.out.println(currentNumerator2);
		int currentDenominator2 = f2.getDenominator();
		//System.out.println(currentDenominator2);
		double currentValue2 = f2.getValue();
		//System.out.println(currentValue2);
		System.out.println("The second fraction you entered was: " + f2);
		

		boolean equalFractions = f1.equals(f2);
		if (equalFractions == true)
		{
			System.out.println("Your fractions are equal.");
		}
		else 
		{
			System.out.println("Your fractions are not equal.");
		}

	}

}
