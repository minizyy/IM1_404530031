/**
 * This class implements Guass's algorithm to calculate the date of Easter
 * Sunday for any given year.
 * 
 * @author 404530031
 *
 */
public class Easter {
	/**
	 * This is a private, no-argument constructor without any implementation.
	 */
	private Easter() {

	}

	/**
	 * This method use Guass's algorithm to calculate the date of Easter Sunday.
	 * 
	 * @param aYear
	 *            any given year
	 * @return This method returns a string which tells us the date of Easter
	 *         Sunday for any given year.
	 */
	public static String calculateEaster(int aYear) {
		int a = aYear % 19;
		int b = aYear % 4;
		int c = aYear % 7;
		int k = aYear / 100;// Math.floor(), -2
		int p = ((13 + 8 * k) / 25);
		int q = k / 4;
		int M = (15 - p + k - q) % 30;
		int N = (4 + k - q) % 7;
		int d = (19 * a + M) % 30;
		int e = (2 * b + 4 * c + 6 * d + N) % 7;
		int day = 22 + d + e;
		int month = 3;
		if (d == 29 && e == 6) {
			day = 19;
			month = 4;
		} else if ((d == 28 && e == 6) && ((11 * M + 11) % 30 < 19)) {
			month = 4;
			day = 18;
		} else if ((0 > day) || (day > 31)) {
			month = 4;
			day = d + e - 9;
		}
		String result = "In " + aYear + ", Easter Sunday is: ";
		result = result + "month = " + month + " and day = " + day + "\n";
		return result;
	}
}