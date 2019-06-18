package Assignment15;
import Assignment13.*;
public class Wells {
	public static void main(String args[]) {
		Customer john = new Customer(10011, "John", "64 Thorne St", 07307);
		Saving johnsa = new Saving(101, john, 1000);
		transaction(johnsa, 1200);
		johnsa.withdraw(1400);
		johnsa.balanceEnquiry();
		Customer johna = new Customer(101, "Johna", "66 Thorne St", 07307);
		CurrentAccount johnaca = new CurrentAccount(102, johna,500,2000);
		transaction(johnaca,1500);
		
		johnaca.withdraw(1000);
		johnaca.withdraw(2000);
		johnaca.withdraw(4000);
		johnaca.withdraw(3000);
	}
	private static void transaction(Account account, double amount) {
		account.deposit(amount);
		//account.withdraw(100);
	}
}

