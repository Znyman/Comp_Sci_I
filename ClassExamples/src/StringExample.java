/**
 * 
 * @author Zachery Nyman
 *
 */
import java.util.Scanner;

public class StringExample {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String getName = keyboard.nextLine();
		
		int chars = getName.length();
		System.out.println("The length is " + chars);
		
		String first = getName.substring(0, 9);
		System.out.println("First is: " + first);
		
		System.out.println(getName.toUpperCase());
		
		String foo = "Hello";
		String bar = new String("Hello");
		
		//if(name.length() >=3)
		

	}

}
