/**
 * Project4
 * @author Zachery Nyman
 * 01 November 2016
 * Lets the user produce a simple drawing on a canvas.
 */
import java.util.Scanner;

public class TurtleDriver {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);		
		Turtle t = new Turtle();
		
		System.out.println("Enter one of the following commands:");
		System.out.println("forward steps (for example, forward 5)");
		System.out.println("right angle (for example, right 45)");
		System.out.println("left angle (for example, left 45)");
		System.out.println("penup");
		System.out.println("pendown");
		System.out.println("pencolor (for example, pencolor blue)");
		System.out.println("quit");
		
		do
		{
			
			t.command = keyboard.next();
			if (t.command.equals("forward"))
			{
				System.out.println("Enter a command: ");
				t.forward(keyboard.nextInt());
			}
			else if (t.command.equals("right"))
			{
				System.out.println("Enter a command: ");
				t.right(keyboard.nextInt());
			}
			else if (t.command.equals("left"))
			{
				System.out.println("Enter a command: ");
				t.left(keyboard.nextInt());
			}
			else if (t.command.equals("penup"))
			{
				System.out.println("Enter a command: ");
				t.penUp();
			}
			else if (t.command.equals("pendown"))
			{
				System.out.println("Enter a command: ");
				t.penDown();
			}
			else if (t.command.equals("pencolor"))
			{
				t.setPenColor(keyboard.next());
				System.out.println("Enter a command: ");
			}
			else if (t.command.equals("quit"))
			{
			}
			else
			{
				System.out.println("Invalid command. Enter a command: ");
			}
			
		} while (!t.command.equals("quit"));
		
		System.out.println("You have terminated the program.");
		System.exit(0);

	}

}
