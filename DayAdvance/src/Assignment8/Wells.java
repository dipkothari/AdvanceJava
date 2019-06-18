package Assignment8;

public class Wells {
	public static void main(String args[]) {
		EmployeeGrade employeegrade = new EmployeeGrade();
		employeegrade.initializeEmployee(1001, "Deep Kothari", 4.5f, 4.9f, 4.2f);
		employeegrade.calculateAverageFeedback();
		employeegrade.calculateGrade();
		employeegrade.displayInfo();
	}
	
}
