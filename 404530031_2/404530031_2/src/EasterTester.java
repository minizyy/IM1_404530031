
/*
 * [A]100
 * [TA's Advise]
 * 1.�D�بèS���n�D�n�gScanner, �Ш̷��D�حn�D�@���g, �Y����@�~�Y�Q�HScanner�i�漶�g�аȥ��g�ҥ~�B�z, ���ͨҥ~���B�z�N�H�{�����~�i�榩��.
 * 2.�кɶq�קK�ϥ�while(true), �o�D�`�M�I�ӥB�A�S���g����break.
 * 3.���bjavadoc�����g���e, Good JOB! extra point +2.
 * 4.�`�����ƾ�method�i�H�O�@�U: Math.floor(), Math.abs(), Math.round(), Math.sqrt(), and so on..
 * */

import java.util.Scanner;

public class EasterTester {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		while (true) {// �o�D�`�M�I! �Ъ`�N!
			System.out.print("Please enter a year: ");
			int year = in.nextInt();
			String result = Easter.calculateEaster(year);
			System.out.print(result);
		}
	}
}
