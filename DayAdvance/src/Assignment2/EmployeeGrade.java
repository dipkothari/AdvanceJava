package Assignment2;

public class EmployeeGrade {
	public static void main(String args[]) {
	int employeeId[]= {1001,1002,1003,1004,1005};
	float customer1Feedback[]= {4.1f,4.5f,3.5f,4.9f,3.9f};
	float customer2Feedback[]= {4.5f,4.8f,4.5f,3.9f,4.9f};
	float customer3Feedback[]= {4.1f,3.8f,4.2f,4.5f,4.9f};
	float averageFeedback[] = new float[employeeId.length];
	char grade[] = new char[employeeId.length];
	for(int i=0;i<employeeId.length;i++) {
		averageFeedback[i]= (customer1Feedback[i]+customer2Feedback[i]+customer3Feedback[i])/3;
	}
	for(int i = 0;i<employeeId.length;i++) {
		 if(averageFeedback[i]<4.99&&averageFeedback[i]>=4.5) {
			 grade[i]='A';
		 }
		 else if(averageFeedback[i]<=4.5&&averageFeedback[i]>=4.2){
			 grade[i]='B';
		 }
		 else if(averageFeedback[i]<=4.2&&averageFeedback[i]>=3.9){
			 grade[i]='C';
		 }
		 else {
			 grade[i]='D';
		 }
	}
	for(int i = 0;i<employeeId.length;i++) {
		System.out.println("EmployeeID "+employeeId[i]+" has feedback of average "+averageFeedback[i]+" with grade"+grade[i]);
	}
	}
}
