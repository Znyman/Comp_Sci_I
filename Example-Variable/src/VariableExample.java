
public class VariableExample {

	public static void main(String[] args) {
		//variable declaration
		int quantity;
		double price;
		double total;
		
		quantity = 15;
		price = 17.5;
		total = quantity * price;
		System.out.println(total);
		
		int intNumber = 6;
		System.out.println(quantity/intNumber);
		System.out.println(quantity%intNumber);
		
		//double doubleNumber = intNumber;
		double doubleNumber = 14.5;
		intNumber = (int) doubleNumber;
		//putting (int) is "casting" telling Java I know I will lose data (the ".5" is lost)
		System.out.println(intNumber);
		//increment and decrement operators
		intNumber++; //increment operator adds 1
		intNumber--; //decrement operator subtracts 1
		

	}

}
