package Assignment5;

public class CustomerAccounT {
	private int EmployeeId;
	private static int accountNumber=0;
	private String firstName;
	private String Middle;
	private String LastName;
	private String EmailID;
	private String AccountType;
	private String DOB;
	private String Gender;
	private String MaritalStatus;
	public CustomerAccounT(int EmployeeId,String firstName, String middle, String lastName, String emailID, String accountType,
			String dOB, String gender, String maritalStatus) {
		this.EmployeeId=EmployeeId;
		accountNumber=accountNumber+1;
		this.firstName = firstName;
		Middle = middle;
		LastName = lastName;
		EmailID = emailID;
		AccountType = accountType;
		DOB = dOB;
		Gender = gender;
		MaritalStatus = maritalStatus;
	}
	public void display() {
		System.out.println("Account Number "+String.format("%04d", accountNumber)+"\n"+
							"Employee ID "+EmployeeId+"\n"+
							"FirstName "+firstName+"\n"+
							"Middle "+Middle+"\n"+
							"LastName"+LastName+"\n"+
							"EmailID "+EmailID+"\n"+
							"Account Type "+AccountType+"\n"+
							"DOB "+DOB+"\n"+
							"Gender "+Gender+"\n"+
							"Marital Status "+MaritalStatus+"\n"+
							"------------------------------------"+
							"------------------------------------");
	}
	
}
