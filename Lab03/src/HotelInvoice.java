/**
 * Lab03
 * @author Zachery Nyman
 * 21 September 2016
 */
import java.util.Scanner;

public class HotelInvoice {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Invoice for Samwise Gamgee");
		
		System.out.println("How many nights did you stay?");
		int nightStayed = keyboard.nextInt();
		System.out.println("Cost per night:");
		double costPerNight = keyboard.nextDouble();
		System.out.println("Percentage of taxes collected by Shire:");
		double taxShire = keyboard.nextDouble()/100;
		System.out.println("Percentage of taxes collected by Bree:");
		double taxBree = keyboard.nextDouble()/100;
		
		double totalCostPerNight = costPerNight + (costPerNight * taxShire) + (costPerNight * taxBree);
		double totalCost = nightStayed * totalCostPerNight;
		System.out.println("Total cost per night: $" + totalCostPerNight);
		System.out.println("Total cost: $" + totalCost);

	}

}
