package com.spring.SpringSetterInjection;

public class Order {
	
	private Customer customer;

	public Customer getCustomer() {
		
		return customer;
	}

	
	
	
	public Order(Customer customer) {
		super();
		this.customer = customer;
	}



	
	
	
	

	public void setCustomer(Customer customer) {
		
		this.customer = customer;
	}
	
	
	public void ShowOrderDetails() {
		
		System.out.println("order placed by :-"+getCustomer().getName());
		customer.display();
	}

}
