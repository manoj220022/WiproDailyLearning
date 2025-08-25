package com.mk;

public class Exception_ex {

	public static void main(String[] args) throws ArithmeticException {
		// TODO Auto-generated method stub

		
		try {
			int result = 10/0;
			
			int age=17;
			if(age<=18);
			{
				throw new ArithmeticException("you are not allowed");
			}
		}
		catch(Exception e) {
			System.out.println("i got exception" + e.getClass().getName());
			System.out.println("message" + e.getMessage());
		}
		finally {
			System.out.println("Final Message");
		}
	
	}
}
