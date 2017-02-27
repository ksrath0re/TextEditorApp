package com.training;

import org.springframework.beans.factory.annotation.Required;

public class Address 
{
	private int flatNumber;
	private String laneNo;
	private String city;
	
	public int getFlatNumber() {
		return flatNumber;
	}
	@Required
	public void setFlatNumber(int flatNumber) {
		this.flatNumber = flatNumber;
	}
	public String getLaneNo() {
		return laneNo;
	}
	@Required
	public void setLaneNo(String laneNo) {
		this.laneNo = laneNo;
	}
	public String getCity() {
		return city;
	}
	@Required
	public void setCity(String city) {
		this.city = city;
	}
	
	public void displayAddress()
	{
		System.out.println("Address is : ");
		System.out.println(flatNumber);
		System.out.println(laneNo);
		System.out.println(city);
		
	}
}
