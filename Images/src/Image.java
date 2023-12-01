/**
 * Lab 17
 * @author Zachery Nyman
 * 14 November 2016
 */

import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import edu.princeton.cs.introcs.StdDraw;
import java.util.Random;

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
    
    //copy constructor
    public Image(Image other)
    {
    	numRows = other.numRows;
    	numColumns = other.numColumns;
    	pixels = new Color[numRows][numColumns];
    	for (int row = 0; row < numRows; row++)
    	{
    		for (int col = 0; col < numColumns; col++)
    		{
    			pixels[row][col] = other.pixels[row][col];
    		}
    	}
    }

    private void loadFile(String filename)
    {
        Scanner inFile = null;
        try
        {
            inFile = new Scanner(new FileInputStream(filename));
        }
        catch (FileNotFoundException e)
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
        System.out.println("image size: " + numColumns + " by " + numRows);
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
                pixels[row][col] = new Color(r, g, b); // red, green, blue
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
    
    public void draw()
    {
    	StdDraw.clear();
    	for (int row = 0; row < numRows; row++)
    	{
    		for (int col = 0; col < numColumns; col++)
    		{
    			StdDraw.setPenColor(pixels[row][col]);
    			StdDraw.filledSquare(col + 0.5, row + 0.5, 0.5);
    		}
    	}
    	StdDraw.show(20);
    }
    
    public Image getGrayscaleImage()
    {
    	Image gray = new Image(this);//using Image copy constructor
    	for (int row = 0; row < numRows; row++)
    	{
    		for (int col = 0; col < numColumns; col++)
    		{
    			int red = this.pixels[row][col].getRed();
    			int green = this.pixels[row][col].getGreen();
    			int blue = this.pixels[row][col].getBlue();
    			int intensity = (red + green + blue)/3;
    			gray.pixels[row][col] = new Color(intensity, intensity, intensity);
    		}
    	}
    	return gray;
    }
    
    public Image getEdgeImage()
    {
    	Image edge = new Image(this);
    	for (int row = 1; row < numRows-1; row++)
    	{
    		for (int col = 1; col < numColumns-1; col++)
    		{
    			int xMinusOne = (this.pixels[row-1][col].getRed()+this.pixels[row-1][col].getGreen()+this.pixels[row-1][col].getBlue())/3;
    			int x = (this.pixels[row][col].getRed()+this.pixels[row][col].getGreen()+this.pixels[row][col].getBlue())/3;
    			int xPlusOne = (this.pixels[row+1][col].getRed()+this.pixels[row+1][col].getGreen()+this.pixels[row+1][col].getBlue())/3;
    			
    			int yMinusOne = (this.pixels[row][col-1].getRed()+this.pixels[row][col-1].getGreen()+this.pixels[row][col-1].getBlue())/3;
    			int y = (this.pixels[row][col].getRed()+this.pixels[row][col].getGreen()+this.pixels[row][col].getBlue())/3;
    			int yPlusOne = (this.pixels[row][col+1].getRed()+this.pixels[row][col+1].getGreen()+this.pixels[row][col+1].getBlue())/3;
    			
    			double Lx = -0.5 * xMinusOne + 0 * x + 0.5 * xPlusOne;
    			double Ly = -0.5 * yMinusOne + 0 * y + 0.5 * yPlusOne;
    			double intensity = Math.sqrt((Lx*Lx)+(Ly*Ly));
    			edge.pixels[row][col] = new Color((int)intensity, (int)intensity, (int)intensity);
    		}
    	}
    	return edge;
    }
    
    public Image getReflection()
    {
    	Image reflect = new Image(this);//using Image copy constructor
    	for (int row = 0; row < numRows; row++)
    	{
    		for (int col = 0; col < numColumns/2; col++)
    		{
    			reflect.pixels[row][col] = this.pixels[row][(numColumns-1)-col];
    		}
    	}
    	return reflect;
    }
    
    public void drip()
    {
    	Random randomNumber = new Random();
    	StdDraw.clear();
    	for (int row = 1; row < numRows; row++)
    	{
    		for (int col = 0; col < numColumns; col++)
    		{
    			StdDraw.setPenColor(pixels[row][col]);
    			StdDraw.filledSquare(col + 0.5, row + 0.5, 0.5);
    			int tenPercent = randomNumber.nextInt(10);
    	    	if (tenPercent == 0)
    	    	{
    	    		pixels[row][col] = pixels[row-1][col];
    	    	}
    		}
    	}
    	StdDraw.show(20);
    }
    
    
    
    
    
    
    
    
}
