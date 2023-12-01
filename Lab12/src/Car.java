/**
 * Lab 12
 * @author Zachery Nyman
 * 26 October 2016
 */
import edu.princeton.cs.introcs.StdDraw;
import java.awt.Color;

public class Car {
	
	private int CANVAS_SIZE;
	private int xCoord, yCoord;
	private Color color;
	private int speed;
	private int carWidth;


	public Car(int canvasWidth)
	{
		CANVAS_SIZE = canvasWidth;
		xCoord = 0;
		yCoord = CANVAS_SIZE/2;
		carWidth = canvasWidth/10;
		speed = 0;
		color = StdDraw.BLACK;
	}

	public Car(int canvasWidth, Color c)
	{
		CANVAS_SIZE = canvasWidth;
		xCoord = 0;
		yCoord = CANVAS_SIZE/2;
		carWidth = canvasWidth/10;
		speed = 0;
		color = c;
	}

	public void gas()
	{
		speed += 10;
	}

	public void brake()
	{
		if (speed > 0)
		{
			speed -= 5;
		}
	}

	public void move()
	{
		xCoord += speed;
		if (xCoord >= CANVAS_SIZE)
		{
			xCoord = 0;
		}
	}

	public double getSpeed()
	{
		return speed;
	}

	public void draw()
	{
		StdDraw.setPenColor(color);
		StdDraw.filledRectangle(xCoord, yCoord, carWidth, carWidth/2);
	}
}
