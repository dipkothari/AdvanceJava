package Assignment9;


public class wellsbank {
	public static void main(String args[]) {
		EmployeeGrade employeegrade = new EmployeeGrade();
		employeegrade.initializeEmployee(1001, "Deep Kothari", 4.5f, 4.9f);
		employeegrade.calculateAverageFeedback();
		employeegrade.calculateGrade();
		employeegrade.displayInfo();
	}

}
