import java.util.Random;

public class Coin {
	private String sideUp = "heads";
	private Random r = new Random();
	
	public void toss()
	{
		int num = r.nextInt(2);
		if (num == 0)
		{
			sideUp = "heads";
		}
		else 
		{
			sideUp = "tails";
		}
	}
	
	public void display()
	{
		System.out.println(sideUp);
	}

}
