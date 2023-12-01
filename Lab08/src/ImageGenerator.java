/**
 * Lab 08
 * @author Zachery Nyman
 * 07 October 2016
 */
import edu.princeton.cs.introcs.StdDraw;
import java.util.Random;

public class ImageGenerator {

	public static final int CANVAS_SIZE = 400;
	
	public static void main(String[] args) {
		
		StdDraw.setCanvasSize(CANVAS_SIZE, CANVAS_SIZE);
        StdDraw.setXscale(0, CANVAS_SIZE);
        StdDraw.setYscale(0, CANVAS_SIZE);
        Random randomNumber = new Random();
        
        for (int squareCount = 0; squareCount < 2000; squareCount++) {
        	double randomXCoordinate = randomNumber.nextInt(400);
        	double randomYCoordinate = randomNumber.nextInt(400);
        	
        	if (randomXCoordinate > randomYCoordinate && randomXCoordinate > 200) {
        		StdDraw.setPenColor(StdDraw.BLUE);
        		StdDraw.filledSquare(randomXCoordinate, randomYCoordinate, 5);
        	}
        	if (randomXCoordinate < randomYCoordinate && randomXCoordinate < 200) {
        		StdDraw.setPenColor(StdDraw.RED);
        		StdDraw.filledSquare(randomXCoordinate, randomYCoordinate, 5);
        	}
        	if (randomXCoordinate > randomYCoordinate && randomXCoordinate < 200) {
        		StdDraw.setPenColor(StdDraw.YELLOW);
        		StdDraw.filledSquare(randomXCoordinate, randomYCoordinate, 5);
        	}
        	if (randomXCoordinate < randomYCoordinate && randomXCoordinate > 200) {
        		StdDraw.setPenColor(StdDraw.GREEN);
        		StdDraw.filledSquare(randomXCoordinate, randomYCoordinate, 5);
        	}
        }

	}

}
