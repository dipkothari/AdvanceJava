package Assignment6;
import Assignment4.*;
public  class Account {
	private int accountNo;
	private Customer customer;
	protected double balance;
	
	public Account() {}

	public Account(int accountNo, Customer customer, double balance) {
		this.accountNo = accountNo;
		this.customer = customer;
		this.balance = balance;
	//	System.out.println(customer);
	}

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", customer=" + customer + ", balance=" + balance + "]";
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public synchronized double getBalance() {
		return balance;
	}

	public synchronized void setBalance(double balance) {
		this.balance = balance;
	}
	
}
