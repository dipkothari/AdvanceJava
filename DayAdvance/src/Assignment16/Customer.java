package Assignment16;

public class Customer {
	private int customerId;
	private String customerName;
	private String customerAddress;
	private int pincode;
	
	public Customer(){
		
	}
	public Customer(int customerId,String customerName,String customerAddress,int pincode) {
		this.customerId=customerId;
		this.customerName=customerName;
		this.customerAddress=customerAddress;
		this.pincode=pincode;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
}
