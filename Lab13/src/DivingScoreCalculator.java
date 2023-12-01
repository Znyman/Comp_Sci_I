/**
 * Lab 13
 * @author Zachery Nyman
 */

import java.util.Scanner;

public class DivingScoreCalculator {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);

		double score[] = new double[7];

		System.out.println("Enter degree of difficulty for the dive (1.2 - 4.8): ");
		double degreeDifficulty = keyboard.nextDouble();

		while (degreeDifficulty < 1.2 || degreeDifficulty > 4.8)
		{
			System.out.println("Invalid difficulty. Please re-enter: ");
			degreeDifficulty = keyboard.nextDouble();
		}
		
		System.out.println("Enter the score for each judge (0.0 - 10.0):");
		
		for (int i = 0; i < 7; i++)
		{
			System.out.print("Enter score for judge " + (i + 1) + ": ");
			score[i] = keyboard.nextDouble();

			while (score[i] < 0 || score[i] > 10)
			{
				System.out.println("Invalid Score. Please re-enter: ");
				score[i] = keyboard.nextDouble();
			}
		}

		double high = score[0];
		for (int i = 0; i < score.length; i++)
		{
			if (high < score[i])
			{
				high = score[i];
			}
		}
		double low = score[0];
		for (int i = 0; i < score.length; i++)
		{
			if (low > score[i])
			{
				low = score[i];
			}
		}
		double total = 0;
		for (int i = 0; i < score.length; i++)
		{
			total += score[i];
		}
		System.out.println("Score for the dive is: " + (total - (high + low)) * degreeDifficulty * 0.6);
	}
}
