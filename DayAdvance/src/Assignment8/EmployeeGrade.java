package Assignment8;

public class EmployeeGrade {
	private int employeeNo;
	private String employeeName;
	private float customer1Feedback;
	private float customer2Feedback;
	private float customer3Feedback;
	private float averageFeedback;
	private char grade;
	
	public void initializeEmployee(int employeeNo, String employeeName, float customer1Feedback, float customer2Feedback, float customer3Feedback) {
		this.employeeNo=employeeNo;
		this.employeeName=employeeName;
		this.customer1Feedback=customer1Feedback;
		this.customer2Feedback=customer2Feedback;
		this.customer3Feedback=customer3Feedback;
	}
	public void calculateAverageFeedback() {
		averageFeedback = (this.customer1Feedback+this.customer2Feedback+this.customer3Feedback)/3;
	}
	public void calculateGrade() {
		 if(averageFeedback<4.99&&averageFeedback>=4.5) {
			 grade='A';
		 }
		 else if(averageFeedback<=4.5&&averageFeedback>=4.2){
			 grade='B';
		 }
		 else if(averageFeedback<=4.2&&averageFeedback>=3.9){
			 grade='C';
		 }
		 else {
			 grade='D';
		 }
	}
	public void displayInfo() {
		System.out.println("Employee No :"+employeeNo+"\n"+
							"Employee Name :"+employeeName+"\n"+
							"Average Feedback :"+averageFeedback+"\n"+
							"Grade :"+grade
							);
		
	}
}
