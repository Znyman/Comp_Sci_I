/**
 * Lab 17
 * @author Zachery Nyman
 * 14 November 2016
 */

import java.util.Scanner;

public class ImageDriver {

	public static void main(String[] args) {
		
		String filename = "test.ppm";
		Scanner keyboard = new Scanner(System.in);
		Image im = new Image(filename);
		im.draw();
		
		System.out.println("Press Enter to display the next image.");
		keyboard.nextLine();
		
		Image im2 = im.getGrayscaleImage();
		im2.draw();
		
		System.out.println("Press Enter to display the next image.");
		keyboard.nextLine();
		
		//Image im3 = im.getEdgeImage();
		im2.getEdgeImage().draw();
		
		System.out.println("Press Enter to display the next image.");
		keyboard.nextLine();
		
		Image im3 = im.getReflection();
		im3.draw();
		
		System.out.println("Press Enter to display the next image.");
		keyboard.nextLine();
		
		while (true)
		{
			im.drip();
			im.draw();
		}

	}

}
