
/*
 * [A]100
 * [TA's Advise]
 * 1.題目並沒有要求要寫Scanner, 請依照題目要求作撰寫, 若之後作業若想以Scanner進行撰寫請務必寫例外處理, 產生例外未處理將以程式錯誤進行扣分.
 * 2.請盡量避免使用while(true), 這非常危險而且你沒有寫任何的break.
 * 3.有在javadoc中撰寫內容, Good JOB! extra point +2.
 * 4.常見的數學method可以記一下: Math.floor(), Math.abs(), Math.round(), Math.sqrt(), and so on..
 * */

import java.util.Scanner;

public class EasterTester {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		while (true) {// 這非常危險! 請注意!
			System.out.print("Please enter a year: ");
			int year = in.nextInt();
			String result = Easter.calculateEaster(year);
			System.out.print(result);
		}
	}
}
