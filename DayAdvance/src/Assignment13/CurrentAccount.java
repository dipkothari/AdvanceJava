package Assignment13;

public class CurrentAccount extends Account {
	private double CurrentAmount;
	public CurrentAccount() {
		
	}
	public CurrentAccount(int accountNo, Customer customer, double balance,double currentAmount) {
		super(accountNo, customer, balance);
		this.CurrentAmount=currentAmount;
		// TODO Auto-generated constructor stub
	}
	public void withdraw(double amount) { //throws InsufficientBalanceException{
		this.balance=this.balance-amount;
		if(this.balance<-(CurrentAmount)) {
			System.out.println("You have exceeded your overdraft amount");
			//throw new InsufficientBalanceException();
		}
		else {
			System.out.println(this.balance);
		}
	}
	public double getEligiblityAmount() {
		return -2000;
	}
	
}
