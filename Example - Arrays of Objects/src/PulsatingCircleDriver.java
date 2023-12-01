import edu.princeton.cs.introcs.StdDraw;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.awt.Color;

public class PulsatingCircleDriver {

	public static final int CANVAS_SIZE = 400;
	public static void main(String[] args) {
		
		StdDraw.setCanvasSize(CANVAS_SIZE, CANVAS_SIZE);
		StdDraw.setXscale(0, CANVAS_SIZE);
		StdDraw.setYscale(0, CANVAS_SIZE);
		
		Random rgen = new Random();
		PulsatingCircle[] circleList;
		circleList = new PulsatingCircle[25];
		int[] pulseValue = new int[circleList.length];
		
		for (int i = 0; i < circleList.length; i++)
		{
			int x = rgen.nextInt(CANVAS_SIZE);
			int y = rgen.nextInt(CANVAS_SIZE);
			//min radius 0-20
			int minSize = rgen.nextInt(20);
			//max radius 40-100
			int maxSize = rgen.nextInt(60) + 40;
			int colorSelector = rgen.nextInt(4);
			Color c = StdDraw.RED;
			switch (colorSelector)
			{
			case 0:
				c = StdDraw.RED;
				break;
			case 1:
				c = StdDraw.BLUE;
				break;
			case 2:
				c = StdDraw.GREEN;
				break;
			case 3:
				c = StdDraw.YELLOW;
				break;
			}
			//creating the objects in the array
			circleList[i] = new PulsatingCircle(x, y, maxSize, minSize, c);
			//parallel array to set pulse rate
			pulseValue[i] = rgen.nextInt(3) + 1;
			
		}
		
		boolean stopped = false;
		while (true)
		{
			if (StdDraw.isKeyPressed(KeyEvent.VK_S))
			{
				stopped = true;
			}
			if (StdDraw.isKeyPressed(KeyEvent.VK_G))
			{
				stopped = false;
			}
			if (!stopped)
			{
				StdDraw.clear();
				for (int i = 0; i < circleList.length; i++)
				{
					circleList[i].pulse(pulseValue[i]);
					circleList[i].draw();
				}
				StdDraw.show(20); //drawing and pausing for ~20 milliseconds
			}
		}
		

	}

}
