package Assignment2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadData {

	public static String acceptString()
	{
		String stringData = null;
		BufferedReader input = null;
		
		try
		{
			input = new BufferedReader(new InputStreamReader(System.in));
			
			stringData = input.readLine();
		}
		catch(IOException ioex)
		{
			System.out.println("Error in accepting data");
		}
		finally
		{
			if(input!=null)
			{
				input = null;
			}
		}
		return stringData;
	}
	
}
