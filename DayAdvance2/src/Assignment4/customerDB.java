package Assignment4;
import java.util.*;
public class customerDB {
	private List<Customer> customerList = new ArrayList<>();
	public boolean saveCustomer(Customer customer) {
		boolean status = false;
		status = customerList.add(customer);
	//	System.out.println(customerList.toString());
		return status;
	}
	
	



	public List<Customer> getAllCustomer(){
	//	System.out.println(customerList);
		return customerList;
	}
	public Set<Integer> getLoanAvailedCustomer(){
		Set<Integer> loanAvailedCustomers = new TreeSet<Integer>();
		Iterator<Customer> customerIterator = customerList.iterator();
		while(customerIterator.hasNext()) {
			Customer customer = customerIterator.next();
			if(customer.isLoanAvailed()) {
				loanAvailedCustomers.add(customer.getCustomerId());
		
			}
		}
		return loanAvailedCustomers;
	}
}
