package Assignment11;
import Assignment10.*;
public class wells {
	public static void main(String args[]) {
		EmployeeGrade[] employee = new EmployeeGrade[3];
		for(int loop=0;loop<employee.length;loop++) {
			employee[loop]=new EmployeeGrade(1001,"Deep",4.1f,4.4f,4.1f);
			employee[loop].calculateAverageFeedback();
			employee[loop].calculateGrade();
		employee[loop].displayInfo();
		}
	}
}
