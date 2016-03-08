/*
 * [A]88
 * [TA's advise]
 * 1.這次的作業比較簡單, 目的是希望你們可以先有一個成績, 所以所有寫這項作業的同學我最高是先給90分, 期中之前麻煩補交一份老師出的homework1, 我會在把剩餘的10分補回來(如果完全正確的話)
 * 這部分煩請你們體諒, 因為這堂課還是會希望你們要學會如何使用物件的方式
 * 2.我開的作業說明是四則運算, 你少了除法, 此部分酌量扣2分
 * 3.想想看若input的並不是數字而是字串的話會產生什麼問題? (這是exception的處理, 此建議僅提供你們動腦, 並沒有列入評分項目)
 */
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
		
		System.out.printf("A + B = %f\n", num1 + num2);
		System.out.printf("A - B = %f\n", num1 - num2);
		System.out.printf("A * B = %f\n", num1 * num2);
	}
}
