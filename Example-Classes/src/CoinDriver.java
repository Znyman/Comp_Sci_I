
public class CoinDriver {

	public static void main(String[] args) {
		
		Coin c1 = new Coin();
		Coin c2 = new Coin();
		for (int i = 0; i < 10; i++)
		{
		c1.display();
		c2.display();
		System.out.println();
		c1.toss();
		c2.toss();
		}

	}

}
