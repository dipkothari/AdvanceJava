package Assignment32;
import java.lang.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import Assignment30.*;

public class TestReflectionAPI {
	public static void main(String args[]) throws Exception, RuntimeException {
		try {
			Class cls = Class.forName("Employee");
			//Field[] a=classObj.getDeclaredFields();
			 Method[] methods = cls.getMethods(); 
			  
		        // Printing method names 
		        for (Method method:methods) 
		            System.out.println(method.getName()); 
		  
		        // creates object of desired method by providing the 
		        // method name and parameter class as arguments to 
		        // the getDeclaredMethod 
		        Method methodcall1 = cls.getDeclaredMethod("method2", 
		                                                 int.class); 
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		
	}
}
	

