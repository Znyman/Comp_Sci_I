/**
 * Project 2
 * @author Zachery Nyman
 * 06 October 2016
 * Draws rectangles and determines whether they intersect or not and colors them accordingly.
 */
import edu.princeton.cs.introcs.StdDraw;
import java.util.Scanner;

public class RectangleIntersection {

	public static void main(String[] args) {
		
Scanner keyboard = new Scanner(System.in);
		
		System.out.print("How many pixels would you like your canvas length to be? ");
		int canvasLength = keyboard.nextInt();
		System.out.print("How many pixels would you like your canvas height to be? ");
		int canvasHeight = keyboard.nextInt();
		
		StdDraw.setCanvasSize(canvasLength, canvasHeight);
		StdDraw.setXscale(0, canvasLength);
		StdDraw.setYscale(0, canvasHeight);
		
		System.out.print("Now, enter the X coordinate for the center of your first rectangle: ");
		double rectangleOneCenterX = keyboard.nextDouble();
		System.out.print("Next, enter the Y coordinate for the center of your first rectangle: ");
		double rectangleOneCenterY = keyboard.nextDouble();
		System.out.print("What would you like the length of your first rectangle to be? ");
		double rectangleOneLength = keyboard.nextDouble();
		System.out.print("What would you like the height of your first rectangle to be? ");
		double rectangleOneHeight = keyboard.nextDouble();
		
		System.out.print("Now, enter the X coordinate for the center of your second rectangle: ");
		double rectangleTwoCenterX = keyboard.nextDouble();
		System.out.print("Next, enter the Y coordinate for the center of your second rectangle: ");
		double rectangleTwoCenterY = keyboard.nextDouble();
		System.out.print("What would you like the length of your second rectangle to be? ");
		double rectangleTwoLength = keyboard.nextDouble();
		System.out.print("What would you like the height of your second rectangle to be? ");
		double rectangleTwoHeight = keyboard.nextDouble();
		
		/* Variables for height and length need to be divided by 2 because in the '.rectangle()'
		   method, the code uses the half width and half height to calculate the size of the rectangle */
		
		double rectangleOneRightEdge = rectangleOneCenterX + rectangleOneLength/2;
		double rectangleOneLeftEdge = rectangleOneCenterX - rectangleOneLength/2;
		double rectangleOneTopEdge = rectangleOneCenterY + rectangleOneHeight/2;
		double rectangleOneBottomEdge = rectangleOneCenterY - rectangleOneHeight/2;
				
		double rectangleTwoRightEdge = rectangleTwoCenterX + rectangleTwoLength/2;
		double rectangleTwoLeftEdge = rectangleTwoCenterX - rectangleTwoLength/2;
		double rectangleTwoTopEdge = rectangleTwoCenterY + rectangleTwoHeight/2;
		double rectangleTwoBottomEdge = rectangleTwoCenterY - rectangleTwoHeight/2;
		
	/* The edge of the rectangles are represented by values on the X and Y axes; Example: inputs of: X = 250; Y = 250;Length:100; Height:200;
	   therefore, the right edge (line) of the rectangle is between the points (300, 150) and (300, 350) because 250+(100/2)==300 which is the
	   X coordinate for the points on the right edge (line); 250-(200/2)==150 which is the Y coordinate for the first point of the right edge
	   (line); 250+(200/2)==350 which is the Y coordinate for the second point of the right edge (line).The same concept is then applied to all
	   of the lines and put into boolean statements to determine intersection and/or overlapping of rectangles. */
		
		if (rectangleOneRightEdge < rectangleTwoLeftEdge || rectangleOneLeftEdge > rectangleTwoRightEdge) {
			StdDraw.setPenColor(StdDraw.GREEN);
			StdDraw.rectangle(rectangleOneCenterX, rectangleOneCenterY, rectangleOneLength/2, rectangleOneHeight/2);
			StdDraw.rectangle(rectangleTwoCenterX, rectangleTwoCenterY, rectangleTwoLength/2, rectangleTwoHeight/2);
			
			System.out.println("Your rectangles are not intersecting.");
		}
				
		else if (rectangleOneBottomEdge > rectangleTwoTopEdge || rectangleOneTopEdge < rectangleTwoBottomEdge) {
			StdDraw.setPenColor(StdDraw.GREEN);
			StdDraw.rectangle(rectangleOneCenterX, rectangleOneCenterY, rectangleOneLength/2, rectangleOneHeight/2);
			StdDraw.rectangle(rectangleTwoCenterX, rectangleTwoCenterY, rectangleTwoLength/2, rectangleTwoHeight/2);
			
			System.out.println("Your rectangles are not intersecting.");
		}
		
		else {
			StdDraw.setPenColor(StdDraw.RED);
			StdDraw.rectangle(rectangleOneCenterX, rectangleOneCenterY, rectangleOneLength/2, rectangleOneHeight/2);
			StdDraw.rectangle(rectangleTwoCenterX, rectangleTwoCenterY, rectangleTwoLength/2, rectangleTwoHeight/2);
			
			System.out.println("Your rectangles are either intersecting or overlapping edges.");
		}
		
		
				

	}

}
