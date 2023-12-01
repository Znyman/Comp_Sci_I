
public class METSCalculator {

	//these are constants
	public static final int RUN_METS = 10;
	public static final int BASKETBALL_METS = 8;
	public static final int SLEEP_METS = 1;
	public static final double LBS_TO_KG = 1/2.2;
	
	public static void main(String[] args) {
		double weightInPounds = 150;
		int runMinutes = 30;
		int bbMinutes = 30;
		int sleepMinutes = 6*60;
		
		double weightInKilograms;
		double runCalories, bbCalories, sleepCalories;
		
		weightInKilograms = weightInPounds*LBS_TO_KG;
		runCalories = 0.0175*RUN_METS*weightInKilograms*runMinutes;
		bbCalories = 0.0175*BASKETBALL_METS*weightInKilograms*bbMinutes;
		sleepCalories = 0.0175*SLEEP_METS*weightInKilograms*sleepMinutes;
		
		double totalCalories = runCalories+bbCalories+sleepCalories;
		System.out.println("Total calories: " + totalCalories);

	}

}
