import edu.princeton.cs.introcs.StdDraw;

public class HelloStdDraw

{

    public static final int CANVAS_SIZE = 400;

    public static void main(String[] args)

    {

         StdDraw.setCanvasSize(CANVAS_SIZE, CANVAS_SIZE);

         StdDraw.setXscale(0, CANVAS_SIZE);

         StdDraw.setYscale(0, CANVAS_SIZE);

         StdDraw.setPenColor(StdDraw.RED);

         StdDraw.circle(200, 200, 100);
         
	}

}
