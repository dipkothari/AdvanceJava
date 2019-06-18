package Assignment10.Assignment10b;

import Assignment10.*;

public class Wells {
	public static void main(String args[]) {
	EmployeeGrade Ram = new EmployeeGrade();
	EmployeeGrade james = new EmployeeGrade(102,"James",4.2f,4.4f,4.1f);
	Ram.calculateAverageFeedback();
	Ram.calculateGrade();
	Ram.displayInfo();
	james.calculateAverageFeedback();
	james.calculateGrade();
	james.displayInfo();
}
}
