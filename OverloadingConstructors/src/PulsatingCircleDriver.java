import edu.princeton.cs.introcs.StdDraw;
import java.awt.event.KeyEvent;

public class PulsatingCircleDriver {

	public static final int CANVAS_SIZE = 400;
	public static void main(String[] args) {
		
		StdDraw.setCanvasSize(CANVAS_SIZE, CANVAS_SIZE);
		StdDraw.setXscale(0, CANVAS_SIZE);
		StdDraw.setYscale(0, CANVAS_SIZE);
		
		PulsatingCircle circle1 = new PulsatingCircle(CANVAS_SIZE/2, CANVAS_SIZE/2, CANVAS_SIZE/2);//argument for max radius
		PulsatingCircle circle2 = new PulsatingCircle(300, 250, 75, 15, StdDraw.RED);//calls upon constructor from PulsatingCircle class
		PulsatingCircle circle3 = new PulsatingCircle(150, 125, 150, 30, StdDraw.BLUE);
		
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
				circle1.pulse(5);
				circle2.pulse(3);
				circle3.pulse(2);
				circle1.draw();
				circle2.draw();
				circle3.draw();
				StdDraw.show(20); //drawing and pausing for ~20 milliseconds
			}
		}
		

	}

}
