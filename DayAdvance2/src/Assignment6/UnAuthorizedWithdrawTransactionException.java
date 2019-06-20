package Assignment6;

public class UnAuthorizedWithdrawTransactionException extends Exception{
	public UnAuthorizedWithdrawTransactionException() {
		super("The user is unauthorized for the withdrawal");
	}
}
