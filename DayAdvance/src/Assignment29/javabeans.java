package Assignment29;

import java.util.Calendar;

public class javabeans {
	int employeeId;
	String employeeName;
	Calendar dateofBirth;
	String customerAddress;
	int pincode;
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Calendar getDateofBirth() {
		return dateofBirth;
	}
	public void setDateofBirth(Calendar dateofBirth) {
		this.dateofBirth = dateofBirth;
	}
}
