package Assignment3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Debug {

	public static void main(String []args){
		Customer customer=new Customer(1001,"Tan");
		SavingsAccount sb1=new SavingsAccount(9001,customer,2000,5,1000);
		
		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objStream = null;
		FileInputStream fileInput = null;
		ObjectInputStream bufferedStream = null;
		
		try
		{
			 fileOutputStream = new FileOutputStream("data.ser");

			 objStream = new ObjectOutputStream(fileOutputStream);

			objStream.writeObject(sb1);
		
			 fileInput=new FileInputStream("data.ser");
		
			 bufferedStream=new ObjectInputStream(fileInput);
		
			SavingsAccount deserializedSb= (SavingsAccount) bufferedStream.readObject();
			
			System.out.println(deserializedSb.getAccountNo() + " " + deserializedSb.getBalance() + " " + deserializedSb.getCustomer().getCustomerId() + " " + deserializedSb.getCustomer().getCustomerName());
		}
		catch(IOException ioex)
		{
			ioex.getMessage();
		}
		catch(ClassNotFoundException classnot)
		{
			classnot.getMessage();
		}
		finally
		{
			if(fileOutputStream != null)
			{
				try
				{
					fileOutputStream.close();
				}
				catch(IOException ioex)
				{
					ioex.getMessage();
				}
			}
			if(objStream != null)
			{
				try
				{
					objStream.close();
				}
				catch(IOException ioex)
				{
					ioex.getMessage();
				}
			}
			if(fileInput != null)
			{
				try
				{
					fileInput.close();
				}
				catch(IOException ioex)
				{
					ioex.getMessage();
				}
			}
			if(bufferedStream != null)
			{
				try
				{
					bufferedStream.close();
				}
				catch(IOException ioex)
				{
					ioex.getMessage();
				}
			}
		}
		
	}
}