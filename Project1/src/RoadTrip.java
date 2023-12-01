/**
 * 28 September 2016
 * @author Zachery Nyman
 * Programming Project 1
 * Calculates gallons of gas needed and number of stops for a road trip.
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class RoadTrip {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);		
		
		System.out.println("What city are you leaving from?");
		String cityFrom = keyboard.next();
		System.out.println("What city are you going to?");
		String cityTo = keyboard.next();
		
		int cityFromNameLength = cityFrom.length();
		int cityToNameLength = cityTo.length();
		String cityFromFirstLetter = cityFrom.substring(0, 1);
		String cityToFirstLetter = cityTo.substring(0, 1);
		String cityFromPartialName = cityFrom.substring(1, cityFromNameLength);
		String cityToPartialName = cityTo.substring(1, cityToNameLength);
		
	/* cityStart and cityFinish are variables used to simplify future output within the
	program	to make sure index '0' is upper case and the indexes > '0' are lower case*/
		
		String cityStart = cityFromFirstLetter.toUpperCase() + cityFromPartialName.toLowerCase();
		String cityFinish = cityToFirstLetter.toUpperCase() + cityToPartialName.toLowerCase();
		
		System.out.println("How many miles is it from " + cityStart + " to " + cityFinish + "?");
		int milesToDrive = keyboard.nextInt();
		System.out.println("How many miles per gallon does your car get?");
		double milesPerGallon = keyboard.nextDouble();
		System.out.println("How many gallons does your car's gas tank hold?");
		double gasTank = keyboard.nextDouble();
		
		double gasTripTotal = milesToDrive / milesPerGallon;
		int timesGasTankFilled = (int)gasTripTotal / (int)gasTank;
		DecimalFormat myFormatter = new DecimalFormat ("0.0");
		
		System.out.println("\nYour trip from " + cityStart + " to " + cityFinish + " will require "
				+ myFormatter.format(gasTripTotal) + " gallons of gas.");
		System.out.println("Assuming your gas tank is full when you leave, then you will need to stop to fill up "
				+ timesGasTankFilled + " times.");
		
		


	}

}
