package Assignment10.Assignment10c;

import Assignment10.EmployeeGrade;

public class wells {
	public static void main(String args[]) {
	//	EmployeeGrade Ram = new EmployeeGrade();
		EmployeeGrade james = new EmployeeGrade(102,"James",4.2f,4.4f,3.1f);
		//Ram.calculateAverageFeedback();
		//Ram.calculateGrade();
		//Ram.displayInfo();
		james.calculateAverageFeedback();
		james.calculateGrade();
		james.displayInfo();
	}
}
