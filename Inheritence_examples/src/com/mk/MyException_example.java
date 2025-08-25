package com.mk;


//we need to extend from exception or run time exception

class MyExceptionEx extends Exception{
	
	
	//step 2 :create some constructor to log some message 
	public MyExceptionEx() {
		System.out.println("this is default Exception");
	
	}
}




public class MyException_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age=13;
		try {
			if(age>10) {
				throw new MyExceptionEx();
			}
		}
		catch(MyExceptionEx e) {
			System.out.println("we caught our Exception");
			
		}
		
	}

}
