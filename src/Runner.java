
public class Runner {

	public static void main(String[] args) {

		double physicsResult = 120;
		double chemistryResult = 110;
		double biologyResult = 89.5;

		Results result = new Results();

		result.examResults(physicsResult, chemistryResult, biologyResult);
		result.examPercentages(physicsResult, chemistryResult, biologyResult);

	}

}
