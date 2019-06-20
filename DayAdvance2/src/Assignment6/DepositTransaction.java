package Assignment6;
public class DepositTransaction extends Thread {
	private int transactionId;
	private Account account;
	private double amount;
	private int customerId;
	public DepositTransaction(int transactionId, Account account, double amount, int customerId) {
		//super();
		this.transactionId = transactionId;
		this.account = account;
		this.amount = amount;
		this.customerId = customerId;
	}
	public void deposit(Account account, double amount) {
		account.setBalance((account.getBalance()+amount));
	}
	public void run() {
		deposit (account,amount);
		System.out.println(transactionId+" transaction"+
						" completed!!!"+customerId +" thank you for "+"depostiting to the account "+account.getAccountNo());
	}
}
