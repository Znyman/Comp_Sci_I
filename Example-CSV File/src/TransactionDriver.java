import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;

public class TransactionDriver {

	public static void main(String[] args) {
		
		String filename = "transactions.txt";
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
		
		Transaction[] transactions = new Transaction[50];//used for partially filled array
		int count = 0;
		
		while (inputStream.hasNextLine())
		{
			String line = inputStream.nextLine();
			//System.out.println(line);//Test on retrieving lines of data from file
			String[] data = line.split(",");
			int itemNumber = Integer.parseInt(data[0]);
			int quantity = Integer.parseInt(data[1]);
			double price = Double.parseDouble(data[2]);
			String description = data[3];
			transactions[count] = new Transaction(itemNumber, quantity, price, description);
			count++;
		}
		
		double total = 0;
		
		DecimalFormat twoDecimalPlaces = new DecimalFormat("0.00");
		
		for (int i = 0; i < count; i++)
		{
			int quantity = transactions[i].getQuantity();
			double price = transactions[i].getPrice();
			String description = transactions[i].getDescription();
			total += quantity * price;
			System.out.println("Sold " + quantity + " " + description + " at " + twoDecimalPlaces.format(price));
		}
		System.out.println("Total sales: " + twoDecimalPlaces.format(total));
		
		

	}

}
