package com.mk.interface1;


interface A{
	
	//by default abstract abstract methods
	void ican();
	void display();
	
}

class B implements A{
	
	public void ican() {
	
		System.out.println("i am done");
	}
	
	public void display() {
		System.out.println("i am display");
	}
}


public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B b =new B();
		b.ican();
		b.display();
	}

}
