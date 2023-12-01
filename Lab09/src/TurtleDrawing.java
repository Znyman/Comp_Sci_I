/**
 * Lab 09
 * @author Zachery Nyman
 * 12 October 2016
 */
import edu.princeton.cs.introcs.StdDraw;
import java.util.Scanner;
import java.util.Random;

public class TurtleDrawing {

	public static final int CANVAS_SIZE = 500;
	public static final int STEP_SIZE = 50;
	public static final int START = 50;
	
	public static void main(String[] args) {
		
		StdDraw.setCanvasSize(CANVAS_SIZE, CANVAS_SIZE);
        StdDraw.setXscale(0, CANVAS_SIZE);
        StdDraw.setYscale(0, CANVAS_SIZE);
        StdDraw.setPenRadius(0.025);
        
        double xCoordinate = START;
        double yCoordinate = START;
        StdDraw.point(xCoordinate, yCoordinate);
        
        Scanner keyboard = new Scanner(System.in);
        Random randomNumber = new Random();
       
        String command;
        do {
        	System.out.println("Enter a command:A ");
        	command = keyboard.next();
            
        	switch (command) {
        	
    		case "forward":
    			StdDraw.setPenRadius(0.025);
    			StdDraw.point(xCoordinate+STEP_SIZE, yCoordinate);//east
    			xCoordinate += STEP_SIZE;
    			break;
    		case "left":
    			System.out.println("Enter a command:B ");
	            command = keyboard.next();
    			if (command.equals("forward")) {
    				do {
    					StdDraw.setPenRadius(0.025);
    					StdDraw.point(xCoordinate, yCoordinate+STEP_SIZE);//north
    					yCoordinate += STEP_SIZE;
    	            	System.out.println("Enter a command:C ");
    	            	command = keyboard.next();
    					} while (command.equals("forward"));
    			}
    			if (command.equals("left")) {
    			System.out.println("Enter a command:D ");
    			command = keyboard.next();
    			do {
    				StdDraw.setPenRadius(0.025);
    				StdDraw.point(xCoordinate-STEP_SIZE, yCoordinate);//west
        			xCoordinate -= STEP_SIZE;
        			System.out.println("Enter a command:E ");
        			command = keyboard.next();
	            	} while (command.equals("forward"));
    			}
    			if (command.equals("left")) {
        			System.out.println("Enter a command:F ");
        			command = keyboard.next();
        			do {
        				StdDraw.setPenRadius(0.025);
        				StdDraw.point(xCoordinate, yCoordinate-STEP_SIZE);//south
            			yCoordinate -= STEP_SIZE;
            			System.out.println("Enter a command:G ");
            			command = keyboard.next();
    	            	} while (command.equals("forward"));
    			}
    			break;
    		case "right":
    			System.out.println("Enter a command:H ");
	            command = keyboard.next();
    			if (command.equals("forward")) {
    				do {
    					StdDraw.setPenRadius(0.025);
    					StdDraw.point(xCoordinate, yCoordinate-STEP_SIZE);//south
    					yCoordinate -= STEP_SIZE;
    					System.out.println("Enter a command:I ");
    					command = keyboard.next();
    					} while (command.equals("forward"));
    			}
    			if (command.equals("right")) {
    			System.out.println("Enter a command:J ");
    			command = keyboard.next();
    				do {
    					StdDraw.setPenRadius(0.025);
    					StdDraw.point(xCoordinate-STEP_SIZE, yCoordinate);//west
    					xCoordinate -= STEP_SIZE;
    					System.out.println("Enter a command:K ");
    					command = keyboard.next();
	            		} while (command.equals("forward"));
    			}
    			if (command.equals("right")) {
        			System.out.println("Enter a command:L ");
        			command = keyboard.next();
        			do {
        				StdDraw.setPenRadius(0.025);
        				StdDraw.point(xCoordinate, yCoordinate+STEP_SIZE);//north
            			yCoordinate += STEP_SIZE;
            			System.out.println("Enter a command:M ");
            			command = keyboard.next();
    	            	} while (command.equals("forward"));
    			}
    			break;
    		case "pendown":
    			{
    					StdDraw.setPenRadius(0.005);
    					StdDraw.line(xCoordinate, yCoordinate, 
    							xCoordinate+STEP_SIZE, yCoordinate);
    					}
    			break;
    		case "resetcolor":
    			StdDraw.setPenColor(StdDraw.BLACK);
    			break;
    		case "randomcolor":
    			int penColor = randomNumber.nextInt(5);
    			
    			if (penColor == 1) {
    				StdDraw.setPenColor(StdDraw.RED);
    			}
    			
    			if (penColor == 2) {
    				StdDraw.setPenColor(StdDraw.BLUE);
    			}
    			if (penColor == 3) {
    				StdDraw.setPenColor(StdDraw.YELLOW);
    			}
    			if (penColor == 4) {
    				StdDraw.setPenColor(StdDraw.GREEN);
    			}
    			break;
    		default:
    			System.out.println("Invalid command");
        	}
        } while (!command.equalsIgnoreCase("quit"));
       
        	
        	
    
		}

	}
