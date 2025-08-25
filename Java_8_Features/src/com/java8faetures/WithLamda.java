package com.java8faetures;

import java.util.ArrayList;

interface Greeting{
	void greet();
}


public class WithLamda {
	public static void main(String[] args) {
		
		Greeting g = ()->System.out.println("Hello good ");
		g.greet();
		
		
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("mk");
		arrayList.add("mk1");
		arrayList.add("mk2");
		
		for(String n:arrayList) {
			System.out.println(n);
		}
		
		
		arrayList.forEach(n->System.out.println(n));
		
			
	}

}
