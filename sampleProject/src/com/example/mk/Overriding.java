package com.example.mk;


class Animals{
	public void eat() {
		System.out.println("Animals will eat grass");
	}
}
class Dog extends Animals{
	public void eat() {
		super.eat();
		System.out.println("Dog can Bark");
	}
}


public class Overriding {

	public static void main(String[] args) {
//			Animals a = new Animals();
//			a.eat();
			Dog d = new Dog();
			d.eat();
			
//			Animals a1 = new Dog();
//			a1.eat();
			
			
	}

}
