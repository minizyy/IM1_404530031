
/*
 * [A]98
 * [TA's Advise]
 * 1. �S����Ӥj���D, �O�o�i��|�X�����a��, ���Өҥ~�B�z�i�H�קK��ӵ{��crush.
 * */
// 2016.4.14
import javax.swing.JOptionPane;

public class GradeAnalyzerTester {
	public static void main(String[] args) {
		GradeAnalyzer classGrade = new GradeAnalyzer();
		String input = JOptionPane.showInputDialog("Enter grades or Q or q to quit: ");
		while (!(input.equals("Q") || input.equals("q"))) {

			// ���ϥΪ̿�J��ĳ�n���ҥ~�B�z, -2.
			double aGrade = Double.parseDouble(input);
			classGrade.addGrade(aGrade);
			input = JOptionPane.showInputDialog("Enter grades or Q or q to quit: ");
		}
		classGrade.AnalyzeGrades();
		String result = classGrade.toString();
		System.out.print(result);
	} // end main
} // end class
