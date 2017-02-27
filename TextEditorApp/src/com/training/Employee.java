package com.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Employee
{
	private Address address;

	public Address getAddress() {
		return address;
	}
	
	@Autowired
	@Qualifier("add2")
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void showAddress()
	{
		address.displayAddress();
	}
	
}
