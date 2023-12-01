/**
 * Project 5
 * @author Zachery Nyman
 * 08 November 2016
 * Driver for the moving rectangles. Freeze tag.
 */

import java.awt.Color;
import java.util.Random;
import edu.princeton.cs.introcs.StdDraw;

public class MovingRectangle {
	
	//I spoke with Dr. Sherba about the instance variables, and she approved my approach
	private int xCoord, yCoord;
	private int width, height;
	private int xDirection, yDirection;
	private int xSpeed, ySpeed;
	private int xVelocity, yVelocity;
	private int canvasSize;
	private Color color;
	private int colorNumber1, colorNumber2, colorNumber3;
	private boolean frozen;
	Random randomColor = new Random();
	Random randomVelocity = new Random();
	//I spoke with Dr. Sherba about the instance variables, and she approved my approach
	
	public MovingRectangle(int xCoordinate, int yCoordinate, int rectangleWidth, int rectangleHeight, int xSpd, int ySpd, int canvas)
	//I spoke with Dr. Sherba about the speed, direction, and velocity variables, and she approved my approach
	{
		xCoord = xCoordinate;
		yCoord = yCoordinate;
		width = rectangleWidth;
		height = rectangleHeight;
		xDirection = 1;
		yDirection = 1;
		xSpeed = xSpd;
		ySpeed = ySpd;
		xVelocity = xSpeed*xDirection;
		yVelocity = ySpeed*yDirection;
		canvasSize = canvas;
		colorNumber1 = randomColor.nextInt(256);
		colorNumber2 = randomColor.nextInt(256);
		colorNumber3 = randomColor.nextInt(256);
		color = new Color(colorNumber1, colorNumber2, colorNumber3);
		frozen = false;
		
	}
	
	public void draw()
	{
		StdDraw.setPenColor(color);
		StdDraw.filledRectangle(xCoord, yCoord, width/2, height/2);
	}
	
	public void move()
	{
		if (!frozen)
		{
			xVelocity = xSpeed*xDirection;
			yVelocity = ySpeed*yDirection;
			xCoord += xVelocity;
			yCoord += yVelocity;
			
			if (xCoord-(width/2) <= 0)
			{
				xDirection = 1;
				colorNumber1 = randomColor.nextInt(256);
				colorNumber2 = randomColor.nextInt(256);
				colorNumber3 = randomColor.nextInt(256);
				color = new Color(colorNumber1, colorNumber2, colorNumber3);
			}
			
			if (yCoord-(height/2) <= 0)
			{
				yDirection = 1;
				colorNumber1 = randomColor.nextInt(256);
				colorNumber2 = randomColor.nextInt(256);
				colorNumber3 = randomColor.nextInt(256);
				color = new Color(colorNumber1, colorNumber2, colorNumber3);
			}
			
			if (xCoord+(width/2) >= canvasSize)
			{
				xDirection = -1;
				colorNumber1 = randomColor.nextInt(256);
				colorNumber2 = randomColor.nextInt(256);
				colorNumber3 = randomColor.nextInt(256);
				color = new Color(colorNumber1, colorNumber2, colorNumber3);
			}
			
			if (yCoord+(height/2) >= canvasSize)
			{
				yDirection = -1;
				colorNumber1 = randomColor.nextInt(256);
				colorNumber2 = randomColor.nextInt(256);
				colorNumber3 = randomColor.nextInt(256);
				color = new Color(colorNumber1, colorNumber2, colorNumber3);
			}
			
		}
	}
	
	public void setColor(Color c)
	{
		color = c;
	}
	
	public void setRandomColor()
	{
		colorNumber1 = randomColor.nextInt(256);
		colorNumber2 = randomColor.nextInt(256);
		colorNumber3 = randomColor.nextInt(256);
		color = new Color(colorNumber1, colorNumber2, colorNumber3);
	}
	
	public boolean containsPoint(double x, double y)
	{
		if (x < xCoord+(width/2) && x > xCoord-(width/2) && y < yCoord+(width/2) && y > yCoord-(width/2))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isFrozen()
	{
		if (frozen)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void setFrozen(boolean val)
	{
		frozen = val;
	}
	
	public boolean isIntersecting(MovingRectangle r)
	{
		double rectangleOneRightEdge = xCoord + width/2;
		double rectangleOneLeftEdge = xCoord - width/2;
		double rectangleOneTopEdge = yCoord + height/2;
		double rectangleOneBottomEdge = yCoord - height/2;
				
		double rectangleTwoRightEdge = r.xCoord + r.width/2;
		double rectangleTwoLeftEdge = r.xCoord - r.width/2;
		double rectangleTwoTopEdge = r.yCoord + r.height/2;
		double rectangleTwoBottomEdge = r.yCoord - r.height/2;
		
		if (rectangleOneRightEdge < rectangleTwoLeftEdge || rectangleOneLeftEdge > rectangleTwoRightEdge
				|| rectangleOneBottomEdge > rectangleTwoTopEdge || rectangleOneTopEdge < rectangleTwoBottomEdge)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}
