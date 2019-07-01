package Assignment2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CustomerFileDB {

	String file = "data2.ser";


	public int saveCustomer(Account account) throws FileNotFoundException, IOException
	{
		int status = -1;
		try(ObjectOutputStream objos = new ObjectOutputStream(new FileOutputStream(file)))
		{	
			objos.writeObject(account);	
			status = 0;	
		}

		return status;
	}

	public Account getAccountDetails(int customerId) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		Account acc = new Account();
		while(true)
		{
			try(ObjectInputStream objis = new ObjectInputStream(new FileInputStream(file)))
			{

				acc = (Account)objis.readObject();

				if(acc.getCustomer().getCustomerId() == customerId)
				{
					return acc;
				}
			}
			catch(EOFException eofex)
			{
				eofex.getMessage();
			}
			return null;
		}
		
	}
}

