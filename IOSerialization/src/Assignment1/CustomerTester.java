package Assignment1;

public class CustomerTester {
	
	public void acceptCutomerInfo(){ 
		
		System.out.println("\n\n\tPlease enter the details of the customer");

	
		System.out.print("Customer Id :"); 
		
		String custId=ReadData.acceptString(); 
		
		System.out.print("Customer Name :");
		
		String custName=ReadData.acceptString();
	
		Customer customer=new Customer();
		customer.setCustomerId(Integer.parseInt(custId));
		customer.setCustomerName(custName);

		int status=new CustomerFileDB().saveCustomer(customer);
		
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
		
	
		public void displayCustInfo()
		{
			System.out.print("\n\nPlease enter customer Id :");
			String custId=ReadData.acceptString();
			Customer customer=new CustomerFileDB().getCustomer(Integer.parseInt(custId));
	
			if(customer!=null)
			{
				System.out.println("\n Customer Id "+customer.getCustomerId());
	
				System.out.println(" Customer Name "+customer.getCustomerName());
			}
			else
			{
				System.out.println("Invalid customerId!!!");
				ReadData.acceptString();
				System.out.println("\n\n\n\n\n\n\n");	
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
