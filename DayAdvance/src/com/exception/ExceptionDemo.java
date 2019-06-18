package com.exception;

public class ExceptionDemo {
	static {
		System.out.println("In the static block");
	}
	public static void main(String args[]) {
		try{
			Class.forName("com.exception.ExceptionDemo");
		}
		catch(ClassNotFoundException ex) {
			System.out.println(ex);
			
		}
	}
	}

