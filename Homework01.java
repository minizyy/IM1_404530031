/*
 * [A]88
 * [TA's advise]
 * 1.�o�����@�~���²��, �ت��O�Ʊ�A�̥i�H�����@�Ӧ��Z, �ҥH�Ҧ��g�o���@�~���P�ǧڳ̰��O����90��, �������e�·иɥ�@���Ѯv�X��homework1, �ڷ|�b��Ѿl��10���ɦ^��(�p�G�������T����)
 * �o�����нЧA�����, �]���o����٬O�|�Ʊ�A�̭n�Ƿ|�p��ϥΪ��󪺤覡
 * 2.�ڶ}���@�~�����O�|�h�B��, �A�֤F���k, �������u�q��2��
 * 3.�Q�Q�ݭYinput���ä��O�Ʀr�ӬO�r�ꪺ�ܷ|���ͤ�����D? (�o�Oexception���B�z, ����ĳ�ȴ��ѧA�̰ʸ�, �èS���C�J��������)
 */
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
