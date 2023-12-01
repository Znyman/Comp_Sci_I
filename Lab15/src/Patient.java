/**
 * Lab 15
 * @author Zachery Nyman
 * 04 November 2016
 */

public class Patient {
	
	private int age;//Patient's age at time of surgery
	private int year;//Year of surgery
	private int positiveNodes;//Number of positive axillary nodes detected
	private boolean survivedFiveYears;//true if patient survived five or more years, false otherwise
	
	Patient (int patientAge, int patientYear, int patientPositiveNodes, int patientSurvivedFiveYears)
	{
		age = patientAge;
		year = patientYear;
		positiveNodes = patientPositiveNodes;
		if (patientSurvivedFiveYears == 1)//data states if '1', then patient survived 5 years or longer
		{
			survivedFiveYears = true;
		}
		else//data states if '2', then patient died within 5 years
		{
			survivedFiveYears = false;
		}
	}
	public int getPositiveNodes()
	{
		return positiveNodes;
	}
	public boolean getFiveYearSurvivalStatus()
	{
		if (survivedFiveYears)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	

}
