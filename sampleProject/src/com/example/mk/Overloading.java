package com.example.mk;

public class Overloading {
	
	public static int add(int a, int b, int c) {
		return a+b+c;
	}
	
	public static double add(double a, double b, double c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		System.out.println(add(2.8,3,4));
	}

}
