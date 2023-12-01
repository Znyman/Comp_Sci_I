/**
 * Project 5
 * @author Zachery Nyman
 * 08 November 2016
 * Moving rectangles. Freeze tag.
 */

import java.util.Random;
import java.util.Scanner;
import edu.princeton.cs.introcs.StdDraw;
import java.awt.Color;
import java.awt.Font;

public class FreezeTagDriver {

	public static void main(String[] args) {
		
		Random randomNumber = new Random();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("How many pixels should the dimensions of your canvas be?");
		int canvas = keyboard.nextInt();
		
		StdDraw.setCanvasSize(canvas, canvas);
		StdDraw.setXscale(0, canvas);
		StdDraw.setYscale(0, canvas);
		
		MovingRectangle[] rectangle = new MovingRectangle[5];
		
		for (int i = 0; i < rectangle.length; i++)
		{
			int xCoordinate = randomNumber.nextInt(canvas+1);
			int yCoordinate = randomNumber.nextInt(canvas+1);
			int rectangleWidth = randomNumber.nextInt(canvas/5)+25;
			int rectangleHeight = randomNumber.nextInt(canvas/5)+25;
			int xSpd = randomNumber.nextInt(6)+1;//I spoke with Dr. Sherba about the speed, direction, and velocity variables, and she approved my approach
			int ySpd = randomNumber.nextInt(6)+1;//I spoke with Dr. Sherba about the speed, direction, and velocity variables, and she approved my approach
			rectangle[i] = new MovingRectangle(xCoordinate, yCoordinate, rectangleWidth, rectangleHeight, xSpd, ySpd, canvas);
			//I spoke with Dr. Sherba about the speed, direction, and velocity variables, and she approved my approach
		}
		
		while (true)
		{
			StdDraw.clear();
			for (int i = 0; i < rectangle.length; i++)
			{
				rectangle[i].move();
				rectangle[i].draw();
				
				if (StdDraw.mousePressed() && rectangle[i].containsPoint(StdDraw.mouseX(), StdDraw.mouseY()))
				{
						rectangle[i].setFrozen(true);
						rectangle[i].setColor(Color.RED);
				}
				
				if (rectangle[0].isFrozen())
				{
					if (rectangle[0].isIntersecting(rectangle[1]) || rectangle[0].isIntersecting(rectangle[2])
							|| rectangle[0].isIntersecting(rectangle[3]) || rectangle[0].isIntersecting(rectangle[4]))
					{
						rectangle[0].setFrozen(false);
						rectangle[0].setRandomColor();
					}
				}
				
				if (rectangle[1].isFrozen())
				{
					if (rectangle[1].isIntersecting(rectangle[0]) || rectangle[1].isIntersecting(rectangle[2])
							|| rectangle[1].isIntersecting(rectangle[3]) || rectangle[1].isIntersecting(rectangle[4]))
					{
						rectangle[1].setFrozen(false);
						rectangle[1].setRandomColor();
					}
				}
				
				if (rectangle[2].isFrozen())
				{
					if (rectangle[2].isIntersecting(rectangle[1]) || rectangle[2].isIntersecting(rectangle[0])
							|| rectangle[2].isIntersecting(rectangle[3]) || rectangle[2].isIntersecting(rectangle[4]))
					{
						rectangle[2].setFrozen(false);
						rectangle[2].setRandomColor();
					}
				}
				
				if (rectangle[3].isFrozen())
				{
					if (rectangle[3].isIntersecting(rectangle[1]) || rectangle[3].isIntersecting(rectangle[2])
							|| rectangle[3].isIntersecting(rectangle[0]) || rectangle[3].isIntersecting(rectangle[4]))
					{
						rectangle[3].setFrozen(false);
						rectangle[3].setRandomColor();
					}
				}
				
				if (rectangle[4].isFrozen())
				{
					if (rectangle[4].isIntersecting(rectangle[1]) || rectangle[4].isIntersecting(rectangle[2])
							|| rectangle[4].isIntersecting(rectangle[3]) || rectangle[4].isIntersecting(rectangle[0]))
					{
						rectangle[4].setFrozen(false);
						rectangle[4].setRandomColor();
					}
				}
				
				if (rectangle[0].isFrozen() && rectangle[1].isFrozen() && rectangle[2].isFrozen() && rectangle[3].isFrozen()
						&& rectangle[4].isFrozen())
				{
					StdDraw.setPenColor(StdDraw.BLACK);
					Font font = new Font("Arial", Font.BOLD, 60);
					StdDraw.setFont(font);
					StdDraw.text(canvas/2, canvas/2, "You Win!");
				}
			}
			StdDraw.show(20); //drawing and pausing for ~20 milliseconds
		}
	}
}
