import java.util.Scanner;

public class Gradebook {
	
	private int numStudents;
	private int numQuizzes;
	private int [][] grade;
	
	public Gradebook(int students, int quizzes)
	{
		numStudents = students;
		numQuizzes = quizzes;
		grade = new int[numStudents+1][numQuizzes+1];
	}
	
	public void enterGrades()
	{
		Scanner keyboard = new Scanner(System.in);
		for (int i = 1; i < grade.length; i++)//rows representing each student
		{
			System.out.println("Enter scores for student " + i + ": ");
			for (int j = 1; j < grade[i].length; j++)
			{
				System.out.println("Enter score for quiz " + j + ": ");
				grade[i][j] = keyboard.nextInt();
			}
		}
	}
	
	public void displayGrades()
	{
		for (int i = 1; i < grade.length; i++)
		{
			System.out.print("Student" + i + ": ");
			for (int j = 1; j < grade[i].length; j++)
			{
				System.out.print("     " + grade[i][j]);
			}
			System.out.println();
		}
	}
	public double getQuizAverage()//for all quizzes
	{
		double sum = 0;
		for (int i = 1; i <= numStudents; i++)
		{
			for (int j = 1; j <= numQuizzes; j++)
			{
				sum +=grade[i][j];
			}
		}
		return sum/(numStudents * numQuizzes);
	}
	
	public double getQuizAverage(int quizNumber)
	{
		if(quizNumber > 0 && quizNumber <= numQuizzes)
		{
			double sum = 0;
			for (int student = 1; student <= numStudents; student++)
			{
				sum += grade[student][quizNumber];
			}
			return sum/numStudents;
		}
		else
		{
			return -1;
		}
	}
	
	public double getStudentAverage(int studentNumber)
	{
		if (studentNumber > 0 && studentNumber <= numStudents)
		{
			double sum = 0;
			for (int quiz = 1; quiz <= numQuizzes; quiz++)
			{
				sum += grade[studentNumber][quiz];
			}
			return sum/numQuizzes;
		}
		else
		{
			return -1;
		}
	}
	
	

}
