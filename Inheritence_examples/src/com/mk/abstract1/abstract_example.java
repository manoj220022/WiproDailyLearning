package com.mk.abstract1;


abstract class CGovt{
	void iam()
	{
		System.out.println("concrete method");
	}
	
	abstract void action_to_taken();
}

class Ap extends CGovt{
	void action_to_taken() {
		System.out.println("Heavy Rain");
	}
}

class Ts extends CGovt{
	void action_to_taken() {
		System.out.println("No Heavy Rain");
	}
}

public class abstract_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Ap ap=new Ap();
		ap.action_to_taken();
		Ts ts = new Ts();
		ts.action_to_taken();
	}

}
