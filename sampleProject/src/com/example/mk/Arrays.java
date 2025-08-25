package com.example.mk;
import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		
		System.out.println("Enter some values");

		for(int i=0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
		System.out.println("Entered values are :");
		
		for(int i=0;i<arr.length;i++) {
			System.out.print("\t" +arr[i]);
		}
		
	}

}
