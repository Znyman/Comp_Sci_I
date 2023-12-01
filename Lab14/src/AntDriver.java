/**
 * Lab 14
 * @author Zachery Nyman
 * 02 November 2016
 */
import edu.princeton.cs.introcs.StdDraw;
import java.util.Random;

public class AntDriver {

	public static final int CANVAS_SIZE = 400;
	public static void main(String[] args) {
		
		StdDraw.setCanvasSize(CANVAS_SIZE, CANVAS_SIZE);
		StdDraw.setXscale(0, CANVAS_SIZE);
		StdDraw.setYscale(0, CANVAS_SIZE);
		
		Random randomNumber = new Random();
		Ant[] antList;
		antList = new Ant[100];
		
		for (int i = 0; i < antList.length; i++)
		{
			int x = randomNumber.nextInt(CANVAS_SIZE);
			int y = randomNumber.nextInt(CANVAS_SIZE);
			antList[i] = new Ant(x, y);
			
		}
		while (true)
		{
			StdDraw.clear();
			for (int i = 0; i < antList.length; i++)
			{
				antList[i].draw();
				antList[i].move(StdDraw.mouseX(), StdDraw.mouseY());
			}
			StdDraw.show(20); //drawing and pausing for ~20 milliseconds
		}


	}

}
