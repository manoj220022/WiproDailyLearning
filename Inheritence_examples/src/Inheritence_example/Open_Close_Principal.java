package com.mk.solid;


//closed for modification
//this is our super class
interface PaymentMethod{
	
	void pay();
}

class creditCard implements PaymentMethod{
	
	@Override
	public void pay() {
		
		System.out.println("process creditcard payment");
		}
}

class debitCard implements PaymentMethod{

	@Override
	public void pay() {
		System.out.println("process debitcard payment");
		
	}
	
}

class Processor{
	
	void Process(PaymentMethod paymentMethod) {
		paymentMethod.pay();
	}
}


public class Open_Close_Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Processor p = new Processor();
		p.Process(new creditCard());
		p.Process(new debitCard());
		
	}

}
