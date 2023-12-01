/**
 * Lab 12
 * @author Zachery Nyman
 * 26 October 2016
 */
import java.awt.event.KeyEvent;
import edu.princeton.cs.introcs.StdDraw;
import java.util.Scanner;

public class CarDriver {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many pixels wide should your canvas be?");
		int canvas = keyboard.nextInt();

		Car car1 = new Car(canvas);
		
		StdDraw.setCanvasSize(canvas, canvas);
		StdDraw.setXscale(0, canvas);
		StdDraw.setYscale(0, canvas);

		while (true)
		{
			StdDraw.clear();
			if (StdDraw.isKeyPressed(KeyEvent.VK_G))
			{
				car1.gas();
			}
			else if (StdDraw.isKeyPressed(KeyEvent.VK_B))
			{
				car1.brake();
			}

			car1.move();
			car1.draw();
			
			if (car1.getSpeed() > 100)
			{
				StdDraw.setPenColor(StdDraw.RED);
				StdDraw.filledRectangle(canvas/3, canvas/4, 50, 25);
				StdDraw.setPenColor(StdDraw.BLUE);
				StdDraw.filledRectangle(canvas/3+100, canvas/4, 50, 25);
			}
			StdDraw.show(30);
		}
	}
}
