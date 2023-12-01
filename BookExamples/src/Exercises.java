import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercises {

	
	public static void main(String[] args) {
		
		int tempF;
		double tempC;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a temperature in degrees fahrenheit: ");
		tempF = keyboard.nextInt();
		tempC = 5.0/9.0*(tempF-32);
		
		DecimalFormat myFormatter = new DecimalFormat ("0.00");
		
		System.out.println(tempF + " degrees F is equal to " + myFormatter.format(tempC) + " degrees C");
		
	}

}
