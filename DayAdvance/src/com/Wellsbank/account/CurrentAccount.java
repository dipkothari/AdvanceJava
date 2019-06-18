package com.Wellsbank.account;
import com.Wellsbank.customer.*;
public class CurrentAccount extends Account {
	protected double CurrentAmount;
	public CurrentAccount() {
		
	}
	public CurrentAccount(int accountNo, Customer customer, double balance,double currentAmount) {
		super(accountNo, customer, balance);
		this.CurrentAmount=currentAmount;
		// TODO Auto-generated constructor stub
	}
	public void withdraw(double amount) {
		this.balance=this.balance-amount;
		if(this.balance<-(CurrentAmount)) {
			System.out.println("You have exceeded your overdraft amount");
		}
		else {
			System.out.println(this.balance);
		}
	}
	public double getEligiblityAmount() {
		return -2000;
	}
	
}
