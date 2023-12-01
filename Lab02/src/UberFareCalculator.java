/**
 * 
 * @author Zachery Nyman
 *
 */
import java.util.Scanner; //<---import class

public class UberFareCalculator {

	public static final double baseCost = 1.0;
	public static final double driverStop = 0.16;
	public static final double driverMovement = 1.10;
	
	public static void main(String[] args) {
	
		int minutesWaited;
		int milesDriven;
		
		//create an object of type scanner
		Scanner keyboard = new Scanner(System.in);
		
		//use the Scanner class methods to read in integers
		System.out.print("Enter the number of minutes waited: ");
		minutesWaited = keyboard.nextInt();
		
		System.out.print("Enter the number miles driven: ");
		milesDriven = keyboard.nextInt();
		
		
		double costWithoutSurge, costWithSurge;
		
		costWithoutSurge = baseCost+driverStop*minutesWaited+driverMovement*milesDriven;
		costWithSurge = costWithoutSurge*5;
		
		System.out.println("Minutes waited: " + minutesWaited);
		System.out.println("Miles driven: " + milesDriven);
		System.out.println("Cost without surge pricing: " + costWithoutSurge);
		System.out.println("Cost with surge pricing: " + costWithSurge);

	}

}
