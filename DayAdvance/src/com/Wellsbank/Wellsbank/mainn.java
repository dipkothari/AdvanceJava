package com.Wellsbank.Wellsbank;
import com.Wellsbank.account.*;
import com.Wellsbank.customer.*;

public class mainn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer john = new Customer(10011, "John", "64 Thorne St", 07307);
		Saving johnsa = new Saving(101, john, 1000);
		johnsa.deposit(1000);
		johnsa.balanceEnquiry();
		johnsa.withdraw(1400);
		johnsa.deposit(200);
		johnsa.balanceEnquiry();
		johnsa.calculateInterest();
		Customer johna = new Customer(101, "Johna", "66 Thorne St", 07307);
		CurrentAccount johnaca = new CurrentAccount(102, johna,500,2000);
		System.out.println(johnaca.getEligiblityAmount());
		/*
		 * johnaca.deposit(1500); johnaca.deposit(2000);
		 */
		johnaca.withdraw(1000);
		johnaca.withdraw(1500);
		johnaca.withdraw(1);
		/*
		 * johnaca.withdraw(2939); johnaca.withdraw(2);
		 */
		//johnaca.getEligiblityAmount();
		
	}

}
