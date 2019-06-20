package Assignment6;

import Assignment4.Customer;

public class WithdrawTransaction extends Security implements Runnable {
	private int transactionId;
	private Account account;
	private Customer customer;
	private double amount;
	public WithdrawTransaction(int transactionId, Account account, Customer customer, double amount) {
		super();
		this.transactionId = transactionId;
		this.account = account;
		this.customer = customer;
		this.amount = amount;
	}
	
	public synchronized double withdraw(Account account,double amount) throws InsufficientBalanceException{
		if(account.getBalance()>=amount) {
			account.setBalance(account.getBalance()-amount);
		}
		else {
			throw new InsufficientBalanceException();
		}
		return account.getBalance();
	}
	public void run() {
		 try {
			 authorization(account,customer);
				double balance = withdraw(account,amount);
				
				System.out.println(transactionId+" Transaction"+"completed!!! and the balance amount is "+balance);
				
		}
		catch(UnAuthorizedWithdrawTransactionException unAuthorizedWithdrawTransactionException) {
			System.out.println(transactionId+" Transaction"+" failed and "+unAuthorizedWithdrawTransactionException.getMessage());
			
		}
		catch(InsufficientBalanceException insufficientBalanceException) {
			System.out.println(transactionId+" Transaction"+"failed!!! and the account has insuffientBalance ");

		}
	}
}

