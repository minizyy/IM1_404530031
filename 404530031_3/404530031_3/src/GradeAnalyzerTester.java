
/*
 * [A]98
 * [TA's Advise]
 * 1. 沒什麼太大問題, 記得可能會出錯的地方, 有個例外處理可以避免整個程式crush.
 * */
// 2016.4.14
import javax.swing.JOptionPane;

public class GradeAnalyzerTester {
	public static void main(String[] args) {
		GradeAnalyzer classGrade = new GradeAnalyzer();
		String input = JOptionPane.showInputDialog("Enter grades or Q or q to quit: ");
		while (!(input.equals("Q") || input.equals("q"))) {

			// 有使用者輸入建議要有例外處理, -2.
			double aGrade = Double.parseDouble(input);
			classGrade.addGrade(aGrade);
			input = JOptionPane.showInputDialog("Enter grades or Q or q to quit: ");
		}
		classGrade.AnalyzeGrades();
		String result = classGrade.toString();
		System.out.print(result);
	} // end main
} // end class
