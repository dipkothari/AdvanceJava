package Assignment30;

import java.util.Calendar;

public class Employee {
	private int employeeID;
	private String employeeName;
	private Calendar dateOFBirth;
	//public Object cal;
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Calendar getDateOFBirth() {
		return dateOFBirth;
	}
	public void setDateOFBirth(Calendar dateOFBirth) {
		this.dateOFBirth =dateOFBirth;
	}
	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", employeeName=" + employeeName + ", dateOFBirth=" + dateOFBirth
				+ "]";
	}
	
	
}
