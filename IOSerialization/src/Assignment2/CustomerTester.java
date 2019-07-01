package Assignment2;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CustomerTester {
	
	public void acceptCutomerInfo(){ 
		
		System.out.println("\n\n\tPlease enter the details of the customer");

	
		System.out.print("Customer Id :"); 
		
		String custId=ReadData.acceptString(); 
		
		System.out.print("Customer Name :");
		
		String custName=ReadData.acceptString();

		System.out.print("Enter balance:");
		
		String balance=ReadData.acceptString();
		
		Customer customer = new Customer();
		Account account = new Account();
		
		customer.setCustomerId(Integer.parseInt(custId));
		customer.setCustomerName(custName);
		
		account.setBalance(Integer.parseInt(balance));		
		account.setCustomer(customer);
		
		int status;
		try {
			status = new CustomerFileDB().saveCustomer(account);
			if(status==0)
			{
				System.out.println("Your details are saved"); 
				ReadData.acceptString();
				System.out.println("\n\n\n\n\n\n\n");
			}
			else
			{
				System.out.println("Your details could not be saved.Please try later");
				ReadData.acceptString();
				System.out.println("\n\n\n\n\n\n\n");
			}
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
		
	
		public void displayCustInfo()
		{
			System.out.print("\n\nPlease enter customer Id :");
			String custmId = ReadData.acceptString();
			Account account;
			try {
				account = new CustomerFileDB().getAccountDetails(Integer.parseInt(custmId));
				if(account!=null)
				{
					System.out.println("\n Customer Id "+account.getCustomer().getCustomerId());
		
					System.out.println("\n Customer Name "+account.getCustomer().getCustomerName());
					
					System.out.println("\n Account No: " + account.getAccountNo());

					System.out.println("\n Account Balance: " + account.getBalance());
				}
				else
				{
					System.out.println("Invalid customerId!!!");
					ReadData.acceptString();
					System.out.println("\n\n\n\n\n\n\n");	
				}
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		public void customerMenu()
		{
		while(true)
		{
		
			System.out.println("\tCustomer Menu");
			System.out.println("-----------------------------------");
	
			System.out.println("1. Add Customer");
			System.out.println("2. Get customer Info");
			System.out.println("3. Exit");
			System.out.print("\nEnter option :");
			String optedValue=ReadData.acceptString();
			
	
			int option=Integer.parseInt(optedValue); 
	
			switch(option)
			{
				case 1: acceptCutomerInfo(); break;
				case 2: displayCustInfo();break;
				case 3: System.exit(0);break;
				default :System.out.println("Enter a valid option");
	
				ReadData.acceptString();
			}
		}
	}
}
