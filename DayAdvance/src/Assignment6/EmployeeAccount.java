package Assignment6;
import Assignment5.*;
public class EmployeeAccount {
	public static void main(String args[]) {
		CustomerAccounT customeraccount = new CustomerAccounT(1001, "Paul", "J", "Anderson", "Paul@Wellsfargo.com", "Salary", "3rd Jan, 1985", "M", "Single");
		customeraccount.display();
		CustomerAccounT customeraccount1 = new CustomerAccounT(1002, "John", " ", "Jacob", "John@Wellsfargo.com", "Non-Salary", "6th March, 1985", "M", "Married");
		customeraccount1.display();
	}
}
