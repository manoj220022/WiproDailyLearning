package com.mk;

import java.io.FileWriter;

public class Createfile {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
 
		FileWriter writer = new FileWriter("sample.txt");
		writer.write("Hello, this is a sample file.");
		writer.close();
		System.out.println("File created and written");
	}

}
