/**
 * Lab 10
 * @author Zachery Nyman
 * 19 October 2016
 */
public class ClockDriver {

	public static void main(String[] args) {
		//Getter = Gets current values of private instance variables.
				// Setter = Sets the current value of private instance variables.
		
		Clock c1 = new Clock(); //instantiated a class
		c1.setHour(5);
		c1.setMinute(16);//value inside parentheses is the argument or actual parameter, and the value stored is the formal parameter.
		//c1.displayTime();
		System.out.println(c1);
		Clock c2 = new Clock();
		c2.setHour(4);
		c2.setMinute(16);
		//c2.displayTime();
		System.out.println(c2);
		boolean equalClocks = c1.equals(c2);
		System.out.println(equalClocks);
		/*
		for (int time = 0; time < 1418; time++)
		{
		c1.displayTime();
		c1.tick();
		} */
		int currentMinute = c1.getMinute();
		System.out.println(currentMinute);
		int currentHour = c1.getHour();
		System.out.println(currentHour);
	}

}
