import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Lab 16
 * @author Zachery Nyman
 * 09 November 2016
 */
public class ArrayPractice {

	public static void main(String[] args) {
		
		String filename = "numbers.txt";
		Scanner inputStream = null;
		
		try //trying to open text file
		{
			inputStream = new Scanner(new FileInputStream(filename));
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Cannot open file: " + filename);
			System.exit(0);
		}
		
		int rows = inputStream.nextInt();
		int columns = inputStream.nextInt();
		
		int[][] numbers = new int [rows][columns];
		
		for (int i = 0; i < numbers.length; i++)//rows representing each student
		{
			for (int j = 0; j < numbers[i].length; j++)
			{
				numbers[i][j] = inputStream.nextInt();
			}
		}
		
		for (int i = 0; i < numbers.length; i++)
		{
			for (int j = 0; j < numbers[i].length; j++)
			{
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		double low = numbers[0][0];
		for (int i = 0; i < numbers[0].length; i++)
		{
			for (int j = 0; j < columns; j++)
			{
				if (low > numbers[i][j])
				{
					low = numbers[i][j];
				}
			}
		}
		System.out.println("Minimum of all numbers: " + low);
		System.out.println();

		for (int i = 0; i < rows; i++)
		{
			double max = numbers[i][0];
			for (int j = 0; j < columns; j++)
			{
				if (max < numbers[i][j])
				{
					max = numbers[i][j];
				}
			}
			System.out.println("Maximum of row " + i + ": " + max);
		}
		System.out.println();
		
		for (int i = 0; i < columns; i++)
		{
			double max = numbers[0][i];
			for (int j = 0; j < rows; j++)
			{
				if (max < numbers[j][i])
				{
					max = numbers[j][i];
				}
			}
			System.out.println("Maximum of column " + i + ": " + max);
		}		
	}
}
