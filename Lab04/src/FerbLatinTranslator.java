/**
 * 23 September 2016
 * @author Zachery Nyman
 * Lab 04
 */
import java.util.Scanner;

public class FerbLatinTranslator {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your first and last name? ");
		String firstName = keyboard.next();
		String lastName = keyboard.next();
		
		int firstNameLength = firstName.length();
		int lastNameLength = lastName.length();
		
		String ferbLatin = "erb";
		String letterOne = firstName.substring(0, 1);
		String letterTwo = firstName.substring(1, 2);
		String newFirstName = firstName.substring(2, firstNameLength);
		
		String letterThree = lastName.substring(0, 1);
		String letterFour = lastName.substring(1, 2);
		String newLastName = lastName.substring(2, lastNameLength);
		
		if (firstName.length() >= 3)
		{
			System.out.print("Your name in Ferb Latin is: " + letterTwo.toUpperCase() + newFirstName + letterOne.toLowerCase() + ferbLatin);
		}	
		else
		{	
				System.out.print("Your name in Ferb Latin is: " + firstName);
		}
		if (lastName.length() >= 3)
		{		
				System.out.print(" " + letterFour.toUpperCase() + newLastName + letterThree.toLowerCase() + ferbLatin);
		}
		else
		{	
			System.out.print(" " + lastName);
	}
	}

}
