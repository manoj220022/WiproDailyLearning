package com.exampleHasA;


class Profesor{
	 
	public String name;

	public Profesor(String name) {
		super();
		this.name = name;
	}
	
	public void teaching() {
		System.out.println("Professor can teach");
	}
}

class University{
	
	Profesor prof;

	public University(Profesor prof) {
		super();
		this.prof = prof;
	}
	
	void startLecture() {
		prof.teaching();
	}
}

public class Aggregation_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Profesor p = new Profesor("Manoj");
		University uni = new University(p);
		uni.startLecture();
	}

}
