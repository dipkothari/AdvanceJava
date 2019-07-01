package Assignment1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CustomerFileDB {

	String file = "data\\customer.dat";
	
	public int saveCustomer(Customer customer)
	{
		int status = -1;
		
		FileWriter filewriter = null;
		BufferedWriter bufferedWriter = null;
		
		try
		{
			filewriter = new FileWriter(file, true);
			bufferedWriter = new BufferedWriter(filewriter);
			
			String data = customer.getCustomerId() + ":" + customer.getCustomerName() + "\n";
			
			bufferedWriter.write(data);
			
			bufferedWriter.flush();
			status = 0;
		}
		catch(IOException ioex)
		{
			status = -2;
			ioex.printStackTrace();
		}
		finally
		{
			if(bufferedWriter != null)
			{
				try
				{
					bufferedWriter.close();
				}
				catch(IOException ioex)
				{
					ioex.printStackTrace();
				}
			}
			if(filewriter !=null)
			{
				try
				{
					filewriter.close();
				}
				catch(IOException ioex)
				{
					ioex.printStackTrace();
				}
			}
		}
		return status;
		
	}

	public Customer getCustomer(int customerId)
	{
		Customer customer = null;
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		
		try
		{
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			String []data = null;
			
			String input =bufferedReader.readLine();
			while(input!=null)
			{
				data = input.split(":");
				if(Integer.parseInt(data[0]) == customerId)
				{
					customer = new Customer();
					customer.setCustomerId(Integer.parseInt(data[0]));
					customer.setCustomerName(data[1]);
					break;
				}
				input = bufferedReader.readLine();
			}
		}
		catch(IOException ioex)
		{
			ioex.printStackTrace();
		}
		finally
		{
			if(null!=bufferedReader)
			{
				try {
				bufferedReader.close();
				}
				catch (IOException ioException)
				{ 
					ioException.printStackTrace();
				}
			}
				
			if(null!=fileReader)
			{
				try 
				{
				fileReader.close();
				}
				catch (IOException ioException)
				{
				ioException.printStackTrace();
				}
			}
		}
				
		return customer;
			
		}
		
	}
	

