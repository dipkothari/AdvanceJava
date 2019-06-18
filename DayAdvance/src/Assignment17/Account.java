package Assignment17;

public abstract class Account {
	private int accountNo;
	private Customer customer;
	protected double balance;
	
	public Account(){
		
	}

	public Account(int accountNo, Customer customer, double balance) {
		super();
		this.accountNo = accountNo;
		this.customer = customer;
		this.balance = balance;
	}
	public void withdraw(double amount) {
	}
	public Customer getCustomer() {
		return customer;
	}
	public void balanceEnquiry() {
		System.out.println("hello available balance is "+this.balance);
	}
	public void deposit(double amount) {
		balance=balance+amount;
	}
}
