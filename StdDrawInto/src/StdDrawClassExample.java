import edu.princeton.cs.introcs.StdDraw;
public class StdDrawClassExample {

	public static final int CANVAS_SIZE = 400;
	public static void main(String[] args) {
		StdDraw.setCanvasSize(CANVAS_SIZE, CANVAS_SIZE);
		StdDraw.setXscale(0, CANVAS_SIZE);
		StdDraw.setYscale(0, CANVAS_SIZE);
		
		//orange circle @ top right
		StdDraw.setPenColor(StdDraw.ORANGE);
		StdDraw.circle(300, 300, 50);
		
		//red filled square @ lower left
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.filledSquare(10, 10, 75);
		
		//black horizontal line through middle of canvas
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.line(0, 200, 400, 200);

	}

}
