package com.java8faetures;


interface add2Number{
	static int add(int a, int b) {
		return a+b;
	}
	
	int add1(int x, int y);
}
public class Staticmethod_interface {

	public static void main(String[] args) {

		int result = add2Number.add(3, 5);
		System.out.println(result);
		
		
		
		//with lambda Expression
		add2Number a  = (x,y)->x+y;
	System.out.println(a.add1(2, 5));
	}

}
