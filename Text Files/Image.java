import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import stddraw.StdDraw;

public class Image
{
    private static final int MAX_CANVAS_DIMENSION = 800;
    private int numColumns;
    private int numRows;
    private Color[][] pixels;

    public Image(String filename)
    {
        loadFile(filename);
        setupCanvas();
    }

    private void loadFile(String filename)
    {
        Scanner inFile = null;
        try
        {
            inFile = new Scanner(new FileInputStream(filename));
        } catch (FileNotFoundException e)
        {
            System.out.println("Cannot open file: " + filename);
            System.exit(0);
        }

        // file starts with P3
        String magic = inFile.nextLine();
        if (!magic.equals("P3"))
        {
            System.out.println("invalid PPM file");
            System.exit(0);
        }

        //throw away comment lines
        while (inFile.hasNext("#.*"))
        {
            inFile.nextLine();
        }
        
        // read in width of image
        numColumns = inFile.nextInt();
        // read in height of image
        numRows = inFile.nextInt();
        System.out.println(
                "image size: " + numColumns + " by " + numRows);
        pixels = new Color[numRows][numColumns];
        
        // read in max color value
        int maxVal = inFile.nextInt();
        
        // read in image data
        // triplets of red, green blue
        for (int row = 0; row < numRows; row++)
        {
            for (int col = 0; col < numColumns; col++)
            {
                int r, g, b;
                r = inFile.nextInt();
                g = inFile.nextInt();
                b = inFile.nextInt();
                pixels[row][col]
                        = new Color(r, g, b); // red, green, blue
            }
        }
    }

    private void setupCanvas()
    {
        int largestDimension = Math.max(numRows, numColumns);
        
        // scale the canvas according to the image size
        int pixelColumns = (int) (MAX_CANVAS_DIMENSION * numColumns / largestDimension);
        int pixelRows = (int) (MAX_CANVAS_DIMENSION * numRows / largestDimension);
        StdDraw.setCanvasSize(pixelColumns, pixelRows); // (width, height)
        StdDraw.setXscale(0, numColumns);
        //flip y scale so it matches array!!!
        StdDraw.setYscale(numRows, 0);
        // start animation mode
        StdDraw.show(0);
    }

}
