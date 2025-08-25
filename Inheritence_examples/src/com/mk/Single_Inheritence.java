package com.mk;


class parent{
	public void iamparent() {
		System.out.println("i am parent");
	}
}

class child extends parent{
	public void iamchild() {
		System.out.println("i am child");
	}
}

public class Single_Inheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		parent p = new parent();
		p.iamparent();
		child c = new child();
		c.iamchild();

	}

}
