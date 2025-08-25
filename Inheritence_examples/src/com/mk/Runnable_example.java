package com.mk;



class MyTask implements Runnable{
	public void run() {
		int a =3;
		int b= 5;
		System.out.println(a+b);
	}
}
public class Runnable_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new MyTask());
		t.start();
	}

}
