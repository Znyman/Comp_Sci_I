
public class Transaction {
	
	private int itemNumber;
	private int quantity;
	private double price;
	private String description;
	
	public Transaction(int num, int qty, double p, String desc)
	{
		itemNumber = num;
		quantity = qty;
		price = p;
		description = desc;
	}
	public int getItemNumber()
	{
		return itemNumber;
	}
	public int getQuantity()
	{
		return quantity;
	}
	public double getPrice()
	{
		return price;
	}
	public String getDescription()
	{
		return description;
	}
	

}
