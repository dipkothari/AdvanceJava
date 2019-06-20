package Assignment6;

import Assignment4.Customer;

public class Security {
	public synchronized void authorization(Account account,Customer customer) throws UnAuthorizedWithdrawTransactionException{
		if(account.getCustomer().getCustomerId()!=customer.getCustomerId()) {
			throw new UnAuthorizedWithdrawTransactionException();
		}
	}
}
