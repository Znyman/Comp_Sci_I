/**
 * 28 September 2016
 * @author Zachery Nyman
 * Lab 05
 */
import java.util.Scanner;

public class ReplyGenerator {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a sentence: ");
		String sentence = keyboard.nextLine();
		
		char lastCharacter = sentence.charAt(sentence.length() - 1);
		
		
		if (lastCharacter == '?' && sentence.length() % 2 == 0)
			
		{
			System.out.print("Yes");
		}
		
		else if (lastCharacter == '?' && sentence.length() % 2 != 0)
			
		{
			System.out.print("No");
		}
		
		else if (lastCharacter == '!')
			
		{
		System.out.print("Wow");
		}
		
		else
			
		{
			System.out.print("You always say \"" + sentence + "\"");
		}
	}

}
