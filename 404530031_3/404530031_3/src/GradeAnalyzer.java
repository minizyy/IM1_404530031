/**
 * This class calculates the average and standard deviation of grades.
 * 
 * @author 404530031
 *
 */
public class GradeAnalyzer {
	private int aPlusCounter = 0;
	private int aCounter = 0;
	private int aMinusCounter = 0;
	private int bPlusCounter = 0;
	private int bCounter = 0;
	private int bMinusCounter = 0;
	private int cPlusCounter = 0;
	private int cCounter = 0;
	private int dCounter = 0;
	private int fCounter = 0;
	private int gradesCounter = 0;
	private double totalGrades = 0;
	private double sumOfSquaredGrades = 0;
	private double average = 0;
	private int standardDeviation = 0;

	/**
	 * This method tells you whether the grade is valid.
	 * 
	 * @param aGrade
	 *            Student's grade
	 * @return Validation of the grade
	 */
	public boolean isValidGrade(double aGrade) {
		final double MIN_GRADE = 0;
		final double MAX_GRADE = 110;
		if (aGrade >= MIN_GRADE && aGrade <= MAX_GRADE) {
			return true;
		} else
			return false;
	}

	/**
	 * This method calculates the total of valid grades and the numbers of valid
	 * grades. It also calculates the sum of the squared of every valid grade
	 * for the method AnalyzeGrades to use.
	 * 
	 * @param aGrade
	 *            Student's grade
	 */
	public void addGrade(double aGrade) {
		final int MIN_APlUS = 98;
		final int MIN_A = 92;
		final int MIN_AMINUS = 90;
		final int MIN_BPlUS = 88;
		final int MIN_B = 82;
		final int MIN_BMINUS = 80;
		final int MIN_CPlUS = 78;
		final int MIN_C = 72;
		final int MIN_CMINUS = 70;
		final int MIN_D = 60;

		if (isValidGrade(aGrade)) {
			totalGrades += aGrade;
			gradesCounter++;
			sumOfSquaredGrades += (aGrade * aGrade);

			if (aGrade >= MIN_APlUS) {
				aPlusCounter++;
			} else if (aGrade >= MIN_A) {
				aCounter++;
			} else if (aGrade >= MIN_AMINUS) {
				aMinusCounter++;
			} else if (aGrade >= MIN_BPlUS) {
				bPlusCounter++;
			} else if (aGrade >= MIN_B) {
				bCounter++;
			} else if (aGrade >= MIN_BMINUS) {
				bMinusCounter++;
			} else if (aGrade >= MIN_CPlUS) {
				cPlusCounter++;
			} else if (aGrade >= MIN_C) {
				cCounter++;
			} else if (aGrade >= MIN_D && aGrade < MIN_CMINUS) {
				dCounter++;
			} else {
				fCounter++;
			}
		} // end if
	} // end addGrade

	/**
	 * This method calculates the average and standard deviation of all valid
	 * grades.
	 */
	public void AnalyzeGrades() {
		average = Math.round(totalGrades / gradesCounter);
		double temp = sumOfSquaredGrades - gradesCounter * average * average;
		double sd = Math.sqrt(temp / (gradesCounter - 1));
		standardDeviation = (int) sd;
	}

	/**
	 * This method provide average, standard deviation and distribution of the
	 * grades.
	 * 
	 * @return A string tells you the statistic of the grades.
	 */
	public String toString() {
		String result = "";
		if (gradesCounter < 2) {
			return "You did not enter enough grades to analyze. Please enter at least 2 valid grades.\n";
		}
		result += "You entered " + gradesCounter + " valid grades from 0 to 110. ";
		result += "Invalid grades are ignored!\n\n";
		result += "The average = " + (int) average + " with a standard deviation = " + standardDeviation + ".\n\n";
		result += "The grade distribution is:\n\n";
		result += "A+ =  " + aPlusCounter + "\n";
		result += "A  =  " + aCounter + "\n";
		result += "A- =  " + aMinusCounter + "\n";
		result += "B+ =  " + bPlusCounter + "\n";
		result += "B  =  " + bCounter + "\n";
		result += "B- =  " + bMinusCounter + "\n";
		result += "C+ =  " + cPlusCounter + "\n";
		result += "C  =  " + cCounter + "\n";
		result += "C- =  " + aMinusCounter + "\n";
		result += "D  =  " + dCounter + "\n";
		result += "F  =  " + fCounter + "\n";
		return result;
	}
} // end class