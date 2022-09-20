package com.hibernate.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	
	@Id
	private int customerId;
	private String customerName;
	private String contact;
	private double creditPoints;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public double getCreditPoints() {
		return creditPoints;
	}
	public void setCreditPoints(double creditPoints) {
		this.creditPoints = creditPoints;
	}
	
	
}


