package com.java8faetures;

interface greeting {
	void greet();
}

class sayHello implements greeting{

	@Override
	public void greet() {

		System.out.println("good morning");
	}
	
}
public class WithoutLamda {

	public static void main(String[] args) {

		sayHello s1 =new  sayHello();
		s1.greet();
		
	}

}
