import edu.princeton.cs.introcs.StdDraw;
import java.awt.Color;

public class PulsatingCircle {
	
	//instance variables
	private double xCoord;
	private double yCoord;
	private double currentRadius;
	private double maxRadius;
	private double minRadius;
	private int direction; //1 for circle going out, and -1 for circle going in
	private Color color;
	
	
	//constructor
	public PulsatingCircle(double centerX, double centerY, double maxRadius)
	{
		xCoord = centerX;
		yCoord = centerY;
		this.maxRadius = maxRadius;
		minRadius = 0;
		currentRadius = minRadius;
		direction = 1;
		color = StdDraw.BLACK;
		}
	
	//constructor 2
	public PulsatingCircle(double centerX, double centerY, double maxSize, double minSize, Color c)
	{
		xCoord = centerX;
		yCoord = centerY;
		maxRadius = maxSize;
		minRadius = minSize;
		currentRadius = minRadius;
		direction = 1;
		color = c;
		
		
	}
	
	public void draw()
	{
		StdDraw.setPenColor(color);
		StdDraw.filledCircle(xCoord, yCoord, currentRadius);
		
	}
	public void pulse()
	{
		currentRadius = currentRadius + 1 * direction;
		if (currentRadius <= minRadius || currentRadius >= maxRadius)
		{
			direction = direction * -1;
		}
	}
	public void pulse(int pulseAmount)
	{
		if (pulseAmount >= 0)
		{
			currentRadius = currentRadius + pulseAmount * direction;
			if (currentRadius <= minRadius || currentRadius >= maxRadius)
			{
				direction = direction * -1;
			}
		}
	}
	
	
	
	
	
	
	
}
