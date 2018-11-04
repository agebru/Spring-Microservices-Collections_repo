package com.me.coreJava;

public class Address {
	private int zipCode;
	private String street;

	public Address() {

	}
	
	

	public Address(int zipCode, String street) {
		super();
		this.zipCode = zipCode;
		this.street = street;
	}



	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}



	@Override
	public String toString() {
		return "Address [zipCode=" + zipCode + ", street=" + street + "]";
	}
	
	
	
	
	
}
