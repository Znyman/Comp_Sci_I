/**
 * Lab 06
 * @author Zachery Nyman
 * 30 September 2016
 */
import edu.princeton.cs.introcs.StdDraw;
import java.util.Scanner;
public class ShapeDrawing {
	
	public static final int CANVAS_SIZE = 300;
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		StdDraw.setCanvasSize(CANVAS_SIZE, CANVAS_SIZE);
		StdDraw.setXscale(0, CANVAS_SIZE);
		StdDraw.setYscale(0, CANVAS_SIZE);
		
		System.out.println("What shape would you like to draw?\nYour options are a circle, square, and triangle.");
		String shapeInput = keyboard.next();
		System.out.println("What color would you like your shape to be?\nYour options are red, green, blue, and yellow.");
		String colorInput = keyboard.next();
		
		String shape = shapeInput.toLowerCase();
		String color = colorInput.toLowerCase();
		
		if (color.equals("red")) {
		StdDraw.setPenColor(StdDraw.RED);
		}
		
		else if (color.equals("green")) {
		StdDraw.setPenColor(StdDraw.GREEN);
		}
		else if (color.equals("blue")) {
		StdDraw.setPenColor(StdDraw.BLUE);
		}
		
		else if (color.equals("yellow")) {
		StdDraw.setPenColor(StdDraw.YELLOW);
		}
		
		else {
		System.out.println("The color you chose is not an option.\nPlease choose red, green, blue, or yellow.");
		}
		
		if (shape.equals("circle")) {
		StdDraw.circle(150, 150, 100);	
		}
		
		else if (shape.equals("square")) {
		StdDraw.square(150, 150, 100);
		}
		
		else if(shape.equals("triangle")) {
		StdDraw.line(100, 100, 150, 200);
		StdDraw.line(150, 200, 200, 100);
		StdDraw.line(100, 100, 200, 100);
		}
		
		else {
		System.out.println("The shape you chose is not an option.\nPlease choose a circle, square, or triangle.");	
		}
		}

	}
