/**
 * Lab 15
 * @author Zachery Nyman
 * 04 November 2016
 */
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class HabermanStatisticsDriver {

	public static void main(String[] args) {
		
		String filename = "haberman.data.txt";
		Scanner inputStream = null;
		
		try //trying to open text file
		{
			inputStream = new Scanner(new FileInputStream(filename));
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Cannot open file: " + filename);
			System.exit(0);
		}
		
		Patient[] patients = new Patient[500];//used for partially filled array
		int count = 0;
		
		while (inputStream.hasNextLine())
		{
			String line = inputStream.nextLine();
			//System.out.println(line);//Test on retrieving lines of data from file
			String[] data = line.split(",");
			int age = Integer.parseInt(data[0]);
			int year = Integer.parseInt(data[1]);
			int positiveNodes = Integer.parseInt(data[2]);
			int yearsSurvived = Integer.parseInt(data[3]);
			patients[count] = new Patient(age, year, positiveNodes, yearsSurvived);
			count++;
		}
		
		double totalNodesSurvived5 = 0;
		double totalNodesDied5 = 0;
		int countNodesSurvived5 = 0;
		int countNodesDied5 = 0;
		
		for (int i = 0; i < count; i++)
		{
			boolean fiveYearSurvivalStatus = patients[i].getFiveYearSurvivalStatus();
			if (fiveYearSurvivalStatus)
			{
				int positiveNodes = patients[i].getPositiveNodes();
				totalNodesSurvived5 += positiveNodes;
				countNodesSurvived5++;
				//System.out.println("Survived5: " + totalNodesSurvived5);//used to test accuracy of input
			}
			else
			{
				int positiveNodes = patients[i].getPositiveNodes();
				totalNodesDied5 += positiveNodes;
				countNodesDied5++;
				//System.out.println("Died5: " + totalNodesDied5);//used to test accuracy of input
			}
		}
		double averageNodesSurvived5 = totalNodesSurvived5/countNodesSurvived5;
		double averageNodesDied5 = totalNodesDied5/countNodesDied5;
		System.out.println("Number of patients processed: " + count);
		System.out.println("The average positive axillary nodes detected in patients:");
		System.out.println("	Survived five years or longer: " + averageNodesSurvived5);
		System.out.println("	Survived less than five years: " + averageNodesDied5);

	}

}
