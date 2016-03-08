
//404530031鄭元媛，上學期沒有修c#那位。
import java.util.Scanner;
public class Homework01
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter number A: ");
		double num1 = in.nextDouble();
		System.out.print("Please enter number B: ");
		double num2 = in.nextDouble();
		
		/*double sum = num1 + num2;
		double subtraction = num1 - num2;
		double multiplication = num1 * num2;*/
		
		System.out.printf("A + B = %f\n", num1 + num2);
		System.out.printf("A - B = %f\n", num1 - num2);
		System.out.printf("A * B = %f\n", num1 * num2);
	}
}
