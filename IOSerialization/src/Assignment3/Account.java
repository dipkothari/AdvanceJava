package Assignment3;

import java.io.Serializable;

public class Account implements Serializable {

	private static int accountNo = 10;
	private Customer customer;
	protected double balance;

	public Account()
	{
		this.accountNo = ++ accountNo;
	}
	public Account(int accountNo, Customer customer, double balance) {
		this();
		this.customer = customer;
		this.balance = balance;
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
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}