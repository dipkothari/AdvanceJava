package com.Wellsbank.account;
import com.Wellsbank.customer.*;
public class Saving extends Account{
	protected double minimunBalance;
	protected int interestRate;
	
	public Saving() {
		
	}

	public Saving(int accountNo, Customer customer, double balance) {
		super(accountNo, customer, balance);
		this.minimunBalance=500;
		this.interestRate=12;
		// TODO Auto-generated constructor stub
	}
	public void withdraw(double amount) {
		if(balance-amount>500||balance-amount==500) {
			this.balance=this.balance-amount;
			System.out.println("Now you left with amount"+(this.balance));
		}
		else {
			System.out.println("Sorry, you can not withdraw because you exceed minimum balance");
		}
	}
	public void calculateInterest() {
		balance=((balance*12)/100)+balance;
		System.out.println("Your Balance with Interest is : "+this.balance);
	}
	
}
