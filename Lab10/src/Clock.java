/**
 * Lab 10
 * @author Zachery Nyman
 * 19 October 2016
 */
import java.text.DecimalFormat;

public class Clock {
	//Getter = Gets current values of private instance variables.
			// Setter = Sets the current value of private instance variables.
	private int hour = 00;//instance variable
	private int minute = 00; //instance variable
	
	DecimalFormat myFormatter = new DecimalFormat ("00");
	
	public void displayTime() //return type
	{
		System.out.println(myFormatter.format(hour) + ":" + myFormatter.format(minute));
	}
	
	public void tick() //return type
	{
		if (minute < 59)
		{
			minute++;
		}
		else {
			hour++;
			if (hour > 23)
			{
				hour = 00;
			}
			minute = 00;
			System.out.println(myFormatter.format(hour) + ":" + myFormatter.format(minute));
			minute++;
		}
		
	}
	
	//defining setter (doesn't return anything, so it's "void")
		public void setMinute(int m)
		{
			if (m >= 0 && m <= 59)
			{
			minute = m;
			}
		}
		public void setHour(int h)
		{
			if (h >= 0 && h < 24)
			{
			hour = h;
			}
		}
		
		public boolean equals(Clock otherClock)
		{
			return hour == otherClock.hour && minute == otherClock.minute;
		}
		
		public String toString()
		{
			return myFormatter.format(hour) + ":" + myFormatter.format(minute);
		}
		
		
		
		
		
	public void reset() //return type
	{
		hour = 00;
		minute = 00;
		System.out.println(myFormatter.format(hour) + ":" + myFormatter.format(minute));
	}
	
	// defining getter.
	public int getMinute()
	{
		return minute;
	}
	public int getHour()
	{
		return hour;
	}
	
	
	
	
}



