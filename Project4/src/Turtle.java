/**
 * Project4
 * @author Zachery Nyman
 * 01 November 2016
 * Lets the user produce a simple drawing on a canvas using a turtle and pen.
 */

import edu.princeton.cs.introcs.StdDraw;
import java.util.Scanner;

public class Turtle {
	
	public static final int STEP_SIZE = 25;
	public static final int CANVAS_SIZE = 500;
	public static final int START = CANVAS_SIZE/2;
	
	private double xCoord, yCoord, previousX, previousY;
	private double direction;
	private boolean penDown;
	public String command;
	Scanner keyboard = new Scanner(System.in);
	
	public Turtle()
	{
		StdDraw.setCanvasSize(CANVAS_SIZE, CANVAS_SIZE);
        StdDraw.setXscale(0, CANVAS_SIZE);
        StdDraw.setYscale(0, CANVAS_SIZE);
        StdDraw.setPenRadius(0.025);
        direction = 90;
        xCoord = START;
        yCoord = START;
        StdDraw.point(xCoord, yCoord);
	}
	public void forward(int steps)
	{
		for (int i = 0; i < steps; i++)
		{
			StdDraw.setPenRadius(0.025);
			previousX = xCoord;
			previousY = yCoord;
			xCoord += STEP_SIZE * Math.cos(Math.toRadians(direction));//executes the angle at which the turtle moves
			yCoord += STEP_SIZE * Math.sin(Math.toRadians(direction));//executes the angle at which the turtle moves
			StdDraw.point(xCoord, yCoord);
			
			if (penDown)
			{
				StdDraw.setPenRadius(0.005);
				StdDraw.line(previousX, previousY, xCoord, yCoord);
			}
		}
	}
	public void right(double angle)
	{
		direction -= angle;//determines the angle at which the turtle moves to the right from its current facing direction
	}
	public void left(double angle)
	{
		direction += angle;//determines the angle at which the turtle moves to the left from its current facing direction
	}
	public void penUp()
	{
		penDown = false;
	}
	public void penDown()
	{
		penDown = true;
	}
	public void setPenColor(String color)
	{
		switch (color)
		{
		case "black":
			StdDraw.setPenColor(StdDraw.BLACK);
			break;
		case "red":
			StdDraw.setPenColor(StdDraw.RED);
			break;
		case "green":
			StdDraw.setPenColor(StdDraw.GREEN);
			break;
		case "yellow":
			StdDraw.setPenColor(StdDraw.YELLOW);
			break;
		case "blue":
			StdDraw.setPenColor(StdDraw.BLUE);
			break;
		}
	}

}
