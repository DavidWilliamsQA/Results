
public class Results {

	double total;
	double percentage;

	public void examResults(double Physics, double Chemistry, double Biology) {

		System.out.println("Physics: " + Physics);
		System.out.println("Chemistry: " + Chemistry);
		System.out.println("Biology: " + Biology);

	}

	public void examPercentages(double Physics, double Chemistry, double Biology) {

		total = Physics + Chemistry + Biology;
		percentage = (total * 100) / 450;

		double physicsPercentage = Physics * 100 / 150;
		double chemistryPercentage = Chemistry * 100 / 150;
		double biologyPercentage = Biology * 100 / 150;
		int counter = 0;

		if (physicsPercentage < 60) {
			System.out.println("Failed the Physics Exam with a percentage: " + physicsPercentage);
			counter++;
		}
		if (chemistryPercentage < 60) {
			System.out.println("Failed the Chemistry Exam with a percentage: " + chemistryPercentage);
			counter++;
		}
		if (biologyPercentage < 60) {
			System.out.println("Failed the Biology Exam with a percentage: " + biologyPercentage);
			counter++;
		}

		if (counter >= 1) {
			System.out.println("Failed " + counter + " exams");
		} else {
			System.out.println("The percentage is " + percentage);
		}
	}

}
