import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int[] number;
		
		System.out.println("How many numbers do you want in the array?");
		int count = keyboard.nextInt();
		
		 number = new int[count];
		 
		
		 for(int i = 0; i < count; i++)
		 {
			 System.out.println("Enter a number:");
			 number[i] = keyboard.nextInt();
		 }
		 
		 //ave
		 int sum = 0;
		 for(int i=0; i < number.length; i++)
		 {
			 sum += number[i];
		 }
		 System.out.println("the average of those numbers is " + (double) sum/number.length);
	
		 //find the smallest value
		 int min = number[0];
		 for(int i =0; i < number.length; i++)
		 {
			if(number[i] < min)
			{
			min = number[i];
			}
		 }
		 
		 System.out.println("The minimum number is: " + min);
		 
		 //find the largest number
		 int max= number[0];
		 for(int i =0; i < number.length; i++)
		 {
			if(number[i] > max)
			{
			max = number[i];
			}
		 }
		 
		 System.out.println("The largest number is: " + max);
	}

}
