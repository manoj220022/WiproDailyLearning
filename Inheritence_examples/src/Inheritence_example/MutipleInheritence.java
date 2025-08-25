package Inheritence_example;

interface A{
	
	void methodA();
	
}

interface B{
	 
	void methodB();
}

class C implements A,B{
	
	public void methodA() {
		System.out.println("i am from interface A");
	}
	
	public void methodB() {
		System.out.println("i am from interface B");
	}
	
	public void myOwnMethod() {
		System.out.println("i am from class C");
	}
	
}





public class MutipleInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		C c = new C();
		c.methodA();
		c.methodB();
		c.myOwnMethod();
	}

}
