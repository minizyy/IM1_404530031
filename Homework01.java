
//404530031�G���D�A�W�Ǵ��S����c#����C
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
		
		System.out.printf("A + B = %f\n", num1 + num2);
		System.out.printf("A - B = %f\n", num1 - num2);
		System.out.printf("A * B = %f\n", num1 * num2);
	}
}
