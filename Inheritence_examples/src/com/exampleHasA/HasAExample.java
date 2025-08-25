package com.exampleHasA;

class Engine {
	public void start() {
		System.out.println("engine started");
	}
}
class Car{
	Engine e = new Engine();
	
	public void drive() {
		e.start();
		System.out.println("car started");
	}
	
	
}
 
public class HasAExample {
 
	public static void main(String[] args) {
		Car c = new Car();
		c.drive();;
 
	}
}
