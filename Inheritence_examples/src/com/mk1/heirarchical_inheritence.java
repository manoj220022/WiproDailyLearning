package com.mk1;


class Grandfather{
	public void iamgrandfather() {
		System.out.println("i am grandfather");
	}
}


class parent1 extends Grandfather{
	public void iamparent1() {
		System.out.println("i am parent1");
	}
}

class parent2 extends Grandfather{
	public void iamparent2() {
		System.out.println("i am parent2");
	}
}

class parent3 extends Grandfather{
	public void iamparent3() {
		System.out.println("i am parent3");
	}
}

public class heirarchical_inheritence {

	public static void main(String[] args) {
		
		
		parent3 p3 = new parent3();
		p3.iamparent3();
		parent2 p2 = new parent2();
		p2.iamparent2();
		parent1 p1 = new parent1();
		p1.iamparent1();
		

	}

}







