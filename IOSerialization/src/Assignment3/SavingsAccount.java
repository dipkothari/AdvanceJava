package Assignment3;

public class SavingsAccount extends Account
{
	private float rateOfInterest;

	private double minimumBalance;

	public SavingsAccount(int accountNo,Customer customer,double
			balance,float rateOfInterest,double minimumBalance){
		super(accountNo,customer,balance);
		this.rateOfInterest=rateOfInterest;
		this.minimumBalance=minimumBalance;
	}

	public float getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(float rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
}