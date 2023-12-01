import java.util.Scanner;

public class GradebookDriver {

	public static void main(String[] args) {
		
		int numStudents;
		int numQuizzes;
		Gradebook comp1671;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a number of students: ");
		numStudents = keyboard.nextInt();
		System.out.println("Enter a number of quizzes: ");
		numQuizzes = keyboard.nextInt();
		comp1671 = new Gradebook(numStudents, numQuizzes);
		comp1671.enterGrades();
		comp1671.displayGrades();
		double averageAllQuizzes = comp1671.getQuizAverage();
		System.out.println(averageAllQuizzes);
		for (int i = 1; i <= numQuizzes; i++)
		{
			System.out.println("Average for quiz " + i + " is: " + comp1671.getQuizAverage(i));
		}
		for (int i = 1; i <= numStudents; i++)
		{
			System.out.println("Average for student " + i + " is: " + comp1671.getStudentAverage(i));
		}

	}

}
