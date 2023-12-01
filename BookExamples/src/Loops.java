import java.util.Scanner;
public class Loops {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int score = 0;
		double sum = 0;
		int count = 0;
		
		//sentinel value while loop
		
		/*System.out.println("What was your score? When you are finished enter a negative number.");
		score= keyboard.nextInt();
		
		while (score >= 0) {
			count++;
			sum += score; //sum = sum + score
			System.out.println("Enter a score: ");
			score = keyboard.nextInt();
			
} 
		
		int n = 10;
		do {
			System.out.println(n);
			n = n - 3;
		} while (n > 0);*/
		
		String answer;
		do {
			System.out.println("Enter a score: ");
			score = keyboard.nextInt();
			keyboard.nextLine();
			count++;
			sum+= score;
			System.out.println("Do you want to enter another score? (Say \"yes\" to contine)");
			answer = keyboard.nextLine();
		} while (answer.equalsIgnoreCase("yes"));
		
		if (count > 0) {
			System.out.println("The average of " + count + " scores is " + sum/count);
		}
		
		else {
			System.out.println("No scores entered.");
		}

		
		
		
	}

}
