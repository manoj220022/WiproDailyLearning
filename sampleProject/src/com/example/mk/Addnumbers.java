package com.example.mk;
import java.util.Scanner;

public class Addnumbers {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      
      System.out.println(add(a,b,c));

	}
	
	public static int  add(int a, int b, int c) {
		return a+b+c;
	}

}
