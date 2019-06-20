package Assignment4;
import java.util.*;

public class WellBank {
	private static final customerDB customerDB = new customerDB();
	
	private static final Login login = new Login();
	
	public static void main(String args[]) {
		Customer cust1 = new Customer(1001,"Tan",false);
		customerDB.saveCustomer(cust1);
		login.addLogin(1001, "Wells123");
		Customer cust2 = new Customer(1002,"Sam",true);
		customerDB.saveCustomer(cust2);
		login.addLogin(1002, "Wells123");
		Customer cust3 = new Customer(1003,"Ram",true);
		customerDB.saveCustomer(cust3);
		login.addLogin(1003, "Wells123");
		Customer cust4 = new Customer(1004,"Manu",false);
		customerDB.saveCustomer(cust4);
		login.addLogin(1004, "Wells123");
		//System.out.println(cust1);
		List<Customer> customerList = customerDB.getAllCustomer();
		if(customerList.isEmpty()) {
			System.out.println("No customer in the Bank");
		}
		else {
			printCustomerList(customerList);
		}
		
		Set<Integer> loanAvailedCustomers = customerDB.getLoanAvailedCustomer();
		System.out.println("\n Customers who have Availed the loan");
		
		System.out.println("----------------------------------------");
		
		for(int custId:loanAvailedCustomers) {
			System.out.println(custId);
		}
	}
	
	public static void printCustomerList(List<Customer> customerlist) {
		Iterator<Customer> custIterator = customerlist.iterator();
		
		System.out.println("            Customer Details");
		System.out.println("--------------------------------------------");
		
		System.out.println("cust ID\t customer Name \t Loan"+"Availed");
		
		while(custIterator.hasNext()) {
			Customer customer = custIterator.next();
			System.out.print(customer.getCustomerId()+"\t\t");
			System.out.print(customer.getCustomerName()+"\t\t");
			
			String displayString="NO";
			if(customer.isLoanAvailed()) {
				displayString="YES";
			}
			System.out.println(displayString);
		}
	}
	
}
