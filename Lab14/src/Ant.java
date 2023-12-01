/**
 * Lab 14
 * @author Zachery Nyman
 * 02 November 2016
 */
import edu.princeton.cs.introcs.StdDraw;

public class Ant {
	
	private double xCoord;
	private double yCoord;
	
	public Ant(double xCoordinate, double yCoordinate)
	{
		xCoord = xCoordinate;
		yCoord = yCoordinate;
	}
	
	public void draw()
	{
		StdDraw.filledCircle(xCoord, yCoord, 3);
	}
	
	public void move(double targetX, double targetY)
	{
		xCoord = xCoord + 0.03 * (targetX - xCoord);
		yCoord = yCoord + 0.03 * (targetY - yCoord);
	}
	
	
	

}
