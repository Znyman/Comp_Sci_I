
public class Switch {

	public static void main(String[] args) {
		int key = -2;
		switch (key + 1)
		{
		case 1:
			System.out.println("Apples");
			break;
		case 2:
			System.out.println("Oranges");
			break;
		case 3:
			System.out.println("Peaches");
			break;
		case 4:
			System.out.println("Plums");
			break;
		default:
			System.out.println("Fruitless");
		}

	}

}
