/**
 * Lab 07
 * @author Zachery Nyman
 *05 October 2016
 */
import java.util.Scanner;
public class EmailValidator {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		/* System.out.print("What is your DU email address? ");
		String emailAddress = keyboard.nextLine();
		
		 while (!emailAddress.endsWith("@du.edu")) {
			System.out.println("What is your DU email address? ");
			emailAddress = keyboard.nextLine();
		}
		
		System.out.println(emailAddress); */
		
		String emailAddress;
		do {
			System.out.print("What is your DU email address? ");
			emailAddress = keyboard.nextLine();
		} while (!emailAddress.endsWith("@du.edu"));
		
		System.out.println(emailAddress);
		
	}

}
