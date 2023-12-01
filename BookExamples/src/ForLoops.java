import java.util.Scanner;
import  java.util.Random;

public class ForLoops {

	public static void main(String[] args) {
		/* for (int count = 1; count < 5; count++){
			System.out.print((2 * count) + " ");
		}
		for(int n = 10; n > 0; n = n - 2) {
			System.out.println("Hello " + n);
		}
		for (double sample = 2; sample > 0; sample = sample - 0.5) {
			System.out.print(sample + " ");
		}
		*/
		
		//count-controlled loop
		Scanner keyboard = new Scanner(System.in);
		
		/* int score = 0;
		double sum = 0;
		int count = 0;
		
		System.out.println("How many scores would you like to enter?");
		count = keyboard.nextInt();
		
		for (int i = 0; i < count; i++) {
			System.out.println("Enter a score: ");
			score = keyboard.nextInt();
			sum += score;
		}
		
		if (count > 0) {
			System.out.println("The average of " + count + " scores is " + sum/count);
		}
		
		else {
			System.out.println("No scores entered.");
		}
		*/
		/*Random randomNumber = new Random();
		
		for (int i = 0; i < 20; i++) {
			int num = randomNumber.nextInt(11) + 10;
			System.out.println(num);
		}*/
		int positive = keyboard.nextInt();
		int sum = 0;
		while (positive >= 0) {
			sum += positive % 2 + positive;
			System.out.println(sum);
		}
		}
	
	}
